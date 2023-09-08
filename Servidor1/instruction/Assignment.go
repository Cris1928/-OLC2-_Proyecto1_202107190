package instruction

import (
	"Servidor1/environment"
	err "Servidor1/environment"
	"Servidor1/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type Assignment struct {
	Id          string
	Expresion   interfaces.Expresion
	Dimensiones *arrayList.List
	Line        int
	Column      int
}

func NewAssignment(id string, val interfaces.Expresion, dimensiones *arrayList.List, line int, column int) Assignment {
	instr := Assignment{id, val, dimensiones, line, column}
	return instr
}

func (p Assignment) IsArray_Valido(env interface{}, arr1 interfaces.Symbol, l_tipo *arrayList.List) bool {
	a_valido := true
	ar_noelementos := 0
	arrType := l_tipo.GetValue(l_tipo.Len() - 1)

	//validar si es nulo
	if arrType.(interfaces.ArrayType).SizeA == nil {
		return true
	}
	res_exp := arrType.(interfaces.ArrayType).SizeA.(interfaces.Expresion).EjecutarValor(env)
	var arrSize int

	if res_exp.Tipo == interfaces.INTEGER {
		arrSize = res_exp.Valor.(int)
	} else {
		desc := fmt.Sprintf("Se esperaba un '%v' se tiene '%v'", "int", interfaces.GetType(res_exp.Tipo))
		err.NewError("Error en Size "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		return false
	}
	l_tipo.RemoveAtIndex(l_tipo.Len() - 1)

	for _, arr := range arr1.Valor.(*arrayList.List).ToArray() {
		if arrType.(interfaces.ArrayType).Tipo != arr.(interfaces.Symbol).Tipo {
			/// si los tipos son diferentes

			desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(arrType.(interfaces.ArrayType).Tipo), interfaces.GetType(arr.(interfaces.Symbol).Tipo))
			//fmt.Println("***array*tipo es diferente de array t symbol: ",  desc)
			err.NewError("Array invalida "+desc, env.(environment.Environment).Nombre, arrType.(interfaces.ArrayType).Line, arrType.(interfaces.ArrayType).Column)

			return false
		}
		if arr.(interfaces.Symbol).Tipo == interfaces.ARRAY {
			a_valido = p.IsArray_Valido(env, arr.(interfaces.Symbol), l_tipo.Clone())
			if !a_valido {
				//fmt.Println("**a_valido: ", a_valido )
				return a_valido
			}
		}
		ar_noelementos++
	}

	if ar_noelementos == arrSize && a_valido {
		return true
	}
	//n   fmt.Println
	desc := fmt.Sprintf("Size del Array '%v' Cantidad de elementos '%v'", arrSize, ar_noelementos)
	err.NewError("Tamaños incorrectos "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
	return false
}

func (p Assignment) Assignment_Array(env interface{}, arrlist interfaces.Symbol, indexs *arrayList.List, resul interfaces.Symbol) (*arrayList.List, bool) {
	var tempExp *arrayList.List
	tempExp = arrayList.New()

	inx := indexs.GetValue(0)
	res_ind := inx.(interfaces.Expresion).EjecutarValor(env)
	index := res_ind.Valor.(int)

	indexs.RemoveAtIndex(0)

	for i := 0; i < arrlist.Valor.(*arrayList.List).Len(); i++ {
		arr := arrlist.Valor.(*arrayList.List).GetValue(i)
		//		fmt.Println("iiiii: ", i)

		if index == i {

			if indexs.Len() == 0 {

				if arr.(interfaces.Symbol).Tipo == resul.Tipo {

					if resul.Tipo == interfaces.ARRAY {

						if resul.Valor.(*arrayList.List).Len() != arr.(interfaces.Symbol).Valor.(*arrayList.List).Len() {
							//fmt.Println(" error en dimensiones")
							desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", arr.(interfaces.Symbol).Valor.(*arrayList.List).Len(), resul.Valor.(*arrayList.List).Len())
							err.NewError("Error en Dimensiones de Array "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
							return nil, false
						}
					}

					tempExp.Add(resul)

				} else {
					desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(arr.(interfaces.Symbol).Tipo), interfaces.GetType(resul.Tipo))
					err.NewError("1: Tipos no coinciden en Asignación "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
					return nil, false
				}

			} else {

				tempExp2, is_Correct := p.Assignment_Array(env, arr.(interfaces.Symbol), indexs.Clone(), resul)
				if is_Correct == false {
					return nil, false
				}
				sym := interfaces.Symbol{Id: arr.(interfaces.Symbol).Id, Tipo: arr.(interfaces.Symbol).Tipo,
					Valor: tempExp2, IsMut: arr.(interfaces.Symbol).IsMut}

				tempExp.Add(sym)
			}

		} else {
			//			fmt.Println("e		arr: ", arr)
			tempExp.Add(arr)
		}
	}

	return tempExp, true

}
func (p Assignment) Ejecutar(env interface{}) interface{} {

	result_mut := env.(environment.Environment).GetVariable(p.Id, p.Line, p.Column, env.(environment.Environment).Nombre)

	if result_mut.Tipo == interfaces.NULL {
		return nil
	}
	if result_mut.IsMut == false {

		err.NewError("La variable "+p.Id+" es inmutable, no puede cambiar valor", env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}

	if result_mut.Tipo == interfaces.ARRAY {

		if p.Dimensiones == nil {

			var result interfaces.Symbol
			result = p.Expresion.EjecutarValor(env)

			if result_mut.Tipo == result.Tipo {
			} else {
				desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(result_mut.Tipo), interfaces.GetType(result.Tipo))
				err.NewError("Tipos no coinciden en Asignación "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
				return nil
			}

			/*validano array*/
			if result_mut.TiposArr != nil {
				if p.IsArray_Valido(env, result, result_mut.TiposArr) {
				} else {
					return nil
				}
			}

			result.Id = p.Id
			env.(environment.Environment).AlterVariable(p.Id, result)
			return nil
		}

		var result interfaces.Symbol
		result = p.Expresion.EjecutarValor(env)

		tempExp, is_Correct := p.Assignment_Array(env, result_mut.Valor.(interfaces.Symbol), p.Dimensiones.Clone(), result)

		//		fmt.Println("FINNNN")
		if is_Correct == false {
			return nil
		}

		sym := interfaces.Symbol{Id: result_mut.Valor.(interfaces.Symbol).Id, Tipo: result_mut.Valor.(interfaces.Symbol).Tipo,
			Valor: tempExp, IsMut: result_mut.Valor.(interfaces.Symbol).IsMut}

		/*validano array*/
		if result_mut.TiposArr != nil {
			if p.IsArray_Valido(env, sym, result_mut.TiposArr.Clone()) {
			} else {
				fmt.Println("nill")
				return nil
			}
		}
		result.Id = p.Id
		env.(environment.Environment).AlterVariable(p.Id, sym)

		return nil //
	}
	//INTEGER
	var result interfaces.Symbol
	result = p.Expresion.EjecutarValor(env)

	if result_mut.Tipo == result.Tipo {

		result.Id = p.Id
		//fmt.Println("result: ", result.Id)
		//fmt.Println("p.Id: ", p.Id)
		//fmt.Println("result: ", result)
		//fmt.Println("p.Id: ", p)
		//fmt.Println(result_mut.Tipo)
		//fmt.Println(result.Tipo)

		env.(environment.Environment).AlterVariable(p.Id, result)

		return nil

	} else if result_mut.Tipo == interfaces.STRING && result.Tipo == interfaces.STR {

		result.Id = p.Id
		//fmt.Println("result: ", result.Id)
		//fmt.Println("p.Id: ", p.Id)
		//fmt.Println("result: ", result)
		//fmt.Println("p.Id: ", p)
		//fmt.Println(result_mut.Tipo)
		//fmt.Println(result.Tipo)

		env.(environment.Environment).AlterVariable(p.Id, result)

		return nil
	} else if result_mut.Tipo == interfaces.STR && result.Tipo == interfaces.STRING {
		result.Id = p.Id
		//fmt.Println("result: ", result.Id)
		//fmt.Println("p.Id: ", p.Id)
		//fmt.Println("result: ", result)
		//fmt.Println("p.Id: ", p)
		//fmt.Println(result_mut.Tipo)
		//fmt.Println(result.Tipo)

		env.(environment.Environment).AlterVariable(p.Id, result)

		return nil

	} else {
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(result_mut.Tipo), interfaces.GetType(result.Tipo))
		err.NewError("Tipos no coinciden en Asignación "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)

		return nil
	}
}

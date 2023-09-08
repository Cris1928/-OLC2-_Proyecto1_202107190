package expresion

import (
	"Servidor1/environment"
	err "Servidor1/environment"
	"Servidor1/interfaces"
	"fmt"
	"math"

	//"reflect"
	"strconv"
)

var res_dominante = [8][8]interfaces.TipoExpresion{
	//INTEGER			//FLOAT			   //STRING			//STR		  //BOOLEAN		   //ARRAY		   		//VOID		   	//NULL
	//INTEGER
	{interfaces.INTEGER, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//FLOAT
	{interfaces.NULL, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//STRING
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.STRING, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//STR
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.STR, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//BOOLEAN
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.BOOLEAN, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//ARRAY
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.BOOLEAN, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//VOID
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.BOOLEAN, interfaces.NULL, interfaces.VOID, interfaces.NULL},
	//NULL
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
}

var res_dominante_unario = [8][8]interfaces.TipoExpresion{
	//INTEGER			//FLOAT			   //STRING			//STR		  //BOOLEAN		   //ARRAY		   		//VOID		   	//NULL
	//INTEGER
	{interfaces.INTEGER, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//FLOAT
	{interfaces.NULL, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//STRING
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.STRING, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//STR
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.STR, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//BOOLEAN
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.BOOLEAN, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//ARRAY
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.BOOLEAN, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//VOID
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.BOOLEAN, interfaces.NULL, interfaces.VOID, interfaces.NULL},
	//NULL
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
}

/****RELACIONALES***/
/*
horizontal segundo
vertical primero*/
var rel_dominante = [8][8]interfaces.TipoExpresion{
	//INTEGER			//FLOAT			   //STRING			//STR		  //BOOLEAN		   //ARRAY		   		//VOID		   	//NULL
	//INTEGER
	{interfaces.INTEGER, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//FLOAT
	{interfaces.NULL, interfaces.FLOAT, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//STRING
	{interfaces.NULL, interfaces.NULL, interfaces.STRING, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//STR
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.STR, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//BOOLEAN
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.BOOLEAN, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//ARRAY
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.BOOLEAN, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//VOID
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.BOOLEAN, interfaces.NULL, interfaces.NULL, interfaces.NULL},
	//NULL
	{interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL, interfaces.NULL},
}

type Aritmetica struct {
	Op1      interfaces.Expresion
	Operador string
	Op2      interfaces.Expresion
	Unario   bool
	Line     int
	Column   int
}

func NewOperacion(Op1 interfaces.Expresion, Operador string, Op2 interfaces.Expresion, unario bool, line int, column int) Aritmetica {

	exp := Aritmetica{Op1, Operador, Op2, unario, line, column}
	return exp
}

func (p Aritmetica) EjecutarValor(env interface{}) interfaces.Symbol {

	var retornoIzq interfaces.Symbol
	var retornoDer interfaces.Symbol

	if p.Unario == true {
		retornoIzq = p.Op1.EjecutarValor(env)
	} else {
		retornoIzq = p.Op1.EjecutarValor(env)
		retornoDer = p.Op2.EjecutarValor(env)
	}

	var resultado interface{}

	var dominante interfaces.TipoExpresion
	var dominante_unario interfaces.TipoExpresion

	switch p.Operador {
	case "+":
		{

			dominante = res_dominante[retornoIzq.Tipo][retornoDer.Tipo]
			//	fmt.Println("dom: ", dominante)
			//	fmt.Println("tranq ", interfaces.STR)

			dominante_unario = res_dominante_unario[retornoDer.Tipo][retornoIzq.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(int) + retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: val1 + val2}
				//return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(float64) + retornoDer.Valor.(float64)}
				//suma 'Str' con 'Str'
			} else if dominante == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				//	fmt.Println("aqui " + r1)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				//	fmt.Println("aqui2 " + r2)

				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: r1 + r2}
				//suma 'String' con 'Str'
			} else if dominante == interfaces.STR {

				//	fmt.Print(dominante)

				//	dominante = interfaces.STRING

				//fmt.Println("inter ", interfaces.STR)
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				//fmt.Println("aqui3 " + r1)
				//fmt.Println("aqui3 t" + fmt.Sprintf("%v", retornoIzq.Tipo))
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				//fmt.Println("aqui4 " + r2)
				//fmt.Println("aqui4 t" + fmt.Sprintf("%v", retornoDer.Tipo))

				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: r1 + r2}
				//	} else if dominante == interfaces.STRING && dominante_unario == interfaces.STR {
				//		fmt.Println("aqui5 ")
				//	} else if dominante == interfaces.STR && dominante_unario == interfaces.STRING {
				//		fmt.Println("aqui6 ")
				//suma 'Str' con 'String'
			} else if dominante_unario == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)

				return interfaces.Symbol{Id: "", Tipo: dominante_unario, Valor: r1 + r2}

				//suma 'String' con 'Str'

			} else if dominante_unario == interfaces.STR {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)

				return interfaces.Symbol{Id: "", Tipo: dominante_unario, Valor: r1 + r2}

				//suma 'String' con 'String'

			} else if dominante_unario == dominante {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)

				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: r1 + r2}

			} else {
				//fmt.Print(dominante)
				desc := fmt.Sprintf("'%v' con '%v'", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en suma "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}

	case "-":
		{

			if p.Unario {

				if retornoIzq.Tipo == interfaces.INTEGER {
					return interfaces.Symbol{Id: "", Tipo: retornoIzq.Tipo, Valor: -1 * retornoIzq.Valor.(int)}
				} else if retornoIzq.Tipo == interfaces.FLOAT {
					return interfaces.Symbol{Id: "", Tipo: retornoIzq.Tipo, Valor: -1 * retornoIzq.Valor.(float64)}
				}

			} else {
				dominante = res_dominante[retornoIzq.Tipo][retornoDer.Tipo]

				if dominante == interfaces.INTEGER {

					return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(int) - retornoDer.Valor.(int)}

				} else if dominante == interfaces.FLOAT {
					val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
					val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
					return interfaces.Symbol{Id: "", Tipo: dominante, Valor: val1 - val2}

				} else {
					desc := fmt.Sprintf("'%v' con '%v'", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
					err.NewError("Tipos incompatibles en resta "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
					//fmt.Print("ERROR: No es posible restar")
				}
			}
		}

	case "*":
		{
			dominante = res_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(int) * retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: val1 * val2}

			} else {
				//fmt.Print("ERROR: No es posible Multiplicar")
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Multiplicación "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}

	case "/":
		{
			dominante = res_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {
				if retornoDer.Valor.(int) == 0 {
					err.NewError("No se pude dividir un número entre 0", env.(environment.Environment).Nombre, p.Line, p.Column)

				} else {
					return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(int) / retornoDer.Valor.(int)}
				}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: val1 / val2}

			} else {
				//fmt.Print("ERROR: No es posible Dividir")
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Divición "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}

	case "%":
		{
			dominante = res_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {
				if retornoDer.Valor.(int) == 0 {
					err.NewError("No se pude dividir(%) un número entre 0", env.(environment.Environment).Nombre, p.Line, p.Column)

				} else {
					return interfaces.Symbol{Id: "", Tipo: dominante, Valor: retornoIzq.Valor.(int) % retornoDer.Valor.(int)}
				}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)

				modval := math.Mod(val1, val2)
				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: modval}

			} else {
				//fmt.Print("ERROR: No es posible Dividir")
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Módulo "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}

	case "pow":
		{
			dominante = res_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				val_pow := math.Pow(val1, val2)

				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: int(val_pow)}

			} else {
				desc := fmt.Sprintf("%v , %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en i64::pow "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}
		}

	case "powf":
		{
			dominante = res_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.FLOAT {

				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				val_pow := math.Pow(val1, val2)

				return interfaces.Symbol{Id: "", Tipo: dominante, Valor: val_pow}
			} else {
				desc := fmt.Sprintf("%v , %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en f64::pow "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}
		}

	case "<":
		{
			dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) < retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: val1 < val2}
				//return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) < retornoDer.Valor.(float64)}

			} else if dominante == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 < r2}

			} else if dominante == interfaces.STR {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 < r2}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Relaciónal (<) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}

	case ">":
		{
			dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) > retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: val1 > val2}
				//return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) > retornoDer.Valor.(float64)}

			} else if dominante == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 > r2}

			} else if dominante == interfaces.STR {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 > r2}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Relaciónal (>) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}
		}

	case "<=":
		{
			dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) <= retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: val1 <= val2}
				//return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) <= retornoDer.Valor.(float64)}

			} else if dominante == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 <= r2}

			} else if dominante == interfaces.STR {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 <= r2}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Relaciónal (<=) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}
		}

	case ">=":
		{
			dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) >= retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: val1 >= val2}
				//return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) >= retornoDer.Valor.(float64)}

			} else if dominante == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 >= r2}

			} else if dominante == interfaces.STR {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 >= r2}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Relaciónal (>=) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}

	case "==":
		{
			dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) == retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: val1 == val2}
				//return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) == retornoDer.Valor.(float64)}

			} else if dominante == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 == r2}

			} else if dominante == interfaces.STR {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 == r2}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Relaciónal (==) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}

	case "!=":
		{
			dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.INTEGER {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(int) != retornoDer.Valor.(int)}

			} else if dominante == interfaces.FLOAT {
				val1, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoIzq.Valor), 64)
				val2, _ := strconv.ParseFloat(fmt.Sprintf("%v", retornoDer.Valor), 64)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: val1 != val2}
				//return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(float64) != retornoDer.Valor.(float64)}

			} else if dominante == interfaces.STRING {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 != r2}

			} else if dominante == interfaces.STR {
				r1 := fmt.Sprintf("%v", retornoIzq.Valor)
				r2 := fmt.Sprintf("%v", retornoDer.Valor)
				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: r1 != r2}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles en Relaciónal (!=) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

		}

	case "&&":
		{

			dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.BOOLEAN {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(bool) && retornoDer.Valor.(bool)}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles Logicos (&&) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

			/* 	dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.BOOLEAN {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(bool) && retornoDer.Valor.(bool)}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles Logicos (&&) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}*/
		}

	case "||":
		{

			dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.BOOLEAN {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(bool) || retornoDer.Valor.(bool)}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles Logicos (||) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}

			/*dominante = rel_dominante[retornoIzq.Tipo][retornoDer.Tipo]

			if dominante == interfaces.BOOLEAN {

				return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: retornoIzq.Valor.(bool) || retornoDer.Valor.(bool)}

			} else {
				desc := fmt.Sprintf("%v con %v", interfaces.GetType(retornoIzq.Tipo), interfaces.GetType(retornoDer.Tipo))
				err.NewError("Tipos incompatibles Logicos (||) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
			}*/

		}
	case "!":
		{

			//fmt.Println("p.Unario ", p.Unario)
			if p.Unario {

				//fmt.Println("retornoIzq.Tipo: ", retornoIzq.Tipo)
				if retornoIzq.Tipo == interfaces.BOOLEAN {

					return interfaces.Symbol{Id: "", Tipo: interfaces.BOOLEAN, Valor: !retornoIzq.Valor.(bool)}

				} else {
					desc := fmt.Sprintf("%v ", interfaces.GetType(retornoIzq.Tipo))
					err.NewError("Tipos incompatibles Logicos (!) "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
				}

			}

		}

	}

	return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
}

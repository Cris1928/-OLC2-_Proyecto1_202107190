package instruction

import (
	"Servidor1/environment"
	err "Servidor1/environment"
	"Servidor1/interfaces"
	"fmt"

	//"reflect"

	arrayList "github.com/colegno/arraylist"
)

type Declaration struct {
	Id        string
	Tipo      interfaces.TipoExpresion
	Expresion interfaces.Expresion

	IsMut  bool
	Line   int
	Column int
}

func NewDeclaration(id string, tipo interfaces.TipoExpresion, val interfaces.Expresion, IsMut bool, line int, column int) Declaration {

	instr := Declaration{id, tipo, val, IsMut, line, column}
	return instr
}

func (p Declaration) Ejecutar(env interface{}) interface{} {

	if p.Expresion != nil {
		var result interfaces.Symbol
		result = p.Expresion.EjecutarValor(env)

		if result.Tipo == interfaces.NULL {
			return nil
		}

		if result.Tipo == p.Tipo {
			env.(environment.Environment).SaveVariable(p.Id, result, p.Tipo, p.IsMut, p.Line, p.Column, env.(environment.Environment).Nombre, nil, 0)

		} else if p.Tipo == interfaces.NULL {

			if result.Tipo == interfaces.ARRAY || result.Tipo == interfaces.VECTOR {

				env.(environment.Environment).SaveVariable(p.Id, result, result.Tipo, p.IsMut, p.Line, p.Column, env.(environment.Environment).Nombre, nil, result.Valor.(*arrayList.List).Len())
			} else {
				/*no tiene tipo en asignacion, se le asigna el tipo de la expresion*/
				env.(environment.Environment).SaveVariable(p.Id, result, result.Tipo, p.IsMut, p.Line, p.Column, env.(environment.Environment).Nombre, nil, 0)
			}

		} else {

			desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(p.Tipo), interfaces.GetType(result.Tipo))
			err.NewError("Tipos no coinciden en Declaración "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		}

	}
	return nil
}

func (p Declaration) IsArray_Valido(env interface{}, arrlist *arrayList.List) bool {
	/**/
	for i := 0; i < arrlist.Len(); i++ {
		arr := arrlist.GetValue(i)
		tipo_primer := arrlist.GetValue(0).(interfaces.Symbol).Tipo

		expre_arr := arr.(interfaces.Symbol)

		if arr.(interfaces.Symbol).Tipo == interfaces.ARRAY {

			p.IsArray_Valido(env, arr.(interfaces.Symbol).Valor.(*arrayList.List))
		} else {
			fmt.Println("Velse: 				", expre_arr.Valor)

			if tipo_primer != expre_arr.Tipo {

				desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(tipo_primer), interfaces.GetType(expre_arr.Tipo))
				err.NewError("Array invalida "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
				return false
			}
		}
	}

	return true
}

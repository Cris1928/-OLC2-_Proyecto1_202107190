package instruction

import (
	//"Servidor1/environment"
	console "Servidor1/environment"
	//err "Servidor1/environment"
	"Servidor1/interfaces"
	"fmt"
	"strings"

	//"reflect"

	arrayList "github.com/colegno/arraylist"
)

type Imprimir struct {
	//Expresion interfaces.Expresion
	L_Expresion *arrayList.List
	Line        int
	Column      int
}

// func NewImprimir(val interfaces.Expresion) Imprimir {
func NewImprimir(val *arrayList.List, line int, column int) Imprimir {
	exp := Imprimir{val, line, column}
	return exp
}

func (p Imprimir) PrintStruct(structSymbol interfaces.Symbol) string {
	formatStructS := "{ "
	for key, element := range structSymbol.Valor.(map[string]interfaces.Symbol) {
		formatStructS = formatStructS + key + ": "
		if element.Tipo == interfaces.STRUCT {
			formatStructS = formatStructS + p.PrintStruct(element)
		} else {
			formatStructS = formatStructS + fmt.Sprintf("%v", element.Valor) + ", "
		}
	}
	formatStructS = strings.TrimRight(formatStructS, ", ")
	return formatStructS + " }"
}

func (p Imprimir) PrintArray(env interface{}, arrlist *arrayList.List) string {

	array_format := ""

	array_format = array_format + "["

	for i := 0; i < arrlist.Len(); i++ {
		arr := arrlist.GetValue(i)

		expre_print := arr.(interfaces.Symbol)

		if arr.(interfaces.Symbol).Tipo == interfaces.ARRAY || arr.(interfaces.Symbol).Tipo == interfaces.VECTOR {

			var coma = ""
			if i < (arrlist.Len() - 1) {
				coma = ", "
			}
			getres := p.PrintArray(env, arr.(interfaces.Symbol).Valor.(*arrayList.List)) + coma

			array_format = array_format + getres
		} else {

			var coma = ""
			if i < (arrlist.Len() - 1) {
				coma = ", "
			}
			if arr.(interfaces.Symbol).Tipo == interfaces.STRING || arr.(interfaces.Symbol).Tipo == interfaces.STR {
				array_format = array_format + fmt.Sprintf("\"%v\"", expre_print.Valor) + coma
			} else {
				array_format = array_format + fmt.Sprintf("%v", expre_print.Valor) + coma
			}

		}
	}
	array_format = array_format + "]"

	return array_format
}

func (p Imprimir) Ejecutar(env interface{}) interface{} {

	if p.L_Expresion.Len() > 1 {

		var result interfaces.Symbol
		result = p.L_Expresion.GetValue(0).(interfaces.Expresion).EjecutarValor(env)
		format_str := fmt.Sprintf("%v", result.Valor)

		List_Expresion := p.L_Expresion.Clone()
		//p.L_Expresion.RemoveAtIndex(0)
		List_Expresion.RemoveAtIndex(0)

		//fmt.Println("format_str: ", format_str)
		//fmt.Println("result.Tipo: ", interfaces.GetType(result.Tipo))

		//	noformat := strings.Count(format_str, "{}") + strings.Count(format_str, "{:?}")
		//fmt.Println("noformat: ", noformat)
		//fmt.Println("p.L_Expresion.Len(): ", p.L_Expresion.Len())

		//if noformat != p.L_Expresion.Len() {
		//if noformat != List_Expresion.Len() {
		//fmt.Println("Formato y número de expresiones incorrecto")
		//	desc := fmt.Sprintf("format: '%v' parametros: '%v'", noformat, List_Expresion.Len())
		//	err.NewError("Formato y número de expresiones incorrecto, "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		//}

		for _, exp := range List_Expresion.ToArray() {
			expre_print := exp.(interfaces.Expresion).EjecutarValor(env)

			if expre_print.Tipo == interfaces.ARRAY || expre_print.Tipo == interfaces.VECTOR {
				str_arr := p.PrintArray(env, expre_print.Valor.(*arrayList.List))

				format_str = format_str + "{:?}"

				format_str = strings.Replace(format_str, "{:?}", str_arr, 1)

			} else if expre_print.Tipo == interfaces.STRUCT {
				str_arr := p.PrintStruct(expre_print)
				format_str = format_str + "{:?}"
				format_str = strings.Replace(format_str, "{:?}", str_arr, 1)

			} else {
				format_str = format_str + "{}"
				format_str = strings.Replace(format_str, "{}", fmt.Sprintf("%v", expre_print.Valor), 1)
			}
		}

		printcon := format_str + "\n"
		console.Console += printcon
		return nil

	}

	var result interfaces.Symbol
	result = p.L_Expresion.GetValue(0).(interfaces.Expresion).EjecutarValor(env)

	printcon := fmt.Sprintf("%v", result.Valor) + "\n"
	console.Console += printcon

	return nil
	//return result.Valor
}

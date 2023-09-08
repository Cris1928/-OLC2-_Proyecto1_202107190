package expresion

import (
	"Servidor1/environment"
	err "Servidor1/environment"
	"Servidor1/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type cadenaFor struct {
	Exp_ini interfaces.Expresion

	TipoDec interfaces.TipoExpresion

	Line   int
	Column int
}

func NewcadenaFor(e_ini interfaces.Expresion, line int, column int) cadenaFor {
	exp := cadenaFor{e_ini, interfaces.STRING, line, column}
	return exp
}

func (p cadenaFor) EjecutarValor(env interface{}) interfaces.Symbol {
	var val1 interfaces.Symbol
	var array *arrayList.List
	array = arrayList.New()
	val1 = p.Exp_ini.EjecutarValor(env)
	p.TipoDec = val1.Tipo

	//print(val1.Valor.(string))
	if val1.Tipo == interfaces.STRING || val1.Tipo == interfaces.STR {

		var tmpSym interfaces.Symbol
		inival := val1.Valor.(string)
		//i:= len(inival)

		for _, c := range inival {
			car := string(c)
			tmpSym = interfaces.Symbol{
				Line:   p.Line,
				Column: p.Column,
				Id:     "",
				Tipo:   interfaces.STRING,
				Valor:  car,
				IsMut:  true,
			}
			array.Add(tmpSym)
		}
		//	fmt.Println(array)

	} else {
		fmt.Println("Error en el tipo del vector")
		desc := fmt.Sprintf("Se esperaba un '%v' se tiene '%v'", "string", interfaces.GetType(val1.Tipo))
		err.NewError("Error en el tipo del vector "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)

	}

	return interfaces.Symbol{
		Line:   p.Line,
		Column: p.Column,
		Id:     "",
		Tipo:   interfaces.ARRAY,
		Valor:  array,
		IsMut:  false,
	}
}

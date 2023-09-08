package instruction

import (
	"Servidor1/environment"
	err "Servidor1/environment"
	"Servidor1/interfaces"
	"fmt"
)

type Increment struct {
	Id        string
	Expresion interfaces.Expresion

	Line   int
	Column int
}

func NewIncrement(id string, val interfaces.Expresion, line int, column int) Increment {
	instr := Increment{id, val, line, column}
	return instr
}

// formato de incremento: id+=1
func (p Increment) Ejecutar(env interface{}) interface{} {
	result_mut := env.(environment.Environment).GetVariable(p.Id, p.Line, p.Column, env.(environment.Environment).Nombre) //obtener el valor de la variable
	var result interfaces.Symbol
	result = p.Expresion.EjecutarValor(env)

	fmt.Println("resultresultresultresultresult", result)
	fmt.Println("result_mutresult_mutresult_mutresult_mut", result_mut)

	if result_mut.Tipo == interfaces.NULL {
		return nil
	}

	if result_mut.Tipo == interfaces.INTEGER {
		result_mut.Valor = result_mut.Valor.(int) + result_mut.Valor.(int) + result.Valor.(int)
		env.(environment.Environment).AlterVariable(p.Id, result_mut)
		//env.(environment.Environment).SaveVariable(p.Id, result_mut, interfaces.INTEGER, result_mut.IsMut, p.Line, p.Column, env.(environment.Environment).Nombre, nil, 0)
		return nil
	} else if result_mut.Tipo == interfaces.FLOAT {

		result_mut.Valor = result_mut.Valor.(float64) + result_mut.Valor.(float64) + result.Valor.(float64)
		//env.(environment.Environment).SaveVariable(p.Id, result_mut, interfaces.FLOAT, result_mut.IsMut, p.Line, p.Column, env.(environment.Environment).Nombre, nil, 0)
		env.(environment.Environment).AlterVariable(p.Id, result_mut)
		return nil
	} else {
		desc := fmt.Sprintf("Se esperaba un '%v' se tiene '%v'", "int o float", interfaces.GetType(result_mut.Tipo))
		err.NewError("Error en Incremento "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}

}

/*func (p Increment) Ejecutar(env interface{}) interface{} {
	result_mut := env.(environment.Environment).GetVariable(p.Id, p.Line, p.Column, env.(environment.Environment).Nombre) //obtener el valor de la variable
	result_mut = p.Expresion.EjecutarValor(env) //obtener el valor de la expresion

	if result_mut.Tipo == interfaces.NULL {
		return nil
	}

	if result_mut.Tipo == interfaces.INTEGER {
		result_mut.Valor = result_mut.Valor.(int) + 1
		env.(environment.Environment).SaveVariable(p.Id, result_mut, interfaces.INTEGER, result_mut.IsMut, p.Line, p.Column, env.(environment.Environment).Nombre, nil, 0)
		return nil
	} else if result_mut.Tipo == interfaces.FLOAT {

		result_mut.Valor = result_mut.Valor.(float64) + 1
		env.(environment.Environment).SaveVariable(p.Id, result_mut, interfaces.FLOAT, result_mut.IsMut, p.Line, p.Column, env.(environment.Environment).Nombre, nil, 0)
		return nil
	} else {
		desc := fmt.Sprintf("Se esperaba un '%v' se tiene '%v'", "int o float", interfaces.GetType(result_mut.Tipo))
		err.NewError("Error en Incremento "+desc, env.(environment.Environment).Nombre, p.Line, p.Column)
		return nil
	}

}*/

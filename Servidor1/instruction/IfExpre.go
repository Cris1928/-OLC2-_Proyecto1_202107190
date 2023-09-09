package instruction

import (
	"Servidor1/environment"
	err "Servidor1/environment"
	"Servidor1/interfaces"
	"fmt"

	arrayList "github.com/colegno/arraylist"
)

type IfExpre struct {
	Condicion interfaces.Expresion

	LB_Principal *arrayList.List
	LB_IfElse    *arrayList.List
	LB_Else      *arrayList.List
	Line         int
	Column       int

	IsExpre     bool
	B_PrinExp   interfaces.Expresion
	B_IfElseExp *arrayList.List
	B_ElseExp   interfaces.Expresion
}

func NewIfExpre(condicion interfaces.Expresion, lb_Principal *arrayList.List, lb_IfElse *arrayList.List, lb_Else *arrayList.List, line int, column int,
	isExpre bool, b_PrinExp interfaces.Expresion, b_IfElseExp *arrayList.List, b_ElseExp interfaces.Expresion) IfExpre {

	return IfExpre{
		Condicion: condicion,

		LB_Principal: lb_Principal,
		LB_IfElse:    lb_IfElse,
		LB_Else:      lb_Else,
		Line:         line,
		Column:       column,

		IsExpre:     isExpre,
		B_PrinExp:   b_PrinExp,
		B_IfElseExp: b_IfElseExp,
		B_ElseExp:   b_ElseExp,
	}
	/*return IfExpre{
		Condicion: condicion,

		LB_Principal: lb_Principal,
		LB_IfElse:    lb_IfElse,
		LB_Else:      lb_Else,

		B_PrinExp:   b_PrinExp,
		B_IfElseExp: b_IfElseExp,
		B_ElseExp:   b_ElseExp,
	}*/
}

func (i IfExpre) EjecutarValor(env interface{}) interfaces.Symbol {

	var resultado interface{}

	var result interfaces.Symbol
	result = i.Condicion.EjecutarValor(env)

	var valtypes = false
	var exp_dom interfaces.Symbol
	exp_dom = i.B_PrinExp.EjecutarValor(env)
	//

	//ELSE IF
	if i.B_IfElseExp != nil {

		for _, s := range i.B_IfElseExp.ToArray() {

			var exp_elif interfaces.Symbol
			exp_elif = s.(IfExpre).B_PrinExp.EjecutarValor(env)

			if exp_dom.Tipo != exp_elif.Tipo {
				desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(exp_dom.Tipo), interfaces.GetType(exp_elif.Tipo))
				err.NewError("Expresion no coinciden, "+desc, env.(environment.Environment).Nombre, s.(IfExpre).Line, s.(IfExpre).Column)
				valtypes = true

			}

		}
	}
	var exp_else interfaces.Symbol
	exp_else = i.B_ElseExp.EjecutarValor(env)

	if exp_dom.Tipo != exp_else.Tipo {
		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(exp_dom.Tipo), interfaces.GetType(exp_else.Tipo))
		err.NewError("Expresion no coinciden, (else) "+desc, env.(environment.Environment).Nombre, i.Line, i.Column)
		valtypes = true
		//return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
	}

	if valtypes == true {
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
	}
	/***************fin validando tipos**********************/

	if result.Tipo != interfaces.BOOLEAN {

		desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.BOOLEAN), interfaces.GetType(result.Tipo))
		err.NewError("Condición invalida "+desc, env.(environment.Environment).Nombre, i.Line, i.Column)
		//return nil
		return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
	}

	if result.Valor == true {

		var res_exp interfaces.Symbol
		res_exp = i.B_PrinExp.EjecutarValor(env)

		return interfaces.Symbol{Id: "", Tipo: res_exp.Tipo, Valor: res_exp.Valor}

		/*}*/

	} else {
		////////ELSE IF
		if i.B_IfElseExp != nil {

			for _, s := range i.B_IfElseExp.ToArray() {

				var elseif interfaces.Symbol

				elseif = s.(IfExpre).Condicion.EjecutarValor(env)

				if elseif.Tipo != interfaces.BOOLEAN {

					desc := fmt.Sprintf("se esperaba '%v' se tiene '%v'", interfaces.GetType(interfaces.BOOLEAN), interfaces.GetType(elseif.Tipo))
					err.NewError("Condición invalida "+desc, env.(environment.Environment).Nombre, s.(If).Line, s.(If).Column)

					return interfaces.Symbol{Id: "", Tipo: interfaces.NULL, Valor: resultado}
				}

				if elseif.Valor == true {

					var res_ifelexp interfaces.Symbol
					res_ifelexp = s.(IfExpre).B_PrinExp.EjecutarValor(env)

					return interfaces.Symbol{Id: "", Tipo: res_ifelexp.Tipo, Valor: res_ifelexp.Valor}

				}

			}

		}

		//////ELSE

		/*if i.IsExpre == false { //// si es if normal

			if i.LB_Else != nil {
				var tmpEnv environment.Environment
				tmpEnv = environment.NewEnvironment("else", env.(environment.Environment))

				for _, s := range i.LB_Else.ToArray() {
					s.(interfaces.Instruction).Ejecutar(tmpEnv)
				}
			}

		} else if i.IsExpre == true {*/ //// si es if como expresion

		var res_exp interfaces.Symbol
		res_exp = i.B_ElseExp.EjecutarValor(env)

		return interfaces.Symbol{Id: "", Tipo: res_exp.Tipo, Valor: res_exp.Valor}

		/*}*/
	}

}

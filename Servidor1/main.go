package main

import (
	//"Servidor1/environment"

	"Servidor1/environment"
	console "Servidor1/environment"
	"Servidor1/instructionExpre"
	"Servidor1/interfaces"
	"Servidor1/parser"
	"bytes"
	"encoding/json"
	"fmt"
	"html/template"
	"io"
	"net/http"
	"os"
	"reflect"
	"strings"

	"github.com/antlr4-go/antlr/v4"
	arrayList "github.com/colegno/arraylist"
)

type Solicitude struct {
	Text string `form:"code"`
}

type Analyze struct {
	Input   string
	Output  string
	Mensaje template.HTML
	Symbolo template.HTML
	Bases   template.HTML
	Tablas  template.HTML
}

//var EnvRep environment.Environment

type TreeShapeListener struct {
	*parser.BaseswiftgrammarListener
}

func createReport() string {

	var rep string = `<table class="table table-striped table-dark">
	<thead>
		<tr>
		<th scope="col">No.</th>
		<th scope="col">Descripción</th>
		<th scope="col">Ámbito</th>
		<th scope="col">Línea</th>
		<th scope="col">Columna</th>
		<th scope="col">Fecha y hora</th>
		</tr>
	</thead>
	<tbody>`

	/*	var rep string = `<table class="table table-striped table-dark">
		<thead>
			<tr>
			<th scope="col">No.</th>
			<th scope="col">Descripción</th>
			<th scope="col">Ámbito</th>
			<th scope="col">Línea</th>
			<th scope="col">Columna</th>
			<th scope="col">Fecha y hora</th>
			</tr>
		</thead>
		<tbody>`*/

	var conte string = ""
	for i := 0; i < len(environment.ErrorList); i++ {
		err_val := environment.ErrorList[i]

		conte = conte + "<tr>" + "<th scope=\"row\">" + fmt.Sprintf("%v", (i+1)) + "</th>" +
			"<td>" + err_val.Descripcion + "</td>" + "<td>" + err_val.Entorno + "</td>" +
			"<td>" + fmt.Sprintf("%v", err_val.Line) + "</td>" + "<td>" + fmt.Sprintf("%v", err_val.Column) + "</td>" +
			"<td>" + err_val.Fecha + "</td>" +
			"</tr>"
	}

	conte = conte + `</tbody>
	</table>`

	rep = rep + conte
	//limpiar la lista de errores
	environment.ErrorList = nil

	return rep
}

func ReportSymbols() string {

	var rep string = `<table class="table table-striped table-dark">
	<thead>
		<tr>
		<th scope="col">No.</th>
		<th scope="col">ID</th>
		<th scope="col">Tipo Símbolo</th>
		<th scope="col">Tipo Dato</th>
		<th scope="col">Ámbito</th>
		<th scope="col">Línea</th>
		<th scope="col">Columna</th>
		</tr>
	</thead>
	<tbody>`

	var conte string = ""
	//fmt.Println("EnvRep.Nombre: ", EnvRep.Nombre)

	for i := 0; i < len(environment.SymbolList); i++ {
		err_val := environment.SymbolList[i]

		conte = conte + "<tr>" + "<th scope=\"row\">" + fmt.Sprintf("%v", (i+1)) + "</th>" +
			"<td>" + err_val.Id + "</td>" + "<td>" + err_val.TipoSym + "</td>" + "<td>" + err_val.TipoDato + "</td>" +
			"<td>" + err_val.Entorno + "</td>" + "<td>" + fmt.Sprintf("%v", err_val.Line) + "</td>" + "<td>" + fmt.Sprintf("%v", err_val.Column) +
			"</td>" + "</tr>"
	}

	conte = conte + `</tbody>
	</table>`

	rep = rep + conte

	return rep
}

var baseconte string = ""

func ReportBases() string {

	var rep string = `<table class="table table-striped table-dark">
	<thead>
		<tr>
		<th scope="col">No.</th>
		<th scope="col">Nombre</th>
		<th scope="col">No. Tablas</th>
		<th scope="col">Línea</th>
		</tr>
	</thead>
	<tbody>`
	rep = rep + baseconte + `</tbody>
	</table>`

	return rep
}

var tableconte string = ""

func ReportTables() string {

	var rep string = `<table class="table table-striped table-dark">
	<thead>
		<tr>
		<th scope="col">No.</th>
		<th scope="col">Nombre tabla</th>
		<th scope="col">Nombre base de datos</th>
		<th scope="col">Línea</th>
		</tr>
	</thead>
	<tbody>`
	rep = rep + tableconte + `</tbody>
	</table>`

	return rep
}

func NewTreeShapeListener() *TreeShapeListener {
	return new(TreeShapeListener)
}

func (this *TreeShapeListener) ExitStart(ctx *parser.StartContext) {
	result := ctx.GetLista()

	var globalEnv environment.Environment
	globalEnv = environment.NewEnvironment("GLOBAL", nil)

	console.Console = ""
	//environment.ErrorList = nil
	//environment.ErrorList = arrayList.New()

	List_Funcs := arrayList.New()
	for _, s := range result.ToArray() {
		//fmt.Println("******reflect.TypeOf(s)", reflect.TypeOf(s))

		if reflect.TypeOf(s) == reflect.TypeOf(instructionExpre.Function{}) {

			List_Funcs.Add(s.(instructionExpre.Function))

			globalEnv.SaveFuncion(s.(instructionExpre.Function).Id, s, s.(instructionExpre.Function).Line, s.(instructionExpre.Function).Column)

		}
		if reflect.TypeOf(s) == reflect.TypeOf(instructionExpre.Struct{}) {
			//fmt.Println("**es struct ** ", reflect.TypeOf(s))
			s.(interfaces.Instruction).Ejecutar(globalEnv)
		}

	}

	//corriendo main
	var mainEnv environment.Environment
	mainEnv = environment.NewEnvironment("main", globalEnv)
	environment.Main_Env = mainEnv
	globalEnv.MainF = mainEnv
	for _, s := range List_Funcs.ToArray() {

		if s.(instructionExpre.Function).Id == "main" {
			s.(interfaces.Instruction).Ejecutar(mainEnv)
		}
	}

	fmt.Println("--------------OUTPUT-----------------")
	fmt.Println(console.Console)

	//fmt.Println("globalEnv.TablaModules:", len(globalEnv.TablaModules))
	/*	if len(globalEnv.TablaModules) == 0 {
		environment.NewError("No se encontró ninguna definición de módulo ", globalEnv.Nombre, 0, 0)

	}*/
	//////ini base de datos report
	baseconte = ""
	tableconte = ""
	var i = 0
	for nameBase, base := range globalEnv.TablaModules {
		//fmt.Println("nameBase: ", nameBase, "-", base.Body.Len(), "-", base.Line)
		i++
		baseconte = baseconte + "<tr>" + "<th scope=\"row\">" + fmt.Sprintf("%v", (i)) + "</th>" +
			"<td>" + nameBase + "</td>" + "<td>" + fmt.Sprintf("%v", base.Body.Len()) + "</td>" +
			"<td>" + fmt.Sprintf("%v", base.Line) + "</td>" +
			"</tr>"

	}
	//////fin base datos report

}

func main() {

	t, err := template.ParseFiles("../cliente/index.html")

	//POST
	http.HandleFunc("/data", func(res http.ResponseWriter, req *http.Request) {
		data := req.FormValue("code")

		is := antlr.NewInputStream(data)

		lexer := parser.Newswiftlexer(is)
		stream := antlr.NewCommonTokenStream(lexer, antlr.TokenDefaultChannel)

		// Create the Parser
		p := parser.Newswiftgrammar(stream)

		p.BuildParseTrees = true
		tree := p.Start_()

		antlr.ParseTreeWalkerDefault.Walk(NewTreeShapeListener(), tree)

		////
		data = "\n" + data
		var rep = createReport()
		var sym = ReportSymbols()

		err = t.Execute(res, Analyze{
			Input:   data,
			Output:  console.Console,
			Mensaje: template.HTML(rep),
			Symbolo: template.HTML(sym),
		})
	})

	http.HandleFunc("/", func(res http.ResponseWriter, req *http.Request) {
		//fmt.Println("-entra en el main")
		err = t.Execute(res, nil)
	})

	if err != nil {
		return
	}

	fmt.Println("Server running on http://localhost:8080")
	err = http.ListenAndServe(":8080", nil)

	if err != nil {
		return
	}

	//limpiar lista de symbolos
	//environment.SymbolList = nil
	//limpiar lista de errores
	//	environment.ErrorList = nil

}
func CrearCST(input string) string {

	// replace the " with \"
	input = strings.ReplaceAll(input, "\"", "\\\"")

	url := "http://lab.antlr.org/parse/"

	// payload
	payload := []byte(`{"grammar": "parser grammar ExprParser;\r\noptions { tokenVocab=ExprLexer; }\r\n\r\n// ? -> uno o nada\r\n// * -> cero o mas\r\n// + -> uno o mas\r\n\r\nstart: block EOF;\r\n\r\nblock: (stmts)\r\n;\r\n\r\nstmts: declaracion (PT_COMA)?\r\n     | declaracion_vector (PT_COMA)?\r\n     | asignacion (PT_COMA)?\r\n     | funciones_vector (PT_COMA)?\r\n     | ifstmt\r\n     | whilestmt\r\n     | forstmt\r\n     | switchstmt\r\n     | declaracion_funcion\r\n     | llamada_funciones\r\n     | transferenciastmt (PT_COMA)?\r\n     | guardstmt\r\n     | printstmt (PT_COMA)?\r\n;\r\n\r\n// SENTENCIAS DE TRANSFERENCIA\r\ntransferenciastmt: BREAK                                            #TransferenciaBreak\r\n                 | CONTINUE                                         #TransferenciaContinue\r\n                 | RETURN (expr)?                                   #TransferenciaReturn\r\n;\r\n\r\n\r\n// VECTORES\r\ndeclaracion_vector: tipo_declaracion PRIM_ID ':' '[' tipo ']' '=' definicion_vector #DecVectorGeneral\r\n                  | tipo_declaracion PRIM_ID ':' tipo '=' PRIM_ID '[' expr ']'      #DecVectorAccesoUnElemt\r\n;\r\ndefinicion_vector: '[' expr (',' expr) ']'      \r\n                 | '[' ']'         \r\n                 | PRIM_ID\r\n;\r\n\r\nfunciones_vector: PRIM_ID '.' APPEND '(' expr ')'                   #FuncVectorAppend\r\n                | PRIM_ID '.' REMOVELAST '()'                       #FuncVectorRemoveLast\r\n                | PRIM_ID '.' REMOVE '(' 'at:' expr ')'             #FuncVectorRemove\r\n;\r\n \r\n\r\ndeclaracion: tipo_declaracion PRIM_ID PT_PUNTO tipo OP_IGUAL expr   #ValorTipoDeclaracion // var value: String = \"Hola\"\r\n           | tipo_declaracion PRIM_ID PT_PUNTO tipo INTERROGRACION  #TipoDeclaracion      // var value: String?\r\n           | tipo_declaracion PRIM_ID OP_IGUAL expr                 #ValorDeclaracion     // var value = \"hola\"\r\n;\r\n\r\ntipo_declaracion: (DECLARACION_VAR | DECLARACION_LET);\r\n\r\nasignacion: PRIM_ID op=(INCREMENTO|DECREMENTO) expr                 #InstrDecrementoIncremento\r\n          | PRIM_ID OP_IGUAL expr                                   #InstrAsignacionValor\r\n;\r\n\r\n\r\n//          FUNCIONES\r\ndeclaracion_funcion: FUNC PRIM_ID '(' lista_parametros? ')' ('->' tipo)? '{' block '}'            #FuncDecMetodo\r\n;\r\nlista_parametros: (PRIM_ID|GUION_BAJO)? PRIM_ID ':' tipo (varios_parametros);\r\nvarios_parametros: ',' (PRIM_ID|GUION_BAJO)? PRIM_ID ':' tipo;\r\n\r\nllamada_funciones: PRIM_ID '(' lista_param_llamado? ')';\r\nlista_param_llamado: (PRIM_ID ':')? expr (varios_param_llamado);\r\nvarios_param_llamado: ',' (PRIM_ID ':')? expr;\r\n\r\n\r\n//          SENTENCIAS DE CONTROL\r\n//                  IF\r\nifstmt: IF expr '{' block '}' ELSE ifstmt                           #SentenciaIfElse\r\n      | IF expr '{' block '}' (ELSE '{' block '}')?                 #SentenciaIf\r\n;\r\n\r\n//                  SWITCH\r\nswitchstmt: SWITCH expr '{' (dec_case)* (dec_default)? '}';\r\ndec_case: CASE expr PT_PUNTO block;\r\ndec_default: DEFAULT PT_PUNTO block;\r\n\r\n//                  WHILE\r\nwhilestmt: WHILE expr '{' block '}';\r\n\r\n//                  FOR\r\nforstmt: FOR identifier=(PRIM_ID|'_') IN (expr|rango) '{' block '}';\r\nrango: left=expr '...' right=expr;\r\n\r\n// GUARD\r\nguardstmt: GUARD expr ELSE '{' block transferenciastmt'}';\r\n\r\n\r\n// PRINT\r\nprintstmt: PRINT '(' expr ')'                                       #InstrPrint\r\n         | PRINT '(' expr (',' expr)* ')'                           #InstrPrintConcatenado\r\n;\r\n\r\n\r\n// EXPRESIONES\r\nexpr\r\n    : op=(OP_NOT|OP_RESTA) right=expr                               #ExprOperacionesLogicasNegacion\r\n    | left=expr op=(OP_MULT|OP_DIV|OP_MODULO) right=expr            #ExprOperacionesAritmeticasMultDivMod\r\n    | left=expr op=(OP_SUMA|OP_RESTA) right=expr                    #ExprOperacionesAritmeticasSumaRest\r\n    // OPERACIONES RELACIONALES\r\n    | left=expr op=(OP_MAYOR_O_IGUALQ|OP_MAYORQ) right=expr         #ExprOperacionesRelacionalesMayIgualMayQ\r\n    | left=expr op=(OP_MENOR_O_IGUALQ|OP_MENORQ) right=expr         #ExprOperacionesRelacionalesMenIgualMenQ\r\n    // OPERACIONES COMPARATIVAS\r\n    | left=expr op=(OP_IGUALIGUAL|OP_NOIGUAL) right=expr            #ExprOperacionesComparativas\r\n    // OPERACIONES LOGICAS\r\n    | left=expr op=OP_AND right=expr                                #ExprOperacionesLogicasAnd\r\n    | left=expr op=OP_OR right=expr                                 #ExprOperacionesLogicasOr\r\n    | llamada_funciones                                             #ExprLlamadaFunc\r\n    | '(' expr ')'                                                  #ExprParentesis\r\n    // EXPRESIONES DE UN VECTOR\r\n    | PRIM_ID '.' ISEMPTY                                           #ExprVectorIsEmpty\r\n    | PRIM_ID '.' COUNT                                             #ExprVectorCount\r\n    // TIPOS PRIMITIVOS\r\n    | PRIM_DIGITO                                                   #ExprDigito\r\n    | PRIM_ID                                                       #ExprId\r\n    | PRIM_CADENA                                                   #ExprCadena\r\n    | (TRUE | FALSE)                                                #ExprBool\r\n    | NIL                                                           #ExprNil\r\n;\r\n\r\ntipo: (INT | FLOAT | STRING | BOOL | CHAR);",
	"input": "` + input + `", 
	"lexgrammar": "lexer grammar ExprLexer;\r\n\r\n// TIPOS PRIMITIVOS\r\nINT: 'Int';\r\nFLOAT: 'Float';\r\nSTRING: 'String';\r\nBOOL: 'Bool';\r\nCHAR: 'Character';\r\nNIL: 'nil';\r\nTRUE: 'true';\r\nFALSE: 'false';\r\n\r\n// DECLARACIONES\r\nDECLARACION_VAR: 'var';\r\nDECLARACION_LET: 'let';\r\nPT_COMA: ';';\r\nPT_PUNTO: ':';\r\nINTERROGRACION: '?';\r\n\r\nCORCHETE_I:'[';\r\nCORCHETE_D:']';\r\nCOMA:',';\r\nPARENT_I:'(';\r\nPARENT_D:')';\r\nAT:'at:';\r\nLLAVE_I:'{';\r\nLLAVE_D:'}';\r\nPARENTESIS:'()';\r\nFLECHA_MAY:'->';\r\nTRES_PT:'...';\r\nPUNTO:'.';\r\n\r\n\r\n// INSTRUCCIONES\r\nINCREMENTO: '+=';\r\nDECREMENTO: '-=';\r\n\r\n\r\n// FUNCIONES\r\nFUNC: 'func';\r\nGUION_BAJO: '';\r\n\r\n\r\n// FUNCIONES DE VECTORES\r\nAPPEND:'append';\r\nREMOVELAST:'removeLast';\r\nREMOVE:'remove';\r\nISEMPTY:'isEmpty';\r\nCOUNT:'count';\r\n\r\n\r\n// OPERADORES ARITMETICOS\r\nOP_IGUAL: '=';\r\nOP_SUMA: '+';\r\nOP_RESTA: '-';\r\nOP_MULT: '';\r\nOP_DIV: '/';\r\nOP_MODULO: '%';\r\n//    |       COMPARACION\r\nOP_IGUALIGUAL: '==';\r\nOP_NOIGUAL: '!=';\r\n//    |       RELACIONES\r\nOP_MAYORQ: '>';\r\nOP_MAYOR_O_IGUALQ: '>=';\r\nOP_MENORQ: '<';\r\nOP_MENOR_O_IGUALQ: '<=';\r\n//    |       LOGICOS\r\nOP_AND: '&&';\r\nOP_OR: '||';\r\nOP_NOT: '!';\r\n\r\n\r\n// SENTENCIAS DE CONTROL\r\nIF: 'if';\r\nELSE: 'else';\r\n\r\nSWITCH: 'switch';\r\nCASE: 'case';\r\nDEFAULT: 'default';\r\nPRINT: 'print';\r\n\r\nWHILE: 'while';\r\n\r\nFOR: 'for';\r\nIN: 'in';\r\n\r\n\r\n// GUARD\r\nGUARD: 'guard';\r\n\r\n\r\n\r\n// SENTENCIAS DE TRASFERENCIA\r\nBREAK: 'break';\r\nCONTINUE: 'continue';\r\nRETURN: 'return';\r\n\r\n\r\n// EXPRESIONES REGULARES\r\nPRIM_DIGITO: [0-9]+ ('.'[0-9]+)?;\r\nPRIM_CADENA: '\"'~[\"]'\"';\r\nPRIM_ID: [a-zA-Z][a-zA-Z0-9_];\r\n\r\n// SKIP\r\nESPACIO_BLANCO: [ \\\\\\r\\n\\t]+ -> skip;\r\nCOMENTARIO_LINEA: '//' ~[\\r\\n] -> skip;\r\nCOMENTARIO_MULTI: '/' .? '*/' -> skip;\r\n\r\nfragment\r\nESC_SEQ\r\n    :   '\\\\' ('\\\\'|'@'|'['|']'|'.'|'#'|'+'|'-'|'!'|':'|' ')\r\n    ;\r\n",
	"start": "start"}`)

	// request
	req, err := http.NewRequest("POST", url, bytes.NewBuffer(payload))

	if err != nil {
		fmt.Println("Error creating request:", err)
		return ""
	}
	req.Header.Set("Content-Type", "application/json") // Set the appropriate content type

	client := &http.Client{}
	resp, err := client.Do(req)
	if err != nil {
		fmt.Println("Error sending request:", err)
		return ""
	}
	defer resp.Body.Close()

	fmt.Println("Response Status:", resp.Status)

	// parse the response body to json
	body, err := io.ReadAll(resp.Body)
	if err != nil {
		fmt.Println("Error reading body:", err)
		return ""
	}

	// create a map to store the json
	var data map[string]interface{}

	// unmarshal the json
	err = json.Unmarshal(body, &data)
	if err != nil {
		fmt.Println("Error unmarshalling json:", err)
		return ""
	}

	// fmt.Println("Response Body:", data)

	result := data["result"].(map[string]interface{})

	// fmt.Println("Response Body:", result["svgtree"])

	// create the file
	err = os.WriteFile("cst.svg", []byte(result["svgtree"].(string)), 0644)
	if err != nil {
		fmt.Println("Error creating file:", err)
		return ""
	}

	fmt.Println("File created successfully")

	return result["svgtree"].(string)

}

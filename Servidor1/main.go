package main

import (
	//"Servidor1/environment"

	"Servidor1/environment"
	console "Servidor1/environment"
	"Servidor1/instructionExpre"
	"Servidor1/interfaces"
	"Servidor1/parser"
	"fmt"
	"html/template"
	"net/http"
	"reflect"

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
	if len(globalEnv.TablaModules) == 0 {
		environment.NewError("No se encontró ninguna definición de módulo ", globalEnv.Nombre, 0, 0)

	}
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

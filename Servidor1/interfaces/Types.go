package interfaces

type TipoExpresion int
type TipoAccess int

const (
	INTEGER TipoExpresion = iota
	FLOAT
	STRING
	STR
	BOOLEAN
	ARRAY
	VOID
	NULL
	STRUCT
	BREAK
	CONTINUE
	RETURN
	VECTOR
	CHAR
)

var nametype = [14]string{
	"Int",
	"Float",
	"String",
	" String",
	"Bool",
	"array",
	"void",
	"nil",
	"struct",
	"break",
	"continue",
	"return",
	"vector",
	"Character",
}

func GetType(tipo TipoExpresion) string {

	return nametype[tipo]
}

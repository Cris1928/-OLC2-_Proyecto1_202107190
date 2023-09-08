lexer grammar swiftlexer;


// Tokens

// reserved words
//Types
PRINT_CON: 'print';
T_NUMBER:   'Int';
T_FLOAT:   'Float';
T_STRING:   'String';
T_BOOL:   'Bool';
T_STR:   ' String';
T_CHAT:   'Character';
T_ARRAY:   'array';
T_VECTOR:   'Vector';
USIZE: 'usize';



//sentences
IF:       'if';
ELSE:       'else';
WHILE:  'while';
FOR:    'for';
IN:     'in';

BREAK: 'break';
CONTINUE: 'continue';

SWITCH:       'switch';
MTOR:       '|';
CASE:       'case';
DEFAULT:       'default';

TRUE: 'true';
FALSE: 'false';

AS:       'as';
AT:       'at';

//POW:   'pow';
//POWF:   'powf';

LET:   'let';
MUT:   'var';

STRUCT:  'struct';
VEC:     'vec!';
VECN:     'vec';
CAPACITY:     'with_capacity';

//functions
TO_STRING:   '.to_string()';
TO_OWNED:   '.to_owned()';

LEN:        'count';
NEW:        'new()';
CAPF:       'capacity()';
CLONE:      'clone()';
ABS:        'abs()';
PUSH:       'append';


INSERT:     'insert';
REMOVE:     'remove';

MODULO:        'mod';

//funciones
TYPETHEN:      '->';

FN:     'func';
MAIN:   'main';
RETURN: 'return';

//REF: '&mut';


NUMBER: [0-9]+;
FLOAT: [0-9]+[.][0-9]+;
STRING: '"'~["]*'"';


PUNTO:          '.';
COMA:          ',';
PTCOMA:         ';';
DOSPUNTO:         '::';
DPUNTO2:         ':';

ASIGNACION:         '=';
MTHEN:         '=>';
GUIONB:         '_';

ID: ([a-zA-Z_])[a-zA-Z0-9_]*;

//RELACIONALES
DISTINTO:      '!=';
IGUAL:          '==';
MAYORIGUAL:     '>=';
MENORIGUAL:     '<=';
MAYOR:          '>';
MENOR:          '<';
ASIG :          '+=';

//aritment
MUL:            '*';
DIV:            '/';
ADD:            '+';
SUB:            '-';
MOD:            '%';

//LOGIC
AND:        '&&';
OR:         '||';
NOT:         '!' ;

INTERROG:'?';
//signos
AMP:            '&';
INOUT:            'inout'; //ne1

PARIZQ:         '(';
PARDER:         ')';
LLAVEIZQ:       '{';
LLAVEDER:       '}';
CORIZQ:         '[';
CORDER:         ']';

CHAR: ['][a-zA-Z0-9]['];

WHITESPACE: [ \\\r\n\t]+ -> skip;
L_COMMENT : '//' ~[\r\n]* -> skip;
COMMENT : '/*' .*? '*/' -> skip;

fragment
ESC_SEQ
    :   '\\' ('\\'|'@'|'['|']'|'.'|'#'|'+'|'-'|'!'|':'|' ')
    ;


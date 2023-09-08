parser grammar swiftgrammar;


options {
  tokenVocab = swiftlexer;
}
@header {
    import arrayList "github.com/colegno/arraylist"
    import "Servidor1/interfaces"
    import "Servidor1/expresion"
    import "Servidor1/instructionExpre"
    import "Servidor1/instruction"



}
/*-----------------------------------------------------------------------*/
start returns [*arrayList.List lista]
  : listaglobal {$lista = $listaglobal.lista}
;

instrucciones returns [*arrayList.List l]
  @init{
    $l =  arrayList.New()
  }
  : e +=instruccion*  {
      listInt := localctx.(*InstruccionesContext).GetE()
      		for _, e := range listInt {
            $l.Add(e.GetInstr())
          }
          //fmt.Printf("tipo %T",localctx.(*InstruccionesContext).GetE())
    }
;



listaglobal returns [*arrayList.List lista]
@init{
    $lista = arrayList.New()
}
    : lisfun =  listaglobal in_global  {
                                          $lisfun.lista.Add( $in_global.globals)
                                          $lista =  $lisfun.lista
                                        }
    | in_global     { $lista.Add( $in_global.globals ) }
;

in_global returns[ interfaces.Instruction globals ]
    : funcion   {$globals = $funcion.instr}
 //   | module    { $globals = $module.modu }
    | newStruct {$globals = $newStruct.str} 
;

/*module returns[ interfaces.Instruction modu ]
: MODULO ID LLAVEIZQ modulo_cuerp LLAVEDER  { 
        $modu = modules.NewModule( $ID.text, $modulo_cuerp.mod_list, $MODULO.line, $MODULO.pos ) 
    }
;*/
/*
modulo_cuerp returns[*arrayList.List mod_list]
    : l_mod=modulo_cuerp accesot module    {
                                            newmod := modules.NewModuleCont($accesot.modAccess, interfaces.MOD, $module.modu)
                                            $l_mod.mod_list.Add(newmod)
                                            $mod_list = $l_mod.mod_list
                                        }
    | l_mod=modulo_cuerp accesot modulo_item    {
                                            newmod := modules.NewModuleCont($accesot.modAccess, interfaces.INS, $modulo_item.instr)
                                            $l_mod.mod_list.Add(newmod)
                                            $mod_list = $l_mod.mod_list
                                        }

    | accesot module   {
                            $mod_list = arrayList.New()
                            newmod := modules.NewModuleCont($accesot.modAccess, interfaces.MOD, $module.modu)
                            $mod_list.Add(newmod)
                        }
    | accesot modulo_item {
                            $mod_list = arrayList.New()
                            newmod := modules.NewModuleCont($accesot.modAccess, interfaces.INS, $modulo_item.instr)
                            $mod_list.Add(newmod)
                        }
;*/
/* 
accesot returns [interfaces.TipoAccess  modAccess]
    : PUBLIC  { $modAccess = interfaces.PUBLIC}
    |         { $modAccess = interfaces.PRIVATE}
;
*/
modulo_item returns[interfaces.Instruction instr]
    : funcion       {$instr = $funcion.instr}
    | newStruct     {$instr = $newStruct.str} 
;


funcion   returns [ interfaces.Instruction  instr]
@init{ listParams :=  arrayList.New() }
    : fn_main             {$instr =  $fn_main.instr}
    | FN  ID '(' ')' '->' tipos_var bloque_inst    { $instr = instructionExpre.NewFunction($ID.text,listParams,$bloque_inst.l, $tipos_var.tipo, $ID.line, $ID.pos, "" )}
 /*   | FN  ID '(' ')' '->' VECN '<' idob=ID '>' bloque_inst    { $instr = instructionExpre.NewFunction($ID.text,listParams,$bloque_inst.l, interfaces.VOID, $ID.line, $ID.pos,  $idob.text )}
  */  | FN  ID '(' ')' '->' idob=ID bloque_inst    { $instr = instructionExpre.NewFunction($ID.text,listParams,$bloque_inst.l, interfaces.VOID, $ID.line, $ID.pos,  $idob.text )}

    | FN  ID '(' ')' bloque_inst                   { $instr = instructionExpre.NewFunction($ID.text,listParams,$bloque_inst.l, interfaces.VOID, $ID.line, $ID.pos, "" )}
    | FN  ID '(' params_declar ')' bloque_inst     { $instr = instructionExpre.NewFunction($ID.text,$params_declar.lista,$bloque_inst.l, interfaces.VOID, $ID.line, $ID.pos, "" )}

    | FN  ID '('  params_declar ')' '->' tipos_var bloque_inst   { $instr = instructionExpre.NewFunction($ID.text,$params_declar.lista, $bloque_inst.l,$tipos_var.tipo, $ID.line, $ID.pos, "" )}
/*  | FN  id=ID '('  params_declar ')' '->' VECN '<' idob=ID '>' bloque_inst   { $instr = instructionExpre.NewFunction($id.text,$params_declar.lista, $bloque_inst.l, interfaces.VECTOR, $id.line, $id.pos, $idob.text  )}
    | FN  id=ID '('  params_declar ')' '->' VECN '<' tipos_var '>' bloque_inst   { $instr = instructionExpre.NewFunction($id.text,$params_declar.lista, $bloque_inst.l, interfaces.VECTOR, $id.line, $id.pos, ""  )}
  */| FN  id=ID '('  params_declar ')' '->' idob=ID bloque_inst   { $instr = instructionExpre.NewFunction($id.text,$params_declar.lista, $bloque_inst.l, interfaces.VOID, $id.line, $id.pos, $idob.text  )}
;




params_declar returns [*arrayList.List lista]
@init{
$lista =  arrayList.New()
}
    : listdec = params_declar ','  declar_parametros    {
                                                            $listdec.lista.Add($declar_parametros.in_dec)
                                                            $lista =  $listdec.lista }
    | declar_parametros {   $lista.Add($declar_parametros.in_dec) }
;

declar_parametros returns [interfaces.Instruction in_dec]
    : isVar=es_var ID ':' tipos_var {
                        listaIdes := arrayList.New()
                        listaIdes.Add(expresion.NewIdentificador($ID.text, $ID.line, $ID.pos ))
                        decl := instruction.NewDeclaration($ID.text, $tipos_var.tipo, nil, $isVar.mut, $ID.line, $ID.pos )
                        $in_dec = decl
                    }
    | id=ID ':' es_referencia '[' idob=ID ']' {
                        decl := instruction.NewVectorDeclaration($id.text, interfaces.NULL, nil, $es_referencia.ref, $id.line, $id.pos, nil, $idob.text)
                        $in_dec = decl
                    }
    | id=ID ':' es_referencia  '[' tipos_var ']' {
                        decl := instruction.NewVectorDeclaration($id.text, $tipos_var.tipo, nil, $es_referencia.ref, $id.line, $id.pos, nil, "")
                        $in_dec = decl
                    }
    | ID ':' INOUT array_type {
                        listaIdes := arrayList.New()
                        listaIdes.Add(expresion.NewIdentificador($ID.text, $ID.line, $ID.pos ))
                        decl := instruction.NewArrayDeclaration($ID.text, $array_type.ty, nil, true, $ID.line, $ID.pos )
                        $in_dec = decl
                    }
 
    | id=ID ':' es_referencia idstruct=ID { 
                            decl := instruction.NewDeclaration($id.text, interfaces.STRUCT, nil, $es_referencia.ref, $id.line, $id.pos)
                            $in_dec = decl
                        }
    | isRef=es_var id=ID ':'  '[' idob=ID ']' {
                        decl := instruction.NewVectorDeclaration($id.text, interfaces.NULL, nil, $isRef.mut, $id.line, $id.pos, nil, $idob.text)
                        $in_dec = decl
                    }
;


//funciones
/*fn_main returns[interfaces.Instruction instr]
@init{ listParams:= arrayList.New() }
    : FN MAIN '(' ')' bloque_inst
    { $instr = instructionExpre.NewFunction("main",listParams,$bloque_inst.l, interfaces.VOID, $MAIN.line, $MAIN.pos, "" )}
;*/

fn_main returns[interfaces.Instruction instr]
@init{ listParams:= arrayList.New() }
   // : FN MAIN '(' ')' bloque_inst

  : bloque_princip  '.'
    { $instr = instructionExpre.NewFunction("main",listParams,$bloque_princip.l, interfaces.VOID, 0, 0, "" )}
   
;

instruccion returns [interfaces.Instruction instr]
  : printconsola  {$instr = $printconsola.instr}
  | declaracion  {$instr = $declaracion.instr}
  | asignacion  {$instr = $asignacion.instr}

  | appendVec  {$instr = $appendVec.instr}

  | if_sent  {$instr = $if_sent.instr}
  | switch_sent {$instr = $switch_sent.instr}

  | while_true { $instr = $while_true.lop }
  | lWhile { $instr = $lWhile.lwh }
  | lForin { $instr = $lForin.lfor }
  

  | lBreak  { $instr = $lBreak.br }
  | lContinue  { $instr = $lContinue.cn }
  
  | newStruct  {$instr = $newStruct.str} 
  
  | callFunction  {$instr = $callFunction.instr} 
  | returnFun  {$instr = $returnFun.instr} 

  | ID '.' REMOVE '(' AT ':' expression ')'  { $instr = instructionExpre.NewRemove($ID.text, $expression.p, $ID.line, $ID.pos) }

;

instruccion_dentro returns [interfaces.Instruction instr]
  : printconsola  {$instr = $printconsola.instr}
  | declaracion  {$instr = $declaracion.instr}
  | asignacion {$instr = $asignacion.instr}

  | appendVec  {$instr = $appendVec.instr}

  | if_sent  {$instr = $if_sent.instr}
  | switch_sent {$instr = $switch_sent.instr}

  | while_true { $instr = $while_true.lop }
  | lWhile { $instr = $lWhile.lwh }
  | lForin { $instr = $lForin.lfor }

  | lBreak  { $instr = $lBreak.br }
  | lContinue  { $instr = $lContinue.cn }

  | callFunction {$instr = $callFunction.instr} 
  | returnFun  {$instr = $returnFun.instr}
 // | callModulo {$instr = $callModulo.instr}

  | ID '.' REMOVE '(' expression ')' { $instr = instructionExpre.NewRemove($ID.text, $expression.p, $ID.line, $ID.pos) }
;

/*vector funciones*/
appendVec returns [interfaces.Instruction instr]
    : ID '.' PUSH '('val=expression')' {$instr = instruction.NewPush($ID.text, $val.p, $ID.line, $ID.pos  )}
    | ID '.' INSERT '(' val1=expression ',' val2=expression ')' { $instr = instruction.NewInsert($ID.text, $val1.p, $val2.p, $ID.line, $ID.pos) }
;
newStruct returns[interfaces.Instruction str]
: STRUCT ID LLAVEIZQ lista_struct LLAVEDER { $str = instructionExpre.NewStruct($ID.text, $lista_struct.l, $STRUCT.line, $STRUCT.pos) }
;

lista_struct returns[*arrayList.List l]
: list=lista_struct MUT id=ID ':' tipos_var  {
                                        Str_atrib := interfaces.NewStructType($id.text, $tipos_var.tipo, "")
                                        $list.l.Add(Str_atrib);
                                        $l = $list.l;
                                    }
| list=lista_struct MUT id=ID ':' idstru=ID {
                                        Str_atrib := interfaces.NewStructType($id.text, interfaces.NULL, $idstru.text)
                                        $list.l.Add(Str_atrib);
                                        $l = $list.l;
                                    }

| list=lista_struct LET id=ID ':' tipos_var  {
                                        Str_atrib := interfaces.NewStructType($id.text, $tipos_var.tipo, "")
                                        $list.l.Add(Str_atrib);
                                        $l = $list.l;
                                    }
| list=lista_struct LET id=ID ':' idstru=ID {
                                        Str_atrib := interfaces.NewStructType($id.text, interfaces.NULL, $idstru.text)
                                        $list.l.Add(Str_atrib);
                                        $l = $list.l;
                                    }

| MUT id=ID ':' tipos_var {
                    Str_atrib := interfaces.NewStructType($id.text, $tipos_var.tipo, "")
                    $l = arrayList.New();
                    $l.Add(Str_atrib);
                }
| MUT id=ID ':' idstru=ID {
                    Str_atrib := interfaces.NewStructType($id.text, interfaces.NULL, $idstru.text)
                    $l = arrayList.New();
                    $l.Add(Str_atrib);
                }

| LET id=ID ':' tipos_var {
                    Str_atrib := interfaces.NewStructType($id.text, $tipos_var.tipo, "")
                    $l = arrayList.New();
                    $l.Add(Str_atrib);
                }
| LET id=ID ':' idstru=ID {
                    Str_atrib := interfaces.NewStructType($id.text, interfaces.NULL, $idstru.text)
                    $l = arrayList.New();
                    $l.Add(Str_atrib);
                }
;

//llamada a funcion
callFunction returns [interfaces.Instruction instr, interfaces.Expresion p]
    : ID '(' ')'    {
                        $instr = instructionExpre.NewCallFunction($ID.text, arrayList.New(), $ID.line, $ID.pos )
                        $p = instructionExpre.NewCallFunction($ID.text, arrayList.New(), $ID.line, $ID.pos )
                    }
    | ID '(' listParamsCall ')' {
                        $instr = instructionExpre.NewCallFunction($ID.text, $listParamsCall.l_e, $ID.line, $ID.pos )
                        $p = instructionExpre.NewCallFunction($ID.text, $listParamsCall.l_e, $ID.line, $ID.pos )
                    }
;
/* 
//llamada a modulo
// PENDENTEEEEEEEEEEEEEEEEEE ENTREADA
callModulo returns [interfaces.Instruction instr, interfaces.Expresion p]
    : listModulec expression {
        $p = instructionExpre.NewModuleAccess($listModulec.lm, $expression.p, $listModulec.start.GetLine(),$listModulec.start.GetColumn() )
        $instr = instructionExpre.NewModuleAccess($listModulec.lm, $expression.p, $listModulec.start.GetLine(),$listModulec.start.GetColumn() )
    }
;

listModulec returns [*arrayList.List lm]
@init{  $lm = arrayList.New()   }
    : list = listModulec ID '::'    {
                                $list.lm.Add($ID.text)
                                $lm = $list.lm
                            }
    | ID '::'   {
                    $lm.Add($ID.text)
                }
;*/
//PENDIENTEEEEEEEEEEEESALIDA finally

returnFun returns [interfaces.Instruction instr]
    : RETURN                { $instr = instructionExpre.NewReturn(nil, $RETURN.line, $RETURN.pos )}
    | RETURN  expression    { $instr = instructionExpre.NewReturn($expression.p, $RETURN.line, $RETURN.pos )}
;

printconsola returns [interfaces.Instruction instr]
    : PRINT_CON PARIZQ listParams PARDER {$instr = instruction.NewImprimir($listParams.l_e, $PRINT_CON.line, localctx.(*PrintconsolaContext).Get_PRINT_CON().GetColumn() )}
    //: PRINT_CON PARIZQ expression PARDER {$instr = instruction.NewImprimir($expression.p)}
;

while_true returns [interfaces.Instruction lop, interfaces.Expresion p]
: WHILE TRUE bloque_inst  { 
                        $lop = instructionExpre.NewLoop($bloque_inst.l, $WHILE.line, $WHILE.pos )
                        $p = instructionExpre.NewLoop($bloque_inst.l, $WHILE.line, $WHILE.pos ) 
                    }
;

lWhile returns[interfaces.Instruction lwh]
: WHILE expression bloque_inst { $lwh = instruction.NewWhile($expression.p, $bloque_inst.l, $WHILE.line, $WHILE.pos ) }
;


lForin returns[interfaces.Instruction lfor]
: FOR ID IN expression bloque_inst { $lfor = instruction.NewForIn($ID.text, $expression.p, $bloque_inst.l, $FOR.line, $FOR.pos) }
//| FOR ID IN exstring bloque_inst { $lfor = instruction.NewForIn($ID.text, $exstring.p, $bloque_inst.l, $FOR.line, $FOR.pos) }
;

lBreak returns[interfaces.Instruction br]
: BREAK { $br = instructionExpre.NewBreak(nil, $BREAK.line, $BREAK.pos) }
| BREAK expression { $br = instructionExpre.NewBreak($expression.p, $BREAK.line, $BREAK.pos ) }
;

lContinue returns[interfaces.Instruction cn]
: CONTINUE { $cn = instructionExpre.NewContinue($CONTINUE.line, $CONTINUE.pos) }
;

listParams returns [*arrayList.List l_e]
@init{
    $l_e = arrayList.New()
}
    : list = listParams ',' expression   {
                                    $list.l_e.Add($expression.p)
                                    $l_e = $list.l_e
                                }
    | expression {$l_e.Add($expression.p)}
;


listParamsCall returns [*arrayList.List l_e]
@init{
    $l_e = arrayList.New()
}
    : list = listParamsCall ',' es_referencia expression   {
                                    ref := instructionExpre.NewParameterBy($expression.p, $es_referencia.ref)
                                    $list.l_e.Add(ref)
                                    $l_e = $list.l_e
                                }
    | es_referencia expression    {   ref := instructionExpre.NewParameterBy($expression.p, $es_referencia.ref)
                        $l_e.Add(ref)
                    }
;

es_referencia returns [bool ref]
   : AMP { $ref = true }
   | { $ref = false }
;


declaracion returns [interfaces.Instruction instr]/*  */
    :isVar=es_varr id=ID ':' tipos_var asig ='=' expression { 
                        $instr = instruction.NewDeclaration($id.text, $tipos_var.tipo, $expression.p, $isVar.mut, $asig.line, localctx.(*DeclaracionContext).GetAsig().GetColumn())
                      }
    | isVar=es_varr id=ID letid asig ='=' expression { 
                      $instr = instruction.NewDeclaration($id.text, interfaces.NULL, $expression.p, $isVar.mut, $asig.line, localctx.(*DeclaracionContext).GetAsig().GetColumn())
                    }
    /*arrays*/
   // |LET* isVar=es_var id=ID ':' array_type asig ='=' expression {
    //                  $instr = instruction.NewArrayDeclaration($id.text, $array_type.ty, $expression.p, $isVar.mut, $asig.line, localctx.(*DeclaracionContext).GetAsig().GetColumn())
     //               }
    /*vectores*/
  
    | isVar=es_varr id=ID ':'  vector_types '=' CORIZQ CORDER {
                        $instr = instruction.NewVectorDeclaration($id.text, $vector_types.tipo, nil, $isVar.mut, $id.line, $id.pos, nil, "")
                    }
    |isVar=es_varr id=ID ':'  vector_types '=' expression {
                        $instr = instruction.NewVectorDeclaration($id.text, $vector_types.tipo, nil, $isVar.mut, $id.line, $id.pos,$expression.p, "")
                    }
   
    | isVar=es_varr id=ID ':'   '[' idob=ID ']' '=' CORIZQ CORDER  {
                        $instr = instruction.NewVectorDeclaration($id.text, interfaces.STRUCT, nil, $isVar.mut, $id.line, $id.pos, nil, $idob.text)
                    }
   /* | isVar=es_var id=ID ':' VECN '<' tipos_var '>' '=' VECN '::' CAPACITY '('expression')' {
                        $instr = instruction.NewVectorDeclaration($id.text, $tipos_var.tipo, $expression.p, $isVar.mut, $VECN.line, $VECN.pos, nil, "")
                    }
    | isVar=es_var id=ID ':' VECN '<' idob=ID '>' '=' VECN '::' CAPACITY '('expression')' {
                        $instr = instruction.NewVectorDeclaration($id.text, interfaces.NULL, $expression.p, $isVar.mut, $VECN.line, $VECN.pos, nil, $idob.text)
                    }*/

    | isVar=es_varr id=ID ':'  '[' idob=ID ']' '=' expression {
                        $instr = instruction.NewVectorDeclaration($id.text, interfaces.NULL, nil, $isVar.mut, $id.line, $id.pos, $expression.p, $idob.text)
                    }
    | isVar=es_varr id=ID ':'  '[' tipos_var ']' '=' expression {
                        $instr = instruction.NewVectorDeclaration($id.text, $tipos_var.tipo, nil, $isVar.mut, $id.line, $id.pos, $expression.p, "")
                    }
;

es_var returns [bool mut]
   : MUT { $mut = true }
   | 
;
es_varr returns [bool mut]
   : MUT { $mut = true }
   | LET { $mut = false }
;

letid returns []
   : ':' ID
   |
;

vector_types returns [interfaces.TipoExpresion tipo]
    :'[' vector_types ']' { $tipo = interfaces.VECTOR }
    |'[' tipos_var ']' { $tipo = $tipos_var.tipo }
;



array_type returns [*arrayList.List ty]
@init{
    $ty = arrayList.New()
}
: CORIZQ array_type ';' expression ']' {
                                        nType := interfaces.NewArrayType(interfaces.ARRAY, $expression.p, $CORIZQ.line, $CORIZQ.pos )
                                        $array_type.ty.Add(nType)
                                        $ty = $array_type.ty
                                    }
| CORIZQ tipos_var ';' expression ']'  {
                                      nType := interfaces.NewArrayType($tipos_var.tipo, $expression.p, $CORIZQ.line, $CORIZQ.pos )
                                      $ty.Add(nType)
                                    }

| CORIZQ tipos_var ']'  {
                                      nType := interfaces.NewArrayType($tipos_var.tipo, nil, $CORIZQ.line, $CORIZQ.pos )
                                      $ty.Add(nType)
                                    }
;

asignacion returns [interfaces.Instruction instr]
    : id=ID '=' expression {$instr = instruction.NewAssignment($id.text,$expression.p, nil, $id.line, localctx.(*AsignacionContext).GetId().GetColumn() )}
    /*array asignacion*/
    | id=ID list_index '=' expression {$instr = instruction.NewAssignment($id.text,$expression.p, $list_index.lista, $id.line, localctx.(*AsignacionContext).GetId().GetColumn() )}

    /*struct asignacion*/
    | l_AccessStruct '=' expression { $instr = instruction.NewAssignmentStruct($l_AccessStruct.l, $expression.p, $l_AccessStruct.start.GetLine(),$l_AccessStruct.start.GetColumn()) }

    /*vector asignacion*/
    //| id=ID '[' index=expression ']' '.'idstr=ID'=' val=expression {$instr = instruction.NewAssignmentVec($id.text, $index.p, $idstr.text, $val.p, $id.line, localctx.(*AsignacionContext).GetId().GetColumn() )}
    | id=ID '[' index=expression ']' '.' l_AccessStruct '=' val=expression {$instr = instruction.NewAssignmentVec($id.text, $index.p, $l_AccessStruct.l, $val.p, $id.line, localctx.(*AsignacionContext).GetId().GetColumn() )}

  /*  | id=ID '=' VECN '::' CAPACITY '('expression')' {
                        $instr = instruction.NewAssignmentVeca p($id.text, $expression.p, $id.line, $id.pos) NewIncrement
                }*/

    | id=ID '+=' expression {$instr = instruction.NewIncrement($id.text,$expression.p, $id.line, localctx.(*AsignacionContext).GetId().GetColumn())}

;


l_AccessStruct returns[*arrayList.List l]
: list=l_AccessStruct '.' ID {
                                   $list.l.Add($ID.text)
                                   $l = $list.l
                                  }
| ID {
            $l = arrayList.New()
            $l.Add($ID.text)
}
;

list_index returns[*arrayList.List lista]
@init{
    $lista = arrayList.New()
}
    :  listi = list_index index_array {
                                      $listi.lista.Add($index_array.index)
                                      $lista = $listi.lista
                                  }
    |  index_array  {$lista.Add($index_array.index)}
;

index_array   returns [interfaces.Expresion index]
    :   '[' expression ']'  {$index = $expression.p}
;

//  IF
if_sent  returns [interfaces.Instruction instr]
    : IF expression bloque_inst  {$instr = instruction.NewIf($expression.p, $bloque_inst.l, nil,nil, $IF.line, localctx.(*If_sentContext).Get_IF().GetColumn() )}
    | IF expression bprin = bloque_inst ELSE  belse = bloque_inst   {$instr = instruction.NewIf($expression.p,$bprin.l,nil,$belse.l, $IF.line, localctx.(*If_sentContext).Get_IF().GetColumn() )}
    | IF expression bprin = bloque_inst list_elseif {$instr = instruction.NewIf($expression.p,$bprin.l,$list_elseif.lista, nil, $IF.line, localctx.(*If_sentContext).Get_IF().GetColumn() )}
    | IF expression bprin = bloque_inst list_elseif ELSE  belse = bloque_inst {$instr = instruction.NewIf($expression.p,$bprin.l,$list_elseif.lista, $belse.l, $IF.line, localctx.(*If_sentContext).Get_IF().GetColumn() )}
;

//  IF as EXPRESION
if_exp returns [interfaces.Expresion p]
    : IF expression bprin_e = bloque_exp ELSE  belse_e = bloque_exp {$p = instruction.NewIfExpre($expression.p, nil ,nil, nil, $IF.line, localctx.(*If_expContext).Get_IF().GetColumn(), true, $bprin_e.p, nil, $belse_e.p )}
    | IF expression bprin_e = bloque_exp list_elseif_exp ELSE  belse_e = bloque_exp {
        $p = instruction.NewIfExpre($expression.p,nil,nil, nil, $IF.line, localctx.(*If_expContext).Get_IF().GetColumn(), true, $bprin_e.p, $list_elseif_exp.lista,  $belse_e.p )
    }
;

list_elseif returns [*arrayList.List lista]
@init{ $lista = arrayList.New()}
: list += else_if+ {
                    listInt := localctx.(*List_elseifContext).GetList()
                    for _, e := range listInt {
                        $lista.Add(e.GetInstr())
                    }
                    }
;

list_elseif_exp returns [*arrayList.List lista]
@init{ $lista = arrayList.New()}
: list += else_if_exp+ {
                    listInt := localctx.(*List_elseif_expContext).GetList()
                    for _, e := range listInt {
                        $lista.Add(e.GetP())
                    }
                    }
;

else_if returns [interfaces.Instruction instr]
    : ELSE IF expression bloque_inst  {$instr = instruction.NewIf($expression.p,$bloque_inst.l,nil,nil, $ELSE.line, localctx.(*Else_ifContext).Get_ELSE().GetColumn() )}
;

else_if_exp returns [interfaces.Expresion p]
    : ELSE IF expression bloque_exp  {$p = instruction.NewIfExpre($expression.p,nil,nil,nil, $ELSE.line, localctx.(*Else_if_expContext).Get_ELSE().GetColumn(), true, $bloque_exp.p, nil, nil )}
;


//  SWITCH primerC
switch_sent  returns [interfaces.Instruction instr, interfaces.Expresion p]
    : SWITCH expression LLAVEIZQ brazos = match_brazos LLAVEDER {
                        $instr = instructionExpre.NewMatch($expression.p, $brazos.l_brazos, nil, nil, $SWITCH.line, localctx.(*Switch_sentContext).Get_SWITCH().GetColumn(), nil, false )
      }
    | SWITCH expression LLAVEIZQ brazos = match_brazos DEFAULT th=':' bloque_inst  LLAVEDER {
                          $instr = instructionExpre.NewMatch($expression.p, $brazos.l_brazos, $bloque_inst.l, nil, $SWITCH.line, localctx.(*Switch_sentContext).Get_SWITCH().GetColumn(), nil, false )
      }
    | SWITCH expression LLAVEIZQ brazos = match_brazos DEFAULT th=':' instruccion_dentro  LLAVEDER {
                          $instr = instructionExpre.NewMatch($expression.p, $brazos.l_brazos, nil,  $instruccion_dentro.instr,  $SWITCH.line, localctx.(*Switch_sentContext).Get_SWITCH().GetColumn(), nil, false )
      }

    /*match expresiones*/
    | SWITCH exp=expression LLAVEIZQ brazosexp = match_brazos_exp LLAVEDER {
                        $p = instructionExpre.NewMatch($exp.p, $brazosexp.l_brazos, nil, nil, $SWITCH.line, localctx.(*Switch_sentContext).Get_SWITCH().GetColumn(), nil, true )
      }
    | SWITCH exp=expression LLAVEIZQ brazosexp = match_brazos_exp DEFAULT th=':' exp_= expression  LLAVEDER {
                        $p = instructionExpre.NewMatch($exp.p, $brazosexp.l_brazos, nil,  nil,  $SWITCH.line, localctx.(*Switch_sentContext).Get_SWITCH().GetColumn(), $exp_.p, true )
      }

;

match_brazos returns [*arrayList.List l_brazos]
@init{
    $l_brazos = arrayList.New()
}
    : listb = match_brazos matchbrazo   {
                                    $listb.l_brazos.Add($matchbrazo.brazo)
                                    $l_brazos = $listb.l_brazos
                                }
    | matchbrazo {$l_brazos.Add($matchbrazo.brazo)}
;

match_brazos_exp returns [*arrayList.List l_brazos]
@init{
    $l_brazos = arrayList.New()
}
    : listb = match_brazos_exp matchbrazo_exp   {
                                    $listb.l_brazos.Add($matchbrazo_exp.brazo)
                                    $l_brazos = $listb.l_brazos
                                }
    | matchbrazo_exp {$l_brazos.Add($matchbrazo_exp.brazo)}
;

matchbrazo returns [instructionExpre.BrazoMatch brazo]
    : CASE listaOpciones th=':' bloque_inst  { $brazo = instructionExpre.NewBrazoMatch($listaOpciones.lisop, $bloque_inst.l, nil, $th.line, localctx.(*MatchbrazoContext).GetTh().GetColumn(), nil ) }
    | CASE listaOpciones th=':' instruccion_dentro  { $brazo = instructionExpre.NewBrazoMatch($listaOpciones.lisop, nil,  $instruccion_dentro.instr, $th.line, localctx.(*MatchbrazoContext).GetTh().GetColumn(), nil ) }
    
    //: listaOpciones '=>' ((bloque_inst | instruccion) ',')? { $instr = expresion.NewArray($listaOpciones.lisop, $bloque_inst.l ) }
    //| listaOpciones '=>' (expression ',')? { $instr = expresion.NewArray($listaOpciones.lisop, $expression.p) }
;

matchbrazo_exp returns [instructionExpre.BrazoMatch brazo]
    : listaOpciones th=':' expression  { $brazo = instructionExpre.NewBrazoMatch($listaOpciones.lisop, nil,  nil, $th.line, localctx.(*Matchbrazo_expContext).GetTh().GetColumn(), $expression.p ) }
;


listaOpciones returns [*arrayList.List lisop]
@init{
    $lisop = arrayList.New()
}
    : list = listaOpciones ',' primitivo  {
                                            $list.lisop.Add( $primitivo.p )
                                            $lisop =  $list.lisop
                                          }
    | primitivo   {
                    $lisop.Add( $primitivo.p )
                  }
;

bloque_inst returns [ *arrayList.List  l]
    : LLAVEIZQ instrucciones LLAVEDER   {$l = $instrucciones.l }
    | LLAVEIZQ LLAVEDER   {$l = arrayList.New()}
;
bloque_princip returns [ *arrayList.List  l]
    : instrucciones    {$l = $instrucciones.l }
    |   {$l = arrayList.New()}
;

bloque_exp returns [interfaces.Expresion p]
    : LLAVEIZQ expression LLAVEDER   {$p = $expression.p}
;



tipos_var returns[interfaces.TipoExpresion tipo]
    : T_NUMBER INTERROG* {$tipo = interfaces.INTEGER}
    | T_STRING  INTERROG* {$tipo = interfaces.STRING}
    | T_FLOAT INTERROG* {$tipo = interfaces.FLOAT}
    | T_BOOL  INTERROG* {$tipo = interfaces.BOOLEAN}
    | T_STR INTERROG* {$tipo = interfaces.STR}
    | STRUCT INTERROG* {$tipo = interfaces.STRUCT}
    | T_CHAT INTERROG* {$tipo = interfaces.CHAR}

    | T_ARRAY INTERROG* {$tipo = interfaces.ARRAY}
    | T_VECTOR INTERROG* {$tipo = interfaces.VECTOR}

  //  | USIZE { $tipo = interfaces.INTEGER }
    
    //| VOIDTYPE  {$tipo = interfaces.VOID}
;

/*instruccion returns [interfaces.Instruction instr]
  : CONSOLE '.' LOG PARIZQ expression PARDER ';' {$instr = instruction.NewImprimir($expression.p)}
  | P_NUMBER id=ID '=' expression ';'{$instr = instruction.NewDeclaration($id.text,interfaces.INTEGER,$expression.p)}
  | P_IF PARIZQ expression PARDER LLAVEIZQ instrucciones LLAVEDER  {$instr = instruction.NewIf($expression.p, $instrucciones.l)}
  | P_WHILE PARIZQ expression PARDER LLAVEIZQ instrucciones LLAVEDER  {$instr = instruction.NewWhile($expression.p, $instrucciones.l)}
  
;*/

expression returns[interfaces.Expresion p]
    : expr_arit    {$p = $expr_arit.p}
    /*funciones primitivas */

    /*rango for */
    | e_ini=expression '.''.''.' e_fin=expression { $p = expresion.NewRangeF($e_ini.p, $e_fin.p, $e_ini.start.GetLine(),$e_ini.start.GetColumn() ) }
    //| exp=expression '.' CLONE { $p = expresion.NewClone($exp.p, $exp.start.GetLine(), $exp.start.GetColumn() ) }
   // | exp=expression '.' ABS { $p = expresion.NewAbs($exp.p, $exp.start.GetLine(), $exp.start.GetColumn() ) }
    //| exp=expression '.' SQRT { $p = expresion.NewSqrt($exp.p, $exp.start.GetLine(), $exp.start.GetColumn() ) }
    //| exp=expression TO_STRING { $p = expresion.NewToString($exp.p, $exp.start.GetLine(), $exp.start.GetColumn() ) }
    //| exp=expression TO_OWNED { $p = expresion.NewToString($exp.p, $exp.start.GetLine(), $exp.start.GetColumn() ) }
;

/*len_f returns[interfaces.Expresion p]
    : exp=expression '.' LEN {$p = expresion.NewLen($exp.p, $exp.start.GetLine(), $exp.start.GetColumn()  )}
;*/

expr_arit returns[interfaces.Expresion p]
    : op='-' opU = expr_arit {$p = expresion.NewOperacion($opU.p,"-",nil,true, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    
    //pow
   // | T_NUMBER DOSPUNTO op=POW PARIZQ opIz = expr_arit COMA opDe = expr_arit PARDER {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    //| T_FLOAT DOSPUNTO op=POWF PARIZQ opIz = expr_arit COMA opDe = expr_arit PARDER {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    | opIz = expr_arit op=('*'|'/'|'%') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    //| opIz = expr_arit op= '%' opDe = expr_arit     {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    
    /*len*/
    | opIz=expr_arit '.' LEN {$p = expresion.NewLen($opIz.p, $opIz.start.GetLine(), $opIz.start.GetColumn()  )}

    | opIz = expr_arit op=('+'|'-') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}

    | opIz = expr_arit op=('<'|'<='|'>'|'>='|'=='|'!=') opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())} 
    
    
    /*Relacional NOT*/
    | op='!' opU = expr_arit {$p = expresion.NewOperacion($opU.p,"!",nil,true, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    /* Relacional AND | OR*/
    | opIz = expr_arit op='&&' opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    | opIz = expr_arit op='||' opDe = expr_arit {$p = expresion.NewOperacion($opIz.p,$op.text,$opDe.p,false, $op.line, localctx.(*Expr_aritContext).GetOp().GetColumn())}
    
    | opIz=expr_arit '.' CLONE { $p = expresion.NewClone($opIz.p, $opIz.start.GetLine(), $opIz.start.GetColumn() ) }
    | T_STRING '(' opIz=expr_arit ')' { $p = expresion.NewToString($opIz.p, $opIz.start.GetLine(), $opIz.start.GetColumn() ) }
  //  | opIz=expr_arit TO_OWNED { $p = expresion.NewToString($opIz.p, $opIz.start.GetLine(), $opIz.start.GetColumn() ) }

    | ID '.' CONTAINS '(''&' val=expression')' {$p = expresion.NewContains($ID.text, $val.p, $ID.line, $ID.pos  )}

    | ID '.' CAPF {$p = expresion.NewCapacity($ID.text, $ID.line, $ID.pos  )}
     /*vector*/
    |  CORIZQ exp = expression ';' tam = expression CORDER { $p = expresion.NewVector(nil, $exp.p, $tam.p, 2, $CORIZQ.line, $CORIZQ.pos ) }
    |  CORIZQ live=listParams CORDER { $p = expresion.NewVector($live.l_e, nil, nil, 1, $CORIZQ.line, $CORIZQ.pos ) }

    /*array*/
  //| CORIZQ exp = expression ';' tam = expression CORDER { $p = expresion.NewArray(nil, $exp.p, $tam.p, 2, $CORIZQ.line, $CORIZQ.pos ) }
   // | CORIZQ listParams CORDER {    $p = expresion.NewArray($listParams.l_e, nil, nil, 1, $CORIZQ.line, $CORIZQ.pos ) }
    
    /*struct*/
    | ID PARIZQ l_StructExp PARDER { $p = instructionExpre.NewStructExpre($ID.text, $l_StructExp.l, $ID.line, $ID.pos ) }

    | primitivo {$p = $primitivo.p}
    | PARIZQ expression PARDER {$p = $expression.p}
    | casteo {$p = $casteo.p} 
    | if_exp {$p = $if_exp.p}
    | switch_sent {$p = $switch_sent.p}
    //| match_sent {$p = $match_sent.instr.(interfaces.Expresion)}

    | while_true { $p = $while_true.p }

    | callFunction {$p = $callFunction.p} 
   /// | callModulo {$p = $callModulo.p} 

    | ID '.' REMOVE '(' expression ')' { $p = instructionExpre.NewRemove($ID.text, $expression.p, $ID.line, $ID.pos) }
 //   | ltext=strings {$p=expresion.NewcadenaFor($STRING.text, $STRING.line, $STRING.pos)}
    | IN primitivo { $p = expresion.NewcadenaFor($primitivo.p, $IN.line, $IN.pos) }
;



/*casteo returns[interfaces.Expresion p]
  : PARIZQ expression AS Tipo_cast PARDER {$p = expresion.NewCasteo($expression.p, interfaces.FLOAT)}
;*/



casteo returns[interfaces.Expresion p]
  : PARIZQ expression AS typec = tipo_cast PARDER {$p = expresion.NewCasteo($expression.p, $typec.tc, $PARIZQ.line, localctx.(*CasteoContext).Get_PARIZQ().GetColumn() )}
;

tipo_cast returns[interfaces.TipoExpresion tc]
  : T_FLOAT {$tc = interfaces.FLOAT}
  | T_NUMBER {$tc = interfaces.INTEGER}
  | USIZE {$tc = interfaces.INTEGER}
;

l_StructExp returns[*arrayList.List l]
: list=l_StructExp COMA ID ':' expression {
                                        Str_ep := instructionExpre.NewStructContenido($ID.text, $expression.p)
                                        $list.l.Add(Str_ep);
                                        $l = $list.l;
                                    }
| ID ':' expression{
                    Str_ep := instructionExpre.NewStructContenido($ID.text, $expression.p)
                    $l = arrayList.New();
                    $l.Add(Str_ep);
                }
;

primitivo returns[interfaces.Expresion p]
    :NUMBER {
            	num,err := strconv.Atoi($NUMBER.text)
                if err!= nil{
                    fmt.Println(err)
                }
            $p = expresion.NewPrimitivo(num,interfaces.INTEGER, $NUMBER.line, localctx.(*PrimitivoContext).Get_NUMBER().GetColumn())
      } 
    | FLOAT {
              num,err := strconv.ParseFloat($FLOAT.text,64)
              if err!= nil{
                  fmt.Println(err)
              }
              $p = expresion.NewPrimitivo (num,interfaces.FLOAT, $FLOAT.line, localctx.(*PrimitivoContext).Get_FLOAT().GetColumn())
      }

    | strings {$p = $strings.p} 

    | CHAR {
                chr := $CHAR.text
                $p = expresion.NewPrimitivo(chr[1:len(chr)-1],interfaces.CHAR, $CHAR.line, $CHAR.pos)
                }
    /*| ID { 
      $p = expresion.NewIdentificador($ID.text, $ID.line, localctx.(*PrimitivoContext).Get_ID().GetColumn() )}*/

    | TRUE  { $p = expresion.NewPrimitivo(true,interfaces.BOOLEAN, $TRUE.line, localctx.(*PrimitivoContext).Get_TRUE().GetColumn())}
    | FALSE { $p = expresion.NewPrimitivo(false,interfaces.BOOLEAN, $FALSE.line, localctx.(*PrimitivoContext).Get_FALSE().GetColumn())}
    | list=listIDArray { $p = $list.p}
;

listIDArray returns[interfaces.Expresion p]
    : list = listIDArray CORIZQ expression CORDER { $p = expresion.NewArrayAccess($list.p, $expression.p, $CORIZQ.line, $CORIZQ.pos ) }
    | list = listIDArray '.' ID { $p = expresion.NewStructAccess($list.p, $ID.text, $list.start.GetLine(), $list.start.GetColumn() )  }
    | ID { 
      $p = expresion.NewIdentificador($ID.text, $ID.line, localctx.(*ListIDArrayContext).Get_ID().GetColumn() )}
    ;

strings returns[interfaces.Expresion p]
    : AMP+'String' '(' STRING ')' { 
      str:= $STRING.text[1:len($STRING.text)-1]
      $p = expresion.NewPrimitivo(str,interfaces.STR, $STRING.line, localctx.(*StringsContext).Get_STRING().GetColumn())}
    
    |'String''(' STRING ')' { 
      str:= $STRING.text[1:len($STRING.text)-1]
      $p = expresion.NewPrimitivo(str,interfaces.STRING, $STRING.line, localctx.(*StringsContext).Get_STRING().GetColumn())}
    
    | STRING { 
      str:= $STRING.text[1:len($STRING.text)-1]
      $p = expresion.NewPrimitivo(str,interfaces.STR, $STRING.line, localctx.(*StringsContext).Get_STRING().GetColumn())}
    
;
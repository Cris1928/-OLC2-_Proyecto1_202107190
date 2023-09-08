// Code generated from swiftgrammar.g4 by ANTLR 4.13.0. DO NOT EDIT.

package parser // swiftgrammar

import "github.com/antlr4-go/antlr/v4"

// BaseswiftgrammarListener is a complete listener for a parse tree produced by swiftgrammar.
type BaseswiftgrammarListener struct{}

var _ swiftgrammarListener = &BaseswiftgrammarListener{}

// VisitTerminal is called when a terminal node is visited.
func (s *BaseswiftgrammarListener) VisitTerminal(node antlr.TerminalNode) {}

// VisitErrorNode is called when an error node is visited.
func (s *BaseswiftgrammarListener) VisitErrorNode(node antlr.ErrorNode) {}

// EnterEveryRule is called when any rule is entered.
func (s *BaseswiftgrammarListener) EnterEveryRule(ctx antlr.ParserRuleContext) {}

// ExitEveryRule is called when any rule is exited.
func (s *BaseswiftgrammarListener) ExitEveryRule(ctx antlr.ParserRuleContext) {}

// EnterStart is called when production start is entered.
func (s *BaseswiftgrammarListener) EnterStart(ctx *StartContext) {}

// ExitStart is called when production start is exited.
func (s *BaseswiftgrammarListener) ExitStart(ctx *StartContext) {}

// EnterInstrucciones is called when production instrucciones is entered.
func (s *BaseswiftgrammarListener) EnterInstrucciones(ctx *InstruccionesContext) {}

// ExitInstrucciones is called when production instrucciones is exited.
func (s *BaseswiftgrammarListener) ExitInstrucciones(ctx *InstruccionesContext) {}

// EnterListaglobal is called when production listaglobal is entered.
func (s *BaseswiftgrammarListener) EnterListaglobal(ctx *ListaglobalContext) {}

// ExitListaglobal is called when production listaglobal is exited.
func (s *BaseswiftgrammarListener) ExitListaglobal(ctx *ListaglobalContext) {}

// EnterIn_global is called when production in_global is entered.
func (s *BaseswiftgrammarListener) EnterIn_global(ctx *In_globalContext) {}

// ExitIn_global is called when production in_global is exited.
func (s *BaseswiftgrammarListener) ExitIn_global(ctx *In_globalContext) {}

// EnterModulo_item is called when production modulo_item is entered.
func (s *BaseswiftgrammarListener) EnterModulo_item(ctx *Modulo_itemContext) {}

// ExitModulo_item is called when production modulo_item is exited.
func (s *BaseswiftgrammarListener) ExitModulo_item(ctx *Modulo_itemContext) {}

// EnterFuncion is called when production funcion is entered.
func (s *BaseswiftgrammarListener) EnterFuncion(ctx *FuncionContext) {}

// ExitFuncion is called when production funcion is exited.
func (s *BaseswiftgrammarListener) ExitFuncion(ctx *FuncionContext) {}

// EnterParams_declar is called when production params_declar is entered.
func (s *BaseswiftgrammarListener) EnterParams_declar(ctx *Params_declarContext) {}

// ExitParams_declar is called when production params_declar is exited.
func (s *BaseswiftgrammarListener) ExitParams_declar(ctx *Params_declarContext) {}

// EnterDeclar_parametros is called when production declar_parametros is entered.
func (s *BaseswiftgrammarListener) EnterDeclar_parametros(ctx *Declar_parametrosContext) {}

// ExitDeclar_parametros is called when production declar_parametros is exited.
func (s *BaseswiftgrammarListener) ExitDeclar_parametros(ctx *Declar_parametrosContext) {}

// EnterFn_main is called when production fn_main is entered.
func (s *BaseswiftgrammarListener) EnterFn_main(ctx *Fn_mainContext) {}

// ExitFn_main is called when production fn_main is exited.
func (s *BaseswiftgrammarListener) ExitFn_main(ctx *Fn_mainContext) {}

// EnterInstruccion is called when production instruccion is entered.
func (s *BaseswiftgrammarListener) EnterInstruccion(ctx *InstruccionContext) {}

// ExitInstruccion is called when production instruccion is exited.
func (s *BaseswiftgrammarListener) ExitInstruccion(ctx *InstruccionContext) {}

// EnterInstruccion_dentro is called when production instruccion_dentro is entered.
func (s *BaseswiftgrammarListener) EnterInstruccion_dentro(ctx *Instruccion_dentroContext) {}

// ExitInstruccion_dentro is called when production instruccion_dentro is exited.
func (s *BaseswiftgrammarListener) ExitInstruccion_dentro(ctx *Instruccion_dentroContext) {}

// EnterAppendVec is called when production appendVec is entered.
func (s *BaseswiftgrammarListener) EnterAppendVec(ctx *AppendVecContext) {}

// ExitAppendVec is called when production appendVec is exited.
func (s *BaseswiftgrammarListener) ExitAppendVec(ctx *AppendVecContext) {}

// EnterNewStruct is called when production newStruct is entered.
func (s *BaseswiftgrammarListener) EnterNewStruct(ctx *NewStructContext) {}

// ExitNewStruct is called when production newStruct is exited.
func (s *BaseswiftgrammarListener) ExitNewStruct(ctx *NewStructContext) {}

// EnterLista_struct is called when production lista_struct is entered.
func (s *BaseswiftgrammarListener) EnterLista_struct(ctx *Lista_structContext) {}

// ExitLista_struct is called when production lista_struct is exited.
func (s *BaseswiftgrammarListener) ExitLista_struct(ctx *Lista_structContext) {}

// EnterCallFunction is called when production callFunction is entered.
func (s *BaseswiftgrammarListener) EnterCallFunction(ctx *CallFunctionContext) {}

// ExitCallFunction is called when production callFunction is exited.
func (s *BaseswiftgrammarListener) ExitCallFunction(ctx *CallFunctionContext) {}

// EnterReturnFun is called when production returnFun is entered.
func (s *BaseswiftgrammarListener) EnterReturnFun(ctx *ReturnFunContext) {}

// ExitReturnFun is called when production returnFun is exited.
func (s *BaseswiftgrammarListener) ExitReturnFun(ctx *ReturnFunContext) {}

// EnterPrintconsola is called when production printconsola is entered.
func (s *BaseswiftgrammarListener) EnterPrintconsola(ctx *PrintconsolaContext) {}

// ExitPrintconsola is called when production printconsola is exited.
func (s *BaseswiftgrammarListener) ExitPrintconsola(ctx *PrintconsolaContext) {}

// EnterWhile_true is called when production while_true is entered.
func (s *BaseswiftgrammarListener) EnterWhile_true(ctx *While_trueContext) {}

// ExitWhile_true is called when production while_true is exited.
func (s *BaseswiftgrammarListener) ExitWhile_true(ctx *While_trueContext) {}

// EnterLWhile is called when production lWhile is entered.
func (s *BaseswiftgrammarListener) EnterLWhile(ctx *LWhileContext) {}

// ExitLWhile is called when production lWhile is exited.
func (s *BaseswiftgrammarListener) ExitLWhile(ctx *LWhileContext) {}

// EnterLForin is called when production lForin is entered.
func (s *BaseswiftgrammarListener) EnterLForin(ctx *LForinContext) {}

// ExitLForin is called when production lForin is exited.
func (s *BaseswiftgrammarListener) ExitLForin(ctx *LForinContext) {}

// EnterLBreak is called when production lBreak is entered.
func (s *BaseswiftgrammarListener) EnterLBreak(ctx *LBreakContext) {}

// ExitLBreak is called when production lBreak is exited.
func (s *BaseswiftgrammarListener) ExitLBreak(ctx *LBreakContext) {}

// EnterLContinue is called when production lContinue is entered.
func (s *BaseswiftgrammarListener) EnterLContinue(ctx *LContinueContext) {}

// ExitLContinue is called when production lContinue is exited.
func (s *BaseswiftgrammarListener) ExitLContinue(ctx *LContinueContext) {}

// EnterListParams is called when production listParams is entered.
func (s *BaseswiftgrammarListener) EnterListParams(ctx *ListParamsContext) {}

// ExitListParams is called when production listParams is exited.
func (s *BaseswiftgrammarListener) ExitListParams(ctx *ListParamsContext) {}

// EnterListParamsCall is called when production listParamsCall is entered.
func (s *BaseswiftgrammarListener) EnterListParamsCall(ctx *ListParamsCallContext) {}

// ExitListParamsCall is called when production listParamsCall is exited.
func (s *BaseswiftgrammarListener) ExitListParamsCall(ctx *ListParamsCallContext) {}

// EnterEs_referencia is called when production es_referencia is entered.
func (s *BaseswiftgrammarListener) EnterEs_referencia(ctx *Es_referenciaContext) {}

// ExitEs_referencia is called when production es_referencia is exited.
func (s *BaseswiftgrammarListener) ExitEs_referencia(ctx *Es_referenciaContext) {}

// EnterDeclaracion is called when production declaracion is entered.
func (s *BaseswiftgrammarListener) EnterDeclaracion(ctx *DeclaracionContext) {}

// ExitDeclaracion is called when production declaracion is exited.
func (s *BaseswiftgrammarListener) ExitDeclaracion(ctx *DeclaracionContext) {}

// EnterEs_var is called when production es_var is entered.
func (s *BaseswiftgrammarListener) EnterEs_var(ctx *Es_varContext) {}

// ExitEs_var is called when production es_var is exited.
func (s *BaseswiftgrammarListener) ExitEs_var(ctx *Es_varContext) {}

// EnterEs_varr is called when production es_varr is entered.
func (s *BaseswiftgrammarListener) EnterEs_varr(ctx *Es_varrContext) {}

// ExitEs_varr is called when production es_varr is exited.
func (s *BaseswiftgrammarListener) ExitEs_varr(ctx *Es_varrContext) {}

// EnterLetid is called when production letid is entered.
func (s *BaseswiftgrammarListener) EnterLetid(ctx *LetidContext) {}

// ExitLetid is called when production letid is exited.
func (s *BaseswiftgrammarListener) ExitLetid(ctx *LetidContext) {}

// EnterVector_types is called when production vector_types is entered.
func (s *BaseswiftgrammarListener) EnterVector_types(ctx *Vector_typesContext) {}

// ExitVector_types is called when production vector_types is exited.
func (s *BaseswiftgrammarListener) ExitVector_types(ctx *Vector_typesContext) {}

// EnterArray_type is called when production array_type is entered.
func (s *BaseswiftgrammarListener) EnterArray_type(ctx *Array_typeContext) {}

// ExitArray_type is called when production array_type is exited.
func (s *BaseswiftgrammarListener) ExitArray_type(ctx *Array_typeContext) {}

// EnterAsignacion is called when production asignacion is entered.
func (s *BaseswiftgrammarListener) EnterAsignacion(ctx *AsignacionContext) {}

// ExitAsignacion is called when production asignacion is exited.
func (s *BaseswiftgrammarListener) ExitAsignacion(ctx *AsignacionContext) {}

// EnterL_AccessStruct is called when production l_AccessStruct is entered.
func (s *BaseswiftgrammarListener) EnterL_AccessStruct(ctx *L_AccessStructContext) {}

// ExitL_AccessStruct is called when production l_AccessStruct is exited.
func (s *BaseswiftgrammarListener) ExitL_AccessStruct(ctx *L_AccessStructContext) {}

// EnterList_index is called when production list_index is entered.
func (s *BaseswiftgrammarListener) EnterList_index(ctx *List_indexContext) {}

// ExitList_index is called when production list_index is exited.
func (s *BaseswiftgrammarListener) ExitList_index(ctx *List_indexContext) {}

// EnterIndex_array is called when production index_array is entered.
func (s *BaseswiftgrammarListener) EnterIndex_array(ctx *Index_arrayContext) {}

// ExitIndex_array is called when production index_array is exited.
func (s *BaseswiftgrammarListener) ExitIndex_array(ctx *Index_arrayContext) {}

// EnterIf_sent is called when production if_sent is entered.
func (s *BaseswiftgrammarListener) EnterIf_sent(ctx *If_sentContext) {}

// ExitIf_sent is called when production if_sent is exited.
func (s *BaseswiftgrammarListener) ExitIf_sent(ctx *If_sentContext) {}

// EnterIf_exp is called when production if_exp is entered.
func (s *BaseswiftgrammarListener) EnterIf_exp(ctx *If_expContext) {}

// ExitIf_exp is called when production if_exp is exited.
func (s *BaseswiftgrammarListener) ExitIf_exp(ctx *If_expContext) {}

// EnterList_elseif is called when production list_elseif is entered.
func (s *BaseswiftgrammarListener) EnterList_elseif(ctx *List_elseifContext) {}

// ExitList_elseif is called when production list_elseif is exited.
func (s *BaseswiftgrammarListener) ExitList_elseif(ctx *List_elseifContext) {}

// EnterList_elseif_exp is called when production list_elseif_exp is entered.
func (s *BaseswiftgrammarListener) EnterList_elseif_exp(ctx *List_elseif_expContext) {}

// ExitList_elseif_exp is called when production list_elseif_exp is exited.
func (s *BaseswiftgrammarListener) ExitList_elseif_exp(ctx *List_elseif_expContext) {}

// EnterElse_if is called when production else_if is entered.
func (s *BaseswiftgrammarListener) EnterElse_if(ctx *Else_ifContext) {}

// ExitElse_if is called when production else_if is exited.
func (s *BaseswiftgrammarListener) ExitElse_if(ctx *Else_ifContext) {}

// EnterElse_if_exp is called when production else_if_exp is entered.
func (s *BaseswiftgrammarListener) EnterElse_if_exp(ctx *Else_if_expContext) {}

// ExitElse_if_exp is called when production else_if_exp is exited.
func (s *BaseswiftgrammarListener) ExitElse_if_exp(ctx *Else_if_expContext) {}

// EnterSwitch_sent is called when production switch_sent is entered.
func (s *BaseswiftgrammarListener) EnterSwitch_sent(ctx *Switch_sentContext) {}

// ExitSwitch_sent is called when production switch_sent is exited.
func (s *BaseswiftgrammarListener) ExitSwitch_sent(ctx *Switch_sentContext) {}

// EnterMatch_brazos is called when production match_brazos is entered.
func (s *BaseswiftgrammarListener) EnterMatch_brazos(ctx *Match_brazosContext) {}

// ExitMatch_brazos is called when production match_brazos is exited.
func (s *BaseswiftgrammarListener) ExitMatch_brazos(ctx *Match_brazosContext) {}

// EnterMatch_brazos_exp is called when production match_brazos_exp is entered.
func (s *BaseswiftgrammarListener) EnterMatch_brazos_exp(ctx *Match_brazos_expContext) {}

// ExitMatch_brazos_exp is called when production match_brazos_exp is exited.
func (s *BaseswiftgrammarListener) ExitMatch_brazos_exp(ctx *Match_brazos_expContext) {}

// EnterMatchbrazo is called when production matchbrazo is entered.
func (s *BaseswiftgrammarListener) EnterMatchbrazo(ctx *MatchbrazoContext) {}

// ExitMatchbrazo is called when production matchbrazo is exited.
func (s *BaseswiftgrammarListener) ExitMatchbrazo(ctx *MatchbrazoContext) {}

// EnterMatchbrazo_exp is called when production matchbrazo_exp is entered.
func (s *BaseswiftgrammarListener) EnterMatchbrazo_exp(ctx *Matchbrazo_expContext) {}

// ExitMatchbrazo_exp is called when production matchbrazo_exp is exited.
func (s *BaseswiftgrammarListener) ExitMatchbrazo_exp(ctx *Matchbrazo_expContext) {}

// EnterListaOpciones is called when production listaOpciones is entered.
func (s *BaseswiftgrammarListener) EnterListaOpciones(ctx *ListaOpcionesContext) {}

// ExitListaOpciones is called when production listaOpciones is exited.
func (s *BaseswiftgrammarListener) ExitListaOpciones(ctx *ListaOpcionesContext) {}

// EnterBloque_inst is called when production bloque_inst is entered.
func (s *BaseswiftgrammarListener) EnterBloque_inst(ctx *Bloque_instContext) {}

// ExitBloque_inst is called when production bloque_inst is exited.
func (s *BaseswiftgrammarListener) ExitBloque_inst(ctx *Bloque_instContext) {}

// EnterBloque_princip is called when production bloque_princip is entered.
func (s *BaseswiftgrammarListener) EnterBloque_princip(ctx *Bloque_principContext) {}

// ExitBloque_princip is called when production bloque_princip is exited.
func (s *BaseswiftgrammarListener) ExitBloque_princip(ctx *Bloque_principContext) {}

// EnterBloque_exp is called when production bloque_exp is entered.
func (s *BaseswiftgrammarListener) EnterBloque_exp(ctx *Bloque_expContext) {}

// ExitBloque_exp is called when production bloque_exp is exited.
func (s *BaseswiftgrammarListener) ExitBloque_exp(ctx *Bloque_expContext) {}

// EnterTipos_var is called when production tipos_var is entered.
func (s *BaseswiftgrammarListener) EnterTipos_var(ctx *Tipos_varContext) {}

// ExitTipos_var is called when production tipos_var is exited.
func (s *BaseswiftgrammarListener) ExitTipos_var(ctx *Tipos_varContext) {}

// EnterExpression is called when production expression is entered.
func (s *BaseswiftgrammarListener) EnterExpression(ctx *ExpressionContext) {}

// ExitExpression is called when production expression is exited.
func (s *BaseswiftgrammarListener) ExitExpression(ctx *ExpressionContext) {}

// EnterExpr_arit is called when production expr_arit is entered.
func (s *BaseswiftgrammarListener) EnterExpr_arit(ctx *Expr_aritContext) {}

// ExitExpr_arit is called when production expr_arit is exited.
func (s *BaseswiftgrammarListener) ExitExpr_arit(ctx *Expr_aritContext) {}

// EnterCasteo is called when production casteo is entered.
func (s *BaseswiftgrammarListener) EnterCasteo(ctx *CasteoContext) {}

// ExitCasteo is called when production casteo is exited.
func (s *BaseswiftgrammarListener) ExitCasteo(ctx *CasteoContext) {}

// EnterTipo_cast is called when production tipo_cast is entered.
func (s *BaseswiftgrammarListener) EnterTipo_cast(ctx *Tipo_castContext) {}

// ExitTipo_cast is called when production tipo_cast is exited.
func (s *BaseswiftgrammarListener) ExitTipo_cast(ctx *Tipo_castContext) {}

// EnterL_StructExp is called when production l_StructExp is entered.
func (s *BaseswiftgrammarListener) EnterL_StructExp(ctx *L_StructExpContext) {}

// ExitL_StructExp is called when production l_StructExp is exited.
func (s *BaseswiftgrammarListener) ExitL_StructExp(ctx *L_StructExpContext) {}

// EnterPrimitivo is called when production primitivo is entered.
func (s *BaseswiftgrammarListener) EnterPrimitivo(ctx *PrimitivoContext) {}

// ExitPrimitivo is called when production primitivo is exited.
func (s *BaseswiftgrammarListener) ExitPrimitivo(ctx *PrimitivoContext) {}

// EnterListIDArray is called when production listIDArray is entered.
func (s *BaseswiftgrammarListener) EnterListIDArray(ctx *ListIDArrayContext) {}

// ExitListIDArray is called when production listIDArray is exited.
func (s *BaseswiftgrammarListener) ExitListIDArray(ctx *ListIDArrayContext) {}

// EnterStrings is called when production strings is entered.
func (s *BaseswiftgrammarListener) EnterStrings(ctx *StringsContext) {}

// ExitStrings is called when production strings is exited.
func (s *BaseswiftgrammarListener) ExitStrings(ctx *StringsContext) {}

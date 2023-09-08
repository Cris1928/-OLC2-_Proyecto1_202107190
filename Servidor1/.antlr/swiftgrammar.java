// Generated from c:\Users\USER\Desktop\OLC2_Proyecto1\Servidor1\swiftgrammar.g4 by ANTLR 4.9.2

    import arrayList "github.com/colegno/arraylist"
    import "Servidor1/interfaces"
    import "Servidor1/expresion"
    import "Servidor1/instructionExpre"
    import "Servidor1/instruction"




import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class swiftgrammar extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT_CON=1, T_NUMBER=2, T_FLOAT=3, T_STRING=4, T_BOOL=5, T_STR=6, T_CHAT=7, 
		T_ARRAY=8, T_VECTOR=9, USIZE=10, IF=11, ELSE=12, WHILE=13, LOOP=14, FOR=15, 
		IN=16, BREAK=17, CONTINUE=18, SWITCH=19, MTOR=20, CASE=21, DEFAULT=22, 
		TRUE=23, FALSE=24, AS=25, AT=26, LET=27, MUT=28, STRUCT=29, VEC=30, VECN=31, 
		CAPACITY=32, TO_STRING=33, TO_OWNED=34, LEN=35, NEW=36, CAPF=37, CLONE=38, 
		ABS=39, PUSH=40, CONTAINS=41, INSERT=42, REMOVE=43, MODULO=44, PUBLIC=45, 
		TYPETHEN=46, FN=47, MAIN=48, RETURN=49, NUMBER=50, FLOAT=51, STRING=52, 
		PUNTO=53, COMA=54, PTCOMA=55, DOSPUNTO=56, DPUNTO2=57, ASIGNACION=58, 
		MTHEN=59, GUIONB=60, ID=61, DISTINTO=62, IGUAL=63, MAYORIGUAL=64, MENORIGUAL=65, 
		MAYOR=66, MENOR=67, ASIG=68, MUL=69, DIV=70, ADD=71, SUB=72, MOD=73, AND=74, 
		OR=75, NOT=76, INTERROG=77, AMP=78, INOUT=79, PARIZQ=80, PARDER=81, LLAVEIZQ=82, 
		LLAVEDER=83, CORIZQ=84, CORDER=85, CHAR=86, WHITESPACE=87, L_COMMENT=88, 
		COMMENT=89;
	public static final int
		RULE_start = 0, RULE_instrucciones = 1, RULE_listaglobal = 2, RULE_in_global = 3, 
		RULE_modulo_item = 4, RULE_funcion = 5, RULE_params_declar = 6, RULE_declar_parametros = 7, 
		RULE_fn_main = 8, RULE_instruccion = 9, RULE_instruccion_dentro = 10, 
		RULE_appendVec = 11, RULE_newStruct = 12, RULE_lista_struct = 13, RULE_callFunction = 14, 
		RULE_returnFun = 15, RULE_printconsola = 16, RULE_while_true = 17, RULE_lWhile = 18, 
		RULE_lForin = 19, RULE_lBreak = 20, RULE_lContinue = 21, RULE_listParams = 22, 
		RULE_listParamsCall = 23, RULE_es_referencia = 24, RULE_declaracion = 25, 
		RULE_es_var = 26, RULE_es_varr = 27, RULE_letid = 28, RULE_vector_types = 29, 
		RULE_array_type = 30, RULE_asignacion = 31, RULE_l_AccessStruct = 32, 
		RULE_list_index = 33, RULE_index_array = 34, RULE_if_sent = 35, RULE_if_exp = 36, 
		RULE_list_elseif = 37, RULE_list_elseif_exp = 38, RULE_else_if = 39, RULE_else_if_exp = 40, 
		RULE_switch_sent = 41, RULE_match_brazos = 42, RULE_match_brazos_exp = 43, 
		RULE_matchbrazo = 44, RULE_matchbrazo_exp = 45, RULE_listaOpciones = 46, 
		RULE_bloque_inst = 47, RULE_bloque_princip = 48, RULE_bloque_exp = 49, 
		RULE_tipos_var = 50, RULE_expression = 51, RULE_expr_arit = 52, RULE_casteo = 53, 
		RULE_tipo_cast = 54, RULE_l_StructExp = 55, RULE_primitivo = 56, RULE_listIDArray = 57, 
		RULE_strings = 58;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "instrucciones", "listaglobal", "in_global", "modulo_item", 
			"funcion", "params_declar", "declar_parametros", "fn_main", "instruccion", 
			"instruccion_dentro", "appendVec", "newStruct", "lista_struct", "callFunction", 
			"returnFun", "printconsola", "while_true", "lWhile", "lForin", "lBreak", 
			"lContinue", "listParams", "listParamsCall", "es_referencia", "declaracion", 
			"es_var", "es_varr", "letid", "vector_types", "array_type", "asignacion", 
			"l_AccessStruct", "list_index", "index_array", "if_sent", "if_exp", "list_elseif", 
			"list_elseif_exp", "else_if", "else_if_exp", "switch_sent", "match_brazos", 
			"match_brazos_exp", "matchbrazo", "matchbrazo_exp", "listaOpciones", 
			"bloque_inst", "bloque_princip", "bloque_exp", "tipos_var", "expression", 
			"expr_arit", "casteo", "tipo_cast", "l_StructExp", "primitivo", "listIDArray", 
			"strings"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'Int'", "'Float'", "'String'", "'Bool'", "' String'", 
			"'Character'", "'array'", "'Vector'", "'usize'", "'if'", "'else'", "'while'", 
			"'loop'", "'for'", "'in'", "'break'", "'continue'", "'switch'", "'|'", 
			"'case'", "'default'", "'true'", "'false'", "'as'", "'at'", "'let'", 
			"'var'", "'struct'", "'vec!'", "'vec'", "'with_capacity'", "'.to_string()'", 
			"'.to_owned()'", "'count'", "'new()'", "'capacity()'", "'clone()'", "'abs()'", 
			"'append'", "'contains'", "'insert'", "'remove'", "'mod'", "'pub'", "'->'", 
			"'func'", "'main'", "'return'", null, null, null, "'.'", "','", "';'", 
			"'::'", "':'", "'='", "'=>'", "'_'", null, "'!='", "'=='", "'>='", "'<='", 
			"'>'", "'<'", "'+='", "'*'", "'/'", "'+'", "'-'", "'%'", "'&&'", "'||'", 
			"'!'", "'?'", "'&'", "'inout'", "'('", "')'", "'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"T_CHAT", "T_ARRAY", "T_VECTOR", "USIZE", "IF", "ELSE", "WHILE", "LOOP", 
			"FOR", "IN", "BREAK", "CONTINUE", "SWITCH", "MTOR", "CASE", "DEFAULT", 
			"TRUE", "FALSE", "AS", "AT", "LET", "MUT", "STRUCT", "VEC", "VECN", "CAPACITY", 
			"TO_STRING", "TO_OWNED", "LEN", "NEW", "CAPF", "CLONE", "ABS", "PUSH", 
			"CONTAINS", "INSERT", "REMOVE", "MODULO", "PUBLIC", "TYPETHEN", "FN", 
			"MAIN", "RETURN", "NUMBER", "FLOAT", "STRING", "PUNTO", "COMA", "PTCOMA", 
			"DOSPUNTO", "DPUNTO2", "ASIGNACION", "MTHEN", "GUIONB", "ID", "DISTINTO", 
			"IGUAL", "MAYORIGUAL", "MENORIGUAL", "MAYOR", "MENOR", "ASIG", "MUL", 
			"DIV", "ADD", "SUB", "MOD", "AND", "OR", "NOT", "INTERROG", "AMP", "INOUT", 
			"PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", "CORIZQ", "CORDER", "CHAR", 
			"WHITESPACE", "L_COMMENT", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "swiftgrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public swiftgrammar(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public *arrayList.List lista;
		public ListaglobalContext listaglobal;
		public ListaglobalContext listaglobal() {
			return getRuleContext(ListaglobalContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			((StartContext)_localctx).listaglobal = listaglobal(0);
			_localctx.lista = ((StartContext)_localctx).listaglobal.lista
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionesContext extends ParserRuleContext {
		public *arrayList.List l;
		public InstruccionContext instruccion;
		public List<InstruccionContext> e = new ArrayList<InstruccionContext>();
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);

		    _localctx.l =  arrayList.New()
		  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT_CON) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << SWITCH) | (1L << LET) | (1L << MUT) | (1L << STRUCT) | (1L << RETURN) | (1L << ID))) != 0)) {
				{
				{
				setState(121);
				((InstruccionesContext)_localctx).instruccion = instruccion();
				((InstruccionesContext)_localctx).e.add(((InstruccionesContext)_localctx).instruccion);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			      listInt := localctx.(*InstruccionesContext).GetE()
			      		for _, e := range listInt {
			            _localctx.l.Add(e.GetInstr())
			          }
			          //fmt.Printf("tipo %T",localctx.(*InstruccionesContext).GetE())
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaglobalContext extends ParserRuleContext {
		public *arrayList.List lista;
		public ListaglobalContext lisfun;
		public In_globalContext in_global;
		public In_globalContext in_global() {
			return getRuleContext(In_globalContext.class,0);
		}
		public ListaglobalContext listaglobal() {
			return getRuleContext(ListaglobalContext.class,0);
		}
		public ListaglobalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaglobal; }
	}

	public final ListaglobalContext listaglobal() throws RecognitionException {
		return listaglobal(0);
	}

	private ListaglobalContext listaglobal(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListaglobalContext _localctx = new ListaglobalContext(_ctx, _parentState);
		ListaglobalContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_listaglobal, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(130);
			((ListaglobalContext)_localctx).in_global = in_global();
			 _localctx.lista.Add( ((ListaglobalContext)_localctx).in_global.globals ) 
			}
			_ctx.stop = _input.LT(-1);
			setState(139);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListaglobalContext(_parentctx, _parentState);
					_localctx.lisfun = _prevctx;
					_localctx.lisfun = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listaglobal);
					setState(133);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(134);
					((ListaglobalContext)_localctx).in_global = in_global();

					                                                    ((ListaglobalContext)_localctx).lisfun.lista.Add( ((ListaglobalContext)_localctx).in_global.globals)
					                                                    _localctx.lista =  ((ListaglobalContext)_localctx).lisfun.lista
					                                                  
					}
					} 
				}
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class In_globalContext extends ParserRuleContext {
		public interfaces.Instruction globals;
		public FuncionContext funcion;
		public NewStructContext newStruct;
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public NewStructContext newStruct() {
			return getRuleContext(NewStructContext.class,0);
		}
		public In_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_in_global; }
	}

	public final In_globalContext in_global() throws RecognitionException {
		In_globalContext _localctx = new In_globalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_in_global);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				((In_globalContext)_localctx).funcion = funcion();
				_localctx.globals = ((In_globalContext)_localctx).funcion.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				((In_globalContext)_localctx).newStruct = newStruct();
				_localctx.globals = ((In_globalContext)_localctx).newStruct.str
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Modulo_itemContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public FuncionContext funcion;
		public NewStructContext newStruct;
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public NewStructContext newStruct() {
			return getRuleContext(NewStructContext.class,0);
		}
		public Modulo_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modulo_item; }
	}

	public final Modulo_itemContext modulo_item() throws RecognitionException {
		Modulo_itemContext _localctx = new Modulo_itemContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modulo_item);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				((Modulo_itemContext)_localctx).funcion = funcion();
				_localctx.instr = ((Modulo_itemContext)_localctx).funcion.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				((Modulo_itemContext)_localctx).newStruct = newStruct();
				_localctx.instr = ((Modulo_itemContext)_localctx).newStruct.str
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Fn_mainContext fn_main;
		public Token ID;
		public Tipos_varContext tipos_var;
		public Bloque_instContext bloque_inst;
		public Token idob;
		public Params_declarContext params_declar;
		public Token id;
		public Fn_mainContext fn_main() {
			return getRuleContext(Fn_mainContext.class,0);
		}
		public TerminalNode FN() { return getToken(swiftgrammar.FN, 0); }
		public List<TerminalNode> ID() { return getTokens(swiftgrammar.ID); }
		public TerminalNode ID(int i) {
			return getToken(swiftgrammar.ID, i);
		}
		public TerminalNode PARIZQ() { return getToken(swiftgrammar.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(swiftgrammar.PARDER, 0); }
		public TerminalNode TYPETHEN() { return getToken(swiftgrammar.TYPETHEN, 0); }
		public Tipos_varContext tipos_var() {
			return getRuleContext(Tipos_varContext.class,0);
		}
		public Bloque_instContext bloque_inst() {
			return getRuleContext(Bloque_instContext.class,0);
		}
		public Params_declarContext params_declar() {
			return getRuleContext(Params_declarContext.class,0);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcion);
		 listParams :=  arrayList.New() 
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				((FuncionContext)_localctx).fn_main = fn_main();
				_localctx.instr =  ((FuncionContext)_localctx).fn_main.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(FN);
				setState(162);
				((FuncionContext)_localctx).ID = match(ID);
				setState(163);
				match(PARIZQ);
				setState(164);
				match(PARDER);
				setState(165);
				match(TYPETHEN);
				setState(166);
				((FuncionContext)_localctx).tipos_var = tipos_var();
				setState(167);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),listParams,((FuncionContext)_localctx).bloque_inst.l, ((FuncionContext)_localctx).tipos_var.tipo, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0), "" )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				match(FN);
				setState(171);
				((FuncionContext)_localctx).ID = match(ID);
				setState(172);
				match(PARIZQ);
				setState(173);
				match(PARDER);
				setState(174);
				match(TYPETHEN);
				setState(175);
				((FuncionContext)_localctx).idob = match(ID);
				setState(176);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),listParams,((FuncionContext)_localctx).bloque_inst.l, interfaces.VOID, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0),  (((FuncionContext)_localctx).idob!=null?((FuncionContext)_localctx).idob.getText():null) )
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(179);
				match(FN);
				setState(180);
				((FuncionContext)_localctx).ID = match(ID);
				setState(181);
				match(PARIZQ);
				setState(182);
				match(PARDER);
				setState(183);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),listParams,((FuncionContext)_localctx).bloque_inst.l, interfaces.VOID, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0), "" )
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				match(FN);
				setState(187);
				((FuncionContext)_localctx).ID = match(ID);
				setState(188);
				match(PARIZQ);
				setState(189);
				((FuncionContext)_localctx).params_declar = params_declar(0);
				setState(190);
				match(PARDER);
				setState(191);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),((FuncionContext)_localctx).params_declar.lista,((FuncionContext)_localctx).bloque_inst.l, interfaces.VOID, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0), "" )
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(194);
				match(FN);
				setState(195);
				((FuncionContext)_localctx).ID = match(ID);
				setState(196);
				match(PARIZQ);
				setState(197);
				((FuncionContext)_localctx).params_declar = params_declar(0);
				setState(198);
				match(PARDER);
				setState(199);
				match(TYPETHEN);
				setState(200);
				((FuncionContext)_localctx).tipos_var = tipos_var();
				setState(201);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getText():null),((FuncionContext)_localctx).params_declar.lista, ((FuncionContext)_localctx).bloque_inst.l,((FuncionContext)_localctx).tipos_var.tipo, (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getLine():0), (((FuncionContext)_localctx).ID!=null?((FuncionContext)_localctx).ID.getCharPositionInLine():0), "" )
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(204);
				match(FN);
				setState(205);
				((FuncionContext)_localctx).id = match(ID);
				setState(206);
				match(PARIZQ);
				setState(207);
				((FuncionContext)_localctx).params_declar = params_declar(0);
				setState(208);
				match(PARDER);
				setState(209);
				match(TYPETHEN);
				setState(210);
				((FuncionContext)_localctx).idob = match(ID);
				setState(211);
				((FuncionContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.instr = instructionExpre.NewFunction((((FuncionContext)_localctx).id!=null?((FuncionContext)_localctx).id.getText():null),((FuncionContext)_localctx).params_declar.lista, ((FuncionContext)_localctx).bloque_inst.l, interfaces.VOID, (((FuncionContext)_localctx).id!=null?((FuncionContext)_localctx).id.getLine():0), (((FuncionContext)_localctx).id!=null?((FuncionContext)_localctx).id.getCharPositionInLine():0), (((FuncionContext)_localctx).idob!=null?((FuncionContext)_localctx).idob.getText():null)  )
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Params_declarContext extends ParserRuleContext {
		public *arrayList.List lista;
		public Params_declarContext listdec;
		public Declar_parametrosContext declar_parametros;
		public Declar_parametrosContext declar_parametros() {
			return getRuleContext(Declar_parametrosContext.class,0);
		}
		public TerminalNode COMA() { return getToken(swiftgrammar.COMA, 0); }
		public Params_declarContext params_declar() {
			return getRuleContext(Params_declarContext.class,0);
		}
		public Params_declarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params_declar; }
	}

	public final Params_declarContext params_declar() throws RecognitionException {
		return params_declar(0);
	}

	private Params_declarContext params_declar(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Params_declarContext _localctx = new Params_declarContext(_ctx, _parentState);
		Params_declarContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_params_declar, _p);

		_localctx.lista =  arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(217);
			((Params_declarContext)_localctx).declar_parametros = declar_parametros();
			   _localctx.lista.Add(((Params_declarContext)_localctx).declar_parametros.in_dec) 
			}
			_ctx.stop = _input.LT(-1);
			setState(227);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Params_declarContext(_parentctx, _parentState);
					_localctx.listdec = _prevctx;
					_localctx.listdec = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_params_declar);
					setState(220);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(221);
					match(COMA);
					setState(222);
					((Params_declarContext)_localctx).declar_parametros = declar_parametros();

					                                                                      ((Params_declarContext)_localctx).listdec.lista.Add(((Params_declarContext)_localctx).declar_parametros.in_dec)
					                                                                      _localctx.lista =  ((Params_declarContext)_localctx).listdec.lista 
					}
					} 
				}
				setState(229);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Declar_parametrosContext extends ParserRuleContext {
		public interfaces.Instruction in_dec;
		public Es_varContext isVar;
		public Token ID;
		public Tipos_varContext tipos_var;
		public Token id;
		public Es_referenciaContext es_referencia;
		public Token idob;
		public Array_typeContext array_type;
		public Token idstruct;
		public Es_varContext isRef;
		public List<TerminalNode> ID() { return getTokens(swiftgrammar.ID); }
		public TerminalNode ID(int i) {
			return getToken(swiftgrammar.ID, i);
		}
		public TerminalNode DPUNTO2() { return getToken(swiftgrammar.DPUNTO2, 0); }
		public Tipos_varContext tipos_var() {
			return getRuleContext(Tipos_varContext.class,0);
		}
		public Es_varContext es_var() {
			return getRuleContext(Es_varContext.class,0);
		}
		public Es_referenciaContext es_referencia() {
			return getRuleContext(Es_referenciaContext.class,0);
		}
		public TerminalNode CORIZQ() { return getToken(swiftgrammar.CORIZQ, 0); }
		public TerminalNode CORDER() { return getToken(swiftgrammar.CORDER, 0); }
		public TerminalNode INOUT() { return getToken(swiftgrammar.INOUT, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Declar_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declar_parametros; }
	}

	public final Declar_parametrosContext declar_parametros() throws RecognitionException {
		Declar_parametrosContext _localctx = new Declar_parametrosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declar_parametros);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				((Declar_parametrosContext)_localctx).isVar = es_var();
				setState(231);
				((Declar_parametrosContext)_localctx).ID = match(ID);
				setState(232);
				match(DPUNTO2);
				setState(233);
				((Declar_parametrosContext)_localctx).tipos_var = tipos_var();

				                        listaIdes := arrayList.New()
				                        listaIdes.Add(expresion.NewIdentificador((((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getText():null), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getLine():0), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getCharPositionInLine():0) ))
				                        decl := instruction.NewDeclaration((((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getText():null), ((Declar_parametrosContext)_localctx).tipos_var.tipo, nil, ((Declar_parametrosContext)_localctx).isVar.mut, (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getLine():0), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getCharPositionInLine():0) )
				                        _localctx.in_dec = decl
				                    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				((Declar_parametrosContext)_localctx).id = match(ID);
				setState(237);
				match(DPUNTO2);
				setState(238);
				((Declar_parametrosContext)_localctx).es_referencia = es_referencia();
				setState(239);
				match(CORIZQ);
				setState(240);
				((Declar_parametrosContext)_localctx).idob = match(ID);
				setState(241);
				match(CORDER);

				                        decl := instruction.NewVectorDeclaration((((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getText():null), interfaces.NULL, nil, ((Declar_parametrosContext)_localctx).es_referencia.ref, (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getLine():0), (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getCharPositionInLine():0), nil, (((Declar_parametrosContext)_localctx).idob!=null?((Declar_parametrosContext)_localctx).idob.getText():null))
				                        _localctx.in_dec = decl
				                    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				((Declar_parametrosContext)_localctx).id = match(ID);
				setState(245);
				match(DPUNTO2);
				setState(246);
				((Declar_parametrosContext)_localctx).es_referencia = es_referencia();
				setState(247);
				match(CORIZQ);
				setState(248);
				((Declar_parametrosContext)_localctx).tipos_var = tipos_var();
				setState(249);
				match(CORDER);

				                        decl := instruction.NewVectorDeclaration((((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getText():null), ((Declar_parametrosContext)_localctx).tipos_var.tipo, nil, ((Declar_parametrosContext)_localctx).es_referencia.ref, (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getLine():0), (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getCharPositionInLine():0), nil, "")
				                        _localctx.in_dec = decl
				                    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				((Declar_parametrosContext)_localctx).ID = match(ID);
				setState(253);
				match(DPUNTO2);
				setState(254);
				match(INOUT);
				setState(255);
				((Declar_parametrosContext)_localctx).array_type = array_type();

				                        listaIdes := arrayList.New()
				                        listaIdes.Add(expresion.NewIdentificador((((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getText():null), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getLine():0), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getCharPositionInLine():0) ))
				                        decl := instruction.NewArrayDeclaration((((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getText():null), ((Declar_parametrosContext)_localctx).array_type.ty, nil, true, (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getLine():0), (((Declar_parametrosContext)_localctx).ID!=null?((Declar_parametrosContext)_localctx).ID.getCharPositionInLine():0) )
				                        _localctx.in_dec = decl
				                    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(258);
				((Declar_parametrosContext)_localctx).id = match(ID);
				setState(259);
				match(DPUNTO2);
				setState(260);
				((Declar_parametrosContext)_localctx).es_referencia = es_referencia();
				setState(261);
				((Declar_parametrosContext)_localctx).idstruct = match(ID);
				 
				                            decl := instruction.NewDeclaration((((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getText():null), interfaces.STRUCT, nil, ((Declar_parametrosContext)_localctx).es_referencia.ref, (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getLine():0), (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getCharPositionInLine():0))
				                            _localctx.in_dec = decl
				                        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(264);
				((Declar_parametrosContext)_localctx).isRef = es_var();
				setState(265);
				((Declar_parametrosContext)_localctx).id = match(ID);
				setState(266);
				match(DPUNTO2);
				setState(267);
				match(CORIZQ);
				setState(268);
				((Declar_parametrosContext)_localctx).idob = match(ID);
				setState(269);
				match(CORDER);

				                        decl := instruction.NewVectorDeclaration((((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getText():null), interfaces.NULL, nil, ((Declar_parametrosContext)_localctx).isRef.mut, (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getLine():0), (((Declar_parametrosContext)_localctx).id!=null?((Declar_parametrosContext)_localctx).id.getCharPositionInLine():0), nil, (((Declar_parametrosContext)_localctx).idob!=null?((Declar_parametrosContext)_localctx).idob.getText():null))
				                        _localctx.in_dec = decl
				                    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fn_mainContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Bloque_principContext bloque_princip;
		public Bloque_principContext bloque_princip() {
			return getRuleContext(Bloque_principContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(swiftgrammar.PUNTO, 0); }
		public Fn_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_main; }
	}

	public final Fn_mainContext fn_main() throws RecognitionException {
		Fn_mainContext _localctx = new Fn_mainContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fn_main);
		 listParams:= arrayList.New() 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			((Fn_mainContext)_localctx).bloque_princip = bloque_princip();
			setState(275);
			match(PUNTO);
			 _localctx.instr = instructionExpre.NewFunction("main",listParams,((Fn_mainContext)_localctx).bloque_princip.l, interfaces.VOID, 0, 0, "" )
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstruccionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public PrintconsolaContext printconsola;
		public DeclaracionContext declaracion;
		public AsignacionContext asignacion;
		public AppendVecContext appendVec;
		public If_sentContext if_sent;
		public Switch_sentContext switch_sent;
		public While_trueContext while_true;
		public LWhileContext lWhile;
		public LForinContext lForin;
		public LBreakContext lBreak;
		public LContinueContext lContinue;
		public NewStructContext newStruct;
		public CallFunctionContext callFunction;
		public ReturnFunContext returnFun;
		public Token ID;
		public ExpressionContext expression;
		public PrintconsolaContext printconsola() {
			return getRuleContext(PrintconsolaContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public AppendVecContext appendVec() {
			return getRuleContext(AppendVecContext.class,0);
		}
		public If_sentContext if_sent() {
			return getRuleContext(If_sentContext.class,0);
		}
		public Switch_sentContext switch_sent() {
			return getRuleContext(Switch_sentContext.class,0);
		}
		public While_trueContext while_true() {
			return getRuleContext(While_trueContext.class,0);
		}
		public LWhileContext lWhile() {
			return getRuleContext(LWhileContext.class,0);
		}
		public LForinContext lForin() {
			return getRuleContext(LForinContext.class,0);
		}
		public LBreakContext lBreak() {
			return getRuleContext(LBreakContext.class,0);
		}
		public LContinueContext lContinue() {
			return getRuleContext(LContinueContext.class,0);
		}
		public NewStructContext newStruct() {
			return getRuleContext(NewStructContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public ReturnFunContext returnFun() {
			return getRuleContext(ReturnFunContext.class,0);
		}
		public TerminalNode ID() { return getToken(swiftgrammar.ID, 0); }
		public TerminalNode PUNTO() { return getToken(swiftgrammar.PUNTO, 0); }
		public TerminalNode REMOVE() { return getToken(swiftgrammar.REMOVE, 0); }
		public TerminalNode PARIZQ() { return getToken(swiftgrammar.PARIZQ, 0); }
		public TerminalNode AT() { return getToken(swiftgrammar.AT, 0); }
		public TerminalNode DPUNTO2() { return getToken(swiftgrammar.DPUNTO2, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(swiftgrammar.PARDER, 0); }
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instruccion);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				((InstruccionContext)_localctx).printconsola = printconsola();
				_localctx.instr = ((InstruccionContext)_localctx).printconsola.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				((InstruccionContext)_localctx).declaracion = declaracion();
				_localctx.instr = ((InstruccionContext)_localctx).declaracion.instr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				((InstruccionContext)_localctx).asignacion = asignacion();
				_localctx.instr = ((InstruccionContext)_localctx).asignacion.instr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(287);
				((InstruccionContext)_localctx).appendVec = appendVec();
				_localctx.instr = ((InstruccionContext)_localctx).appendVec.instr
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(290);
				((InstruccionContext)_localctx).if_sent = if_sent();
				_localctx.instr = ((InstruccionContext)_localctx).if_sent.instr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(293);
				((InstruccionContext)_localctx).switch_sent = switch_sent();
				_localctx.instr = ((InstruccionContext)_localctx).switch_sent.instr
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(296);
				((InstruccionContext)_localctx).while_true = while_true();
				 _localctx.instr = ((InstruccionContext)_localctx).while_true.lop 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(299);
				((InstruccionContext)_localctx).lWhile = lWhile();
				 _localctx.instr = ((InstruccionContext)_localctx).lWhile.lwh 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(302);
				((InstruccionContext)_localctx).lForin = lForin();
				 _localctx.instr = ((InstruccionContext)_localctx).lForin.lfor 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(305);
				((InstruccionContext)_localctx).lBreak = lBreak();
				 _localctx.instr = ((InstruccionContext)_localctx).lBreak.br 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(308);
				((InstruccionContext)_localctx).lContinue = lContinue();
				 _localctx.instr = ((InstruccionContext)_localctx).lContinue.cn 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(311);
				((InstruccionContext)_localctx).newStruct = newStruct();
				_localctx.instr = ((InstruccionContext)_localctx).newStruct.str
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(314);
				((InstruccionContext)_localctx).callFunction = callFunction();
				_localctx.instr = ((InstruccionContext)_localctx).callFunction.instr
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(317);
				((InstruccionContext)_localctx).returnFun = returnFun();
				_localctx.instr = ((InstruccionContext)_localctx).returnFun.instr
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(320);
				((InstruccionContext)_localctx).ID = match(ID);
				setState(321);
				match(PUNTO);
				setState(322);
				match(REMOVE);
				setState(323);
				match(PARIZQ);
				setState(324);
				match(AT);
				setState(325);
				match(DPUNTO2);
				setState(326);
				((InstruccionContext)_localctx).expression = expression(0);
				setState(327);
				match(PARDER);
				 _localctx.instr = instructionExpre.NewRemove((((InstruccionContext)_localctx).ID!=null?((InstruccionContext)_localctx).ID.getText():null), ((InstruccionContext)_localctx).expression.p, (((InstruccionContext)_localctx).ID!=null?((InstruccionContext)_localctx).ID.getLine():0), (((InstruccionContext)_localctx).ID!=null?((InstruccionContext)_localctx).ID.getCharPositionInLine():0)) 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Instruccion_dentroContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public PrintconsolaContext printconsola;
		public DeclaracionContext declaracion;
		public AsignacionContext asignacion;
		public AppendVecContext appendVec;
		public If_sentContext if_sent;
		public Switch_sentContext switch_sent;
		public While_trueContext while_true;
		public LWhileContext lWhile;
		public LForinContext lForin;
		public LBreakContext lBreak;
		public LContinueContext lContinue;
		public CallFunctionContext callFunction;
		public ReturnFunContext returnFun;
		public Token ID;
		public ExpressionContext expression;
		public PrintconsolaContext printconsola() {
			return getRuleContext(PrintconsolaContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public AppendVecContext appendVec() {
			return getRuleContext(AppendVecContext.class,0);
		}
		public If_sentContext if_sent() {
			return getRuleContext(If_sentContext.class,0);
		}
		public Switch_sentContext switch_sent() {
			return getRuleContext(Switch_sentContext.class,0);
		}
		public While_trueContext while_true() {
			return getRuleContext(While_trueContext.class,0);
		}
		public LWhileContext lWhile() {
			return getRuleContext(LWhileContext.class,0);
		}
		public LForinContext lForin() {
			return getRuleContext(LForinContext.class,0);
		}
		public LBreakContext lBreak() {
			return getRuleContext(LBreakContext.class,0);
		}
		public LContinueContext lContinue() {
			return getRuleContext(LContinueContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public ReturnFunContext returnFun() {
			return getRuleContext(ReturnFunContext.class,0);
		}
		public TerminalNode ID() { return getToken(swiftgrammar.ID, 0); }
		public TerminalNode PUNTO() { return getToken(swiftgrammar.PUNTO, 0); }
		public TerminalNode REMOVE() { return getToken(swiftgrammar.REMOVE, 0); }
		public TerminalNode PARIZQ() { return getToken(swiftgrammar.PARIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(swiftgrammar.PARDER, 0); }
		public Instruccion_dentroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion_dentro; }
	}

	public final Instruccion_dentroContext instruccion_dentro() throws RecognitionException {
		Instruccion_dentroContext _localctx = new Instruccion_dentroContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_instruccion_dentro);
		try {
			setState(379);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				((Instruccion_dentroContext)_localctx).printconsola = printconsola();
				_localctx.instr = ((Instruccion_dentroContext)_localctx).printconsola.instr
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				((Instruccion_dentroContext)_localctx).declaracion = declaracion();
				_localctx.instr = ((Instruccion_dentroContext)_localctx).declaracion.instr
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(338);
				((Instruccion_dentroContext)_localctx).asignacion = asignacion();
				_localctx.instr = ((Instruccion_dentroContext)_localctx).asignacion.instr
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(341);
				((Instruccion_dentroContext)_localctx).appendVec = appendVec();
				_localctx.instr = ((Instruccion_dentroContext)_localctx).appendVec.instr
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(344);
				((Instruccion_dentroContext)_localctx).if_sent = if_sent();
				_localctx.instr = ((Instruccion_dentroContext)_localctx).if_sent.instr
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(347);
				((Instruccion_dentroContext)_localctx).switch_sent = switch_sent();
				_localctx.instr = ((Instruccion_dentroContext)_localctx).switch_sent.instr
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(350);
				((Instruccion_dentroContext)_localctx).while_true = while_true();
				 _localctx.instr = ((Instruccion_dentroContext)_localctx).while_true.lop 
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(353);
				((Instruccion_dentroContext)_localctx).lWhile = lWhile();
				 _localctx.instr = ((Instruccion_dentroContext)_localctx).lWhile.lwh 
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(356);
				((Instruccion_dentroContext)_localctx).lForin = lForin();
				 _localctx.instr = ((Instruccion_dentroContext)_localctx).lForin.lfor 
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(359);
				((Instruccion_dentroContext)_localctx).lBreak = lBreak();
				 _localctx.instr = ((Instruccion_dentroContext)_localctx).lBreak.br 
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(362);
				((Instruccion_dentroContext)_localctx).lContinue = lContinue();
				 _localctx.instr = ((Instruccion_dentroContext)_localctx).lContinue.cn 
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(365);
				((Instruccion_dentroContext)_localctx).callFunction = callFunction();
				_localctx.instr = ((Instruccion_dentroContext)_localctx).callFunction.instr
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(368);
				((Instruccion_dentroContext)_localctx).returnFun = returnFun();
				_localctx.instr = ((Instruccion_dentroContext)_localctx).returnFun.instr
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(371);
				((Instruccion_dentroContext)_localctx).ID = match(ID);
				setState(372);
				match(PUNTO);
				setState(373);
				match(REMOVE);
				setState(374);
				match(PARIZQ);
				setState(375);
				((Instruccion_dentroContext)_localctx).expression = expression(0);
				setState(376);
				match(PARDER);
				 _localctx.instr = instructionExpre.NewRemove((((Instruccion_dentroContext)_localctx).ID!=null?((Instruccion_dentroContext)_localctx).ID.getText():null), ((Instruccion_dentroContext)_localctx).expression.p, (((Instruccion_dentroContext)_localctx).ID!=null?((Instruccion_dentroContext)_localctx).ID.getLine():0), (((Instruccion_dentroContext)_localctx).ID!=null?((Instruccion_dentroContext)_localctx).ID.getCharPositionInLine():0)) 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AppendVecContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token ID;
		public ExpressionContext val;
		public ExpressionContext val1;
		public ExpressionContext val2;
		public TerminalNode ID() { return getToken(swiftgrammar.ID, 0); }
		public TerminalNode PUNTO() { return getToken(swiftgrammar.PUNTO, 0); }
		public TerminalNode PUSH() { return getToken(swiftgrammar.PUSH, 0); }
		public TerminalNode PARIZQ() { return getToken(swiftgrammar.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(swiftgrammar.PARDER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode INSERT() { return getToken(swiftgrammar.INSERT, 0); }
		public TerminalNode COMA() { return getToken(swiftgrammar.COMA, 0); }
		public AppendVecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendVec; }
	}

	public final AppendVecContext appendVec() throws RecognitionException {
		AppendVecContext _localctx = new AppendVecContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_appendVec);
		try {
			setState(399);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(381);
				((AppendVecContext)_localctx).ID = match(ID);
				setState(382);
				match(PUNTO);
				setState(383);
				match(PUSH);
				setState(384);
				match(PARIZQ);
				setState(385);
				((AppendVecContext)_localctx).val = expression(0);
				setState(386);
				match(PARDER);
				_localctx.instr = instruction.NewPush((((AppendVecContext)_localctx).ID!=null?((AppendVecContext)_localctx).ID.getText():null), ((AppendVecContext)_localctx).val.p, (((AppendVecContext)_localctx).ID!=null?((AppendVecContext)_localctx).ID.getLine():0), (((AppendVecContext)_localctx).ID!=null?((AppendVecContext)_localctx).ID.getCharPositionInLine():0)  )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(389);
				((AppendVecContext)_localctx).ID = match(ID);
				setState(390);
				match(PUNTO);
				setState(391);
				match(INSERT);
				setState(392);
				match(PARIZQ);
				setState(393);
				((AppendVecContext)_localctx).val1 = expression(0);
				setState(394);
				match(COMA);
				setState(395);
				((AppendVecContext)_localctx).val2 = expression(0);
				setState(396);
				match(PARDER);
				 _localctx.instr = instruction.NewInsert((((AppendVecContext)_localctx).ID!=null?((AppendVecContext)_localctx).ID.getText():null), ((AppendVecContext)_localctx).val1.p, ((AppendVecContext)_localctx).val2.p, (((AppendVecContext)_localctx).ID!=null?((AppendVecContext)_localctx).ID.getLine():0), (((AppendVecContext)_localctx).ID!=null?((AppendVecContext)_localctx).ID.getCharPositionInLine():0)) 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NewStructContext extends ParserRuleContext {
		public interfaces.Instruction str;
		public Token STRUCT;
		public Token ID;
		public Lista_structContext lista_struct;
		public TerminalNode STRUCT() { return getToken(swiftgrammar.STRUCT, 0); }
		public TerminalNode ID() { return getToken(swiftgrammar.ID, 0); }
		public TerminalNode LLAVEIZQ() { return getToken(swiftgrammar.LLAVEIZQ, 0); }
		public Lista_structContext lista_struct() {
			return getRuleContext(Lista_structContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(swiftgrammar.LLAVEDER, 0); }
		public NewStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newStruct; }
	}

	public final NewStructContext newStruct() throws RecognitionException {
		NewStructContext _localctx = new NewStructContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_newStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			((NewStructContext)_localctx).STRUCT = match(STRUCT);
			setState(402);
			((NewStructContext)_localctx).ID = match(ID);
			setState(403);
			match(LLAVEIZQ);
			setState(404);
			((NewStructContext)_localctx).lista_struct = lista_struct(0);
			setState(405);
			match(LLAVEDER);
			 _localctx.str = instructionExpre.NewStruct((((NewStructContext)_localctx).ID!=null?((NewStructContext)_localctx).ID.getText():null), ((NewStructContext)_localctx).lista_struct.l, (((NewStructContext)_localctx).STRUCT!=null?((NewStructContext)_localctx).STRUCT.getLine():0), (((NewStructContext)_localctx).STRUCT!=null?((NewStructContext)_localctx).STRUCT.getCharPositionInLine():0)) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lista_structContext extends ParserRuleContext {
		public *arrayList.List l;
		public Lista_structContext list;
		public Token id;
		public Tipos_varContext tipos_var;
		public Token idstru;
		public TerminalNode MUT() { return getToken(swiftgrammar.MUT, 0); }
		public TerminalNode DPUNTO2() { return getToken(swiftgrammar.DPUNTO2, 0); }
		public Tipos_varContext tipos_var() {
			return getRuleContext(Tipos_varContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(swiftgrammar.ID); }
		public TerminalNode ID(int i) {
			return getToken(swiftgrammar.ID, i);
		}
		public TerminalNode LET() { return getToken(swiftgrammar.LET, 0); }
		public Lista_structContext lista_struct() {
			return getRuleContext(Lista_structContext.class,0);
		}
		public Lista_structContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_struct; }
	}

	public final Lista_structContext lista_struct() throws RecognitionException {
		return lista_struct(0);
	}

	private Lista_structContext lista_struct(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Lista_structContext _localctx = new Lista_structContext(_ctx, _parentState);
		Lista_structContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_lista_struct, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(409);
				match(MUT);
				setState(410);
				((Lista_structContext)_localctx).id = match(ID);
				setState(411);
				match(DPUNTO2);
				setState(412);
				((Lista_structContext)_localctx).tipos_var = tipos_var();

				                    Str_atrib := interfaces.NewStructType((((Lista_structContext)_localctx).id!=null?((Lista_structContext)_localctx).id.getText():null), ((Lista_structContext)_localctx).tipos_var.tipo, "")
				                    ((Lista_structContext)_localctx).l =  arrayList.New();
				                    _localctx.l.Add(Str_atrib);
				                
				}
				break;
			case 2:
				{
				setState(415);
				match(MUT);
				setState(416);
				((Lista_structContext)_localctx).id = match(ID);
				setState(417);
				match(DPUNTO2);
				setState(418);
				((Lista_structContext)_localctx).idstru = match(ID);

				                    Str_atrib := interfaces.NewStructType((((Lista_structContext)_localctx).id!=null?((Lista_structContext)_localctx).id.getText():null), interfaces.NULL, (((Lista_structContext)_localctx).idstru!=null?((Lista_structContext)_localctx).idstru.getText():null))
				                    ((Lista_structContext)_localctx).l =  arrayList.New();
				                    _localctx.l.Add(Str_atrib);
				                
				}
				break;
			case 3:
				{
				setState(420);
				match(LET);
				setState(421);
				((Lista_structContext)_localctx).id = match(ID);
				setState(422);
				match(DPUNTO2);
				setState(423);
				((Lista_structContext)_localctx).tipos_var = tipos_var();

				                    Str_atrib := interfaces.NewStructType((((Lista_structContext)_localctx).id!=null?((Lista_structContext)_localctx).id.getText():null), ((Lista_structContext)_localctx).tipos_var.tipo, "")
				                    ((Lista_structContext)_localctx).l =  arrayList.New();
				                    _localctx.l.Add(Str_atrib);
				                
				}
				break;
			case 4:
				{
				setState(426);
				match(LET);
				setState(427);
				((Lista_structContext)_localctx).id = match(ID);
				setState(428);
				match(DPUNTO2);
				setState(429);
				((Lista_structContext)_localctx).idstru = match(ID);

				                    Str_atrib := interfaces.NewStructType((((Lista_structContext)_localctx).id!=null?((Lista_structContext)_localctx).id.getText():null), interfaces.NULL, (((Lista_structContext)_localctx).idstru!=null?((Lista_structContext)_localctx).idstru.getText():null))
				                    ((Lista_structContext)_localctx).l =  arrayList.New();
				                    _localctx.l.Add(Str_atrib);
				                
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(461);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(459);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new Lista_structContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_lista_struct);
						setState(433);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(434);
						match(MUT);
						setState(435);
						((Lista_structContext)_localctx).id = match(ID);
						setState(436);
						match(DPUNTO2);
						setState(437);
						((Lista_structContext)_localctx).tipos_var = tipos_var();

						                                                  Str_atrib := interfaces.NewStructType((((Lista_structContext)_localctx).id!=null?((Lista_structContext)_localctx).id.getText():null), ((Lista_structContext)_localctx).tipos_var.tipo, "")
						                                                  ((Lista_structContext)_localctx).list.l.Add(Str_atrib);
						                                                  ((Lista_structContext)_localctx).l =  ((Lista_structContext)_localctx).list.l;
						                                              
						}
						break;
					case 2:
						{
						_localctx = new Lista_structContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_lista_struct);
						setState(440);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(441);
						match(MUT);
						setState(442);
						((Lista_structContext)_localctx).id = match(ID);
						setState(443);
						match(DPUNTO2);
						setState(444);
						((Lista_structContext)_localctx).idstru = match(ID);

						                                                  Str_atrib := interfaces.NewStructType((((Lista_structContext)_localctx).id!=null?((Lista_structContext)_localctx).id.getText():null), interfaces.NULL, (((Lista_structContext)_localctx).idstru!=null?((Lista_structContext)_localctx).idstru.getText():null))
						                                                  ((Lista_structContext)_localctx).list.l.Add(Str_atrib);
						                                                  ((Lista_structContext)_localctx).l =  ((Lista_structContext)_localctx).list.l;
						                                              
						}
						break;
					case 3:
						{
						_localctx = new Lista_structContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_lista_struct);
						setState(446);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(447);
						match(LET);
						setState(448);
						((Lista_structContext)_localctx).id = match(ID);
						setState(449);
						match(DPUNTO2);
						setState(450);
						((Lista_structContext)_localctx).tipos_var = tipos_var();

						                                                  Str_atrib := interfaces.NewStructType((((Lista_structContext)_localctx).id!=null?((Lista_structContext)_localctx).id.getText():null), ((Lista_structContext)_localctx).tipos_var.tipo, "")
						                                                  ((Lista_structContext)_localctx).list.l.Add(Str_atrib);
						                                                  ((Lista_structContext)_localctx).l =  ((Lista_structContext)_localctx).list.l;
						                                              
						}
						break;
					case 4:
						{
						_localctx = new Lista_structContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_lista_struct);
						setState(453);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(454);
						match(LET);
						setState(455);
						((Lista_structContext)_localctx).id = match(ID);
						setState(456);
						match(DPUNTO2);
						setState(457);
						((Lista_structContext)_localctx).idstru = match(ID);

						                                                  Str_atrib := interfaces.NewStructType((((Lista_structContext)_localctx).id!=null?((Lista_structContext)_localctx).id.getText():null), interfaces.NULL, (((Lista_structContext)_localctx).idstru!=null?((Lista_structContext)_localctx).idstru.getText():null))
						                                                  ((Lista_structContext)_localctx).list.l.Add(Str_atrib);
						                                                  ((Lista_structContext)_localctx).l =  ((Lista_structContext)_localctx).list.l;
						                                              
						}
						break;
					}
					} 
				}
				setState(463);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CallFunctionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public interfaces.Expresion p;
		public Token ID;
		public ListParamsCallContext listParamsCall;
		public TerminalNode ID() { return getToken(swiftgrammar.ID, 0); }
		public TerminalNode PARIZQ() { return getToken(swiftgrammar.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(swiftgrammar.PARDER, 0); }
		public ListParamsCallContext listParamsCall() {
			return getRuleContext(ListParamsCallContext.class,0);
		}
		public CallFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunction; }
	}

	public final CallFunctionContext callFunction() throws RecognitionException {
		CallFunctionContext _localctx = new CallFunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callFunction);
		try {
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				((CallFunctionContext)_localctx).ID = match(ID);
				setState(465);
				match(PARIZQ);
				setState(466);
				match(PARDER);

				                        _localctx.instr = instructionExpre.NewCallFunction((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), arrayList.New(), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0) )
				                        _localctx.p = instructionExpre.NewCallFunction((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), arrayList.New(), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0) )
				                    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				((CallFunctionContext)_localctx).ID = match(ID);
				setState(469);
				match(PARIZQ);
				setState(470);
				((CallFunctionContext)_localctx).listParamsCall = listParamsCall(0);
				setState(471);
				match(PARDER);

				                        _localctx.instr = instructionExpre.NewCallFunction((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), ((CallFunctionContext)_localctx).listParamsCall.l_e, (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0) )
				                        _localctx.p = instructionExpre.NewCallFunction((((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getText():null), ((CallFunctionContext)_localctx).listParamsCall.l_e, (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getLine():0), (((CallFunctionContext)_localctx).ID!=null?((CallFunctionContext)_localctx).ID.getCharPositionInLine():0) )
				                    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnFunContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token RETURN;
		public ExpressionContext expression;
		public TerminalNode RETURN() { return getToken(swiftgrammar.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnFunContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnFun; }
	}

	public final ReturnFunContext returnFun() throws RecognitionException {
		ReturnFunContext _localctx = new ReturnFunContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_returnFun);
		try {
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				((ReturnFunContext)_localctx).RETURN = match(RETURN);
				 _localctx.instr = instructionExpre.NewReturn(nil, (((ReturnFunContext)_localctx).RETURN!=null?((ReturnFunContext)_localctx).RETURN.getLine():0), (((ReturnFunContext)_localctx).RETURN!=null?((ReturnFunContext)_localctx).RETURN.getCharPositionInLine():0) )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				((ReturnFunContext)_localctx).RETURN = match(RETURN);
				setState(479);
				((ReturnFunContext)_localctx).expression = expression(0);
				 _localctx.instr = instructionExpre.NewReturn(((ReturnFunContext)_localctx).expression.p, (((ReturnFunContext)_localctx).RETURN!=null?((ReturnFunContext)_localctx).RETURN.getLine():0), (((ReturnFunContext)_localctx).RETURN!=null?((ReturnFunContext)_localctx).RETURN.getCharPositionInLine():0) )
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintconsolaContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token PRINT_CON;
		public ListParamsContext listParams;
		public TerminalNode PRINT_CON() { return getToken(swiftgrammar.PRINT_CON, 0); }
		public TerminalNode PARIZQ() { return getToken(swiftgrammar.PARIZQ, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public TerminalNode PARDER() { return getToken(swiftgrammar.PARDER, 0); }
		public PrintconsolaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printconsola; }
	}

	public final PrintconsolaContext printconsola() throws RecognitionException {
		PrintconsolaContext _localctx = new PrintconsolaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_printconsola);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			((PrintconsolaContext)_localctx).PRINT_CON = match(PRINT_CON);
			setState(485);
			match(PARIZQ);
			setState(486);
			((PrintconsolaContext)_localctx).listParams = listParams(0);
			setState(487);
			match(PARDER);
			_localctx.instr = instruction.NewImprimir(((PrintconsolaContext)_localctx).listParams.l_e, (((PrintconsolaContext)_localctx).PRINT_CON!=null?((PrintconsolaContext)_localctx).PRINT_CON.getLine():0), localctx.(*PrintconsolaContext).Get_PRINT_CON().GetColumn() )
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_trueContext extends ParserRuleContext {
		public interfaces.Instruction lop;
		public interfaces.Expresion p;
		public Token WHILE;
		public Bloque_instContext bloque_inst;
		public TerminalNode WHILE() { return getToken(swiftgrammar.WHILE, 0); }
		public TerminalNode TRUE() { return getToken(swiftgrammar.TRUE, 0); }
		public Bloque_instContext bloque_inst() {
			return getRuleContext(Bloque_instContext.class,0);
		}
		public While_trueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_true; }
	}

	public final While_trueContext while_true() throws RecognitionException {
		While_trueContext _localctx = new While_trueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_while_true);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			((While_trueContext)_localctx).WHILE = match(WHILE);
			setState(491);
			match(TRUE);
			setState(492);
			((While_trueContext)_localctx).bloque_inst = bloque_inst();
			 
			                        _localctx.lop = instructionExpre.NewLoop(((While_trueContext)_localctx).bloque_inst.l, (((While_trueContext)_localctx).WHILE!=null?((While_trueContext)_localctx).WHILE.getLine():0), (((While_trueContext)_localctx).WHILE!=null?((While_trueContext)_localctx).WHILE.getCharPositionInLine():0) )
			                        _localctx.p = instructionExpre.NewLoop(((While_trueContext)_localctx).bloque_inst.l, (((While_trueContext)_localctx).WHILE!=null?((While_trueContext)_localctx).WHILE.getLine():0), (((While_trueContext)_localctx).WHILE!=null?((While_trueContext)_localctx).WHILE.getCharPositionInLine():0) ) 
			                    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LWhileContext extends ParserRuleContext {
		public interfaces.Instruction lwh;
		public Token WHILE;
		public ExpressionContext expression;
		public Bloque_instContext bloque_inst;
		public TerminalNode WHILE() { return getToken(swiftgrammar.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bloque_instContext bloque_inst() {
			return getRuleContext(Bloque_instContext.class,0);
		}
		public LWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lWhile; }
	}

	public final LWhileContext lWhile() throws RecognitionException {
		LWhileContext _localctx = new LWhileContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_lWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			((LWhileContext)_localctx).WHILE = match(WHILE);
			setState(496);
			((LWhileContext)_localctx).expression = expression(0);
			setState(497);
			((LWhileContext)_localctx).bloque_inst = bloque_inst();
			 _localctx.lwh = instruction.NewWhile(((LWhileContext)_localctx).expression.p, ((LWhileContext)_localctx).bloque_inst.l, (((LWhileContext)_localctx).WHILE!=null?((LWhileContext)_localctx).WHILE.getLine():0), (((LWhileContext)_localctx).WHILE!=null?((LWhileContext)_localctx).WHILE.getCharPositionInLine():0) ) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LForinContext extends ParserRuleContext {
		public interfaces.Instruction lfor;
		public Token FOR;
		public Token ID;
		public ExpressionContext expression;
		public Bloque_instContext bloque_inst;
		public TerminalNode FOR() { return getToken(swiftgrammar.FOR, 0); }
		public TerminalNode ID() { return getToken(swiftgrammar.ID, 0); }
		public TerminalNode IN() { return getToken(swiftgrammar.IN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bloque_instContext bloque_inst() {
			return getRuleContext(Bloque_instContext.class,0);
		}
		public LForinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lForin; }
	}

	public final LForinContext lForin() throws RecognitionException {
		LForinContext _localctx = new LForinContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_lForin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			((LForinContext)_localctx).FOR = match(FOR);
			setState(501);
			((LForinContext)_localctx).ID = match(ID);
			setState(502);
			match(IN);
			setState(503);
			((LForinContext)_localctx).expression = expression(0);
			setState(504);
			((LForinContext)_localctx).bloque_inst = bloque_inst();
			 _localctx.lfor = instruction.NewForIn((((LForinContext)_localctx).ID!=null?((LForinContext)_localctx).ID.getText():null), ((LForinContext)_localctx).expression.p, ((LForinContext)_localctx).bloque_inst.l, (((LForinContext)_localctx).FOR!=null?((LForinContext)_localctx).FOR.getLine():0), (((LForinContext)_localctx).FOR!=null?((LForinContext)_localctx).FOR.getCharPositionInLine():0)) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LBreakContext extends ParserRuleContext {
		public interfaces.Instruction br;
		public Token BREAK;
		public ExpressionContext expression;
		public TerminalNode BREAK() { return getToken(swiftgrammar.BREAK, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LBreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lBreak; }
	}

	public final LBreakContext lBreak() throws RecognitionException {
		LBreakContext _localctx = new LBreakContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_lBreak);
		try {
			setState(513);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				((LBreakContext)_localctx).BREAK = match(BREAK);
				 _localctx.br = instructionExpre.NewBreak(nil, (((LBreakContext)_localctx).BREAK!=null?((LBreakContext)_localctx).BREAK.getLine():0), (((LBreakContext)_localctx).BREAK!=null?((LBreakContext)_localctx).BREAK.getCharPositionInLine():0)) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(509);
				((LBreakContext)_localctx).BREAK = match(BREAK);
				setState(510);
				((LBreakContext)_localctx).expression = expression(0);
				 _localctx.br = instructionExpre.NewBreak(((LBreakContext)_localctx).expression.p, (((LBreakContext)_localctx).BREAK!=null?((LBreakContext)_localctx).BREAK.getLine():0), (((LBreakContext)_localctx).BREAK!=null?((LBreakContext)_localctx).BREAK.getCharPositionInLine():0) ) 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LContinueContext extends ParserRuleContext {
		public interfaces.Instruction cn;
		public Token CONTINUE;
		public TerminalNode CONTINUE() { return getToken(swiftgrammar.CONTINUE, 0); }
		public LContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lContinue; }
	}

	public final LContinueContext lContinue() throws RecognitionException {
		LContinueContext _localctx = new LContinueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lContinue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			((LContinueContext)_localctx).CONTINUE = match(CONTINUE);
			 _localctx.cn = instructionExpre.NewContinue((((LContinueContext)_localctx).CONTINUE!=null?((LContinueContext)_localctx).CONTINUE.getLine():0), (((LContinueContext)_localctx).CONTINUE!=null?((LContinueContext)_localctx).CONTINUE.getCharPositionInLine():0)) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListParamsContext extends ParserRuleContext {
		public *arrayList.List l_e;
		public ListParamsContext list;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(swiftgrammar.COMA, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public ListParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParams; }
	}

	public final ListParamsContext listParams() throws RecognitionException {
		return listParams(0);
	}

	private ListParamsContext listParams(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsContext _localctx = new ListParamsContext(_ctx, _parentState);
		ListParamsContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_listParams, _p);

		    _localctx.l_e = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(519);
			((ListParamsContext)_localctx).expression = expression(0);
			_localctx.l_e.Add(((ListParamsContext)_localctx).expression.p)
			}
			_ctx.stop = _input.LT(-1);
			setState(529);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParams);
					setState(522);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(523);
					match(COMA);
					setState(524);
					((ListParamsContext)_localctx).expression = expression(0);

					                                              ((ListParamsContext)_localctx).list.l_e.Add(((ListParamsContext)_localctx).expression.p)
					                                              _localctx.l_e = ((ListParamsContext)_localctx).list.l_e
					                                          
					}
					} 
				}
				setState(531);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ListParamsCallContext extends ParserRuleContext {
		public *arrayList.List l_e;
		public ListParamsCallContext list;
		public Es_referenciaContext es_referencia;
		public ExpressionContext expression;
		public Es_referenciaContext es_referencia() {
			return getRuleContext(Es_referenciaContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(swiftgrammar.COMA, 0); }
		public ListParamsCallContext listParamsCall() {
			return getRuleContext(ListParamsCallContext.class,0);
		}
		public ListParamsCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listParamsCall; }
	}

	public final ListParamsCallContext listParamsCall() throws RecognitionException {
		return listParamsCall(0);
	}

	private ListParamsCallContext listParamsCall(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListParamsCallContext _localctx = new ListParamsCallContext(_ctx, _parentState);
		ListParamsCallContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_listParamsCall, _p);

		    _localctx.l_e = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(533);
			((ListParamsCallContext)_localctx).es_referencia = es_referencia();
			setState(534);
			((ListParamsCallContext)_localctx).expression = expression(0);
			   ref := instructionExpre.NewParameterBy(((ListParamsCallContext)_localctx).expression.p, ((ListParamsCallContext)_localctx).es_referencia.ref)
			                        _localctx.l_e.Add(ref)
			                    
			}
			_ctx.stop = _input.LT(-1);
			setState(545);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListParamsCallContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listParamsCall);
					setState(537);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(538);
					match(COMA);
					setState(539);
					((ListParamsCallContext)_localctx).es_referencia = es_referencia();
					setState(540);
					((ListParamsCallContext)_localctx).expression = expression(0);

					                                              ref := instructionExpre.NewParameterBy(((ListParamsCallContext)_localctx).expression.p, ((ListParamsCallContext)_localctx).es_referencia.ref)
					                                              ((ListParamsCallContext)_localctx).list.l_e.Add(ref)
					                                              _localctx.l_e = ((ListParamsCallContext)_localctx).list.l_e
					                                          
					}
					} 
				}
				setState(547);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Es_referenciaContext extends ParserRuleContext {
		public bool ref;
		public TerminalNode AMP() { return getToken(swiftgrammar.AMP, 0); }
		public Es_referenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_es_referencia; }
	}

	public final Es_referenciaContext es_referencia() throws RecognitionException {
		Es_referenciaContext _localctx = new Es_referenciaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_es_referencia);
		try {
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(548);
				match(AMP);
				 _localctx.ref = true 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 _localctx.ref = false 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Es_varrContext isVar;
		public Token id;
		public Tipos_varContext tipos_var;
		public Token asig;
		public ExpressionContext expression;
		public Vector_typesContext vector_types;
		public Token idob;
		public TerminalNode DPUNTO2() { return getToken(swiftgrammar.DPUNTO2, 0); }
		public Tipos_varContext tipos_var() {
			return getRuleContext(Tipos_varContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Es_varrContext es_varr() {
			return getRuleContext(Es_varrContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(swiftgrammar.ID); }
		public TerminalNode ID(int i) {
			return getToken(swiftgrammar.ID, i);
		}
		public TerminalNode ASIGNACION() { return getToken(swiftgrammar.ASIGNACION, 0); }
		public LetidContext letid() {
			return getRuleContext(LetidContext.class,0);
		}
		public Vector_typesContext vector_types() {
			return getRuleContext(Vector_typesContext.class,0);
		}
		public List<TerminalNode> CORIZQ() { return getTokens(swiftgrammar.CORIZQ); }
		public TerminalNode CORIZQ(int i) {
			return getToken(swiftgrammar.CORIZQ, i);
		}
		public List<TerminalNode> CORDER() { return getTokens(swiftgrammar.CORDER); }
		public TerminalNode CORDER(int i) {
			return getToken(swiftgrammar.CORDER, i);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declaracion);
		try {
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(553);
				((DeclaracionContext)_localctx).isVar = es_varr();
				setState(554);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(555);
				match(DPUNTO2);
				setState(556);
				((DeclaracionContext)_localctx).tipos_var = tipos_var();
				setState(557);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(558);
				((DeclaracionContext)_localctx).expression = expression(0);
				 
				                        _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).tipos_var.tipo, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isVar.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(561);
				((DeclaracionContext)_localctx).isVar = es_varr();
				setState(562);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(563);
				letid();
				setState(564);
				((DeclaracionContext)_localctx).asig = match(ASIGNACION);
				setState(565);
				((DeclaracionContext)_localctx).expression = expression(0);
				 
				                      _localctx.instr = instruction.NewDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), interfaces.NULL, ((DeclaracionContext)_localctx).expression.p, ((DeclaracionContext)_localctx).isVar.mut, (((DeclaracionContext)_localctx).asig!=null?((DeclaracionContext)_localctx).asig.getLine():0), localctx.(*DeclaracionContext).GetAsig().GetColumn())
				                    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(568);
				((DeclaracionContext)_localctx).isVar = es_varr();
				setState(569);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(570);
				match(DPUNTO2);
				setState(571);
				((DeclaracionContext)_localctx).vector_types = vector_types();
				setState(572);
				match(ASIGNACION);
				setState(573);
				match(CORIZQ);
				setState(574);
				match(CORDER);

				                        _localctx.instr = instruction.NewVectorDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).vector_types.tipo, nil, ((DeclaracionContext)_localctx).isVar.mut, (((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getLine():0), (((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getCharPositionInLine():0), nil, "")
				                    
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(577);
				((DeclaracionContext)_localctx).isVar = es_varr();
				setState(578);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(579);
				match(DPUNTO2);
				setState(580);
				((DeclaracionContext)_localctx).vector_types = vector_types();
				setState(581);
				match(ASIGNACION);
				setState(582);
				((DeclaracionContext)_localctx).expression = expression(0);

				                        _localctx.instr = instruction.NewVectorDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).vector_types.tipo, nil, ((DeclaracionContext)_localctx).isVar.mut, (((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getLine():0), (((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getCharPositionInLine():0),((DeclaracionContext)_localctx).expression.p, "")
				                    
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(585);
				((DeclaracionContext)_localctx).isVar = es_varr();
				setState(586);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(587);
				match(DPUNTO2);
				setState(588);
				match(CORIZQ);
				setState(589);
				((DeclaracionContext)_localctx).idob = match(ID);
				setState(590);
				match(CORDER);
				setState(591);
				match(ASIGNACION);
				setState(592);
				match(CORIZQ);
				setState(593);
				match(CORDER);

				                        _localctx.instr = instruction.NewVectorDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), interfaces.STRUCT, nil, ((DeclaracionContext)_localctx).isVar.mut, (((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getLine():0), (((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getCharPositionInLine():0), nil, (((DeclaracionContext)_localctx).idob!=null?((DeclaracionContext)_localctx).idob.getText():null))
				                    
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(596);
				((DeclaracionContext)_localctx).isVar = es_varr();
				setState(597);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(598);
				match(DPUNTO2);
				setState(599);
				match(CORIZQ);
				setState(600);
				((DeclaracionContext)_localctx).idob = match(ID);
				setState(601);
				match(CORDER);
				setState(602);
				match(ASIGNACION);
				setState(603);
				((DeclaracionContext)_localctx).expression = expression(0);

				                        _localctx.instr = instruction.NewVectorDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), interfaces.NULL, nil, ((DeclaracionContext)_localctx).isVar.mut, (((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getLine():0), (((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getCharPositionInLine():0), ((DeclaracionContext)_localctx).expression.p, (((DeclaracionContext)_localctx).idob!=null?((DeclaracionContext)_localctx).idob.getText():null))
				                    
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(606);
				((DeclaracionContext)_localctx).isVar = es_varr();
				setState(607);
				((DeclaracionContext)_localctx).id = match(ID);
				setState(608);
				match(DPUNTO2);
				setState(609);
				match(CORIZQ);
				setState(610);
				((DeclaracionContext)_localctx).tipos_var = tipos_var();
				setState(611);
				match(CORDER);
				setState(612);
				match(ASIGNACION);
				setState(613);
				((DeclaracionContext)_localctx).expression = expression(0);

				                        _localctx.instr = instruction.NewVectorDeclaration((((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getText():null), ((DeclaracionContext)_localctx).tipos_var.tipo, nil, ((DeclaracionContext)_localctx).isVar.mut, (((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getLine():0), (((DeclaracionContext)_localctx).id!=null?((DeclaracionContext)_localctx).id.getCharPositionInLine():0), ((DeclaracionContext)_localctx).expression.p, "")
				                    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Es_varContext extends ParserRuleContext {
		public bool mut;
		public TerminalNode MUT() { return getToken(swiftgrammar.MUT, 0); }
		public Es_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_es_var; }
	}

	public final Es_varContext es_var() throws RecognitionException {
		Es_varContext _localctx = new Es_varContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_es_var);
		try {
			setState(621);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				match(MUT);
				 _localctx.mut = true 
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Es_varrContext extends ParserRuleContext {
		public bool mut;
		public TerminalNode MUT() { return getToken(swiftgrammar.MUT, 0); }
		public TerminalNode LET() { return getToken(swiftgrammar.LET, 0); }
		public Es_varrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_es_varr; }
	}

	public final Es_varrContext es_varr() throws RecognitionException {
		Es_varrContext _localctx = new Es_varrContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_es_varr);
		try {
			setState(627);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				match(MUT);
				 _localctx.mut = true 
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 2);
				{
				setState(625);
				match(LET);
				 _localctx.mut = false 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetidContext extends ParserRuleContext {
		public TerminalNode DPUNTO2() { return getToken(swiftgrammar.DPUNTO2, 0); }
		public TerminalNode ID() { return getToken(swiftgrammar.ID, 0); }
		public LetidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letid; }
	}

	public final LetidContext letid() throws RecognitionException {
		LetidContext _localctx = new LetidContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_letid);
		try {
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DPUNTO2:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				match(DPUNTO2);
				setState(630);
				match(ID);
				}
				break;
			case ASIGNACION:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Vector_typesContext extends ParserRuleContext {
		public interfaces.TipoExpresion tipo;
		public Tipos_varContext tipos_var;
		public TerminalNode CORIZQ() { return getToken(swiftgrammar.CORIZQ, 0); }
		public Vector_typesContext vector_types() {
			return getRuleContext(Vector_typesContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(swiftgrammar.CORDER, 0); }
		public Tipos_varContext tipos_var() {
			return getRuleContext(Tipos_varContext.class,0);
		}
		public Vector_typesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vector_types; }
	}

	public final Vector_typesContext vector_types() throws RecognitionException {
		Vector_typesContext _localctx = new Vector_typesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_vector_types);
		try {
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(634);
				match(CORIZQ);
				setState(635);
				vector_types();
				setState(636);
				match(CORDER);
				 _localctx.tipo = interfaces.VECTOR 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(639);
				match(CORIZQ);
				setState(640);
				((Vector_typesContext)_localctx).tipos_var = tipos_var();
				setState(641);
				match(CORDER);
				 _localctx.tipo = ((Vector_typesContext)_localctx).tipos_var.tipo 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_typeContext extends ParserRuleContext {
		public *arrayList.List ty;
		public Token CORIZQ;
		public Array_typeContext array_type;
		public ExpressionContext expression;
		public Tipos_varContext tipos_var;
		public TerminalNode CORIZQ() { return getToken(swiftgrammar.CORIZQ, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public TerminalNode PTCOMA() { return getToken(swiftgrammar.PTCOMA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(swiftgrammar.CORDER, 0); }
		public Tipos_varContext tipos_var() {
			return getRuleContext(Tipos_varContext.class,0);
		}
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_array_type);

		    _localctx.ty = arrayList.New()

		try {
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(646);
				((Array_typeContext)_localctx).CORIZQ = match(CORIZQ);
				setState(647);
				((Array_typeContext)_localctx).array_type = array_type();
				setState(648);
				match(PTCOMA);
				setState(649);
				((Array_typeContext)_localctx).expression = expression(0);
				setState(650);
				match(CORDER);

				                                        nType := interfaces.NewArrayType(interfaces.ARRAY, ((Array_typeContext)_localctx).expression.p, (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getLine():0), (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getCharPositionInLine():0) )
				                                        ((Array_typeContext)_localctx).array_type.ty.Add(nType)
				                                        _localctx.ty = ((Array_typeContext)_localctx).array_type.ty
				                                    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(653);
				((Array_typeContext)_localctx).CORIZQ = match(CORIZQ);
				setState(654);
				((Array_typeContext)_localctx).tipos_var = tipos_var();
				setState(655);
				match(PTCOMA);
				setState(656);
				((Array_typeContext)_localctx).expression = expression(0);
				setState(657);
				match(CORDER);

				                                      nType := interfaces.NewArrayType(((Array_typeContext)_localctx).tipos_var.tipo, ((Array_typeContext)_localctx).expression.p, (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getLine():0), (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getCharPositionInLine():0) )
				                                      _localctx.ty.Add(nType)
				                                    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(660);
				((Array_typeContext)_localctx).CORIZQ = match(CORIZQ);
				setState(661);
				((Array_typeContext)_localctx).tipos_var = tipos_var();
				setState(662);
				match(CORDER);

				                                      nType := interfaces.NewArrayType(((Array_typeContext)_localctx).tipos_var.tipo, nil, (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getLine():0), (((Array_typeContext)_localctx).CORIZQ!=null?((Array_typeContext)_localctx).CORIZQ.getCharPositionInLine():0) )
				                                      _localctx.ty.Add(nType)
				                                    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token id;
		public ExpressionContext expression;
		public List_indexContext list_index;
		public L_AccessStructContext l_AccessStruct;
		public ExpressionContext index;
		public ExpressionContext val;
		public TerminalNode ASIGNACION() { return getToken(swiftgrammar.ASIGNACION, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(swiftgrammar.ID, 0); }
		public List_indexContext list_index() {
			return getRuleContext(List_indexContext.class,0);
		}
		public L_AccessStructContext l_AccessStruct() {
			return getRuleContext(L_AccessStructContext.class,0);
		}
		public TerminalNode CORIZQ() { return getToken(swiftgrammar.CORIZQ, 0); }
		public TerminalNode CORDER() { return getToken(swiftgrammar.CORDER, 0); }
		public TerminalNode PUNTO() { return getToken(swiftgrammar.PUNTO, 0); }
		public TerminalNode ASIG() { return getToken(swiftgrammar.ASIG, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_asignacion);
		try {
			setState(698);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				((AsignacionContext)_localctx).id = match(ID);
				setState(668);
				match(ASIGNACION);
				setState(669);
				((AsignacionContext)_localctx).expression = expression(0);
				_localctx.instr = instruction.NewAssignment((((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getText():null),((AsignacionContext)_localctx).expression.p, nil, (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getLine():0), localctx.(*AsignacionContext).GetId().GetColumn() )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(672);
				((AsignacionContext)_localctx).id = match(ID);
				setState(673);
				((AsignacionContext)_localctx).list_index = list_index(0);
				setState(674);
				match(ASIGNACION);
				setState(675);
				((AsignacionContext)_localctx).expression = expression(0);
				_localctx.instr = instruction.NewAssignment((((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getText():null),((AsignacionContext)_localctx).expression.p, ((AsignacionContext)_localctx).list_index.lista, (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getLine():0), localctx.(*AsignacionContext).GetId().GetColumn() )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(678);
				((AsignacionContext)_localctx).l_AccessStruct = l_AccessStruct(0);
				setState(679);
				match(ASIGNACION);
				setState(680);
				((AsignacionContext)_localctx).expression = expression(0);
				 _localctx.instr = instruction.NewAssignmentStruct(((AsignacionContext)_localctx).l_AccessStruct.l, ((AsignacionContext)_localctx).expression.p, (((AsignacionContext)_localctx).l_AccessStruct!=null?(((AsignacionContext)_localctx).l_AccessStruct.start):null).GetLine(),(((AsignacionContext)_localctx).l_AccessStruct!=null?(((AsignacionContext)_localctx).l_AccessStruct.start):null).GetColumn()) 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(683);
				((AsignacionContext)_localctx).id = match(ID);
				setState(684);
				match(CORIZQ);
				setState(685);
				((AsignacionContext)_localctx).index = expression(0);
				setState(686);
				match(CORDER);
				setState(687);
				match(PUNTO);
				setState(688);
				((AsignacionContext)_localctx).l_AccessStruct = l_AccessStruct(0);
				setState(689);
				match(ASIGNACION);
				setState(690);
				((AsignacionContext)_localctx).val = expression(0);
				_localctx.instr = instruction.NewAssignmentVec((((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getText():null), ((AsignacionContext)_localctx).index.p, ((AsignacionContext)_localctx).l_AccessStruct.l, ((AsignacionContext)_localctx).val.p, (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getLine():0), localctx.(*AsignacionContext).GetId().GetColumn() )
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(693);
				((AsignacionContext)_localctx).id = match(ID);
				setState(694);
				match(ASIG);
				setState(695);
				((AsignacionContext)_localctx).expression = expression(0);
				_localctx.instr = instruction.NewIncrement((((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getText():null),((AsignacionContext)_localctx).expression.p, (((AsignacionContext)_localctx).id!=null?((AsignacionContext)_localctx).id.getLine():0), localctx.(*AsignacionContext).GetId().GetColumn())
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class L_AccessStructContext extends ParserRuleContext {
		public *arrayList.List l;
		public L_AccessStructContext list;
		public Token ID;
		public TerminalNode ID() { return getToken(swiftgrammar.ID, 0); }
		public TerminalNode PUNTO() { return getToken(swiftgrammar.PUNTO, 0); }
		public L_AccessStructContext l_AccessStruct() {
			return getRuleContext(L_AccessStructContext.class,0);
		}
		public L_AccessStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_AccessStruct; }
	}

	public final L_AccessStructContext l_AccessStruct() throws RecognitionException {
		return l_AccessStruct(0);
	}

	private L_AccessStructContext l_AccessStruct(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		L_AccessStructContext _localctx = new L_AccessStructContext(_ctx, _parentState);
		L_AccessStructContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_l_AccessStruct, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(701);
			((L_AccessStructContext)_localctx).ID = match(ID);

			            _localctx.l = arrayList.New()
			            _localctx.l.Add((((L_AccessStructContext)_localctx).ID!=null?((L_AccessStructContext)_localctx).ID.getText():null))

			}
			_ctx.stop = _input.LT(-1);
			setState(710);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new L_AccessStructContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_l_AccessStruct);
					setState(704);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(705);
					match(PUNTO);
					setState(706);
					((L_AccessStructContext)_localctx).ID = match(ID);

					                                             ((L_AccessStructContext)_localctx).list.l.Add((((L_AccessStructContext)_localctx).ID!=null?((L_AccessStructContext)_localctx).ID.getText():null))
					                                             _localctx.l = ((L_AccessStructContext)_localctx).list.l
					                                            
					}
					} 
				}
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class List_indexContext extends ParserRuleContext {
		public *arrayList.List lista;
		public List_indexContext listi;
		public Index_arrayContext index_array;
		public Index_arrayContext index_array() {
			return getRuleContext(Index_arrayContext.class,0);
		}
		public List_indexContext list_index() {
			return getRuleContext(List_indexContext.class,0);
		}
		public List_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_index; }
	}

	public final List_indexContext list_index() throws RecognitionException {
		return list_index(0);
	}

	private List_indexContext list_index(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		List_indexContext _localctx = new List_indexContext(_ctx, _parentState);
		List_indexContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_list_index, _p);

		    _localctx.lista = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(714);
			((List_indexContext)_localctx).index_array = index_array();
			_localctx.lista.Add(((List_indexContext)_localctx).index_array.index)
			}
			_ctx.stop = _input.LT(-1);
			setState(723);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new List_indexContext(_parentctx, _parentState);
					_localctx.listi = _prevctx;
					_localctx.listi = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_list_index);
					setState(717);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(718);
					((List_indexContext)_localctx).index_array = index_array();

					                                                ((List_indexContext)_localctx).listi.lista.Add(((List_indexContext)_localctx).index_array.index)
					                                                _localctx.lista = ((List_indexContext)_localctx).listi.lista
					                                            
					}
					} 
				}
				setState(725);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Index_arrayContext extends ParserRuleContext {
		public interfaces.Expresion index;
		public ExpressionContext expression;
		public TerminalNode CORIZQ() { return getToken(swiftgrammar.CORIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(swiftgrammar.CORDER, 0); }
		public Index_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_array; }
	}

	public final Index_arrayContext index_array() throws RecognitionException {
		Index_arrayContext _localctx = new Index_arrayContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_index_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(CORIZQ);
			setState(727);
			((Index_arrayContext)_localctx).expression = expression(0);
			setState(728);
			match(CORDER);
			_localctx.index = ((Index_arrayContext)_localctx).expression.p
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_sentContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token IF;
		public ExpressionContext expression;
		public Bloque_instContext bloque_inst;
		public Bloque_instContext bprin;
		public Bloque_instContext belse;
		public List_elseifContext list_elseif;
		public TerminalNode IF() { return getToken(swiftgrammar.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<Bloque_instContext> bloque_inst() {
			return getRuleContexts(Bloque_instContext.class);
		}
		public Bloque_instContext bloque_inst(int i) {
			return getRuleContext(Bloque_instContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(swiftgrammar.ELSE, 0); }
		public List_elseifContext list_elseif() {
			return getRuleContext(List_elseifContext.class,0);
		}
		public If_sentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_sent; }
	}

	public final If_sentContext if_sent() throws RecognitionException {
		If_sentContext _localctx = new If_sentContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_if_sent);
		try {
			setState(757);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				((If_sentContext)_localctx).IF = match(IF);
				setState(732);
				((If_sentContext)_localctx).expression = expression(0);
				setState(733);
				((If_sentContext)_localctx).bloque_inst = bloque_inst();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p, ((If_sentContext)_localctx).bloque_inst.l, nil,nil, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(736);
				((If_sentContext)_localctx).IF = match(IF);
				setState(737);
				((If_sentContext)_localctx).expression = expression(0);
				setState(738);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(739);
				match(ELSE);
				setState(740);
				((If_sentContext)_localctx).belse = bloque_inst();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p,((If_sentContext)_localctx).bprin.l,nil,((If_sentContext)_localctx).belse.l, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(743);
				((If_sentContext)_localctx).IF = match(IF);
				setState(744);
				((If_sentContext)_localctx).expression = expression(0);
				setState(745);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(746);
				((If_sentContext)_localctx).list_elseif = list_elseif();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p,((If_sentContext)_localctx).bprin.l,((If_sentContext)_localctx).list_elseif.lista, nil, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(749);
				((If_sentContext)_localctx).IF = match(IF);
				setState(750);
				((If_sentContext)_localctx).expression = expression(0);
				setState(751);
				((If_sentContext)_localctx).bprin = bloque_inst();
				setState(752);
				((If_sentContext)_localctx).list_elseif = list_elseif();
				setState(753);
				match(ELSE);
				setState(754);
				((If_sentContext)_localctx).belse = bloque_inst();
				_localctx.instr = instruction.NewIf(((If_sentContext)_localctx).expression.p,((If_sentContext)_localctx).bprin.l,((If_sentContext)_localctx).list_elseif.lista, ((If_sentContext)_localctx).belse.l, (((If_sentContext)_localctx).IF!=null?((If_sentContext)_localctx).IF.getLine():0), localctx.(*If_sentContext).Get_IF().GetColumn() )
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_expContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token IF;
		public ExpressionContext expression;
		public Bloque_expContext bprin_e;
		public Bloque_expContext belse_e;
		public List_elseif_expContext list_elseif_exp;
		public TerminalNode IF() { return getToken(swiftgrammar.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(swiftgrammar.ELSE, 0); }
		public List<Bloque_expContext> bloque_exp() {
			return getRuleContexts(Bloque_expContext.class);
		}
		public Bloque_expContext bloque_exp(int i) {
			return getRuleContext(Bloque_expContext.class,i);
		}
		public List_elseif_expContext list_elseif_exp() {
			return getRuleContext(List_elseif_expContext.class,0);
		}
		public If_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_exp; }
	}

	public final If_expContext if_exp() throws RecognitionException {
		If_expContext _localctx = new If_expContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_if_exp);
		try {
			setState(774);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(759);
				((If_expContext)_localctx).IF = match(IF);
				setState(760);
				((If_expContext)_localctx).expression = expression(0);
				setState(761);
				((If_expContext)_localctx).bprin_e = bloque_exp();
				setState(762);
				match(ELSE);
				setState(763);
				((If_expContext)_localctx).belse_e = bloque_exp();
				_localctx.p = instruction.NewIfExpre(((If_expContext)_localctx).expression.p, nil ,nil, nil, (((If_expContext)_localctx).IF!=null?((If_expContext)_localctx).IF.getLine():0), localctx.(*If_expContext).Get_IF().GetColumn(), true, ((If_expContext)_localctx).bprin_e.p, nil, ((If_expContext)_localctx).belse_e.p )
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(766);
				((If_expContext)_localctx).IF = match(IF);
				setState(767);
				((If_expContext)_localctx).expression = expression(0);
				setState(768);
				((If_expContext)_localctx).bprin_e = bloque_exp();
				setState(769);
				((If_expContext)_localctx).list_elseif_exp = list_elseif_exp();
				setState(770);
				match(ELSE);
				setState(771);
				((If_expContext)_localctx).belse_e = bloque_exp();

				        _localctx.p = instruction.NewIfExpre(((If_expContext)_localctx).expression.p,nil,nil, nil, (((If_expContext)_localctx).IF!=null?((If_expContext)_localctx).IF.getLine():0), localctx.(*If_expContext).Get_IF().GetColumn(), true, ((If_expContext)_localctx).bprin_e.p, ((If_expContext)_localctx).list_elseif_exp.lista,  ((If_expContext)_localctx).belse_e.p )
				    
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_elseifContext extends ParserRuleContext {
		public *arrayList.List lista;
		public Else_ifContext else_if;
		public List<Else_ifContext> list = new ArrayList<Else_ifContext>();
		public List<Else_ifContext> else_if() {
			return getRuleContexts(Else_ifContext.class);
		}
		public Else_ifContext else_if(int i) {
			return getRuleContext(Else_ifContext.class,i);
		}
		public List_elseifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_elseif; }
	}

	public final List_elseifContext list_elseif() throws RecognitionException {
		List_elseifContext _localctx = new List_elseifContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_list_elseif);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(777); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(776);
					((List_elseifContext)_localctx).else_if = else_if();
					((List_elseifContext)_localctx).list.add(((List_elseifContext)_localctx).else_if);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(779); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

			                    listInt := localctx.(*List_elseifContext).GetList()
			                    for _, e := range listInt {
			                        _localctx.lista.Add(e.GetInstr())
			                    }
			                    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_elseif_expContext extends ParserRuleContext {
		public *arrayList.List lista;
		public Else_if_expContext else_if_exp;
		public List<Else_if_expContext> list = new ArrayList<Else_if_expContext>();
		public List<Else_if_expContext> else_if_exp() {
			return getRuleContexts(Else_if_expContext.class);
		}
		public Else_if_expContext else_if_exp(int i) {
			return getRuleContext(Else_if_expContext.class,i);
		}
		public List_elseif_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_elseif_exp; }
	}

	public final List_elseif_expContext list_elseif_exp() throws RecognitionException {
		List_elseif_expContext _localctx = new List_elseif_expContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_list_elseif_exp);
		 _localctx.lista = arrayList.New()
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(784); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(783);
					((List_elseif_expContext)_localctx).else_if_exp = else_if_exp();
					((List_elseif_expContext)_localctx).list.add(((List_elseif_expContext)_localctx).else_if_exp);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(786); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );

			                    listInt := localctx.(*List_elseif_expContext).GetList()
			                    for _, e := range listInt {
			                        _localctx.lista.Add(e.GetP())
			                    }
			                    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_ifContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public Token ELSE;
		public ExpressionContext expression;
		public Bloque_instContext bloque_inst;
		public TerminalNode ELSE() { return getToken(swiftgrammar.ELSE, 0); }
		public TerminalNode IF() { return getToken(swiftgrammar.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bloque_instContext bloque_inst() {
			return getRuleContext(Bloque_instContext.class,0);
		}
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			((Else_ifContext)_localctx).ELSE = match(ELSE);
			setState(791);
			match(IF);
			setState(792);
			((Else_ifContext)_localctx).expression = expression(0);
			setState(793);
			((Else_ifContext)_localctx).bloque_inst = bloque_inst();
			_localctx.instr = instruction.NewIf(((Else_ifContext)_localctx).expression.p,((Else_ifContext)_localctx).bloque_inst.l,nil,nil, (((Else_ifContext)_localctx).ELSE!=null?((Else_ifContext)_localctx).ELSE.getLine():0), localctx.(*Else_ifContext).Get_ELSE().GetColumn() )
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_if_expContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token ELSE;
		public ExpressionContext expression;
		public Bloque_expContext bloque_exp;
		public TerminalNode ELSE() { return getToken(swiftgrammar.ELSE, 0); }
		public TerminalNode IF() { return getToken(swiftgrammar.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Bloque_expContext bloque_exp() {
			return getRuleContext(Bloque_expContext.class,0);
		}
		public Else_if_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if_exp; }
	}

	public final Else_if_expContext else_if_exp() throws RecognitionException {
		Else_if_expContext _localctx = new Else_if_expContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_else_if_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			((Else_if_expContext)_localctx).ELSE = match(ELSE);
			setState(797);
			match(IF);
			setState(798);
			((Else_if_expContext)_localctx).expression = expression(0);
			setState(799);
			((Else_if_expContext)_localctx).bloque_exp = bloque_exp();
			_localctx.p = instruction.NewIfExpre(((Else_if_expContext)_localctx).expression.p,nil,nil,nil, (((Else_if_expContext)_localctx).ELSE!=null?((Else_if_expContext)_localctx).ELSE.getLine():0), localctx.(*Else_if_expContext).Get_ELSE().GetColumn(), true, ((Else_if_expContext)_localctx).bloque_exp.p, nil, nil )
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Switch_sentContext extends ParserRuleContext {
		public interfaces.Instruction instr;
		public interfaces.Expresion p;
		public Token SWITCH;
		public ExpressionContext expression;
		public Match_brazosContext brazos;
		public Token th;
		public Bloque_instContext bloque_inst;
		public Instruccion_dentroContext instruccion_dentro;
		public ExpressionContext exp;
		public Match_brazos_expContext brazosexp;
		public ExpressionContext exp_;
		public TerminalNode SWITCH() { return getToken(swiftgrammar.SWITCH, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LLAVEIZQ() { return getToken(swiftgrammar.LLAVEIZQ, 0); }
		public TerminalNode LLAVEDER() { return getToken(swiftgrammar.LLAVEDER, 0); }
		public Match_brazosContext match_brazos() {
			return getRuleContext(Match_brazosContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(swiftgrammar.DEFAULT, 0); }
		public Bloque_instContext bloque_inst() {
			return getRuleContext(Bloque_instContext.class,0);
		}
		public TerminalNode DPUNTO2() { return getToken(swiftgrammar.DPUNTO2, 0); }
		public Instruccion_dentroContext instruccion_dentro() {
			return getRuleContext(Instruccion_dentroContext.class,0);
		}
		public Match_brazos_expContext match_brazos_exp() {
			return getRuleContext(Match_brazos_expContext.class,0);
		}
		public Switch_sentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch_sent; }
	}

	public final Switch_sentContext switch_sent() throws RecognitionException {
		Switch_sentContext _localctx = new Switch_sentContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_switch_sent);
		try {
			setState(846);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				((Switch_sentContext)_localctx).SWITCH = match(SWITCH);
				setState(803);
				((Switch_sentContext)_localctx).expression = expression(0);
				setState(804);
				match(LLAVEIZQ);
				setState(805);
				((Switch_sentContext)_localctx).brazos = match_brazos(0);
				setState(806);
				match(LLAVEDER);

				                        _localctx.instr = instructionExpre.NewMatch(((Switch_sentContext)_localctx).expression.p, ((Switch_sentContext)_localctx).brazos.l_brazos, nil, nil, (((Switch_sentContext)_localctx).SWITCH!=null?((Switch_sentContext)_localctx).SWITCH.getLine():0), localctx.(*Switch_sentContext).Get_SWITCH().GetColumn(), nil, false )
				      
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(809);
				((Switch_sentContext)_localctx).SWITCH = match(SWITCH);
				setState(810);
				((Switch_sentContext)_localctx).expression = expression(0);
				setState(811);
				match(LLAVEIZQ);
				setState(812);
				((Switch_sentContext)_localctx).brazos = match_brazos(0);
				setState(813);
				match(DEFAULT);
				setState(814);
				((Switch_sentContext)_localctx).th = match(DPUNTO2);
				setState(815);
				((Switch_sentContext)_localctx).bloque_inst = bloque_inst();
				setState(816);
				match(LLAVEDER);

				                          _localctx.instr = instructionExpre.NewMatch(((Switch_sentContext)_localctx).expression.p, ((Switch_sentContext)_localctx).brazos.l_brazos, ((Switch_sentContext)_localctx).bloque_inst.l, nil, (((Switch_sentContext)_localctx).SWITCH!=null?((Switch_sentContext)_localctx).SWITCH.getLine():0), localctx.(*Switch_sentContext).Get_SWITCH().GetColumn(), nil, false )
				      
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(819);
				((Switch_sentContext)_localctx).SWITCH = match(SWITCH);
				setState(820);
				((Switch_sentContext)_localctx).expression = expression(0);
				setState(821);
				match(LLAVEIZQ);
				setState(822);
				((Switch_sentContext)_localctx).brazos = match_brazos(0);
				setState(823);
				match(DEFAULT);
				setState(824);
				((Switch_sentContext)_localctx).th = match(DPUNTO2);
				setState(825);
				((Switch_sentContext)_localctx).instruccion_dentro = instruccion_dentro();
				setState(826);
				match(LLAVEDER);

				                          _localctx.instr = instructionExpre.NewMatch(((Switch_sentContext)_localctx).expression.p, ((Switch_sentContext)_localctx).brazos.l_brazos, nil,  ((Switch_sentContext)_localctx).instruccion_dentro.instr,  (((Switch_sentContext)_localctx).SWITCH!=null?((Switch_sentContext)_localctx).SWITCH.getLine():0), localctx.(*Switch_sentContext).Get_SWITCH().GetColumn(), nil, false )
				      
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(829);
				((Switch_sentContext)_localctx).SWITCH = match(SWITCH);
				setState(830);
				((Switch_sentContext)_localctx).exp = expression(0);
				setState(831);
				match(LLAVEIZQ);
				setState(832);
				((Switch_sentContext)_localctx).brazosexp = match_brazos_exp(0);
				setState(833);
				match(LLAVEDER);

				                        _localctx.p = instructionExpre.NewMatch(((Switch_sentContext)_localctx).exp.p, ((Switch_sentContext)_localctx).brazosexp.l_brazos, nil, nil, (((Switch_sentContext)_localctx).SWITCH!=null?((Switch_sentContext)_localctx).SWITCH.getLine():0), localctx.(*Switch_sentContext).Get_SWITCH().GetColumn(), nil, true )
				      
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(836);
				((Switch_sentContext)_localctx).SWITCH = match(SWITCH);
				setState(837);
				((Switch_sentContext)_localctx).exp = expression(0);
				setState(838);
				match(LLAVEIZQ);
				setState(839);
				((Switch_sentContext)_localctx).brazosexp = match_brazos_exp(0);
				setState(840);
				match(DEFAULT);
				setState(841);
				((Switch_sentContext)_localctx).th = match(DPUNTO2);
				setState(842);
				((Switch_sentContext)_localctx).exp_ = expression(0);
				setState(843);
				match(LLAVEDER);

				                        _localctx.p = instructionExpre.NewMatch(((Switch_sentContext)_localctx).exp.p, ((Switch_sentContext)_localctx).brazosexp.l_brazos, nil,  nil,  (((Switch_sentContext)_localctx).SWITCH!=null?((Switch_sentContext)_localctx).SWITCH.getLine():0), localctx.(*Switch_sentContext).Get_SWITCH().GetColumn(), ((Switch_sentContext)_localctx).exp_.p, true )
				      
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Match_brazosContext extends ParserRuleContext {
		public *arrayList.List l_brazos;
		public Match_brazosContext listb;
		public MatchbrazoContext matchbrazo;
		public MatchbrazoContext matchbrazo() {
			return getRuleContext(MatchbrazoContext.class,0);
		}
		public Match_brazosContext match_brazos() {
			return getRuleContext(Match_brazosContext.class,0);
		}
		public Match_brazosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_brazos; }
	}

	public final Match_brazosContext match_brazos() throws RecognitionException {
		return match_brazos(0);
	}

	private Match_brazosContext match_brazos(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Match_brazosContext _localctx = new Match_brazosContext(_ctx, _parentState);
		Match_brazosContext _prevctx = _localctx;
		int _startState = 84;
		enterRecursionRule(_localctx, 84, RULE_match_brazos, _p);

		    _localctx.l_brazos = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(849);
			((Match_brazosContext)_localctx).matchbrazo = matchbrazo();
			_localctx.l_brazos.Add(((Match_brazosContext)_localctx).matchbrazo.brazo)
			}
			_ctx.stop = _input.LT(-1);
			setState(858);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Match_brazosContext(_parentctx, _parentState);
					_localctx.listb = _prevctx;
					_localctx.listb = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_match_brazos);
					setState(852);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(853);
					((Match_brazosContext)_localctx).matchbrazo = matchbrazo();

					                                              ((Match_brazosContext)_localctx).listb.l_brazos.Add(((Match_brazosContext)_localctx).matchbrazo.brazo)
					                                              _localctx.l_brazos = ((Match_brazosContext)_localctx).listb.l_brazos
					                                          
					}
					} 
				}
				setState(860);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Match_brazos_expContext extends ParserRuleContext {
		public *arrayList.List l_brazos;
		public Match_brazos_expContext listb;
		public Matchbrazo_expContext matchbrazo_exp;
		public Matchbrazo_expContext matchbrazo_exp() {
			return getRuleContext(Matchbrazo_expContext.class,0);
		}
		public Match_brazos_expContext match_brazos_exp() {
			return getRuleContext(Match_brazos_expContext.class,0);
		}
		public Match_brazos_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_brazos_exp; }
	}

	public final Match_brazos_expContext match_brazos_exp() throws RecognitionException {
		return match_brazos_exp(0);
	}

	private Match_brazos_expContext match_brazos_exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Match_brazos_expContext _localctx = new Match_brazos_expContext(_ctx, _parentState);
		Match_brazos_expContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_match_brazos_exp, _p);

		    _localctx.l_brazos = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(862);
			((Match_brazos_expContext)_localctx).matchbrazo_exp = matchbrazo_exp();
			_localctx.l_brazos.Add(((Match_brazos_expContext)_localctx).matchbrazo_exp.brazo)
			}
			_ctx.stop = _input.LT(-1);
			setState(871);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Match_brazos_expContext(_parentctx, _parentState);
					_localctx.listb = _prevctx;
					_localctx.listb = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_match_brazos_exp);
					setState(865);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(866);
					((Match_brazos_expContext)_localctx).matchbrazo_exp = matchbrazo_exp();

					                                              ((Match_brazos_expContext)_localctx).listb.l_brazos.Add(((Match_brazos_expContext)_localctx).matchbrazo_exp.brazo)
					                                              _localctx.l_brazos = ((Match_brazos_expContext)_localctx).listb.l_brazos
					                                          
					}
					} 
				}
				setState(873);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class MatchbrazoContext extends ParserRuleContext {
		public instructionExpre.BrazoMatch brazo;
		public ListaOpcionesContext listaOpciones;
		public Token th;
		public Bloque_instContext bloque_inst;
		public Instruccion_dentroContext instruccion_dentro;
		public TerminalNode CASE() { return getToken(swiftgrammar.CASE, 0); }
		public ListaOpcionesContext listaOpciones() {
			return getRuleContext(ListaOpcionesContext.class,0);
		}
		public Bloque_instContext bloque_inst() {
			return getRuleContext(Bloque_instContext.class,0);
		}
		public TerminalNode DPUNTO2() { return getToken(swiftgrammar.DPUNTO2, 0); }
		public Instruccion_dentroContext instruccion_dentro() {
			return getRuleContext(Instruccion_dentroContext.class,0);
		}
		public MatchbrazoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchbrazo; }
	}

	public final MatchbrazoContext matchbrazo() throws RecognitionException {
		MatchbrazoContext _localctx = new MatchbrazoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_matchbrazo);
		try {
			setState(886);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(874);
				match(CASE);
				setState(875);
				((MatchbrazoContext)_localctx).listaOpciones = listaOpciones(0);
				setState(876);
				((MatchbrazoContext)_localctx).th = match(DPUNTO2);
				setState(877);
				((MatchbrazoContext)_localctx).bloque_inst = bloque_inst();
				 _localctx.brazo = instructionExpre.NewBrazoMatch(((MatchbrazoContext)_localctx).listaOpciones.lisop, ((MatchbrazoContext)_localctx).bloque_inst.l, nil, (((MatchbrazoContext)_localctx).th!=null?((MatchbrazoContext)_localctx).th.getLine():0), localctx.(*MatchbrazoContext).GetTh().GetColumn(), nil ) 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(880);
				match(CASE);
				setState(881);
				((MatchbrazoContext)_localctx).listaOpciones = listaOpciones(0);
				setState(882);
				((MatchbrazoContext)_localctx).th = match(DPUNTO2);
				setState(883);
				((MatchbrazoContext)_localctx).instruccion_dentro = instruccion_dentro();
				 _localctx.brazo = instructionExpre.NewBrazoMatch(((MatchbrazoContext)_localctx).listaOpciones.lisop, nil,  ((MatchbrazoContext)_localctx).instruccion_dentro.instr, (((MatchbrazoContext)_localctx).th!=null?((MatchbrazoContext)_localctx).th.getLine():0), localctx.(*MatchbrazoContext).GetTh().GetColumn(), nil ) 
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Matchbrazo_expContext extends ParserRuleContext {
		public instructionExpre.BrazoMatch brazo;
		public ListaOpcionesContext listaOpciones;
		public Token th;
		public ExpressionContext expression;
		public ListaOpcionesContext listaOpciones() {
			return getRuleContext(ListaOpcionesContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DPUNTO2() { return getToken(swiftgrammar.DPUNTO2, 0); }
		public Matchbrazo_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchbrazo_exp; }
	}

	public final Matchbrazo_expContext matchbrazo_exp() throws RecognitionException {
		Matchbrazo_expContext _localctx = new Matchbrazo_expContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_matchbrazo_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(888);
			((Matchbrazo_expContext)_localctx).listaOpciones = listaOpciones(0);
			setState(889);
			((Matchbrazo_expContext)_localctx).th = match(DPUNTO2);
			setState(890);
			((Matchbrazo_expContext)_localctx).expression = expression(0);
			 _localctx.brazo = instructionExpre.NewBrazoMatch(((Matchbrazo_expContext)_localctx).listaOpciones.lisop, nil,  nil, (((Matchbrazo_expContext)_localctx).th!=null?((Matchbrazo_expContext)_localctx).th.getLine():0), localctx.(*Matchbrazo_expContext).GetTh().GetColumn(), ((Matchbrazo_expContext)_localctx).expression.p ) 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaOpcionesContext extends ParserRuleContext {
		public *arrayList.List lisop;
		public ListaOpcionesContext list;
		public PrimitivoContext primitivo;
		public PrimitivoContext primitivo() {
			return getRuleContext(PrimitivoContext.class,0);
		}
		public TerminalNode COMA() { return getToken(swiftgrammar.COMA, 0); }
		public ListaOpcionesContext listaOpciones() {
			return getRuleContext(ListaOpcionesContext.class,0);
		}
		public ListaOpcionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaOpciones; }
	}

	public final ListaOpcionesContext listaOpciones() throws RecognitionException {
		return listaOpciones(0);
	}

	private ListaOpcionesContext listaOpciones(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListaOpcionesContext _localctx = new ListaOpcionesContext(_ctx, _parentState);
		ListaOpcionesContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_listaOpciones, _p);

		    _localctx.lisop = arrayList.New()

		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(894);
			((ListaOpcionesContext)_localctx).primitivo = primitivo();

			                    _localctx.lisop.Add( ((ListaOpcionesContext)_localctx).primitivo.p )
			                  
			}
			_ctx.stop = _input.LT(-1);
			setState(904);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ListaOpcionesContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_listaOpciones);
					setState(897);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(898);
					match(COMA);
					setState(899);
					((ListaOpcionesContext)_localctx).primitivo = primitivo();

					                                                      ((ListaOpcionesContext)_localctx).list.lisop.Add( ((ListaOpcionesContext)_localctx).primitivo.p )
					                                                      _localctx.lisop =  ((ListaOpcionesContext)_localctx).list.lisop
					                                                    
					}
					} 
				}
				setState(906);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Bloque_instContext extends ParserRuleContext {
		public *arrayList.List l;
		public InstruccionesContext instrucciones;
		public TerminalNode LLAVEIZQ() { return getToken(swiftgrammar.LLAVEIZQ, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(swiftgrammar.LLAVEDER, 0); }
		public Bloque_instContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_inst; }
	}

	public final Bloque_instContext bloque_inst() throws RecognitionException {
		Bloque_instContext _localctx = new Bloque_instContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_bloque_inst);
		try {
			setState(915);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(907);
				match(LLAVEIZQ);
				setState(908);
				((Bloque_instContext)_localctx).instrucciones = instrucciones();
				setState(909);
				match(LLAVEDER);
				_localctx.l = ((Bloque_instContext)_localctx).instrucciones.l 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(912);
				match(LLAVEIZQ);
				setState(913);
				match(LLAVEDER);
				_localctx.l = arrayList.New()
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bloque_principContext extends ParserRuleContext {
		public *arrayList.List l;
		public InstruccionesContext instrucciones;
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public Bloque_principContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_princip; }
	}

	public final Bloque_principContext bloque_princip() throws RecognitionException {
		Bloque_principContext _localctx = new Bloque_principContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_bloque_princip);
		try {
			setState(921);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(917);
				((Bloque_principContext)_localctx).instrucciones = instrucciones();
				_localctx.l = ((Bloque_principContext)_localctx).instrucciones.l 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_localctx.l = arrayList.New()
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bloque_expContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public ExpressionContext expression;
		public TerminalNode LLAVEIZQ() { return getToken(swiftgrammar.LLAVEIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LLAVEDER() { return getToken(swiftgrammar.LLAVEDER, 0); }
		public Bloque_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_exp; }
	}

	public final Bloque_expContext bloque_exp() throws RecognitionException {
		Bloque_expContext _localctx = new Bloque_expContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_bloque_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			match(LLAVEIZQ);
			setState(924);
			((Bloque_expContext)_localctx).expression = expression(0);
			setState(925);
			match(LLAVEDER);
			_localctx.p = ((Bloque_expContext)_localctx).expression.p
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipos_varContext extends ParserRuleContext {
		public interfaces.TipoExpresion tipo;
		public TerminalNode T_NUMBER() { return getToken(swiftgrammar.T_NUMBER, 0); }
		public List<TerminalNode> INTERROG() { return getTokens(swiftgrammar.INTERROG); }
		public TerminalNode INTERROG(int i) {
			return getToken(swiftgrammar.INTERROG, i);
		}
		public TerminalNode T_STRING() { return getToken(swiftgrammar.T_STRING, 0); }
		public TerminalNode T_FLOAT() { return getToken(swiftgrammar.T_FLOAT, 0); }
		public TerminalNode T_BOOL() { return getToken(swiftgrammar.T_BOOL, 0); }
		public TerminalNode T_STR() { return getToken(swiftgrammar.T_STR, 0); }
		public TerminalNode STRUCT() { return getToken(swiftgrammar.STRUCT, 0); }
		public TerminalNode T_CHAT() { return getToken(swiftgrammar.T_CHAT, 0); }
		public TerminalNode T_ARRAY() { return getToken(swiftgrammar.T_ARRAY, 0); }
		public TerminalNode T_VECTOR() { return getToken(swiftgrammar.T_VECTOR, 0); }
		public Tipos_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_var; }
	}

	public final Tipos_varContext tipos_var() throws RecognitionException {
		Tipos_varContext _localctx = new Tipos_varContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_tipos_var);
		try {
			int _alt;
			setState(1000);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(928);
				match(T_NUMBER);
				setState(932);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(929);
						match(INTERROG);
						}
						} 
					}
					setState(934);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				_localctx.tipo = interfaces.INTEGER
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				match(T_STRING);
				setState(940);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(937);
						match(INTERROG);
						}
						} 
					}
					setState(942);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				_localctx.tipo = interfaces.STRING
				}
				break;
			case T_FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(944);
				match(T_FLOAT);
				setState(948);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(945);
						match(INTERROG);
						}
						} 
					}
					setState(950);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				_localctx.tipo = interfaces.FLOAT
				}
				break;
			case T_BOOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(952);
				match(T_BOOL);
				setState(956);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(953);
						match(INTERROG);
						}
						} 
					}
					setState(958);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				_localctx.tipo = interfaces.BOOLEAN
				}
				break;
			case T_STR:
				enterOuterAlt(_localctx, 5);
				{
				setState(960);
				match(T_STR);
				setState(964);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(961);
						match(INTERROG);
						}
						} 
					}
					setState(966);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
				}
				_localctx.tipo = interfaces.STR
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 6);
				{
				setState(968);
				match(STRUCT);
				setState(972);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(969);
						match(INTERROG);
						}
						} 
					}
					setState(974);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				}
				_localctx.tipo = interfaces.STRUCT
				}
				break;
			case T_CHAT:
				enterOuterAlt(_localctx, 7);
				{
				setState(976);
				match(T_CHAT);
				setState(980);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(977);
						match(INTERROG);
						}
						} 
					}
					setState(982);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				_localctx.tipo = interfaces.CHAR
				}
				break;
			case T_ARRAY:
				enterOuterAlt(_localctx, 8);
				{
				setState(984);
				match(T_ARRAY);
				setState(988);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(985);
						match(INTERROG);
						}
						} 
					}
					setState(990);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				_localctx.tipo = interfaces.ARRAY
				}
				break;
			case T_VECTOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(992);
				match(T_VECTOR);
				setState(996);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(993);
						match(INTERROG);
						}
						} 
					}
					setState(998);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				_localctx.tipo = interfaces.VECTOR
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public ExpressionContext e_ini;
		public Expr_aritContext expr_arit;
		public ExpressionContext e_fin;
		public Expr_aritContext expr_arit() {
			return getRuleContext(Expr_aritContext.class,0);
		}
		public List<TerminalNode> PUNTO() { return getTokens(swiftgrammar.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(swiftgrammar.PUNTO, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 102;
		enterRecursionRule(_localctx, 102, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1003);
			((ExpressionContext)_localctx).expr_arit = expr_arit(0);
			_localctx.p = ((ExpressionContext)_localctx).expr_arit.p
			}
			_ctx.stop = _input.LT(-1);
			setState(1015);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					_localctx.e_ini = _prevctx;
					_localctx.e_ini = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(1006);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1007);
					match(PUNTO);
					setState(1008);
					match(PUNTO);
					setState(1009);
					match(PUNTO);
					setState(1010);
					((ExpressionContext)_localctx).e_fin = expression(2);
					 _localctx.p = expresion.NewRangeF(((ExpressionContext)_localctx).e_ini.p, ((ExpressionContext)_localctx).e_fin.p, (((ExpressionContext)_localctx).e_ini!=null?(((ExpressionContext)_localctx).e_ini.start):null).GetLine(),(((ExpressionContext)_localctx).e_ini!=null?(((ExpressionContext)_localctx).e_ini.start):null).GetColumn() ) 
					}
					} 
				}
				setState(1017);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Expr_aritContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Expr_aritContext opIz;
		public Token op;
		public Expr_aritContext opU;
		public Token ID;
		public ExpressionContext val;
		public ExpressionContext expression;
		public Token CORIZQ;
		public ExpressionContext exp;
		public ExpressionContext tam;
		public ListParamsContext live;
		public L_StructExpContext l_StructExp;
		public PrimitivoContext primitivo;
		public CasteoContext casteo;
		public If_expContext if_exp;
		public Switch_sentContext switch_sent;
		public While_trueContext while_true;
		public CallFunctionContext callFunction;
		public Token IN;
		public Expr_aritContext opDe;
		public TerminalNode SUB() { return getToken(swiftgrammar.SUB, 0); }
		public List<Expr_aritContext> expr_arit() {
			return getRuleContexts(Expr_aritContext.class);
		}
		public Expr_aritContext expr_arit(int i) {
			return getRuleContext(Expr_aritContext.class,i);
		}
		public TerminalNode NOT() { return getToken(swiftgrammar.NOT, 0); }
		public TerminalNode T_STRING() { return getToken(swiftgrammar.T_STRING, 0); }
		public TerminalNode PARIZQ() { return getToken(swiftgrammar.PARIZQ, 0); }
		public TerminalNode PARDER() { return getToken(swiftgrammar.PARDER, 0); }
		public TerminalNode ID() { return getToken(swiftgrammar.ID, 0); }
		public TerminalNode PUNTO() { return getToken(swiftgrammar.PUNTO, 0); }
		public TerminalNode CONTAINS() { return getToken(swiftgrammar.CONTAINS, 0); }
		public TerminalNode AMP() { return getToken(swiftgrammar.AMP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CAPF() { return getToken(swiftgrammar.CAPF, 0); }
		public TerminalNode CORIZQ() { return getToken(swiftgrammar.CORIZQ, 0); }
		public TerminalNode PTCOMA() { return getToken(swiftgrammar.PTCOMA, 0); }
		public TerminalNode CORDER() { return getToken(swiftgrammar.CORDER, 0); }
		public ListParamsContext listParams() {
			return getRuleContext(ListParamsContext.class,0);
		}
		public L_StructExpContext l_StructExp() {
			return getRuleContext(L_StructExpContext.class,0);
		}
		public PrimitivoContext primitivo() {
			return getRuleContext(PrimitivoContext.class,0);
		}
		public CasteoContext casteo() {
			return getRuleContext(CasteoContext.class,0);
		}
		public If_expContext if_exp() {
			return getRuleContext(If_expContext.class,0);
		}
		public Switch_sentContext switch_sent() {
			return getRuleContext(Switch_sentContext.class,0);
		}
		public While_trueContext while_true() {
			return getRuleContext(While_trueContext.class,0);
		}
		public CallFunctionContext callFunction() {
			return getRuleContext(CallFunctionContext.class,0);
		}
		public TerminalNode REMOVE() { return getToken(swiftgrammar.REMOVE, 0); }
		public TerminalNode IN() { return getToken(swiftgrammar.IN, 0); }
		public TerminalNode MUL() { return getToken(swiftgrammar.MUL, 0); }
		public TerminalNode DIV() { return getToken(swiftgrammar.DIV, 0); }
		public TerminalNode MOD() { return getToken(swiftgrammar.MOD, 0); }
		public TerminalNode ADD() { return getToken(swiftgrammar.ADD, 0); }
		public TerminalNode MENOR() { return getToken(swiftgrammar.MENOR, 0); }
		public TerminalNode MENORIGUAL() { return getToken(swiftgrammar.MENORIGUAL, 0); }
		public TerminalNode MAYOR() { return getToken(swiftgrammar.MAYOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(swiftgrammar.MAYORIGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(swiftgrammar.IGUAL, 0); }
		public TerminalNode DISTINTO() { return getToken(swiftgrammar.DISTINTO, 0); }
		public TerminalNode AND() { return getToken(swiftgrammar.AND, 0); }
		public TerminalNode OR() { return getToken(swiftgrammar.OR, 0); }
		public TerminalNode LEN() { return getToken(swiftgrammar.LEN, 0); }
		public TerminalNode CLONE() { return getToken(swiftgrammar.CLONE, 0); }
		public Expr_aritContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_arit; }
	}

	public final Expr_aritContext expr_arit() throws RecognitionException {
		return expr_arit(0);
	}

	private Expr_aritContext expr_arit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expr_aritContext _localctx = new Expr_aritContext(_ctx, _parentState);
		Expr_aritContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_expr_arit, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				setState(1019);
				((Expr_aritContext)_localctx).op = match(SUB);
				setState(1020);
				((Expr_aritContext)_localctx).opU = expr_arit(24);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"-",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 2:
				{
				setState(1023);
				((Expr_aritContext)_localctx).op = match(NOT);
				setState(1024);
				((Expr_aritContext)_localctx).opU = expr_arit(19);
				_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opU.p,"!",nil,true, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
				}
				break;
			case 3:
				{
				setState(1027);
				match(T_STRING);
				setState(1028);
				match(PARIZQ);
				setState(1029);
				((Expr_aritContext)_localctx).opIz = expr_arit(0);
				setState(1030);
				match(PARDER);
				 _localctx.p = expresion.NewToString(((Expr_aritContext)_localctx).opIz.p, (((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(), (((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn() ) 
				}
				break;
			case 4:
				{
				setState(1033);
				((Expr_aritContext)_localctx).ID = match(ID);
				setState(1034);
				match(PUNTO);
				setState(1035);
				match(CONTAINS);
				setState(1036);
				match(PARIZQ);
				setState(1037);
				match(AMP);
				setState(1038);
				((Expr_aritContext)_localctx).val = ((Expr_aritContext)_localctx).expression = expression(0);
				setState(1039);
				match(PARDER);
				_localctx.p = expresion.NewContains((((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getText():null), ((Expr_aritContext)_localctx).val.p, (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getLine():0), (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getCharPositionInLine():0)  )
				}
				break;
			case 5:
				{
				setState(1042);
				((Expr_aritContext)_localctx).ID = match(ID);
				setState(1043);
				match(PUNTO);
				setState(1044);
				match(CAPF);
				_localctx.p = expresion.NewCapacity((((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getText():null), (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getLine():0), (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getCharPositionInLine():0)  )
				}
				break;
			case 6:
				{
				setState(1046);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(1047);
				((Expr_aritContext)_localctx).exp = ((Expr_aritContext)_localctx).expression = expression(0);
				setState(1048);
				match(PTCOMA);
				setState(1049);
				((Expr_aritContext)_localctx).tam = ((Expr_aritContext)_localctx).expression = expression(0);
				setState(1050);
				match(CORDER);
				 _localctx.p = expresion.NewVector(nil, ((Expr_aritContext)_localctx).exp.p, ((Expr_aritContext)_localctx).tam.p, 2, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 7:
				{
				setState(1053);
				((Expr_aritContext)_localctx).CORIZQ = match(CORIZQ);
				setState(1054);
				((Expr_aritContext)_localctx).live = listParams(0);
				setState(1055);
				match(CORDER);
				 _localctx.p = expresion.NewVector(((Expr_aritContext)_localctx).live.l_e, nil, nil, 1, (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getLine():0), (((Expr_aritContext)_localctx).CORIZQ!=null?((Expr_aritContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
				}
				break;
			case 8:
				{
				setState(1058);
				((Expr_aritContext)_localctx).ID = match(ID);
				setState(1059);
				match(PARIZQ);
				setState(1060);
				((Expr_aritContext)_localctx).l_StructExp = l_StructExp(0);
				setState(1061);
				match(PARDER);
				 _localctx.p = instructionExpre.NewStructExpre((((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getText():null), ((Expr_aritContext)_localctx).l_StructExp.l, (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getLine():0), (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getCharPositionInLine():0) ) 
				}
				break;
			case 9:
				{
				setState(1064);
				((Expr_aritContext)_localctx).primitivo = primitivo();
				_localctx.p = ((Expr_aritContext)_localctx).primitivo.p
				}
				break;
			case 10:
				{
				setState(1067);
				match(PARIZQ);
				setState(1068);
				((Expr_aritContext)_localctx).expression = expression(0);
				setState(1069);
				match(PARDER);
				_localctx.p = ((Expr_aritContext)_localctx).expression.p
				}
				break;
			case 11:
				{
				setState(1072);
				((Expr_aritContext)_localctx).casteo = casteo();
				_localctx.p = ((Expr_aritContext)_localctx).casteo.p
				}
				break;
			case 12:
				{
				setState(1075);
				((Expr_aritContext)_localctx).if_exp = if_exp();
				_localctx.p = ((Expr_aritContext)_localctx).if_exp.p
				}
				break;
			case 13:
				{
				setState(1078);
				((Expr_aritContext)_localctx).switch_sent = switch_sent();
				_localctx.p = ((Expr_aritContext)_localctx).switch_sent.p
				}
				break;
			case 14:
				{
				setState(1081);
				((Expr_aritContext)_localctx).while_true = while_true();
				 _localctx.p = ((Expr_aritContext)_localctx).while_true.p 
				}
				break;
			case 15:
				{
				setState(1084);
				((Expr_aritContext)_localctx).callFunction = callFunction();
				_localctx.p = ((Expr_aritContext)_localctx).callFunction.p
				}
				break;
			case 16:
				{
				setState(1087);
				((Expr_aritContext)_localctx).ID = match(ID);
				setState(1088);
				match(PUNTO);
				setState(1089);
				match(REMOVE);
				setState(1090);
				match(PARIZQ);
				setState(1091);
				((Expr_aritContext)_localctx).expression = expression(0);
				setState(1092);
				match(PARDER);
				 _localctx.p = instructionExpre.NewRemove((((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getText():null), ((Expr_aritContext)_localctx).expression.p, (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getLine():0), (((Expr_aritContext)_localctx).ID!=null?((Expr_aritContext)_localctx).ID.getCharPositionInLine():0)) 
				}
				break;
			case 17:
				{
				setState(1095);
				((Expr_aritContext)_localctx).IN = match(IN);
				setState(1096);
				((Expr_aritContext)_localctx).primitivo = primitivo();
				 _localctx.p = expresion.NewcadenaFor(((Expr_aritContext)_localctx).primitivo.p, (((Expr_aritContext)_localctx).IN!=null?((Expr_aritContext)_localctx).IN.getLine():0), (((Expr_aritContext)_localctx).IN!=null?((Expr_aritContext)_localctx).IN.getCharPositionInLine():0)) 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1134);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(1101);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(1102);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (MUL - 69)) | (1L << (DIV - 69)) | (1L << (MOD - 69)))) != 0)) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1103);
						((Expr_aritContext)_localctx).opDe = expr_arit(24);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 2:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(1106);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(1107);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1108);
						((Expr_aritContext)_localctx).opDe = expr_arit(22);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 3:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(1111);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(1112);
						((Expr_aritContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 62)) & ~0x3f) == 0 && ((1L << (_la - 62)) & ((1L << (DISTINTO - 62)) | (1L << (IGUAL - 62)) | (1L << (MAYORIGUAL - 62)) | (1L << (MENORIGUAL - 62)) | (1L << (MAYOR - 62)) | (1L << (MENOR - 62)))) != 0)) ) {
							((Expr_aritContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1113);
						((Expr_aritContext)_localctx).opDe = expr_arit(21);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 4:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(1116);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(1117);
						((Expr_aritContext)_localctx).op = match(AND);
						setState(1118);
						((Expr_aritContext)_localctx).opDe = expr_arit(19);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 5:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(1121);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(1122);
						((Expr_aritContext)_localctx).op = match(OR);
						setState(1123);
						((Expr_aritContext)_localctx).opDe = expr_arit(18);
						_localctx.p = expresion.NewOperacion(((Expr_aritContext)_localctx).opIz.p,(((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getText():null),((Expr_aritContext)_localctx).opDe.p,false, (((Expr_aritContext)_localctx).op!=null?((Expr_aritContext)_localctx).op.getLine():0), localctx.(*Expr_aritContext).GetOp().GetColumn())
						}
						break;
					case 6:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(1126);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(1127);
						match(PUNTO);
						setState(1128);
						match(LEN);
						_localctx.p = expresion.NewLen(((Expr_aritContext)_localctx).opIz.p, (((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(), (((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn()  )
						}
						break;
					case 7:
						{
						_localctx = new Expr_aritContext(_parentctx, _parentState);
						_localctx.opIz = _prevctx;
						_localctx.opIz = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr_arit);
						setState(1130);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(1131);
						match(PUNTO);
						setState(1132);
						match(CLONE);
						 _localctx.p = expresion.NewClone(((Expr_aritContext)_localctx).opIz.p, (((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetLine(), (((Expr_aritContext)_localctx).opIz!=null?(((Expr_aritContext)_localctx).opIz.start):null).GetColumn() ) 
						}
						break;
					}
					} 
				}
				setState(1138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CasteoContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token PARIZQ;
		public ExpressionContext expression;
		public Tipo_castContext typec;
		public TerminalNode PARIZQ() { return getToken(swiftgrammar.PARIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(swiftgrammar.AS, 0); }
		public TerminalNode PARDER() { return getToken(swiftgrammar.PARDER, 0); }
		public Tipo_castContext tipo_cast() {
			return getRuleContext(Tipo_castContext.class,0);
		}
		public CasteoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casteo; }
	}

	public final CasteoContext casteo() throws RecognitionException {
		CasteoContext _localctx = new CasteoContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_casteo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			((CasteoContext)_localctx).PARIZQ = match(PARIZQ);
			setState(1140);
			((CasteoContext)_localctx).expression = expression(0);
			setState(1141);
			match(AS);
			setState(1142);
			((CasteoContext)_localctx).typec = tipo_cast();
			setState(1143);
			match(PARDER);
			_localctx.p = expresion.NewCasteo(((CasteoContext)_localctx).expression.p, ((CasteoContext)_localctx).typec.tc, (((CasteoContext)_localctx).PARIZQ!=null?((CasteoContext)_localctx).PARIZQ.getLine():0), localctx.(*CasteoContext).Get_PARIZQ().GetColumn() )
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_castContext extends ParserRuleContext {
		public interfaces.TipoExpresion tc;
		public TerminalNode T_FLOAT() { return getToken(swiftgrammar.T_FLOAT, 0); }
		public TerminalNode T_NUMBER() { return getToken(swiftgrammar.T_NUMBER, 0); }
		public TerminalNode USIZE() { return getToken(swiftgrammar.USIZE, 0); }
		public Tipo_castContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_cast; }
	}

	public final Tipo_castContext tipo_cast() throws RecognitionException {
		Tipo_castContext _localctx = new Tipo_castContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_tipo_cast);
		try {
			setState(1152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1146);
				match(T_FLOAT);
				_localctx.tc = interfaces.FLOAT
				}
				break;
			case T_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1148);
				match(T_NUMBER);
				_localctx.tc = interfaces.INTEGER
				}
				break;
			case USIZE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1150);
				match(USIZE);
				_localctx.tc = interfaces.INTEGER
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class L_StructExpContext extends ParserRuleContext {
		public *arrayList.List l;
		public L_StructExpContext list;
		public Token ID;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(swiftgrammar.ID, 0); }
		public TerminalNode DPUNTO2() { return getToken(swiftgrammar.DPUNTO2, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMA() { return getToken(swiftgrammar.COMA, 0); }
		public L_StructExpContext l_StructExp() {
			return getRuleContext(L_StructExpContext.class,0);
		}
		public L_StructExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_l_StructExp; }
	}

	public final L_StructExpContext l_StructExp() throws RecognitionException {
		return l_StructExp(0);
	}

	private L_StructExpContext l_StructExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		L_StructExpContext _localctx = new L_StructExpContext(_ctx, _parentState);
		L_StructExpContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_l_StructExp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1155);
			((L_StructExpContext)_localctx).ID = match(ID);
			setState(1156);
			match(DPUNTO2);
			setState(1157);
			((L_StructExpContext)_localctx).expression = expression(0);

			                    Str_ep := instructionExpre.NewStructContenido((((L_StructExpContext)_localctx).ID!=null?((L_StructExpContext)_localctx).ID.getText():null), ((L_StructExpContext)_localctx).expression.p)
			                    ((L_StructExpContext)_localctx).l =  arrayList.New();
			                    _localctx.l.Add(Str_ep);
			                
			}
			_ctx.stop = _input.LT(-1);
			setState(1169);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new L_StructExpContext(_parentctx, _parentState);
					_localctx.list = _prevctx;
					_localctx.list = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_l_StructExp);
					setState(1160);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1161);
					match(COMA);
					setState(1162);
					((L_StructExpContext)_localctx).ID = match(ID);
					setState(1163);
					match(DPUNTO2);
					setState(1164);
					((L_StructExpContext)_localctx).expression = expression(0);

					                                                  Str_ep := instructionExpre.NewStructContenido((((L_StructExpContext)_localctx).ID!=null?((L_StructExpContext)_localctx).ID.getText():null), ((L_StructExpContext)_localctx).expression.p)
					                                                  ((L_StructExpContext)_localctx).list.l.Add(Str_ep);
					                                                  ((L_StructExpContext)_localctx).l =  ((L_StructExpContext)_localctx).list.l;
					                                              
					}
					} 
				}
				setState(1171);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimitivoContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token NUMBER;
		public Token FLOAT;
		public StringsContext strings;
		public Token CHAR;
		public Token TRUE;
		public Token FALSE;
		public ListIDArrayContext list;
		public TerminalNode NUMBER() { return getToken(swiftgrammar.NUMBER, 0); }
		public TerminalNode FLOAT() { return getToken(swiftgrammar.FLOAT, 0); }
		public StringsContext strings() {
			return getRuleContext(StringsContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(swiftgrammar.CHAR, 0); }
		public TerminalNode TRUE() { return getToken(swiftgrammar.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(swiftgrammar.FALSE, 0); }
		public ListIDArrayContext listIDArray() {
			return getRuleContext(ListIDArrayContext.class,0);
		}
		public PrimitivoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitivo; }
	}

	public final PrimitivoContext primitivo() throws RecognitionException {
		PrimitivoContext _localctx = new PrimitivoContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_primitivo);
		try {
			setState(1188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1172);
				((PrimitivoContext)_localctx).NUMBER = match(NUMBER);

				            	num,err := strconv.Atoi((((PrimitivoContext)_localctx).NUMBER!=null?((PrimitivoContext)_localctx).NUMBER.getText():null))
				                if err!= nil{
				                    fmt.Println(err)
				                }
				            _localctx.p = expresion.NewPrimitivo(num,interfaces.INTEGER, (((PrimitivoContext)_localctx).NUMBER!=null?((PrimitivoContext)_localctx).NUMBER.getLine():0), localctx.(*PrimitivoContext).Get_NUMBER().GetColumn())
				      
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1174);
				((PrimitivoContext)_localctx).FLOAT = match(FLOAT);

				              num,err := strconv.ParseFloat((((PrimitivoContext)_localctx).FLOAT!=null?((PrimitivoContext)_localctx).FLOAT.getText():null),64)
				              if err!= nil{
				                  fmt.Println(err)
				              }
				              _localctx.p = expresion.NewPrimitivo (num,interfaces.FLOAT, (((PrimitivoContext)_localctx).FLOAT!=null?((PrimitivoContext)_localctx).FLOAT.getLine():0), localctx.(*PrimitivoContext).Get_FLOAT().GetColumn())
				      
				}
				break;
			case T_STRING:
			case STRING:
			case AMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1176);
				((PrimitivoContext)_localctx).strings = strings();
				_localctx.p = ((PrimitivoContext)_localctx).strings.p
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1179);
				((PrimitivoContext)_localctx).CHAR = match(CHAR);

				                chr := (((PrimitivoContext)_localctx).CHAR!=null?((PrimitivoContext)_localctx).CHAR.getText():null)
				                _localctx.p = expresion.NewPrimitivo(chr[1:len(chr)-1],interfaces.CHAR, (((PrimitivoContext)_localctx).CHAR!=null?((PrimitivoContext)_localctx).CHAR.getLine():0), (((PrimitivoContext)_localctx).CHAR!=null?((PrimitivoContext)_localctx).CHAR.getCharPositionInLine():0))
				                
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1181);
				((PrimitivoContext)_localctx).TRUE = match(TRUE);
				 _localctx.p = expresion.NewPrimitivo(true,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).TRUE!=null?((PrimitivoContext)_localctx).TRUE.getLine():0), localctx.(*PrimitivoContext).Get_TRUE().GetColumn())
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1183);
				((PrimitivoContext)_localctx).FALSE = match(FALSE);
				 _localctx.p = expresion.NewPrimitivo(false,interfaces.BOOLEAN, (((PrimitivoContext)_localctx).FALSE!=null?((PrimitivoContext)_localctx).FALSE.getLine():0), localctx.(*PrimitivoContext).Get_FALSE().GetColumn())
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 7);
				{
				setState(1185);
				((PrimitivoContext)_localctx).list = listIDArray(0);
				 _localctx.p = ((PrimitivoContext)_localctx).list.p
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListIDArrayContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public ListIDArrayContext list;
		public Token ID;
		public Token CORIZQ;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(swiftgrammar.ID, 0); }
		public TerminalNode CORIZQ() { return getToken(swiftgrammar.CORIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CORDER() { return getToken(swiftgrammar.CORDER, 0); }
		public ListIDArrayContext listIDArray() {
			return getRuleContext(ListIDArrayContext.class,0);
		}
		public TerminalNode PUNTO() { return getToken(swiftgrammar.PUNTO, 0); }
		public ListIDArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listIDArray; }
	}

	public final ListIDArrayContext listIDArray() throws RecognitionException {
		return listIDArray(0);
	}

	private ListIDArrayContext listIDArray(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ListIDArrayContext _localctx = new ListIDArrayContext(_ctx, _parentState);
		ListIDArrayContext _prevctx = _localctx;
		int _startState = 114;
		enterRecursionRule(_localctx, 114, RULE_listIDArray, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1191);
			((ListIDArrayContext)_localctx).ID = match(ID);
			 
			      _localctx.p = expresion.NewIdentificador((((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getText():null), (((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getLine():0), localctx.(*ListIDArrayContext).Get_ID().GetColumn() )
			}
			_ctx.stop = _input.LT(-1);
			setState(1206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new ListIDArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listIDArray);
						setState(1194);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1195);
						((ListIDArrayContext)_localctx).CORIZQ = match(CORIZQ);
						setState(1196);
						((ListIDArrayContext)_localctx).expression = expression(0);
						setState(1197);
						match(CORDER);
						 _localctx.p = expresion.NewArrayAccess(((ListIDArrayContext)_localctx).list.p, ((ListIDArrayContext)_localctx).expression.p, (((ListIDArrayContext)_localctx).CORIZQ!=null?((ListIDArrayContext)_localctx).CORIZQ.getLine():0), (((ListIDArrayContext)_localctx).CORIZQ!=null?((ListIDArrayContext)_localctx).CORIZQ.getCharPositionInLine():0) ) 
						}
						break;
					case 2:
						{
						_localctx = new ListIDArrayContext(_parentctx, _parentState);
						_localctx.list = _prevctx;
						_localctx.list = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_listIDArray);
						setState(1200);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1201);
						match(PUNTO);
						setState(1202);
						((ListIDArrayContext)_localctx).ID = match(ID);
						 _localctx.p = expresion.NewStructAccess(((ListIDArrayContext)_localctx).list.p, (((ListIDArrayContext)_localctx).ID!=null?((ListIDArrayContext)_localctx).ID.getText():null), (((ListIDArrayContext)_localctx).list!=null?(((ListIDArrayContext)_localctx).list.start):null).GetLine(), (((ListIDArrayContext)_localctx).list!=null?(((ListIDArrayContext)_localctx).list.start):null).GetColumn() )  
						}
						break;
					}
					} 
				}
				setState(1208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StringsContext extends ParserRuleContext {
		public interfaces.Expresion p;
		public Token STRING;
		public TerminalNode T_STRING() { return getToken(swiftgrammar.T_STRING, 0); }
		public TerminalNode PARIZQ() { return getToken(swiftgrammar.PARIZQ, 0); }
		public TerminalNode STRING() { return getToken(swiftgrammar.STRING, 0); }
		public TerminalNode PARDER() { return getToken(swiftgrammar.PARDER, 0); }
		public List<TerminalNode> AMP() { return getTokens(swiftgrammar.AMP); }
		public TerminalNode AMP(int i) {
			return getToken(swiftgrammar.AMP, i);
		}
		public StringsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strings; }
	}

	public final StringsContext strings() throws RecognitionException {
		StringsContext _localctx = new StringsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_strings);
		int _la;
		try {
			setState(1226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AMP:
				enterOuterAlt(_localctx, 1);
				{
				setState(1210); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1209);
					match(AMP);
					}
					}
					setState(1212); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==AMP );
				setState(1214);
				match(T_STRING);
				setState(1215);
				match(PARIZQ);
				setState(1216);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(1217);
				match(PARDER);
				 
				      str:= (((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getText():null)[1:len((((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getText():null))-1]
				      _localctx.p = expresion.NewPrimitivo(str,interfaces.STR, (((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getLine():0), localctx.(*StringsContext).Get_STRING().GetColumn())
				}
				break;
			case T_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1219);
				match(T_STRING);
				setState(1220);
				match(PARIZQ);
				setState(1221);
				((StringsContext)_localctx).STRING = match(STRING);
				setState(1222);
				match(PARDER);
				 
				      str:= (((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getText():null)[1:len((((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getText():null))-1]
				      _localctx.p = expresion.NewPrimitivo(str,interfaces.STRING, (((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getLine():0), localctx.(*StringsContext).Get_STRING().GetColumn())
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(1224);
				((StringsContext)_localctx).STRING = match(STRING);
				 
				      str:= (((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getText():null)[1:len((((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getText():null))-1]
				      _localctx.p = expresion.NewPrimitivo(str,interfaces.STR, (((StringsContext)_localctx).STRING!=null?((StringsContext)_localctx).STRING.getLine():0), localctx.(*StringsContext).Get_STRING().GetColumn())
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return listaglobal_sempred((ListaglobalContext)_localctx, predIndex);
		case 6:
			return params_declar_sempred((Params_declarContext)_localctx, predIndex);
		case 13:
			return lista_struct_sempred((Lista_structContext)_localctx, predIndex);
		case 22:
			return listParams_sempred((ListParamsContext)_localctx, predIndex);
		case 23:
			return listParamsCall_sempred((ListParamsCallContext)_localctx, predIndex);
		case 32:
			return l_AccessStruct_sempred((L_AccessStructContext)_localctx, predIndex);
		case 33:
			return list_index_sempred((List_indexContext)_localctx, predIndex);
		case 42:
			return match_brazos_sempred((Match_brazosContext)_localctx, predIndex);
		case 43:
			return match_brazos_exp_sempred((Match_brazos_expContext)_localctx, predIndex);
		case 46:
			return listaOpciones_sempred((ListaOpcionesContext)_localctx, predIndex);
		case 51:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 52:
			return expr_arit_sempred((Expr_aritContext)_localctx, predIndex);
		case 55:
			return l_StructExp_sempred((L_StructExpContext)_localctx, predIndex);
		case 57:
			return listIDArray_sempred((ListIDArrayContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean listaglobal_sempred(ListaglobalContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean params_declar_sempred(Params_declarContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean lista_struct_sempred(Lista_structContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean listParams_sempred(ListParamsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listParamsCall_sempred(ListParamsCallContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean l_AccessStruct_sempred(L_AccessStructContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean list_index_sempred(List_indexContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean match_brazos_sempred(Match_brazosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean match_brazos_exp_sempred(Match_brazos_expContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listaOpciones_sempred(ListaOpcionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expr_arit_sempred(Expr_aritContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 23);
		case 15:
			return precpred(_ctx, 21);
		case 16:
			return precpred(_ctx, 20);
		case 17:
			return precpred(_ctx, 18);
		case 18:
			return precpred(_ctx, 17);
		case 19:
			return precpred(_ctx, 22);
		case 20:
			return precpred(_ctx, 16);
		}
		return true;
	}
	private boolean l_StructExp_sempred(L_StructExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 21:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean listIDArray_sempred(ListIDArrayContext _localctx, int predIndex) {
		switch (predIndex) {
		case 22:
			return precpred(_ctx, 3);
		case 23:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3[\u04cf\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\3\2\3"+
		"\2\3\2\3\3\7\3}\n\3\f\3\16\3\u0080\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4\u008c\n\4\f\4\16\4\u008f\13\4\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5\u0097\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009f\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d9"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00e4\n\b\f\b\16\b\u00e7"+
		"\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0113\n\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u014d\n\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u017e\n\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u0192\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17\u01b2\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\7\17\u01ce\n\17\f\17\16\17\u01d1\13\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u01dd\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u01e5\n\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0204\n\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0212\n\30\f\30\16\30\u0215\13"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0222"+
		"\n\31\f\31\16\31\u0225\13\31\3\32\3\32\3\32\5\32\u022a\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\5\33\u026b\n\33\3\34\3\34\3\34\5\34\u0270\n"+
		"\34\3\35\3\35\3\35\3\35\5\35\u0276\n\35\3\36\3\36\3\36\5\36\u027b\n\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0287\n\37\3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u029c\n \3!"+
		"\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!"+
		"\3!\3!\3!\3!\3!\3!\3!\5!\u02bd\n!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\""+
		"\u02c7\n\"\f\"\16\"\u02ca\13\"\3#\3#\3#\3#\3#\3#\3#\3#\7#\u02d4\n#\f#"+
		"\16#\u02d7\13#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u02f8\n%\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0309\n&\3\'\6\'\u030c\n\'\r\'\16\'\u030d"+
		"\3\'\3\'\3(\6(\u0313\n(\r(\16(\u0314\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*"+
		"\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\5+\u0351\n+\3,\3,\3,\3,\3,\3,\3,\3,\7,\u035b\n,\f,\16,\u035e\13,\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\7-\u0368\n-\f-\16-\u036b\13-\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\5.\u0379\n.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\7\60\u0389\n\60\f\60\16\60\u038c\13\60\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0396\n\61\3\62\3\62\3\62\3\62\5\62"+
		"\u039c\n\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64\7\64\u03a5\n\64\f\64\16"+
		"\64\u03a8\13\64\3\64\3\64\3\64\7\64\u03ad\n\64\f\64\16\64\u03b0\13\64"+
		"\3\64\3\64\3\64\7\64\u03b5\n\64\f\64\16\64\u03b8\13\64\3\64\3\64\3\64"+
		"\7\64\u03bd\n\64\f\64\16\64\u03c0\13\64\3\64\3\64\3\64\7\64\u03c5\n\64"+
		"\f\64\16\64\u03c8\13\64\3\64\3\64\3\64\7\64\u03cd\n\64\f\64\16\64\u03d0"+
		"\13\64\3\64\3\64\3\64\7\64\u03d5\n\64\f\64\16\64\u03d8\13\64\3\64\3\64"+
		"\3\64\7\64\u03dd\n\64\f\64\16\64\u03e0\13\64\3\64\3\64\3\64\7\64\u03e5"+
		"\n\64\f\64\16\64\u03e8\13\64\3\64\5\64\u03eb\n\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u03f8\n\65\f\65\16\65\u03fb\13"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u044e"+
		"\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\7\66\u0471\n\66\f\66\16\66\u0474\13\66"+
		"\3\67\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\58\u0483\n8\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\79\u0492\n9\f9\169\u0495\139\3:\3:"+
		"\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u04a7\n:\3;\3;\3;\3;\3;"+
		"\3;\3;\3;\3;\3;\3;\3;\3;\3;\7;\u04b7\n;\f;\16;\u04ba\13;\3<\6<\u04bd\n"+
		"<\r<\16<\u04be\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\5<\u04cd\n<\3<\2\20"+
		"\6\16\34.\60BDVX^hjpt=\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,"+
		".\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtv\2\5\4\2GHKK\3\2IJ\3\2@"+
		"E\2\u0525\2x\3\2\2\2\4~\3\2\2\2\6\u0083\3\2\2\2\b\u0096\3\2\2\2\n\u009e"+
		"\3\2\2\2\f\u00d8\3\2\2\2\16\u00da\3\2\2\2\20\u0112\3\2\2\2\22\u0114\3"+
		"\2\2\2\24\u014c\3\2\2\2\26\u017d\3\2\2\2\30\u0191\3\2\2\2\32\u0193\3\2"+
		"\2\2\34\u01b1\3\2\2\2\36\u01dc\3\2\2\2 \u01e4\3\2\2\2\"\u01e6\3\2\2\2"+
		"$\u01ec\3\2\2\2&\u01f1\3\2\2\2(\u01f6\3\2\2\2*\u0203\3\2\2\2,\u0205\3"+
		"\2\2\2.\u0208\3\2\2\2\60\u0216\3\2\2\2\62\u0229\3\2\2\2\64\u026a\3\2\2"+
		"\2\66\u026f\3\2\2\28\u0275\3\2\2\2:\u027a\3\2\2\2<\u0286\3\2\2\2>\u029b"+
		"\3\2\2\2@\u02bc\3\2\2\2B\u02be\3\2\2\2D\u02cb\3\2\2\2F\u02d8\3\2\2\2H"+
		"\u02f7\3\2\2\2J\u0308\3\2\2\2L\u030b\3\2\2\2N\u0312\3\2\2\2P\u0318\3\2"+
		"\2\2R\u031e\3\2\2\2T\u0350\3\2\2\2V\u0352\3\2\2\2X\u035f\3\2\2\2Z\u0378"+
		"\3\2\2\2\\\u037a\3\2\2\2^\u037f\3\2\2\2`\u0395\3\2\2\2b\u039b\3\2\2\2"+
		"d\u039d\3\2\2\2f\u03ea\3\2\2\2h\u03ec\3\2\2\2j\u044d\3\2\2\2l\u0475\3"+
		"\2\2\2n\u0482\3\2\2\2p\u0484\3\2\2\2r\u04a6\3\2\2\2t\u04a8\3\2\2\2v\u04cc"+
		"\3\2\2\2xy\5\6\4\2yz\b\2\1\2z\3\3\2\2\2{}\5\24\13\2|{\3\2\2\2}\u0080\3"+
		"\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080~\3\2\2\2\u0081\u0082"+
		"\b\3\1\2\u0082\5\3\2\2\2\u0083\u0084\b\4\1\2\u0084\u0085\5\b\5\2\u0085"+
		"\u0086\b\4\1\2\u0086\u008d\3\2\2\2\u0087\u0088\f\4\2\2\u0088\u0089\5\b"+
		"\5\2\u0089\u008a\b\4\1\2\u008a\u008c\3\2\2\2\u008b\u0087\3\2\2\2\u008c"+
		"\u008f\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\7\3\2\2\2"+
		"\u008f\u008d\3\2\2\2\u0090\u0091\5\f\7\2\u0091\u0092\b\5\1\2\u0092\u0097"+
		"\3\2\2\2\u0093\u0094\5\32\16\2\u0094\u0095\b\5\1\2\u0095\u0097\3\2\2\2"+
		"\u0096\u0090\3\2\2\2\u0096\u0093\3\2\2\2\u0097\t\3\2\2\2\u0098\u0099\5"+
		"\f\7\2\u0099\u009a\b\6\1\2\u009a\u009f\3\2\2\2\u009b\u009c\5\32\16\2\u009c"+
		"\u009d\b\6\1\2\u009d\u009f\3\2\2\2\u009e\u0098\3\2\2\2\u009e\u009b\3\2"+
		"\2\2\u009f\13\3\2\2\2\u00a0\u00a1\5\22\n\2\u00a1\u00a2\b\7\1\2\u00a2\u00d9"+
		"\3\2\2\2\u00a3\u00a4\7\61\2\2\u00a4\u00a5\7?\2\2\u00a5\u00a6\7R\2\2\u00a6"+
		"\u00a7\7S\2\2\u00a7\u00a8\7\60\2\2\u00a8\u00a9\5f\64\2\u00a9\u00aa\5`"+
		"\61\2\u00aa\u00ab\b\7\1\2\u00ab\u00d9\3\2\2\2\u00ac\u00ad\7\61\2\2\u00ad"+
		"\u00ae\7?\2\2\u00ae\u00af\7R\2\2\u00af\u00b0\7S\2\2\u00b0\u00b1\7\60\2"+
		"\2\u00b1\u00b2\7?\2\2\u00b2\u00b3\5`\61\2\u00b3\u00b4\b\7\1\2\u00b4\u00d9"+
		"\3\2\2\2\u00b5\u00b6\7\61\2\2\u00b6\u00b7\7?\2\2\u00b7\u00b8\7R\2\2\u00b8"+
		"\u00b9\7S\2\2\u00b9\u00ba\5`\61\2\u00ba\u00bb\b\7\1\2\u00bb\u00d9\3\2"+
		"\2\2\u00bc\u00bd\7\61\2\2\u00bd\u00be\7?\2\2\u00be\u00bf\7R\2\2\u00bf"+
		"\u00c0\5\16\b\2\u00c0\u00c1\7S\2\2\u00c1\u00c2\5`\61\2\u00c2\u00c3\b\7"+
		"\1\2\u00c3\u00d9\3\2\2\2\u00c4\u00c5\7\61\2\2\u00c5\u00c6\7?\2\2\u00c6"+
		"\u00c7\7R\2\2\u00c7\u00c8\5\16\b\2\u00c8\u00c9\7S\2\2\u00c9\u00ca\7\60"+
		"\2\2\u00ca\u00cb\5f\64\2\u00cb\u00cc\5`\61\2\u00cc\u00cd\b\7\1\2\u00cd"+
		"\u00d9\3\2\2\2\u00ce\u00cf\7\61\2\2\u00cf\u00d0\7?\2\2\u00d0\u00d1\7R"+
		"\2\2\u00d1\u00d2\5\16\b\2\u00d2\u00d3\7S\2\2\u00d3\u00d4\7\60\2\2\u00d4"+
		"\u00d5\7?\2\2\u00d5\u00d6\5`\61\2\u00d6\u00d7\b\7\1\2\u00d7\u00d9\3\2"+
		"\2\2\u00d8\u00a0\3\2\2\2\u00d8\u00a3\3\2\2\2\u00d8\u00ac\3\2\2\2\u00d8"+
		"\u00b5\3\2\2\2\u00d8\u00bc\3\2\2\2\u00d8\u00c4\3\2\2\2\u00d8\u00ce\3\2"+
		"\2\2\u00d9\r\3\2\2\2\u00da\u00db\b\b\1\2\u00db\u00dc\5\20\t\2\u00dc\u00dd"+
		"\b\b\1\2\u00dd\u00e5\3\2\2\2\u00de\u00df\f\4\2\2\u00df\u00e0\78\2\2\u00e0"+
		"\u00e1\5\20\t\2\u00e1\u00e2\b\b\1\2\u00e2\u00e4\3\2\2\2\u00e3\u00de\3"+
		"\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\17\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\5\66\34\2\u00e9\u00ea\7?\2"+
		"\2\u00ea\u00eb\7;\2\2\u00eb\u00ec\5f\64\2\u00ec\u00ed\b\t\1\2\u00ed\u0113"+
		"\3\2\2\2\u00ee\u00ef\7?\2\2\u00ef\u00f0\7;\2\2\u00f0\u00f1\5\62\32\2\u00f1"+
		"\u00f2\7V\2\2\u00f2\u00f3\7?\2\2\u00f3\u00f4\7W\2\2\u00f4\u00f5\b\t\1"+
		"\2\u00f5\u0113\3\2\2\2\u00f6\u00f7\7?\2\2\u00f7\u00f8\7;\2\2\u00f8\u00f9"+
		"\5\62\32\2\u00f9\u00fa\7V\2\2\u00fa\u00fb\5f\64\2\u00fb\u00fc\7W\2\2\u00fc"+
		"\u00fd\b\t\1\2\u00fd\u0113\3\2\2\2\u00fe\u00ff\7?\2\2\u00ff\u0100\7;\2"+
		"\2\u0100\u0101\7Q\2\2\u0101\u0102\5> \2\u0102\u0103\b\t\1\2\u0103\u0113"+
		"\3\2\2\2\u0104\u0105\7?\2\2\u0105\u0106\7;\2\2\u0106\u0107\5\62\32\2\u0107"+
		"\u0108\7?\2\2\u0108\u0109\b\t\1\2\u0109\u0113\3\2\2\2\u010a\u010b\5\66"+
		"\34\2\u010b\u010c\7?\2\2\u010c\u010d\7;\2\2\u010d\u010e\7V\2\2\u010e\u010f"+
		"\7?\2\2\u010f\u0110\7W\2\2\u0110\u0111\b\t\1\2\u0111\u0113\3\2\2\2\u0112"+
		"\u00e8\3\2\2\2\u0112\u00ee\3\2\2\2\u0112\u00f6\3\2\2\2\u0112\u00fe\3\2"+
		"\2\2\u0112\u0104\3\2\2\2\u0112\u010a\3\2\2\2\u0113\21\3\2\2\2\u0114\u0115"+
		"\5b\62\2\u0115\u0116\7\67\2\2\u0116\u0117\b\n\1\2\u0117\23\3\2\2\2\u0118"+
		"\u0119\5\"\22\2\u0119\u011a\b\13\1\2\u011a\u014d\3\2\2\2\u011b\u011c\5"+
		"\64\33\2\u011c\u011d\b\13\1\2\u011d\u014d\3\2\2\2\u011e\u011f\5@!\2\u011f"+
		"\u0120\b\13\1\2\u0120\u014d\3\2\2\2\u0121\u0122\5\30\r\2\u0122\u0123\b"+
		"\13\1\2\u0123\u014d\3\2\2\2\u0124\u0125\5H%\2\u0125\u0126\b\13\1\2\u0126"+
		"\u014d\3\2\2\2\u0127\u0128\5T+\2\u0128\u0129\b\13\1\2\u0129\u014d\3\2"+
		"\2\2\u012a\u012b\5$\23\2\u012b\u012c\b\13\1\2\u012c\u014d\3\2\2\2\u012d"+
		"\u012e\5&\24\2\u012e\u012f\b\13\1\2\u012f\u014d\3\2\2\2\u0130\u0131\5"+
		"(\25\2\u0131\u0132\b\13\1\2\u0132\u014d\3\2\2\2\u0133\u0134\5*\26\2\u0134"+
		"\u0135\b\13\1\2\u0135\u014d\3\2\2\2\u0136\u0137\5,\27\2\u0137\u0138\b"+
		"\13\1\2\u0138\u014d\3\2\2\2\u0139\u013a\5\32\16\2\u013a\u013b\b\13\1\2"+
		"\u013b\u014d\3\2\2\2\u013c\u013d\5\36\20\2\u013d\u013e\b\13\1\2\u013e"+
		"\u014d\3\2\2\2\u013f\u0140\5 \21\2\u0140\u0141\b\13\1\2\u0141\u014d\3"+
		"\2\2\2\u0142\u0143\7?\2\2\u0143\u0144\7\67\2\2\u0144\u0145\7-\2\2\u0145"+
		"\u0146\7R\2\2\u0146\u0147\7\34\2\2\u0147\u0148\7;\2\2\u0148\u0149\5h\65"+
		"\2\u0149\u014a\7S\2\2\u014a\u014b\b\13\1\2\u014b\u014d\3\2\2\2\u014c\u0118"+
		"\3\2\2\2\u014c\u011b\3\2\2\2\u014c\u011e\3\2\2\2\u014c\u0121\3\2\2\2\u014c"+
		"\u0124\3\2\2\2\u014c\u0127\3\2\2\2\u014c\u012a\3\2\2\2\u014c\u012d\3\2"+
		"\2\2\u014c\u0130\3\2\2\2\u014c\u0133\3\2\2\2\u014c\u0136\3\2\2\2\u014c"+
		"\u0139\3\2\2\2\u014c\u013c\3\2\2\2\u014c\u013f\3\2\2\2\u014c\u0142\3\2"+
		"\2\2\u014d\25\3\2\2\2\u014e\u014f\5\"\22\2\u014f\u0150\b\f\1\2\u0150\u017e"+
		"\3\2\2\2\u0151\u0152\5\64\33\2\u0152\u0153\b\f\1\2\u0153\u017e\3\2\2\2"+
		"\u0154\u0155\5@!\2\u0155\u0156\b\f\1\2\u0156\u017e\3\2\2\2\u0157\u0158"+
		"\5\30\r\2\u0158\u0159\b\f\1\2\u0159\u017e\3\2\2\2\u015a\u015b\5H%\2\u015b"+
		"\u015c\b\f\1\2\u015c\u017e\3\2\2\2\u015d\u015e\5T+\2\u015e\u015f\b\f\1"+
		"\2\u015f\u017e\3\2\2\2\u0160\u0161\5$\23\2\u0161\u0162\b\f\1\2\u0162\u017e"+
		"\3\2\2\2\u0163\u0164\5&\24\2\u0164\u0165\b\f\1\2\u0165\u017e\3\2\2\2\u0166"+
		"\u0167\5(\25\2\u0167\u0168\b\f\1\2\u0168\u017e\3\2\2\2\u0169\u016a\5*"+
		"\26\2\u016a\u016b\b\f\1\2\u016b\u017e\3\2\2\2\u016c\u016d\5,\27\2\u016d"+
		"\u016e\b\f\1\2\u016e\u017e\3\2\2\2\u016f\u0170\5\36\20\2\u0170\u0171\b"+
		"\f\1\2\u0171\u017e\3\2\2\2\u0172\u0173\5 \21\2\u0173\u0174\b\f\1\2\u0174"+
		"\u017e\3\2\2\2\u0175\u0176\7?\2\2\u0176\u0177\7\67\2\2\u0177\u0178\7-"+
		"\2\2\u0178\u0179\7R\2\2\u0179\u017a\5h\65\2\u017a\u017b\7S\2\2\u017b\u017c"+
		"\b\f\1\2\u017c\u017e\3\2\2\2\u017d\u014e\3\2\2\2\u017d\u0151\3\2\2\2\u017d"+
		"\u0154\3\2\2\2\u017d\u0157\3\2\2\2\u017d\u015a\3\2\2\2\u017d\u015d\3\2"+
		"\2\2\u017d\u0160\3\2\2\2\u017d\u0163\3\2\2\2\u017d\u0166\3\2\2\2\u017d"+
		"\u0169\3\2\2\2\u017d\u016c\3\2\2\2\u017d\u016f\3\2\2\2\u017d\u0172\3\2"+
		"\2\2\u017d\u0175\3\2\2\2\u017e\27\3\2\2\2\u017f\u0180\7?\2\2\u0180\u0181"+
		"\7\67\2\2\u0181\u0182\7*\2\2\u0182\u0183\7R\2\2\u0183\u0184\5h\65\2\u0184"+
		"\u0185\7S\2\2\u0185\u0186\b\r\1\2\u0186\u0192\3\2\2\2\u0187\u0188\7?\2"+
		"\2\u0188\u0189\7\67\2\2\u0189\u018a\7,\2\2\u018a\u018b\7R\2\2\u018b\u018c"+
		"\5h\65\2\u018c\u018d\78\2\2\u018d\u018e\5h\65\2\u018e\u018f\7S\2\2\u018f"+
		"\u0190\b\r\1\2\u0190\u0192\3\2\2\2\u0191\u017f\3\2\2\2\u0191\u0187\3\2"+
		"\2\2\u0192\31\3\2\2\2\u0193\u0194\7\37\2\2\u0194\u0195\7?\2\2\u0195\u0196"+
		"\7T\2\2\u0196\u0197\5\34\17\2\u0197\u0198\7U\2\2\u0198\u0199\b\16\1\2"+
		"\u0199\33\3\2\2\2\u019a\u019b\b\17\1\2\u019b\u019c\7\36\2\2\u019c\u019d"+
		"\7?\2\2\u019d\u019e\7;\2\2\u019e\u019f\5f\64\2\u019f\u01a0\b\17\1\2\u01a0"+
		"\u01b2\3\2\2\2\u01a1\u01a2\7\36\2\2\u01a2\u01a3\7?\2\2\u01a3\u01a4\7;"+
		"\2\2\u01a4\u01a5\7?\2\2\u01a5\u01b2\b\17\1\2\u01a6\u01a7\7\35\2\2\u01a7"+
		"\u01a8\7?\2\2\u01a8\u01a9\7;\2\2\u01a9\u01aa\5f\64\2\u01aa\u01ab\b\17"+
		"\1\2\u01ab\u01b2\3\2\2\2\u01ac\u01ad\7\35\2\2\u01ad\u01ae\7?\2\2\u01ae"+
		"\u01af\7;\2\2\u01af\u01b0\7?\2\2\u01b0\u01b2\b\17\1\2\u01b1\u019a\3\2"+
		"\2\2\u01b1\u01a1\3\2\2\2\u01b1\u01a6\3\2\2\2\u01b1\u01ac\3\2\2\2\u01b2"+
		"\u01cf\3\2\2\2\u01b3\u01b4\f\n\2\2\u01b4\u01b5\7\36\2\2\u01b5\u01b6\7"+
		"?\2\2\u01b6\u01b7\7;\2\2\u01b7\u01b8\5f\64\2\u01b8\u01b9\b\17\1\2\u01b9"+
		"\u01ce\3\2\2\2\u01ba\u01bb\f\t\2\2\u01bb\u01bc\7\36\2\2\u01bc\u01bd\7"+
		"?\2\2\u01bd\u01be\7;\2\2\u01be\u01bf\7?\2\2\u01bf\u01ce\b\17\1\2\u01c0"+
		"\u01c1\f\b\2\2\u01c1\u01c2\7\35\2\2\u01c2\u01c3\7?\2\2\u01c3\u01c4\7;"+
		"\2\2\u01c4\u01c5\5f\64\2\u01c5\u01c6\b\17\1\2\u01c6\u01ce\3\2\2\2\u01c7"+
		"\u01c8\f\7\2\2\u01c8\u01c9\7\35\2\2\u01c9\u01ca\7?\2\2\u01ca\u01cb\7;"+
		"\2\2\u01cb\u01cc\7?\2\2\u01cc\u01ce\b\17\1\2\u01cd\u01b3\3\2\2\2\u01cd"+
		"\u01ba\3\2\2\2\u01cd\u01c0\3\2\2\2\u01cd\u01c7\3\2\2\2\u01ce\u01d1\3\2"+
		"\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\35\3\2\2\2\u01d1\u01cf"+
		"\3\2\2\2\u01d2\u01d3\7?\2\2\u01d3\u01d4\7R\2\2\u01d4\u01d5\7S\2\2\u01d5"+
		"\u01dd\b\20\1\2\u01d6\u01d7\7?\2\2\u01d7\u01d8\7R\2\2\u01d8\u01d9\5\60"+
		"\31\2\u01d9\u01da\7S\2\2\u01da\u01db\b\20\1\2\u01db\u01dd\3\2\2\2\u01dc"+
		"\u01d2\3\2\2\2\u01dc\u01d6\3\2\2\2\u01dd\37\3\2\2\2\u01de\u01df\7\63\2"+
		"\2\u01df\u01e5\b\21\1\2\u01e0\u01e1\7\63\2\2\u01e1\u01e2\5h\65\2\u01e2"+
		"\u01e3\b\21\1\2\u01e3\u01e5\3\2\2\2\u01e4\u01de\3\2\2\2\u01e4\u01e0\3"+
		"\2\2\2\u01e5!\3\2\2\2\u01e6\u01e7\7\3\2\2\u01e7\u01e8\7R\2\2\u01e8\u01e9"+
		"\5.\30\2\u01e9\u01ea\7S\2\2\u01ea\u01eb\b\22\1\2\u01eb#\3\2\2\2\u01ec"+
		"\u01ed\7\17\2\2\u01ed\u01ee\7\31\2\2\u01ee\u01ef\5`\61\2\u01ef\u01f0\b"+
		"\23\1\2\u01f0%\3\2\2\2\u01f1\u01f2\7\17\2\2\u01f2\u01f3\5h\65\2\u01f3"+
		"\u01f4\5`\61\2\u01f4\u01f5\b\24\1\2\u01f5\'\3\2\2\2\u01f6\u01f7\7\21\2"+
		"\2\u01f7\u01f8\7?\2\2\u01f8\u01f9\7\22\2\2\u01f9\u01fa\5h\65\2\u01fa\u01fb"+
		"\5`\61\2\u01fb\u01fc\b\25\1\2\u01fc)\3\2\2\2\u01fd\u01fe\7\23\2\2\u01fe"+
		"\u0204\b\26\1\2\u01ff\u0200\7\23\2\2\u0200\u0201\5h\65\2\u0201\u0202\b"+
		"\26\1\2\u0202\u0204\3\2\2\2\u0203\u01fd\3\2\2\2\u0203\u01ff\3\2\2\2\u0204"+
		"+\3\2\2\2\u0205\u0206\7\24\2\2\u0206\u0207\b\27\1\2\u0207-\3\2\2\2\u0208"+
		"\u0209\b\30\1\2\u0209\u020a\5h\65\2\u020a\u020b\b\30\1\2\u020b\u0213\3"+
		"\2\2\2\u020c\u020d\f\4\2\2\u020d\u020e\78\2\2\u020e\u020f\5h\65\2\u020f"+
		"\u0210\b\30\1\2\u0210\u0212\3\2\2\2\u0211\u020c\3\2\2\2\u0212\u0215\3"+
		"\2\2\2\u0213\u0211\3\2\2\2\u0213\u0214\3\2\2\2\u0214/\3\2\2\2\u0215\u0213"+
		"\3\2\2\2\u0216\u0217\b\31\1\2\u0217\u0218\5\62\32\2\u0218\u0219\5h\65"+
		"\2\u0219\u021a\b\31\1\2\u021a\u0223\3\2\2\2\u021b\u021c\f\4\2\2\u021c"+
		"\u021d\78\2\2\u021d\u021e\5\62\32\2\u021e\u021f\5h\65\2\u021f\u0220\b"+
		"\31\1\2\u0220\u0222\3\2\2\2\u0221\u021b\3\2\2\2\u0222\u0225\3\2\2\2\u0223"+
		"\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224\61\3\2\2\2\u0225\u0223\3\2\2"+
		"\2\u0226\u0227\7P\2\2\u0227\u022a\b\32\1\2\u0228\u022a\b\32\1\2\u0229"+
		"\u0226\3\2\2\2\u0229\u0228\3\2\2\2\u022a\63\3\2\2\2\u022b\u022c\58\35"+
		"\2\u022c\u022d\7?\2\2\u022d\u022e\7;\2\2\u022e\u022f\5f\64\2\u022f\u0230"+
		"\7<\2\2\u0230\u0231\5h\65\2\u0231\u0232\b\33\1\2\u0232\u026b\3\2\2\2\u0233"+
		"\u0234\58\35\2\u0234\u0235\7?\2\2\u0235\u0236\5:\36\2\u0236\u0237\7<\2"+
		"\2\u0237\u0238\5h\65\2\u0238\u0239\b\33\1\2\u0239\u026b\3\2\2\2\u023a"+
		"\u023b\58\35\2\u023b\u023c\7?\2\2\u023c\u023d\7;\2\2\u023d\u023e\5<\37"+
		"\2\u023e\u023f\7<\2\2\u023f\u0240\7V\2\2\u0240\u0241\7W\2\2\u0241\u0242"+
		"\b\33\1\2\u0242\u026b\3\2\2\2\u0243\u0244\58\35\2\u0244\u0245\7?\2\2\u0245"+
		"\u0246\7;\2\2\u0246\u0247\5<\37\2\u0247\u0248\7<\2\2\u0248\u0249\5h\65"+
		"\2\u0249\u024a\b\33\1\2\u024a\u026b\3\2\2\2\u024b\u024c\58\35\2\u024c"+
		"\u024d\7?\2\2\u024d\u024e\7;\2\2\u024e\u024f\7V\2\2\u024f\u0250\7?\2\2"+
		"\u0250\u0251\7W\2\2\u0251\u0252\7<\2\2\u0252\u0253\7V\2\2\u0253\u0254"+
		"\7W\2\2\u0254\u0255\b\33\1\2\u0255\u026b\3\2\2\2\u0256\u0257\58\35\2\u0257"+
		"\u0258\7?\2\2\u0258\u0259\7;\2\2\u0259\u025a\7V\2\2\u025a\u025b\7?\2\2"+
		"\u025b\u025c\7W\2\2\u025c\u025d\7<\2\2\u025d\u025e\5h\65\2\u025e\u025f"+
		"\b\33\1\2\u025f\u026b\3\2\2\2\u0260\u0261\58\35\2\u0261\u0262\7?\2\2\u0262"+
		"\u0263\7;\2\2\u0263\u0264\7V\2\2\u0264\u0265\5f\64\2\u0265\u0266\7W\2"+
		"\2\u0266\u0267\7<\2\2\u0267\u0268\5h\65\2\u0268\u0269\b\33\1\2\u0269\u026b"+
		"\3\2\2\2\u026a\u022b\3\2\2\2\u026a\u0233\3\2\2\2\u026a\u023a\3\2\2\2\u026a"+
		"\u0243\3\2\2\2\u026a\u024b\3\2\2\2\u026a\u0256\3\2\2\2\u026a\u0260\3\2"+
		"\2\2\u026b\65\3\2\2\2\u026c\u026d\7\36\2\2\u026d\u0270\b\34\1\2\u026e"+
		"\u0270\3\2\2\2\u026f\u026c\3\2\2\2\u026f\u026e\3\2\2\2\u0270\67\3\2\2"+
		"\2\u0271\u0272\7\36\2\2\u0272\u0276\b\35\1\2\u0273\u0274\7\35\2\2\u0274"+
		"\u0276\b\35\1\2\u0275\u0271\3\2\2\2\u0275\u0273\3\2\2\2\u02769\3\2\2\2"+
		"\u0277\u0278\7;\2\2\u0278\u027b\7?\2\2\u0279\u027b\3\2\2\2\u027a\u0277"+
		"\3\2\2\2\u027a\u0279\3\2\2\2\u027b;\3\2\2\2\u027c\u027d\7V\2\2\u027d\u027e"+
		"\5<\37\2\u027e\u027f\7W\2\2\u027f\u0280\b\37\1\2\u0280\u0287\3\2\2\2\u0281"+
		"\u0282\7V\2\2\u0282\u0283\5f\64\2\u0283\u0284\7W\2\2\u0284\u0285\b\37"+
		"\1\2\u0285\u0287\3\2\2\2\u0286\u027c\3\2\2\2\u0286\u0281\3\2\2\2\u0287"+
		"=\3\2\2\2\u0288\u0289\7V\2\2\u0289\u028a\5> \2\u028a\u028b\79\2\2\u028b"+
		"\u028c\5h\65\2\u028c\u028d\7W\2\2\u028d\u028e\b \1\2\u028e\u029c\3\2\2"+
		"\2\u028f\u0290\7V\2\2\u0290\u0291\5f\64\2\u0291\u0292\79\2\2\u0292\u0293"+
		"\5h\65\2\u0293\u0294\7W\2\2\u0294\u0295\b \1\2\u0295\u029c\3\2\2\2\u0296"+
		"\u0297\7V\2\2\u0297\u0298\5f\64\2\u0298\u0299\7W\2\2\u0299\u029a\b \1"+
		"\2\u029a\u029c\3\2\2\2\u029b\u0288\3\2\2\2\u029b\u028f\3\2\2\2\u029b\u0296"+
		"\3\2\2\2\u029c?\3\2\2\2\u029d\u029e\7?\2\2\u029e\u029f\7<\2\2\u029f\u02a0"+
		"\5h\65\2\u02a0\u02a1\b!\1\2\u02a1\u02bd\3\2\2\2\u02a2\u02a3\7?\2\2\u02a3"+
		"\u02a4\5D#\2\u02a4\u02a5\7<\2\2\u02a5\u02a6\5h\65\2\u02a6\u02a7\b!\1\2"+
		"\u02a7\u02bd\3\2\2\2\u02a8\u02a9\5B\"\2\u02a9\u02aa\7<\2\2\u02aa\u02ab"+
		"\5h\65\2\u02ab\u02ac\b!\1\2\u02ac\u02bd\3\2\2\2\u02ad\u02ae\7?\2\2\u02ae"+
		"\u02af\7V\2\2\u02af\u02b0\5h\65\2\u02b0\u02b1\7W\2\2\u02b1\u02b2\7\67"+
		"\2\2\u02b2\u02b3\5B\"\2\u02b3\u02b4\7<\2\2\u02b4\u02b5\5h\65\2\u02b5\u02b6"+
		"\b!\1\2\u02b6\u02bd\3\2\2\2\u02b7\u02b8\7?\2\2\u02b8\u02b9\7F\2\2\u02b9"+
		"\u02ba\5h\65\2\u02ba\u02bb\b!\1\2\u02bb\u02bd\3\2\2\2\u02bc\u029d\3\2"+
		"\2\2\u02bc\u02a2\3\2\2\2\u02bc\u02a8\3\2\2\2\u02bc\u02ad\3\2\2\2\u02bc"+
		"\u02b7\3\2\2\2\u02bdA\3\2\2\2\u02be\u02bf\b\"\1\2\u02bf\u02c0\7?\2\2\u02c0"+
		"\u02c1\b\"\1\2\u02c1\u02c8\3\2\2\2\u02c2\u02c3\f\4\2\2\u02c3\u02c4\7\67"+
		"\2\2\u02c4\u02c5\7?\2\2\u02c5\u02c7\b\"\1\2\u02c6\u02c2\3\2\2\2\u02c7"+
		"\u02ca\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9C\3\2\2\2"+
		"\u02ca\u02c8\3\2\2\2\u02cb\u02cc\b#\1\2\u02cc\u02cd\5F$\2\u02cd\u02ce"+
		"\b#\1\2\u02ce\u02d5\3\2\2\2\u02cf\u02d0\f\4\2\2\u02d0\u02d1\5F$\2\u02d1"+
		"\u02d2\b#\1\2\u02d2\u02d4\3\2\2\2\u02d3\u02cf\3\2\2\2\u02d4\u02d7\3\2"+
		"\2\2\u02d5\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6E\3\2\2\2\u02d7\u02d5"+
		"\3\2\2\2\u02d8\u02d9\7V\2\2\u02d9\u02da\5h\65\2\u02da\u02db\7W\2\2\u02db"+
		"\u02dc\b$\1\2\u02dcG\3\2\2\2\u02dd\u02de\7\r\2\2\u02de\u02df\5h\65\2\u02df"+
		"\u02e0\5`\61\2\u02e0\u02e1\b%\1\2\u02e1\u02f8\3\2\2\2\u02e2\u02e3\7\r"+
		"\2\2\u02e3\u02e4\5h\65\2\u02e4\u02e5\5`\61\2\u02e5\u02e6\7\16\2\2\u02e6"+
		"\u02e7\5`\61\2\u02e7\u02e8\b%\1\2\u02e8\u02f8\3\2\2\2\u02e9\u02ea\7\r"+
		"\2\2\u02ea\u02eb\5h\65\2\u02eb\u02ec\5`\61\2\u02ec\u02ed\5L\'\2\u02ed"+
		"\u02ee\b%\1\2\u02ee\u02f8\3\2\2\2\u02ef\u02f0\7\r\2\2\u02f0\u02f1\5h\65"+
		"\2\u02f1\u02f2\5`\61\2\u02f2\u02f3\5L\'\2\u02f3\u02f4\7\16\2\2\u02f4\u02f5"+
		"\5`\61\2\u02f5\u02f6\b%\1\2\u02f6\u02f8\3\2\2\2\u02f7\u02dd\3\2\2\2\u02f7"+
		"\u02e2\3\2\2\2\u02f7\u02e9\3\2\2\2\u02f7\u02ef\3\2\2\2\u02f8I\3\2\2\2"+
		"\u02f9\u02fa\7\r\2\2\u02fa\u02fb\5h\65\2\u02fb\u02fc\5d\63\2\u02fc\u02fd"+
		"\7\16\2\2\u02fd\u02fe\5d\63\2\u02fe\u02ff\b&\1\2\u02ff\u0309\3\2\2\2\u0300"+
		"\u0301\7\r\2\2\u0301\u0302\5h\65\2\u0302\u0303\5d\63\2\u0303\u0304\5N"+
		"(\2\u0304\u0305\7\16\2\2\u0305\u0306\5d\63\2\u0306\u0307\b&\1\2\u0307"+
		"\u0309\3\2\2\2\u0308\u02f9\3\2\2\2\u0308\u0300\3\2\2\2\u0309K\3\2\2\2"+
		"\u030a\u030c\5P)\2\u030b\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030b"+
		"\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\b\'\1\2\u0310"+
		"M\3\2\2\2\u0311\u0313\5R*\2\u0312\u0311\3\2\2\2\u0313\u0314\3\2\2\2\u0314"+
		"\u0312\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0316\3\2\2\2\u0316\u0317\b("+
		"\1\2\u0317O\3\2\2\2\u0318\u0319\7\16\2\2\u0319\u031a\7\r\2\2\u031a\u031b"+
		"\5h\65\2\u031b\u031c\5`\61\2\u031c\u031d\b)\1\2\u031dQ\3\2\2\2\u031e\u031f"+
		"\7\16\2\2\u031f\u0320\7\r\2\2\u0320\u0321\5h\65\2\u0321\u0322\5d\63\2"+
		"\u0322\u0323\b*\1\2\u0323S\3\2\2\2\u0324\u0325\7\25\2\2\u0325\u0326\5"+
		"h\65\2\u0326\u0327\7T\2\2\u0327\u0328\5V,\2\u0328\u0329\7U\2\2\u0329\u032a"+
		"\b+\1\2\u032a\u0351\3\2\2\2\u032b\u032c\7\25\2\2\u032c\u032d\5h\65\2\u032d"+
		"\u032e\7T\2\2\u032e\u032f\5V,\2\u032f\u0330\7\30\2\2\u0330\u0331\7;\2"+
		"\2\u0331\u0332\5`\61\2\u0332\u0333\7U\2\2\u0333\u0334\b+\1\2\u0334\u0351"+
		"\3\2\2\2\u0335\u0336\7\25\2\2\u0336\u0337\5h\65\2\u0337\u0338\7T\2\2\u0338"+
		"\u0339\5V,\2\u0339\u033a\7\30\2\2\u033a\u033b\7;\2\2\u033b\u033c\5\26"+
		"\f\2\u033c\u033d\7U\2\2\u033d\u033e\b+\1\2\u033e\u0351\3\2\2\2\u033f\u0340"+
		"\7\25\2\2\u0340\u0341\5h\65\2\u0341\u0342\7T\2\2\u0342\u0343\5X-\2\u0343"+
		"\u0344\7U\2\2\u0344\u0345\b+\1\2\u0345\u0351\3\2\2\2\u0346\u0347\7\25"+
		"\2\2\u0347\u0348\5h\65\2\u0348\u0349\7T\2\2\u0349\u034a\5X-\2\u034a\u034b"+
		"\7\30\2\2\u034b\u034c\7;\2\2\u034c\u034d\5h\65\2\u034d\u034e\7U\2\2\u034e"+
		"\u034f\b+\1\2\u034f\u0351\3\2\2\2\u0350\u0324\3\2\2\2\u0350\u032b\3\2"+
		"\2\2\u0350\u0335\3\2\2\2\u0350\u033f\3\2\2\2\u0350\u0346\3\2\2\2\u0351"+
		"U\3\2\2\2\u0352\u0353\b,\1\2\u0353\u0354\5Z.\2\u0354\u0355\b,\1\2\u0355"+
		"\u035c\3\2\2\2\u0356\u0357\f\4\2\2\u0357\u0358\5Z.\2\u0358\u0359\b,\1"+
		"\2\u0359\u035b\3\2\2\2\u035a\u0356\3\2\2\2\u035b\u035e\3\2\2\2\u035c\u035a"+
		"\3\2\2\2\u035c\u035d\3\2\2\2\u035dW\3\2\2\2\u035e\u035c\3\2\2\2\u035f"+
		"\u0360\b-\1\2\u0360\u0361\5\\/\2\u0361\u0362\b-\1\2\u0362\u0369\3\2\2"+
		"\2\u0363\u0364\f\4\2\2\u0364\u0365\5\\/\2\u0365\u0366\b-\1\2\u0366\u0368"+
		"\3\2\2\2\u0367\u0363\3\2\2\2\u0368\u036b\3\2\2\2\u0369\u0367\3\2\2\2\u0369"+
		"\u036a\3\2\2\2\u036aY\3\2\2\2\u036b\u0369\3\2\2\2\u036c\u036d\7\27\2\2"+
		"\u036d\u036e\5^\60\2\u036e\u036f\7;\2\2\u036f\u0370\5`\61\2\u0370\u0371"+
		"\b.\1\2\u0371\u0379\3\2\2\2\u0372\u0373\7\27\2\2\u0373\u0374\5^\60\2\u0374"+
		"\u0375\7;\2\2\u0375\u0376\5\26\f\2\u0376\u0377\b.\1\2\u0377\u0379\3\2"+
		"\2\2\u0378\u036c\3\2\2\2\u0378\u0372\3\2\2\2\u0379[\3\2\2\2\u037a\u037b"+
		"\5^\60\2\u037b\u037c\7;\2\2\u037c\u037d\5h\65\2\u037d\u037e\b/\1\2\u037e"+
		"]\3\2\2\2\u037f\u0380\b\60\1\2\u0380\u0381\5r:\2\u0381\u0382\b\60\1\2"+
		"\u0382\u038a\3\2\2\2\u0383\u0384\f\4\2\2\u0384\u0385\78\2\2\u0385\u0386"+
		"\5r:\2\u0386\u0387\b\60\1\2\u0387\u0389\3\2\2\2\u0388\u0383\3\2\2\2\u0389"+
		"\u038c\3\2\2\2\u038a\u0388\3\2\2\2\u038a\u038b\3\2\2\2\u038b_\3\2\2\2"+
		"\u038c\u038a\3\2\2\2\u038d\u038e\7T\2\2\u038e\u038f\5\4\3\2\u038f\u0390"+
		"\7U\2\2\u0390\u0391\b\61\1\2\u0391\u0396\3\2\2\2\u0392\u0393\7T\2\2\u0393"+
		"\u0394\7U\2\2\u0394\u0396\b\61\1\2\u0395\u038d\3\2\2\2\u0395\u0392\3\2"+
		"\2\2\u0396a\3\2\2\2\u0397\u0398\5\4\3\2\u0398\u0399\b\62\1\2\u0399\u039c"+
		"\3\2\2\2\u039a\u039c\b\62\1\2\u039b\u0397\3\2\2\2\u039b\u039a\3\2\2\2"+
		"\u039cc\3\2\2\2\u039d\u039e\7T\2\2\u039e\u039f\5h\65\2\u039f\u03a0\7U"+
		"\2\2\u03a0\u03a1\b\63\1\2\u03a1e\3\2\2\2\u03a2\u03a6\7\4\2\2\u03a3\u03a5"+
		"\7O\2\2\u03a4\u03a3\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6"+
		"\u03a7\3\2\2\2\u03a7\u03a9\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9\u03eb\b\64"+
		"\1\2\u03aa\u03ae\7\6\2\2\u03ab\u03ad\7O\2\2\u03ac\u03ab\3\2\2\2\u03ad"+
		"\u03b0\3\2\2\2\u03ae\u03ac\3\2\2\2\u03ae\u03af\3\2\2\2\u03af\u03b1\3\2"+
		"\2\2\u03b0\u03ae\3\2\2\2\u03b1\u03eb\b\64\1\2\u03b2\u03b6\7\5\2\2\u03b3"+
		"\u03b5\7O\2\2\u03b4\u03b3\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6\u03b4\3\2"+
		"\2\2\u03b6\u03b7\3\2\2\2\u03b7\u03b9\3\2\2\2\u03b8\u03b6\3\2\2\2\u03b9"+
		"\u03eb\b\64\1\2\u03ba\u03be\7\7\2\2\u03bb\u03bd\7O\2\2\u03bc\u03bb\3\2"+
		"\2\2\u03bd\u03c0\3\2\2\2\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf"+
		"\u03c1\3\2\2\2\u03c0\u03be\3\2\2\2\u03c1\u03eb\b\64\1\2\u03c2\u03c6\7"+
		"\b\2\2\u03c3\u03c5\7O\2\2\u03c4\u03c3\3\2\2\2\u03c5\u03c8\3\2\2\2\u03c6"+
		"\u03c4\3\2\2\2\u03c6\u03c7\3\2\2\2\u03c7\u03c9\3\2\2\2\u03c8\u03c6\3\2"+
		"\2\2\u03c9\u03eb\b\64\1\2\u03ca\u03ce\7\37\2\2\u03cb\u03cd\7O\2\2\u03cc"+
		"\u03cb\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2"+
		"\2\2\u03cf\u03d1\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u03eb\b\64\1\2\u03d2"+
		"\u03d6\7\t\2\2\u03d3\u03d5\7O\2\2\u03d4\u03d3\3\2\2\2\u03d5\u03d8\3\2"+
		"\2\2\u03d6\u03d4\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d9\3\2\2\2\u03d8"+
		"\u03d6\3\2\2\2\u03d9\u03eb\b\64\1\2\u03da\u03de\7\n\2\2\u03db\u03dd\7"+
		"O\2\2\u03dc\u03db\3\2\2\2\u03dd\u03e0\3\2\2\2\u03de\u03dc\3\2\2\2\u03de"+
		"\u03df\3\2\2\2\u03df\u03e1\3\2\2\2\u03e0\u03de\3\2\2\2\u03e1\u03eb\b\64"+
		"\1\2\u03e2\u03e6\7\13\2\2\u03e3\u03e5\7O\2\2\u03e4\u03e3\3\2\2\2\u03e5"+
		"\u03e8\3\2\2\2\u03e6\u03e4\3\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e9\3\2"+
		"\2\2\u03e8\u03e6\3\2\2\2\u03e9\u03eb\b\64\1\2\u03ea\u03a2\3\2\2\2\u03ea"+
		"\u03aa\3\2\2\2\u03ea\u03b2\3\2\2\2\u03ea\u03ba\3\2\2\2\u03ea\u03c2\3\2"+
		"\2\2\u03ea\u03ca\3\2\2\2\u03ea\u03d2\3\2\2\2\u03ea\u03da\3\2\2\2\u03ea"+
		"\u03e2\3\2\2\2\u03ebg\3\2\2\2\u03ec\u03ed\b\65\1\2\u03ed\u03ee\5j\66\2"+
		"\u03ee\u03ef\b\65\1\2\u03ef\u03f9\3\2\2\2\u03f0\u03f1\f\3\2\2\u03f1\u03f2"+
		"\7\67\2\2\u03f2\u03f3\7\67\2\2\u03f3\u03f4\7\67\2\2\u03f4\u03f5\5h\65"+
		"\4\u03f5\u03f6\b\65\1\2\u03f6\u03f8\3\2\2\2\u03f7\u03f0\3\2\2\2\u03f8"+
		"\u03fb\3\2\2\2\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fai\3\2\2\2"+
		"\u03fb\u03f9\3\2\2\2\u03fc\u03fd\b\66\1\2\u03fd\u03fe\7J\2\2\u03fe\u03ff"+
		"\5j\66\32\u03ff\u0400\b\66\1\2\u0400\u044e\3\2\2\2\u0401\u0402\7N\2\2"+
		"\u0402\u0403\5j\66\25\u0403\u0404\b\66\1\2\u0404\u044e\3\2\2\2\u0405\u0406"+
		"\7\6\2\2\u0406\u0407\7R\2\2\u0407\u0408\5j\66\2\u0408\u0409\7S\2\2\u0409"+
		"\u040a\b\66\1\2\u040a\u044e\3\2\2\2\u040b\u040c\7?\2\2\u040c\u040d\7\67"+
		"\2\2\u040d\u040e\7+\2\2\u040e\u040f\7R\2\2\u040f\u0410\7P\2\2\u0410\u0411"+
		"\5h\65\2\u0411\u0412\7S\2\2\u0412\u0413\b\66\1\2\u0413\u044e\3\2\2\2\u0414"+
		"\u0415\7?\2\2\u0415\u0416\7\67\2\2\u0416\u0417\7\'\2\2\u0417\u044e\b\66"+
		"\1\2\u0418\u0419\7V\2\2\u0419\u041a\5h\65\2\u041a\u041b\79\2\2\u041b\u041c"+
		"\5h\65\2\u041c\u041d\7W\2\2\u041d\u041e\b\66\1\2\u041e\u044e\3\2\2\2\u041f"+
		"\u0420\7V\2\2\u0420\u0421\5.\30\2\u0421\u0422\7W\2\2\u0422\u0423\b\66"+
		"\1\2\u0423\u044e\3\2\2\2\u0424\u0425\7?\2\2\u0425\u0426\7R\2\2\u0426\u0427"+
		"\5p9\2\u0427\u0428\7S\2\2\u0428\u0429\b\66\1\2\u0429\u044e\3\2\2\2\u042a"+
		"\u042b\5r:\2\u042b\u042c\b\66\1\2\u042c\u044e\3\2\2\2\u042d\u042e\7R\2"+
		"\2\u042e\u042f\5h\65\2\u042f\u0430\7S\2\2\u0430\u0431\b\66\1\2\u0431\u044e"+
		"\3\2\2\2\u0432\u0433\5l\67\2\u0433\u0434\b\66\1\2\u0434\u044e\3\2\2\2"+
		"\u0435\u0436\5J&\2\u0436\u0437\b\66\1\2\u0437\u044e\3\2\2\2\u0438\u0439"+
		"\5T+\2\u0439\u043a\b\66\1\2\u043a\u044e\3\2\2\2\u043b\u043c\5$\23\2\u043c"+
		"\u043d\b\66\1\2\u043d\u044e\3\2\2\2\u043e\u043f\5\36\20\2\u043f\u0440"+
		"\b\66\1\2\u0440\u044e\3\2\2\2\u0441\u0442\7?\2\2\u0442\u0443\7\67\2\2"+
		"\u0443\u0444\7-\2\2\u0444\u0445\7R\2\2\u0445\u0446\5h\65\2\u0446\u0447"+
		"\7S\2\2\u0447\u0448\b\66\1\2\u0448\u044e\3\2\2\2\u0449\u044a\7\22\2\2"+
		"\u044a\u044b\5r:\2\u044b\u044c\b\66\1\2\u044c\u044e\3\2\2\2\u044d\u03fc"+
		"\3\2\2\2\u044d\u0401\3\2\2\2\u044d\u0405\3\2\2\2\u044d\u040b\3\2\2\2\u044d"+
		"\u0414\3\2\2\2\u044d\u0418\3\2\2\2\u044d\u041f\3\2\2\2\u044d\u0424\3\2"+
		"\2\2\u044d\u042a\3\2\2\2\u044d\u042d\3\2\2\2\u044d\u0432\3\2\2\2\u044d"+
		"\u0435\3\2\2\2\u044d\u0438\3\2\2\2\u044d\u043b\3\2\2\2\u044d\u043e\3\2"+
		"\2\2\u044d\u0441\3\2\2\2\u044d\u0449\3\2\2\2\u044e\u0472\3\2\2\2\u044f"+
		"\u0450\f\31\2\2\u0450\u0451\t\2\2\2\u0451\u0452\5j\66\32\u0452\u0453\b"+
		"\66\1\2\u0453\u0471\3\2\2\2\u0454\u0455\f\27\2\2\u0455\u0456\t\3\2\2\u0456"+
		"\u0457\5j\66\30\u0457\u0458\b\66\1\2\u0458\u0471\3\2\2\2\u0459\u045a\f"+
		"\26\2\2\u045a\u045b\t\4\2\2\u045b\u045c\5j\66\27\u045c\u045d\b\66\1\2"+
		"\u045d\u0471\3\2\2\2\u045e\u045f\f\24\2\2\u045f\u0460\7L\2\2\u0460\u0461"+
		"\5j\66\25\u0461\u0462\b\66\1\2\u0462\u0471\3\2\2\2\u0463\u0464\f\23\2"+
		"\2\u0464\u0465\7M\2\2\u0465\u0466\5j\66\24\u0466\u0467\b\66\1\2\u0467"+
		"\u0471\3\2\2\2\u0468\u0469\f\30\2\2\u0469\u046a\7\67\2\2\u046a\u046b\7"+
		"%\2\2\u046b\u0471\b\66\1\2\u046c\u046d\f\22\2\2\u046d\u046e\7\67\2\2\u046e"+
		"\u046f\7(\2\2\u046f\u0471\b\66\1\2\u0470\u044f\3\2\2\2\u0470\u0454\3\2"+
		"\2\2\u0470\u0459\3\2\2\2\u0470\u045e\3\2\2\2\u0470\u0463\3\2\2\2\u0470"+
		"\u0468\3\2\2\2\u0470\u046c\3\2\2\2\u0471\u0474\3\2\2\2\u0472\u0470\3\2"+
		"\2\2\u0472\u0473\3\2\2\2\u0473k\3\2\2\2\u0474\u0472\3\2\2\2\u0475\u0476"+
		"\7R\2\2\u0476\u0477\5h\65\2\u0477\u0478\7\33\2\2\u0478\u0479\5n8\2\u0479"+
		"\u047a\7S\2\2\u047a\u047b\b\67\1\2\u047bm\3\2\2\2\u047c\u047d\7\5\2\2"+
		"\u047d\u0483\b8\1\2\u047e\u047f\7\4\2\2\u047f\u0483\b8\1\2\u0480\u0481"+
		"\7\f\2\2\u0481\u0483\b8\1\2\u0482\u047c\3\2\2\2\u0482\u047e\3\2\2\2\u0482"+
		"\u0480\3\2\2\2\u0483o\3\2\2\2\u0484\u0485\b9\1\2\u0485\u0486\7?\2\2\u0486"+
		"\u0487\7;\2\2\u0487\u0488\5h\65\2\u0488\u0489\b9\1\2\u0489\u0493\3\2\2"+
		"\2\u048a\u048b\f\4\2\2\u048b\u048c\78\2\2\u048c\u048d\7?\2\2\u048d\u048e"+
		"\7;\2\2\u048e\u048f\5h\65\2\u048f\u0490\b9\1\2\u0490\u0492\3\2\2\2\u0491"+
		"\u048a\3\2\2\2\u0492\u0495\3\2\2\2\u0493\u0491\3\2\2\2\u0493\u0494\3\2"+
		"\2\2\u0494q\3\2\2\2\u0495\u0493\3\2\2\2\u0496\u0497\7\64\2\2\u0497\u04a7"+
		"\b:\1\2\u0498\u0499\7\65\2\2\u0499\u04a7\b:\1\2\u049a\u049b\5v<\2\u049b"+
		"\u049c\b:\1\2\u049c\u04a7\3\2\2\2\u049d\u049e\7X\2\2\u049e\u04a7\b:\1"+
		"\2\u049f\u04a0\7\31\2\2\u04a0\u04a7\b:\1\2\u04a1\u04a2\7\32\2\2\u04a2"+
		"\u04a7\b:\1\2\u04a3\u04a4\5t;\2\u04a4\u04a5\b:\1\2\u04a5\u04a7\3\2\2\2"+
		"\u04a6\u0496\3\2\2\2\u04a6\u0498\3\2\2\2\u04a6\u049a\3\2\2\2\u04a6\u049d"+
		"\3\2\2\2\u04a6\u049f\3\2\2\2\u04a6\u04a1\3\2\2\2\u04a6\u04a3\3\2\2\2\u04a7"+
		"s\3\2\2\2\u04a8\u04a9\b;\1\2\u04a9\u04aa\7?\2\2\u04aa\u04ab\b;\1\2\u04ab"+
		"\u04b8\3\2\2\2\u04ac\u04ad\f\5\2\2\u04ad\u04ae\7V\2\2\u04ae\u04af\5h\65"+
		"\2\u04af\u04b0\7W\2\2\u04b0\u04b1\b;\1\2\u04b1\u04b7\3\2\2\2\u04b2\u04b3"+
		"\f\4\2\2\u04b3\u04b4\7\67\2\2\u04b4\u04b5\7?\2\2\u04b5\u04b7\b;\1\2\u04b6"+
		"\u04ac\3\2\2\2\u04b6\u04b2\3\2\2\2\u04b7\u04ba\3\2\2\2\u04b8\u04b6\3\2"+
		"\2\2\u04b8\u04b9\3\2\2\2\u04b9u\3\2\2\2\u04ba\u04b8\3\2\2\2\u04bb\u04bd"+
		"\7P\2\2\u04bc\u04bb\3\2\2\2\u04bd\u04be\3\2\2\2\u04be\u04bc\3\2\2\2\u04be"+
		"\u04bf\3\2\2\2\u04bf\u04c0\3\2\2\2\u04c0\u04c1\7\6\2\2\u04c1\u04c2\7R"+
		"\2\2\u04c2\u04c3\7\66\2\2\u04c3\u04c4\7S\2\2\u04c4\u04cd\b<\1\2\u04c5"+
		"\u04c6\7\6\2\2\u04c6\u04c7\7R\2\2\u04c7\u04c8\7\66\2\2\u04c8\u04c9\7S"+
		"\2\2\u04c9\u04cd\b<\1\2\u04ca\u04cb\7\66\2\2\u04cb\u04cd\b<\1\2\u04cc"+
		"\u04bc\3\2\2\2\u04cc\u04c5\3\2\2\2\u04cc\u04ca\3\2\2\2\u04cdw\3\2\2\2"+
		">~\u008d\u0096\u009e\u00d8\u00e5\u0112\u014c\u017d\u0191\u01b1\u01cd\u01cf"+
		"\u01dc\u01e4\u0203\u0213\u0223\u0229\u026a\u026f\u0275\u027a\u0286\u029b"+
		"\u02bc\u02c8\u02d5\u02f7\u0308\u030d\u0314\u0350\u035c\u0369\u0378\u038a"+
		"\u0395\u039b\u03a6\u03ae\u03b6\u03be\u03c6\u03ce\u03d6\u03de\u03e6\u03ea"+
		"\u03f9\u044d\u0470\u0472\u0482\u0493\u04a6\u04b6\u04b8\u04be\u04cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
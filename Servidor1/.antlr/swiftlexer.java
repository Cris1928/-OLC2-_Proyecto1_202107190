// Generated from c:\Users\USER\Desktop\OLC2_Proyecto1\Servidor1\swiftlexer.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class swiftlexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT_CON=1, T_NUMBER=2, T_FLOAT=3, T_STRING=4, T_BOOL=5, T_STR=6, T_CHAT=7, 
		T_ARRAY=8, T_VECTOR=9, USIZE=10, IF=11, ELSE=12, WHILE=13, FOR=14, IN=15, 
		BREAK=16, CONTINUE=17, SWITCH=18, MTOR=19, CASE=20, DEFAULT=21, TRUE=22, 
		FALSE=23, AS=24, AT=25, LET=26, MUT=27, STRUCT=28, COUNT=29, NEW=30, CAPF=31, 
		APPEND=32, INSERT=33, REMOVE=34, MODULO=35, TYPETHEN=36, FN=37, RETURN=38, 
		NUMBER=39, FLOAT=40, STRING=41, PUNTO=42, COMA=43, PTCOMA=44, DOSPUNTO=45, 
		DPUNTO2=46, ASIGNACION=47, MTHEN=48, GUIONB=49, ID=50, DISTINTO=51, IGUAL=52, 
		MAYORIGUAL=53, MENORIGUAL=54, MAYOR=55, MENOR=56, ASIG=57, MUL=58, DIV=59, 
		ADD=60, SUB=61, MOD=62, AND=63, OR=64, NOT=65, INTERROG=66, AMP=67, INOUT=68, 
		PARIZQ=69, PARDER=70, LLAVEIZQ=71, LLAVEDER=72, CORIZQ=73, CORDER=74, 
		CHAR=75, WHITESPACE=76, L_COMMENT=77, COMMENT=78;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", "T_CHAT", 
			"T_ARRAY", "T_VECTOR", "USIZE", "IF", "ELSE", "WHILE", "FOR", "IN", "BREAK", 
			"CONTINUE", "SWITCH", "MTOR", "CASE", "DEFAULT", "TRUE", "FALSE", "AS", 
			"AT", "LET", "MUT", "STRUCT", "COUNT", "NEW", "CAPF", "APPEND", "INSERT", 
			"REMOVE", "MODULO", "TYPETHEN", "FN", "RETURN", "NUMBER", "FLOAT", "STRING", 
			"PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", "ASIGNACION", "MTHEN", 
			"GUIONB", "ID", "DISTINTO", "IGUAL", "MAYORIGUAL", "MENORIGUAL", "MAYOR", 
			"MENOR", "ASIG", "MUL", "DIV", "ADD", "SUB", "MOD", "AND", "OR", "NOT", 
			"INTERROG", "AMP", "INOUT", "PARIZQ", "PARDER", "LLAVEIZQ", "LLAVEDER", 
			"CORIZQ", "CORDER", "CHAR", "WHITESPACE", "L_COMMENT", "COMMENT", "ESC_SEQ"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'Int'", "'Float'", "'String'", "'Bool'", "' String'", 
			"'Character'", "'array'", "'Vector'", "'usize'", "'if'", "'else'", "'while'", 
			"'for'", "'in'", "'break'", "'continue'", "'switch'", "'|'", "'case'", 
			"'default'", "'true'", "'false'", "'as'", "'at'", "'let'", "'var'", "'struct'", 
			"'count'", "'new()'", "'capacity()'", "'append'", "'insert'", "'remove'", 
			"'mod'", "'->'", "'func'", "'return'", null, null, null, "'.'", "','", 
			"';'", "'::'", "':'", "'='", "'=>'", "'_'", null, "'!='", "'=='", "'>='", 
			"'<='", "'>'", "'<'", "'+='", "'*'", "'/'", "'+'", "'-'", "'%'", "'&&'", 
			"'||'", "'!'", "'?'", "'&'", "'inout'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT_CON", "T_NUMBER", "T_FLOAT", "T_STRING", "T_BOOL", "T_STR", 
			"T_CHAT", "T_ARRAY", "T_VECTOR", "USIZE", "IF", "ELSE", "WHILE", "FOR", 
			"IN", "BREAK", "CONTINUE", "SWITCH", "MTOR", "CASE", "DEFAULT", "TRUE", 
			"FALSE", "AS", "AT", "LET", "MUT", "STRUCT", "COUNT", "NEW", "CAPF", 
			"APPEND", "INSERT", "REMOVE", "MODULO", "TYPETHEN", "FN", "RETURN", "NUMBER", 
			"FLOAT", "STRING", "PUNTO", "COMA", "PTCOMA", "DOSPUNTO", "DPUNTO2", 
			"ASIGNACION", "MTHEN", "GUIONB", "ID", "DISTINTO", "IGUAL", "MAYORIGUAL", 
			"MENORIGUAL", "MAYOR", "MENOR", "ASIG", "MUL", "DIV", "ADD", "SUB", "MOD", 
			"AND", "OR", "NOT", "INTERROG", "AMP", "INOUT", "PARIZQ", "PARDER", "LLAVEIZQ", 
			"LLAVEDER", "CORIZQ", "CORDER", "CHAR", "WHITESPACE", "L_COMMENT", "COMMENT"
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


	public swiftlexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "swiftlexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u020f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3(\6(\u017d\n(\r(\16(\u017e\3)\6)\u0182\n)\r)\16)\u0183\3)\3)\6)"+
		"\u0188\n)\r)\16)\u0189\3*\3*\7*\u018e\n*\f*\16*\u0191\13*\3*\3*\3+\3+"+
		"\3,\3,\3-\3-\3.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\61\3\62\3\62\3\63\3"+
		"\63\7\63\u01a9\n\63\f\63\16\63\u01ac\13\63\3\64\3\64\3\64\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\39\39\3:\3:\3:\3;\3;\3<\3<\3="+
		"\3=\3>\3>\3?\3?\3@\3@\3@\3A\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3E\3E\3E\3E"+
		"\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3L\3L\3M\6M\u01ee\nM\rM\16"+
		"M\u01ef\3M\3M\3N\3N\3N\3N\7N\u01f8\nN\fN\16N\u01fb\13N\3N\3N\3O\3O\3O"+
		"\3O\7O\u0203\nO\fO\16O\u0206\13O\3O\3O\3O\3O\3O\3P\3P\3P\3\u0204\2Q\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9"+
		"q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008f"+
		"I\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f\2\3\2\f\3\2\62"+
		";\3\2\60\60\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\3\2))\5\2\62;C\\c|\6\2\13"+
		"\f\17\17\"\"^^\4\2\f\f\17\17\t\2\"#%%--/\60<<BB]_\2\u0215\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W"+
		"\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2"+
		"\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2"+
		"\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}"+
		"\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2"+
		"\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\3\u00a1\3\2\2\2\5\u00a7"+
		"\3\2\2\2\7\u00ab\3\2\2\2\t\u00b1\3\2\2\2\13\u00b8\3\2\2\2\r\u00bd\3\2"+
		"\2\2\17\u00c5\3\2\2\2\21\u00cf\3\2\2\2\23\u00d5\3\2\2\2\25\u00dc\3\2\2"+
		"\2\27\u00e2\3\2\2\2\31\u00e5\3\2\2\2\33\u00ea\3\2\2\2\35\u00f0\3\2\2\2"+
		"\37\u00f4\3\2\2\2!\u00f7\3\2\2\2#\u00fd\3\2\2\2%\u0106\3\2\2\2\'\u010d"+
		"\3\2\2\2)\u010f\3\2\2\2+\u0114\3\2\2\2-\u011c\3\2\2\2/\u0121\3\2\2\2\61"+
		"\u0127\3\2\2\2\63\u012a\3\2\2\2\65\u012d\3\2\2\2\67\u0131\3\2\2\29\u0135"+
		"\3\2\2\2;\u013c\3\2\2\2=\u0142\3\2\2\2?\u0148\3\2\2\2A\u0153\3\2\2\2C"+
		"\u015a\3\2\2\2E\u0161\3\2\2\2G\u0168\3\2\2\2I\u016c\3\2\2\2K\u016f\3\2"+
		"\2\2M\u0174\3\2\2\2O\u017c\3\2\2\2Q\u0181\3\2\2\2S\u018b\3\2\2\2U\u0194"+
		"\3\2\2\2W\u0196\3\2\2\2Y\u0198\3\2\2\2[\u019a\3\2\2\2]\u019d\3\2\2\2_"+
		"\u019f\3\2\2\2a\u01a1\3\2\2\2c\u01a4\3\2\2\2e\u01a6\3\2\2\2g\u01ad\3\2"+
		"\2\2i\u01b0\3\2\2\2k\u01b3\3\2\2\2m\u01b6\3\2\2\2o\u01b9\3\2\2\2q\u01bb"+
		"\3\2\2\2s\u01bd\3\2\2\2u\u01c0\3\2\2\2w\u01c2\3\2\2\2y\u01c4\3\2\2\2{"+
		"\u01c6\3\2\2\2}\u01c8\3\2\2\2\177\u01ca\3\2\2\2\u0081\u01cd\3\2\2\2\u0083"+
		"\u01d0\3\2\2\2\u0085\u01d2\3\2\2\2\u0087\u01d4\3\2\2\2\u0089\u01d6\3\2"+
		"\2\2\u008b\u01dc\3\2\2\2\u008d\u01de\3\2\2\2\u008f\u01e0\3\2\2\2\u0091"+
		"\u01e2\3\2\2\2\u0093\u01e4\3\2\2\2\u0095\u01e6\3\2\2\2\u0097\u01e8\3\2"+
		"\2\2\u0099\u01ed\3\2\2\2\u009b\u01f3\3\2\2\2\u009d\u01fe\3\2\2\2\u009f"+
		"\u020c\3\2\2\2\u00a1\u00a2\7r\2\2\u00a2\u00a3\7t\2\2\u00a3\u00a4\7k\2"+
		"\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7v\2\2\u00a6\4\3\2\2\2\u00a7\u00a8\7"+
		"K\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7v\2\2\u00aa\6\3\2\2\2\u00ab\u00ac"+
		"\7H\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7q\2\2\u00ae\u00af\7c\2\2\u00af"+
		"\u00b0\7v\2\2\u00b0\b\3\2\2\2\u00b1\u00b2\7U\2\2\u00b2\u00b3\7v\2\2\u00b3"+
		"\u00b4\7t\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7p\2\2\u00b6\u00b7\7i\2\2"+
		"\u00b7\n\3\2\2\2\u00b8\u00b9\7D\2\2\u00b9\u00ba\7q\2\2\u00ba\u00bb\7q"+
		"\2\2\u00bb\u00bc\7n\2\2\u00bc\f\3\2\2\2\u00bd\u00be\7\"\2\2\u00be\u00bf"+
		"\7U\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7t\2\2\u00c1\u00c2\7k\2\2\u00c2"+
		"\u00c3\7p\2\2\u00c3\u00c4\7i\2\2\u00c4\16\3\2\2\2\u00c5\u00c6\7E\2\2\u00c6"+
		"\u00c7\7j\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7c\2\2"+
		"\u00ca\u00cb\7e\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce"+
		"\7t\2\2\u00ce\20\3\2\2\2\u00cf\u00d0\7c\2\2\u00d0\u00d1\7t\2\2\u00d1\u00d2"+
		"\7t\2\2\u00d2\u00d3\7c\2\2\u00d3\u00d4\7{\2\2\u00d4\22\3\2\2\2\u00d5\u00d6"+
		"\7X\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7e\2\2\u00d8\u00d9\7v\2\2\u00d9"+
		"\u00da\7q\2\2\u00da\u00db\7t\2\2\u00db\24\3\2\2\2\u00dc\u00dd\7w\2\2\u00dd"+
		"\u00de\7u\2\2\u00de\u00df\7k\2\2\u00df\u00e0\7|\2\2\u00e0\u00e1\7g\2\2"+
		"\u00e1\26\3\2\2\2\u00e2\u00e3\7k\2\2\u00e3\u00e4\7h\2\2\u00e4\30\3\2\2"+
		"\2\u00e5\u00e6\7g\2\2\u00e6\u00e7\7n\2\2\u00e7\u00e8\7u\2\2\u00e8\u00e9"+
		"\7g\2\2\u00e9\32\3\2\2\2\u00ea\u00eb\7y\2\2\u00eb\u00ec\7j\2\2\u00ec\u00ed"+
		"\7k\2\2\u00ed\u00ee\7n\2\2\u00ee\u00ef\7g\2\2\u00ef\34\3\2\2\2\u00f0\u00f1"+
		"\7h\2\2\u00f1\u00f2\7q\2\2\u00f2\u00f3\7t\2\2\u00f3\36\3\2\2\2\u00f4\u00f5"+
		"\7k\2\2\u00f5\u00f6\7p\2\2\u00f6 \3\2\2\2\u00f7\u00f8\7d\2\2\u00f8\u00f9"+
		"\7t\2\2\u00f9\u00fa\7g\2\2\u00fa\u00fb\7c\2\2\u00fb\u00fc\7m\2\2\u00fc"+
		"\"\3\2\2\2\u00fd\u00fe\7e\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7p\2\2\u0100"+
		"\u0101\7v\2\2\u0101\u0102\7k\2\2\u0102\u0103\7p\2\2\u0103\u0104\7w\2\2"+
		"\u0104\u0105\7g\2\2\u0105$\3\2\2\2\u0106\u0107\7u\2\2\u0107\u0108\7y\2"+
		"\2\u0108\u0109\7k\2\2\u0109\u010a\7v\2\2\u010a\u010b\7e\2\2\u010b\u010c"+
		"\7j\2\2\u010c&\3\2\2\2\u010d\u010e\7~\2\2\u010e(\3\2\2\2\u010f\u0110\7"+
		"e\2\2\u0110\u0111\7c\2\2\u0111\u0112\7u\2\2\u0112\u0113\7g\2\2\u0113*"+
		"\3\2\2\2\u0114\u0115\7f\2\2\u0115\u0116\7g\2\2\u0116\u0117\7h\2\2\u0117"+
		"\u0118\7c\2\2\u0118\u0119\7w\2\2\u0119\u011a\7n\2\2\u011a\u011b\7v\2\2"+
		"\u011b,\3\2\2\2\u011c\u011d\7v\2\2\u011d\u011e\7t\2\2\u011e\u011f\7w\2"+
		"\2\u011f\u0120\7g\2\2\u0120.\3\2\2\2\u0121\u0122\7h\2\2\u0122\u0123\7"+
		"c\2\2\u0123\u0124\7n\2\2\u0124\u0125\7u\2\2\u0125\u0126\7g\2\2\u0126\60"+
		"\3\2\2\2\u0127\u0128\7c\2\2\u0128\u0129\7u\2\2\u0129\62\3\2\2\2\u012a"+
		"\u012b\7c\2\2\u012b\u012c\7v\2\2\u012c\64\3\2\2\2\u012d\u012e\7n\2\2\u012e"+
		"\u012f\7g\2\2\u012f\u0130\7v\2\2\u0130\66\3\2\2\2\u0131\u0132\7x\2\2\u0132"+
		"\u0133\7c\2\2\u0133\u0134\7t\2\2\u01348\3\2\2\2\u0135\u0136\7u\2\2\u0136"+
		"\u0137\7v\2\2\u0137\u0138\7t\2\2\u0138\u0139\7w\2\2\u0139\u013a\7e\2\2"+
		"\u013a\u013b\7v\2\2\u013b:\3\2\2\2\u013c\u013d\7e\2\2\u013d\u013e\7q\2"+
		"\2\u013e\u013f\7w\2\2\u013f\u0140\7p\2\2\u0140\u0141\7v\2\2\u0141<\3\2"+
		"\2\2\u0142\u0143\7p\2\2\u0143\u0144\7g\2\2\u0144\u0145\7y\2\2\u0145\u0146"+
		"\7*\2\2\u0146\u0147\7+\2\2\u0147>\3\2\2\2\u0148\u0149\7e\2\2\u0149\u014a"+
		"\7c\2\2\u014a\u014b\7r\2\2\u014b\u014c\7c\2\2\u014c\u014d\7e\2\2\u014d"+
		"\u014e\7k\2\2\u014e\u014f\7v\2\2\u014f\u0150\7{\2\2\u0150\u0151\7*\2\2"+
		"\u0151\u0152\7+\2\2\u0152@\3\2\2\2\u0153\u0154\7c\2\2\u0154\u0155\7r\2"+
		"\2\u0155\u0156\7r\2\2\u0156\u0157\7g\2\2\u0157\u0158\7p\2\2\u0158\u0159"+
		"\7f\2\2\u0159B\3\2\2\2\u015a\u015b\7k\2\2\u015b\u015c\7p\2\2\u015c\u015d"+
		"\7u\2\2\u015d\u015e\7g\2\2\u015e\u015f\7t\2\2\u015f\u0160\7v\2\2\u0160"+
		"D\3\2\2\2\u0161\u0162\7t\2\2\u0162\u0163\7g\2\2\u0163\u0164\7o\2\2\u0164"+
		"\u0165\7q\2\2\u0165\u0166\7x\2\2\u0166\u0167\7g\2\2\u0167F\3\2\2\2\u0168"+
		"\u0169\7o\2\2\u0169\u016a\7q\2\2\u016a\u016b\7f\2\2\u016bH\3\2\2\2\u016c"+
		"\u016d\7/\2\2\u016d\u016e\7@\2\2\u016eJ\3\2\2\2\u016f\u0170\7h\2\2\u0170"+
		"\u0171\7w\2\2\u0171\u0172\7p\2\2\u0172\u0173\7e\2\2\u0173L\3\2\2\2\u0174"+
		"\u0175\7t\2\2\u0175\u0176\7g\2\2\u0176\u0177\7v\2\2\u0177\u0178\7w\2\2"+
		"\u0178\u0179\7t\2\2\u0179\u017a\7p\2\2\u017aN\3\2\2\2\u017b\u017d\t\2"+
		"\2\2\u017c\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017c\3\2\2\2\u017e"+
		"\u017f\3\2\2\2\u017fP\3\2\2\2\u0180\u0182\t\2\2\2\u0181\u0180\3\2\2\2"+
		"\u0182\u0183\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0185\u0187\t\3\2\2\u0186\u0188\t\2\2\2\u0187\u0186\3\2\2\2\u0188"+
		"\u0189\3\2\2\2\u0189\u0187\3\2\2\2\u0189\u018a\3\2\2\2\u018aR\3\2\2\2"+
		"\u018b\u018f\7$\2\2\u018c\u018e\n\4\2\2\u018d\u018c\3\2\2\2\u018e\u0191"+
		"\3\2\2\2\u018f\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0192\3\2\2\2\u0191"+
		"\u018f\3\2\2\2\u0192\u0193\7$\2\2\u0193T\3\2\2\2\u0194\u0195\7\60\2\2"+
		"\u0195V\3\2\2\2\u0196\u0197\7.\2\2\u0197X\3\2\2\2\u0198\u0199\7=\2\2\u0199"+
		"Z\3\2\2\2\u019a\u019b\7<\2\2\u019b\u019c\7<\2\2\u019c\\\3\2\2\2\u019d"+
		"\u019e\7<\2\2\u019e^\3\2\2\2\u019f\u01a0\7?\2\2\u01a0`\3\2\2\2\u01a1\u01a2"+
		"\7?\2\2\u01a2\u01a3\7@\2\2\u01a3b\3\2\2\2\u01a4\u01a5\7a\2\2\u01a5d\3"+
		"\2\2\2\u01a6\u01aa\t\5\2\2\u01a7\u01a9\t\6\2\2\u01a8\u01a7\3\2\2\2\u01a9"+
		"\u01ac\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01abf\3\2\2\2"+
		"\u01ac\u01aa\3\2\2\2\u01ad\u01ae\7#\2\2\u01ae\u01af\7?\2\2\u01afh\3\2"+
		"\2\2\u01b0\u01b1\7?\2\2\u01b1\u01b2\7?\2\2\u01b2j\3\2\2\2\u01b3\u01b4"+
		"\7@\2\2\u01b4\u01b5\7?\2\2\u01b5l\3\2\2\2\u01b6\u01b7\7>\2\2\u01b7\u01b8"+
		"\7?\2\2\u01b8n\3\2\2\2\u01b9\u01ba\7@\2\2\u01bap\3\2\2\2\u01bb\u01bc\7"+
		">\2\2\u01bcr\3\2\2\2\u01bd\u01be\7-\2\2\u01be\u01bf\7?\2\2\u01bft\3\2"+
		"\2\2\u01c0\u01c1\7,\2\2\u01c1v\3\2\2\2\u01c2\u01c3\7\61\2\2\u01c3x\3\2"+
		"\2\2\u01c4\u01c5\7-\2\2\u01c5z\3\2\2\2\u01c6\u01c7\7/\2\2\u01c7|\3\2\2"+
		"\2\u01c8\u01c9\7\'\2\2\u01c9~\3\2\2\2\u01ca\u01cb\7(\2\2\u01cb\u01cc\7"+
		"(\2\2\u01cc\u0080\3\2\2\2\u01cd\u01ce\7~\2\2\u01ce\u01cf\7~\2\2\u01cf"+
		"\u0082\3\2\2\2\u01d0\u01d1\7#\2\2\u01d1\u0084\3\2\2\2\u01d2\u01d3\7A\2"+
		"\2\u01d3\u0086\3\2\2\2\u01d4\u01d5\7(\2\2\u01d5\u0088\3\2\2\2\u01d6\u01d7"+
		"\7k\2\2\u01d7\u01d8\7p\2\2\u01d8\u01d9\7q\2\2\u01d9\u01da\7w\2\2\u01da"+
		"\u01db\7v\2\2\u01db\u008a\3\2\2\2\u01dc\u01dd\7*\2\2\u01dd\u008c\3\2\2"+
		"\2\u01de\u01df\7+\2\2\u01df\u008e\3\2\2\2\u01e0\u01e1\7}\2\2\u01e1\u0090"+
		"\3\2\2\2\u01e2\u01e3\7\177\2\2\u01e3\u0092\3\2\2\2\u01e4\u01e5\7]\2\2"+
		"\u01e5\u0094\3\2\2\2\u01e6\u01e7\7_\2\2\u01e7\u0096\3\2\2\2\u01e8\u01e9"+
		"\t\7\2\2\u01e9\u01ea\t\b\2\2\u01ea\u01eb\t\7\2\2\u01eb\u0098\3\2\2\2\u01ec"+
		"\u01ee\t\t\2\2\u01ed\u01ec\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01ed\3\2"+
		"\2\2\u01ef\u01f0\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\bM\2\2\u01f2"+
		"\u009a\3\2\2\2\u01f3\u01f4\7\61\2\2\u01f4\u01f5\7\61\2\2\u01f5\u01f9\3"+
		"\2\2\2\u01f6\u01f8\n\n\2\2\u01f7\u01f6\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f9\3\2"+
		"\2\2\u01fc\u01fd\bN\2\2\u01fd\u009c\3\2\2\2\u01fe\u01ff\7\61\2\2\u01ff"+
		"\u0200\7,\2\2\u0200\u0204\3\2\2\2\u0201\u0203\13\2\2\2\u0202\u0201\3\2"+
		"\2\2\u0203\u0206\3\2\2\2\u0204\u0205\3\2\2\2\u0204\u0202\3\2\2\2\u0205"+
		"\u0207\3\2\2\2\u0206\u0204\3\2\2\2\u0207\u0208\7,\2\2\u0208\u0209\7\61"+
		"\2\2\u0209\u020a\3\2\2\2\u020a\u020b\bO\2\2\u020b\u009e\3\2\2\2\u020c"+
		"\u020d\7^\2\2\u020d\u020e\t\13\2\2\u020e\u00a0\3\2\2\2\13\2\u017e\u0183"+
		"\u0189\u018f\u01aa\u01ef\u01f9\u0204\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
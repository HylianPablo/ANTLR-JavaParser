// Generated from Method.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MethodLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, STATIC=2, VOID=3, STRING=4, ARGS=5, MAIN=6, CLASS=7, OB=8, CB=9, 
		OP=10, CP=11, OC=12, CC=13, SC=14, WORD=15, SPACE=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PUBLIC", "STATIC", "VOID", "STRING", "ARGS", "MAIN", "CLASS", "OB", 
			"CB", "OP", "CP", "OC", "CC", "SC", "WORD", "SPACE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'static'", "'void'", "'String'", "'args'", "'main'", 
			"'class'", "'{'", "'}'", "'('", "')'", "'['", "']'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "STATIC", "VOID", "STRING", "ARGS", "MAIN", "CLASS", 
			"OB", "CB", "OP", "CP", "OC", "CC", "SC", "WORD", "SPACE"
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


	public MethodLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Method.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22d\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\6\20]\n\20\r\20\16\20^\3\21\3\21\3\21\3\21\2\2\22\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22\3\2\4\7\2$$*+\60\60C\\c|\5\2\13\f\17\17\"\"\2d\2\3\3\2\2\2\2\5\3"+
		"\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2"+
		"\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3"+
		"\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5*\3\2\2\2\7\61"+
		"\3\2\2\2\t\66\3\2\2\2\13=\3\2\2\2\rB\3\2\2\2\17G\3\2\2\2\21M\3\2\2\2\23"+
		"O\3\2\2\2\25Q\3\2\2\2\27S\3\2\2\2\31U\3\2\2\2\33W\3\2\2\2\35Y\3\2\2\2"+
		"\37\\\3\2\2\2!`\3\2\2\2#$\7r\2\2$%\7w\2\2%&\7d\2\2&\'\7n\2\2\'(\7k\2\2"+
		"()\7e\2\2)\4\3\2\2\2*+\7u\2\2+,\7v\2\2,-\7c\2\2-.\7v\2\2./\7k\2\2/\60"+
		"\7e\2\2\60\6\3\2\2\2\61\62\7x\2\2\62\63\7q\2\2\63\64\7k\2\2\64\65\7f\2"+
		"\2\65\b\3\2\2\2\66\67\7U\2\2\678\7v\2\289\7t\2\29:\7k\2\2:;\7p\2\2;<\7"+
		"i\2\2<\n\3\2\2\2=>\7c\2\2>?\7t\2\2?@\7i\2\2@A\7u\2\2A\f\3\2\2\2BC\7o\2"+
		"\2CD\7c\2\2DE\7k\2\2EF\7p\2\2F\16\3\2\2\2GH\7e\2\2HI\7n\2\2IJ\7c\2\2J"+
		"K\7u\2\2KL\7u\2\2L\20\3\2\2\2MN\7}\2\2N\22\3\2\2\2OP\7\177\2\2P\24\3\2"+
		"\2\2QR\7*\2\2R\26\3\2\2\2ST\7+\2\2T\30\3\2\2\2UV\7]\2\2V\32\3\2\2\2WX"+
		"\7_\2\2X\34\3\2\2\2YZ\7=\2\2Z\36\3\2\2\2[]\t\2\2\2\\[\3\2\2\2]^\3\2\2"+
		"\2^\\\3\2\2\2^_\3\2\2\2_ \3\2\2\2`a\t\3\2\2ab\3\2\2\2bc\b\21\2\2c\"\3"+
		"\2\2\2\5\2\\^\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
package es.uva.inf.tfg;
// Generated from Method.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MethodParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, STATIC=2, VOID=3, STRING=4, ARGS=5, MAIN=6, CLASS=7, OB=8, CB=9, 
		OP=10, CP=11, OC=12, CC=13, SC=14, WORD=15, SPACE=16;
	public static final int
		RULE_init = 0, RULE_method = 1, RULE_mainheader = 2, RULE_sentence = 3, 
		RULE_word = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "method", "mainheader", "sentence", "word"
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

	@Override
	public String getGrammarFileName() { return "Method.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MethodParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InitContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(MethodParser.PUBLIC, 0); }
		public TerminalNode CLASS() { return getToken(MethodParser.CLASS, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode OB() { return getToken(MethodParser.OB, 0); }
		public MethodContext method() {
			return getRuleContext(MethodContext.class,0);
		}
		public TerminalNode CB() { return getToken(MethodParser.CB, 0); }
		public TerminalNode EOF() { return getToken(MethodParser.EOF, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MethodListener ) ((MethodListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MethodListener ) ((MethodListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MethodVisitor ) return ((MethodVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(PUBLIC);
			setState(11);
			match(CLASS);
			setState(12);
			word();
			setState(13);
			match(OB);
			setState(14);
			method();
			setState(15);
			match(CB);
			setState(16);
			match(EOF);
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

	public static class MethodContext extends ParserRuleContext {
		public MainheaderContext mainheader() {
			return getRuleContext(MainheaderContext.class,0);
		}
		public TerminalNode OB() { return getToken(MethodParser.OB, 0); }
		public TerminalNode CB() { return getToken(MethodParser.CB, 0); }
		public List<SentenceContext> sentence() {
			return getRuleContexts(SentenceContext.class);
		}
		public SentenceContext sentence(int i) {
			return getRuleContext(SentenceContext.class,i);
		}
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MethodListener ) ((MethodListener)listener).enterMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MethodListener ) ((MethodListener)listener).exitMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MethodVisitor ) return ((MethodVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			mainheader();
			setState(19);
			match(OB);
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				sentence();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(25);
			match(CB);
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

	public static class MainheaderContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(MethodParser.PUBLIC, 0); }
		public TerminalNode STATIC() { return getToken(MethodParser.STATIC, 0); }
		public TerminalNode VOID() { return getToken(MethodParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(MethodParser.MAIN, 0); }
		public TerminalNode OP() { return getToken(MethodParser.OP, 0); }
		public TerminalNode STRING() { return getToken(MethodParser.STRING, 0); }
		public TerminalNode ARGS() { return getToken(MethodParser.ARGS, 0); }
		public TerminalNode OC() { return getToken(MethodParser.OC, 0); }
		public TerminalNode CC() { return getToken(MethodParser.CC, 0); }
		public TerminalNode CP() { return getToken(MethodParser.CP, 0); }
		public MainheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainheader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MethodListener ) ((MethodListener)listener).enterMainheader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MethodListener ) ((MethodListener)listener).exitMainheader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MethodVisitor ) return ((MethodVisitor<? extends T>)visitor).visitMainheader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainheaderContext mainheader() throws RecognitionException {
		MainheaderContext _localctx = new MainheaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainheader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(PUBLIC);
			setState(28);
			match(STATIC);
			setState(29);
			match(VOID);
			setState(30);
			match(MAIN);
			setState(31);
			match(OP);
			setState(32);
			match(STRING);
			setState(33);
			match(ARGS);
			setState(34);
			match(OC);
			setState(35);
			match(CC);
			setState(36);
			match(CP);
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

	public static class SentenceContext extends ParserRuleContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode SC() { return getToken(MethodParser.SC, 0); }
		public SentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MethodListener ) ((MethodListener)listener).enterSentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MethodListener ) ((MethodListener)listener).exitSentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MethodVisitor ) return ((MethodVisitor<? extends T>)visitor).visitSentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenceContext sentence() throws RecognitionException {
		SentenceContext _localctx = new SentenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			word();
			setState(39);
			match(SC);
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

	public static class WordContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(MethodParser.WORD, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MethodListener ) ((MethodListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MethodListener ) ((MethodListener)listener).exitWord(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MethodVisitor ) return ((MethodVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			match(WORD);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22.\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\6\3\30\n\3\r\3\16\3\31\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\2\2\7\2\4\6\b\n\2\2\2)\2\f\3\2\2\2\4\24"+
		"\3\2\2\2\6\35\3\2\2\2\b(\3\2\2\2\n+\3\2\2\2\f\r\7\3\2\2\r\16\7\t\2\2\16"+
		"\17\5\n\6\2\17\20\7\n\2\2\20\21\5\4\3\2\21\22\7\13\2\2\22\23\7\2\2\3\23"+
		"\3\3\2\2\2\24\25\5\6\4\2\25\27\7\n\2\2\26\30\5\b\5\2\27\26\3\2\2\2\30"+
		"\31\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\33\3\2\2\2\33\34\7\13\2\2\34"+
		"\5\3\2\2\2\35\36\7\3\2\2\36\37\7\4\2\2\37 \7\5\2\2 !\7\b\2\2!\"\7\f\2"+
		"\2\"#\7\6\2\2#$\7\7\2\2$%\7\16\2\2%&\7\17\2\2&\'\7\r\2\2\'\7\3\2\2\2("+
		")\5\n\6\2)*\7\20\2\2*\t\3\2\2\2+,\7\21\2\2,\13\3\2\2\2\3\31";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
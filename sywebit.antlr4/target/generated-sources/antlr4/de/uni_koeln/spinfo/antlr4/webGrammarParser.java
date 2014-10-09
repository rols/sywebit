// Generated from de\u005Cuni_koeln\spinfo\antlr4\webGrammar.g4 by ANTLR 4.2.2
package de.uni_koeln.spinfo.antlr4;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class webGrammarParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NN=5, PAR=11, PRON=1, ADJ=6, PREP=2, DOT=12, INT=4, STEM=9, VERBTYPE=3, 
		ADV=7, LINEBREAK=8, WS=10, EXCLAM=13;
	public static final String[] tokenNames = {
		"<INVALID>", "' pron'", "' prep.'", "VERBTYPE", "' interj'", "NN", "' adj'", 
		"' adv'", "LINEBREAK", "STEM", "WS", "PAR", "'.'", "'!'"
	};
	public static final int
		RULE_startSymb = 0, RULE_error = 1, RULE_qs = 2, RULE_qsLemma = 3, RULE_pos = 4, 
		RULE_verb = 5, RULE_verbstamm = 6, RULE_stem = 7, RULE_konjugation = 8, 
		RULE_nomen = 9, RULE_alternat = 10, RULE_endEntry = 11;
	public static final String[] ruleNames = {
		"startSymb", "error", "qs", "qsLemma", "pos", "verb", "verbstamm", "stem", 
		"konjugation", "nomen", "alternat", "endEntry"
	};

	@Override
	public String getGrammarFileName() { return "webGrammar.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public webGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartSymbContext extends ParserRuleContext {
		public QsContext qs() {
			return getRuleContext(QsContext.class,0);
		}
		public EndEntryContext endEntry() {
			return getRuleContext(EndEntryContext.class,0);
		}
		public StartSymbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startSymb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).enterStartSymb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).exitStartSymb(this);
		}
	}

	public final StartSymbContext startSymb() throws RecognitionException {
		StartSymbContext _localctx = new StartSymbContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_startSymb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); qs();
			setState(25); endEntry();
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

	public static class ErrorContext extends ParserRuleContext {
		public EndEntryContext endEntry() {
			return getRuleContext(EndEntryContext.class,0);
		}
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).exitError(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=1 && _alt!=ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(27);
					matchWildcard();
					}
					} 
				}
				setState(32);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(33); endEntry();
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

	public static class QsContext extends ParserRuleContext {
		public QsLemmaContext qsLemma() {
			return getRuleContext(QsLemmaContext.class,0);
		}
		public QsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).enterQs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).exitQs(this);
		}
	}

	public final QsContext qs() throws RecognitionException {
		QsContext _localctx = new QsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_qs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); qsLemma();
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

	public static class QsLemmaContext extends ParserRuleContext {
		public AlternatContext alternat() {
			return getRuleContext(AlternatContext.class,0);
		}
		public NomenContext nomen() {
			return getRuleContext(NomenContext.class,0);
		}
		public VerbContext verb() {
			return getRuleContext(VerbContext.class,0);
		}
		public QsLemmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qsLemma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).enterQsLemma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).exitQsLemma(this);
		}
	}

	public final QsLemmaContext qsLemma() throws RecognitionException {
		QsLemmaContext _localctx = new QsLemmaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_qsLemma);
		try {
			setState(40);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(37); verb();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38); nomen();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(39); alternat();
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

	public static class PosContext extends ParserRuleContext {
		public TerminalNode PREP() { return getToken(webGrammarParser.PREP, 0); }
		public TerminalNode PRON() { return getToken(webGrammarParser.PRON, 0); }
		public TerminalNode ADV() { return getToken(webGrammarParser.ADV, 0); }
		public TerminalNode WS() { return getToken(webGrammarParser.WS, 0); }
		public TerminalNode NN() { return getToken(webGrammarParser.NN, 0); }
		public TerminalNode ADJ() { return getToken(webGrammarParser.ADJ, 0); }
		public TerminalNode INT() { return getToken(webGrammarParser.INT, 0); }
		public PosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).enterPos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).exitPos(this);
		}
	}

	public final PosContext pos() throws RecognitionException {
		PosContext _localctx = new PosContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRON) | (1L << PREP) | (1L << INT) | (1L << NN) | (1L << ADJ) | (1L << ADV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(44);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(43); match(WS);
				}
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

	public static class VerbContext extends ParserRuleContext {
		public TerminalNode VERBTYPE() { return getToken(webGrammarParser.VERBTYPE, 0); }
		public VerbstammContext verbstamm() {
			return getRuleContext(VerbstammContext.class,0);
		}
		public KonjugationContext konjugation() {
			return getRuleContext(KonjugationContext.class,0);
		}
		public VerbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verb; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).enterVerb(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).exitVerb(this);
		}
	}

	public final VerbContext verb() throws RecognitionException {
		VerbContext _localctx = new VerbContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_verb);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); verbstamm();
			setState(47); konjugation();
			setState(48); match(VERBTYPE);
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

	public static class VerbstammContext extends ParserRuleContext {
		public StemContext stem() {
			return getRuleContext(StemContext.class,0);
		}
		public VerbstammContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbstamm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).enterVerbstamm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).exitVerbstamm(this);
		}
	}

	public final VerbstammContext verbstamm() throws RecognitionException {
		VerbstammContext _localctx = new VerbstammContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_verbstamm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); stem();
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

	public static class StemContext extends ParserRuleContext {
		public TerminalNode STEM(int i) {
			return getToken(webGrammarParser.STEM, i);
		}
		public List<TerminalNode> STEM() { return getTokens(webGrammarParser.STEM); }
		public StemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).enterStem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).exitStem(this);
		}
	}

	public final StemContext stem() throws RecognitionException {
		StemContext _localctx = new StemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stem);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(52); match(STEM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(55); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=ATN.INVALID_ALT_NUMBER );
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

	public static class KonjugationContext extends ParserRuleContext {
		public TerminalNode STEM(int i) {
			return getToken(webGrammarParser.STEM, i);
		}
		public List<TerminalNode> STEM() { return getTokens(webGrammarParser.STEM); }
		public KonjugationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_konjugation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).enterKonjugation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).exitKonjugation(this);
		}
	}

	public final KonjugationContext konjugation() throws RecognitionException {
		KonjugationContext _localctx = new KonjugationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_konjugation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57); match(STEM);
			setState(58);
			if (!((_input.LT(-1).getText().equals("a")) || (_input.LT(-1).getText().equals("e"))
					|| (_input.LT(-1).getText().equals("i"))
					)) throw new FailedPredicateException(this, "(_input.LT(-1).getText().equals(\"a\")) || (_input.LT(-1).getText().equals(\"e\"))\r\n\t\t|| (_input.LT(-1).getText().equals(\"i\"))\r\n\t\t");
			setState(59); match(STEM);
			setState(60);
			if (!((_input.LT(-1).getText().equals("r")))) throw new FailedPredicateException(this, "(_input.LT(-1).getText().equals(\"r\"))");
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

	public static class NomenContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(webGrammarParser.WS, 0); }
		public TerminalNode NN() { return getToken(webGrammarParser.NN, 0); }
		public StemContext stem() {
			return getRuleContext(StemContext.class,0);
		}
		public NomenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nomen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).enterNomen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).exitNomen(this);
		}
	}

	public final NomenContext nomen() throws RecognitionException {
		NomenContext _localctx = new NomenContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nomen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62); stem();
			setState(63); match(NN);
			setState(65);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(64); match(WS);
				}
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

	public static class AlternatContext extends ParserRuleContext {
		public PosContext pos() {
			return getRuleContext(PosContext.class,0);
		}
		public StemContext stem() {
			return getRuleContext(StemContext.class,0);
		}
		public AlternatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alternat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).enterAlternat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).exitAlternat(this);
		}
	}

	public final AlternatContext alternat() throws RecognitionException {
		AlternatContext _localctx = new AlternatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_alternat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67); stem();
			setState(68); pos();
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

	public static class EndEntryContext extends ParserRuleContext {
		public TerminalNode LINEBREAK() { return getToken(webGrammarParser.LINEBREAK, 0); }
		public EndEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).enterEndEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).exitEndEntry(this);
		}
	}

	public final EndEntryContext endEntry() throws RecognitionException {
		EndEntryContext _localctx = new EndEntryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_endEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70); match(LINEBREAK);
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
		case 8: return konjugation_sempred((KonjugationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean konjugation_sempred(KonjugationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return (_input.LT(-1).getText().equals("a")) || (_input.LT(-1).getText().equals("e"))
				|| (_input.LT(-1).getText().equals("i"))
				;

		case 1: return (_input.LT(-1).getText().equals("r"));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17K\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\5\5+\n\5\3\6\3\6\5\6/\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\6\t8\n\t\r\t\16\t9\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5\13D\n\13\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3 \2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\3\4\2\3\4"+
		"\6\tD\2\32\3\2\2\2\4 \3\2\2\2\6%\3\2\2\2\b*\3\2\2\2\n,\3\2\2\2\f\60\3"+
		"\2\2\2\16\64\3\2\2\2\20\67\3\2\2\2\22;\3\2\2\2\24@\3\2\2\2\26E\3\2\2\2"+
		"\30H\3\2\2\2\32\33\5\6\4\2\33\34\5\30\r\2\34\3\3\2\2\2\35\37\13\2\2\2"+
		"\36\35\3\2\2\2\37\"\3\2\2\2 !\3\2\2\2 \36\3\2\2\2!#\3\2\2\2\" \3\2\2\2"+
		"#$\5\30\r\2$\5\3\2\2\2%&\5\b\5\2&\7\3\2\2\2\'+\5\f\7\2(+\5\24\13\2)+\5"+
		"\26\f\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2+\t\3\2\2\2,.\t\2\2\2-/\7\f\2\2"+
		".-\3\2\2\2./\3\2\2\2/\13\3\2\2\2\60\61\5\16\b\2\61\62\5\22\n\2\62\63\7"+
		"\5\2\2\63\r\3\2\2\2\64\65\5\20\t\2\65\17\3\2\2\2\668\7\13\2\2\67\66\3"+
		"\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\21\3\2\2\2;<\7\13\2\2<=\6\n\2"+
		"\2=>\7\13\2\2>?\6\n\3\2?\23\3\2\2\2@A\5\20\t\2AC\7\7\2\2BD\7\f\2\2CB\3"+
		"\2\2\2CD\3\2\2\2D\25\3\2\2\2EF\5\20\t\2FG\5\n\6\2G\27\3\2\2\2HI\7\n\2"+
		"\2I\31\3\2\2\2\7 *.9C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
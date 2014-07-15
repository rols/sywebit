// Generated from de/uni_koeln/spinfo/antlr4/webGrammar.g4 by ANTLR 4.2.2
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
		WORD=2, WS=3, PUNKT=1;
	public static final String[] tokenNames = {
		"<INVALID>", "'.'", "WORD", "WS"
	};
	public static final int
		RULE_startSymb = 0, RULE_dot = 1, RULE_word = 2;
	public static final String[] ruleNames = {
		"startSymb", "dot", "word"
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
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public DotContext dot() {
			return getRuleContext(DotContext.class,0);
		}
		public TerminalNode EOF() { return getToken(webGrammarParser.EOF, 0); }
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(6); word();
				}
				}
				setState(9); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			setState(11); dot();
			setState(12); match(EOF);
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

	public static class DotContext extends ParserRuleContext {
		public TerminalNode PUNKT() { return getToken(webGrammarParser.PUNKT, 0); }
		public DotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).enterDot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).exitDot(this);
		}
	}

	public final DotContext dot() throws RecognitionException {
		DotContext _localctx = new DotContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dot);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14); match(PUNKT);
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
		public TerminalNode WORD() { return getToken(webGrammarParser.WORD, 0); }
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).enterWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof webGrammarListener ) ((webGrammarListener)listener).exitWord(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		WordContext _localctx = new WordContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_word);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); match(WORD);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\5\25\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\3\2\6\2\n\n\2\r\2\16\2\13\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4"+
		"\2\2\5\2\4\6\2\2\22\2\t\3\2\2\2\4\20\3\2\2\2\6\22\3\2\2\2\b\n\5\6\4\2"+
		"\t\b\3\2\2\2\n\13\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\r\3\2\2\2\r\16\5"+
		"\4\3\2\16\17\7\2\2\3\17\3\3\2\2\2\20\21\7\3\2\2\21\5\3\2\2\2\22\23\7\4"+
		"\2\2\23\7\3\2\2\2\3\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
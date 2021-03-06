// Generated from de\u005Cuni_koeln\spinfo\antlr4\webGrammarLexer.g4 by ANTLR 4.2.2
package de.uni_koeln.spinfo.antlr4;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class webGrammarLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRON=1, PREP=2, VERBTYPE=3, INT=4, NN=5, ADJ=6, ADV=7, LINEBREAK=8, STEM=9, 
		WS=10, PAR=11, DOT=12, EXCLAM=13;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"' pron'", "' prep.'", "VERBTYPE", "' interj'", "NN", "' adj'", "' adv'", 
		"LINEBREAK", "STEM", "WS", "PAR", "'.'", "'!'"
	};
	public static final String[] ruleNames = {
		"PRON", "PREP", "VERBTYPE", "INT", "NN", "ADJ", "ADV", "LINEBREAK", "STEM", 
		"WS", "PAR", "DOT", "EXCLAM"
	};


	public webGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "webGrammarLexer.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\17n\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\48"+
		"\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6F\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\5\tS\n\t\3\t\3\t\5\tW\n\t\3\n\3\n"+
		"\3\13\6\13\\\n\13\r\13\16\13]\3\f\3\f\7\fb\n\f\f\f\16\fe\13\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3c\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\3\2\3\5\2\13\13\16\17\"\"t\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\3\35\3\2\2\2\5#\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13E\3\2\2"+
		"\2\rG\3\2\2\2\17L\3\2\2\2\21V\3\2\2\2\23X\3\2\2\2\25[\3\2\2\2\27_\3\2"+
		"\2\2\31j\3\2\2\2\33l\3\2\2\2\35\36\7\"\2\2\36\37\7r\2\2\37 \7t\2\2 !\7"+
		"q\2\2!\"\7p\2\2\"\4\3\2\2\2#$\7\"\2\2$%\7r\2\2%&\7t\2\2&\'\7g\2\2\'(\7"+
		"r\2\2()\7\60\2\2)\6\3\2\2\2*+\7\"\2\2+,\7v\2\2,8\7t\2\2-.\7\"\2\2./\7"+
		"k\2\2/\60\7p\2\2\60\61\7v\2\2\618\7t\2\2\62\63\7\"\2\2\63\64\7t\2\2\64"+
		"\65\7g\2\2\65\66\7h\2\2\668\7n\2\2\67*\3\2\2\2\67-\3\2\2\2\67\62\3\2\2"+
		"\28\b\3\2\2\29:\7\"\2\2:;\7k\2\2;<\7p\2\2<=\7v\2\2=>\7g\2\2>?\7t\2\2?"+
		"@\7l\2\2@\n\3\2\2\2AB\7\"\2\2BF\7o\2\2CD\7\"\2\2DF\7h\2\2EA\3\2\2\2EC"+
		"\3\2\2\2F\f\3\2\2\2GH\7\"\2\2HI\7c\2\2IJ\7f\2\2JK\7l\2\2K\16\3\2\2\2L"+
		"M\7\"\2\2MN\7c\2\2NO\7f\2\2OP\7x\2\2P\20\3\2\2\2QS\7\17\2\2RQ\3\2\2\2"+
		"RS\3\2\2\2ST\3\2\2\2TW\7\f\2\2UW\7\17\2\2VR\3\2\2\2VU\3\2\2\2W\22\3\2"+
		"\2\2XY\4c|\2Y\24\3\2\2\2Z\\\t\2\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3"+
		"\2\2\2^\26\3\2\2\2_c\7*\2\2`b\13\2\2\2a`\3\2\2\2be\3\2\2\2cd\3\2\2\2c"+
		"a\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7+\2\2gh\3\2\2\2hi\b\f\2\2i\30\3\2\2\2"+
		"jk\7\60\2\2k\32\3\2\2\2lm\7#\2\2m\34\3\2\2\2\t\2\67ERV]c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
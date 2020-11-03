// Generated from /Users/rahulprajapati/Google Drive/CSCE Courses/CSCE 322/Homework/1/startercode/part2/csce322hmwrk01prt02.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322hmwrk01prt02Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECTION_BEGIN=1, SECTION_END=2, SECTION_TYPE=3, VALUE_ASSIGNMENT=4, VALUE_SEPERATOR=5, 
		PUZZLE_VALUE=6, MOVES=7, ROW_SEPERATOR=8, BOARD_BEGIN=9, BOARD_END=10, 
		LIST_BEGIN=11, LIST_END=12, WS=13, ERROR=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SECTION_BEGIN", "SECTION_END", "SECTION_TYPE", "VALUE_ASSIGNMENT", "VALUE_SEPERATOR", 
			"PUZZLE_VALUE", "MOVES", "ROW_SEPERATOR", "BOARD_BEGIN", "BOARD_END", 
			"LIST_BEGIN", "LIST_END", "WS", "ERROR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<<alpha'", "'omega>>'", null, "'='", "'&'", null, null, "'$'", 
			"'{'", "'}'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SECTION_BEGIN", "SECTION_END", "SECTION_TYPE", "VALUE_ASSIGNMENT", 
			"VALUE_SEPERATOR", "PUZZLE_VALUE", "MOVES", "ROW_SEPERATOR", "BOARD_BEGIN", 
			"BOARD_END", "LIST_BEGIN", "LIST_END", "WS", "ERROR"
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


	public csce322hmwrk01prt02Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "csce322hmwrk01prt02.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20^\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\5\4;\n\4\3\5\3\5\3\6\3\6\3\7\6\7B\n\7\r\7\16\7C\3\7\3\7\5\7H"+
		"\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16W\n\16"+
		"\r\16\16\16X\3\16\3\16\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\3\2\5\3\2\62;\6\2ffnnttww\5\2"+
		"\13\f\17\17\"\"\2a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5"+
		"\'\3\2\2\2\7:\3\2\2\2\t<\3\2\2\2\13>\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21"+
		"K\3\2\2\2\23M\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31S\3\2\2\2\33V\3\2\2\2"+
		"\35\\\3\2\2\2\37 \7>\2\2 !\7>\2\2!\"\7c\2\2\"#\7n\2\2#$\7r\2\2$%\7j\2"+
		"\2%&\7c\2\2&\4\3\2\2\2\'(\7q\2\2()\7o\2\2)*\7g\2\2*+\7i\2\2+,\7c\2\2,"+
		"-\7@\2\2-.\7@\2\2.\6\3\2\2\2/\60\7O\2\2\60\61\7q\2\2\61\62\7x\2\2\62\63"+
		"\7g\2\2\63;\7u\2\2\64\65\7R\2\2\65\66\7w\2\2\66\67\7|\2\2\678\7|\2\28"+
		"9\7n\2\29;\7g\2\2:/\3\2\2\2:\64\3\2\2\2;\b\3\2\2\2<=\7?\2\2=\n\3\2\2\2"+
		">?\7(\2\2?\f\3\2\2\2@B\t\2\2\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2CD\3\2\2\2"+
		"DH\3\2\2\2EF\7/\2\2FH\7\63\2\2GA\3\2\2\2GE\3\2\2\2H\16\3\2\2\2IJ\t\3\2"+
		"\2J\20\3\2\2\2KL\7&\2\2L\22\3\2\2\2MN\7}\2\2N\24\3\2\2\2OP\7\177\2\2P"+
		"\26\3\2\2\2QR\7]\2\2R\30\3\2\2\2ST\7_\2\2T\32\3\2\2\2UW\t\4\2\2VU\3\2"+
		"\2\2WX\3\2\2\2XV\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\b\16\2\2[\34\3\2\2\2\\"+
		"]\13\2\2\2]\36\3\2\2\2\7\2:CGX\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
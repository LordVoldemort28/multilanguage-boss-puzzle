// Generated from /Users/rahulprajapati/Google Drive/CSCE Courses/CSCE 322/Homework/1/startercode/part1/csce322hmwrk01prt01.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322hmwrk01prt01Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECTION_BEGIN=1, SECTION_END=2, SECTION_TYPE=3, VALUE_ASSIGNMENT=4, VALUE_SEPERATOR=5, 
		NUMERICAL=6, MOVES=7, ROW_SEPERATOR=8, BOARD_BEGIN=9, BOARD_END=10, LIST_BEGIN=11, 
		LIST_END=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SECTION_BEGIN", "SECTION_END", "SECTION_TYPE", "VALUE_ASSIGNMENT", "VALUE_SEPERATOR", 
			"NUMERICAL", "MOVES", "ROW_SEPERATOR", "BOARD_BEGIN", "BOARD_END", "LIST_BEGIN", 
			"LIST_END", "WS"
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
			"VALUE_SEPERATOR", "NUMERICAL", "MOVES", "ROW_SEPERATOR", "BOARD_BEGIN", 
			"BOARD_END", "LIST_BEGIN", "LIST_END", "WS"
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


	public csce322hmwrk01prt01Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "csce322hmwrk01prt01.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17V\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\49\n\4\3\5\3\5\3\6\3\6\3\7\6\7@\n\7\r\7\16\7A\3\b\3\b\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\6\16Q\n\16\r\16\16\16R\3\16\3\16\2\2\17"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\5"+
		"\3\2\62;\6\2ffnnttww\5\2\13\f\17\17\"\"\2X\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3"+
		"\35\3\2\2\2\5%\3\2\2\2\78\3\2\2\2\t:\3\2\2\2\13<\3\2\2\2\r?\3\2\2\2\17"+
		"C\3\2\2\2\21E\3\2\2\2\23G\3\2\2\2\25I\3\2\2\2\27K\3\2\2\2\31M\3\2\2\2"+
		"\33P\3\2\2\2\35\36\7>\2\2\36\37\7>\2\2\37 \7c\2\2 !\7n\2\2!\"\7r\2\2\""+
		"#\7j\2\2#$\7c\2\2$\4\3\2\2\2%&\7q\2\2&\'\7o\2\2\'(\7g\2\2()\7i\2\2)*\7"+
		"c\2\2*+\7@\2\2+,\7@\2\2,\6\3\2\2\2-.\7O\2\2./\7q\2\2/\60\7x\2\2\60\61"+
		"\7g\2\2\619\7u\2\2\62\63\7R\2\2\63\64\7w\2\2\64\65\7|\2\2\65\66\7|\2\2"+
		"\66\67\7n\2\2\679\7g\2\28-\3\2\2\28\62\3\2\2\29\b\3\2\2\2:;\7?\2\2;\n"+
		"\3\2\2\2<=\7(\2\2=\f\3\2\2\2>@\t\2\2\2?>\3\2\2\2@A\3\2\2\2A?\3\2\2\2A"+
		"B\3\2\2\2B\16\3\2\2\2CD\t\3\2\2D\20\3\2\2\2EF\7&\2\2F\22\3\2\2\2GH\7}"+
		"\2\2H\24\3\2\2\2IJ\7\177\2\2J\26\3\2\2\2KL\7]\2\2L\30\3\2\2\2MN\7_\2\2"+
		"N\32\3\2\2\2OQ\t\4\2\2PO\3\2\2\2QR\3\2\2\2RP\3\2\2\2RS\3\2\2\2ST\3\2\2"+
		"\2TU\b\16\2\2U\34\3\2\2\2\6\28AR\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
// Generated from /Users/rahulprajapati/Google Drive/CSCE Courses/CSCE 322/Homework/1/startercode/part1/csce322hmwrk01prt01.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322hmwrk01prt01Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECTION_BEGIN=1, SECTION_END=2, SECTION_TYPE=3, VALUE_ASSIGNMENT=4, VALUE_SEPERATOR=5, 
		NUMERICAL=6, MOVES=7, ROW_SEPERATOR=8, BOARD_BEGIN=9, BOARD_END=10, LIST_BEGIN=11, 
		LIST_END=12, WS=13;
	public static final int
		RULE_boss = 0, RULE_moves = 1, RULE_move_symbol = 2, RULE_puzzles = 3, 
		RULE_puzzle_symbol = 4, RULE_eof = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"boss", "moves", "move_symbol", "puzzles", "puzzle_symbol", "eof"
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

	@Override
	public String getGrammarFileName() { return "csce322hmwrk01prt01.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public csce322hmwrk01prt01Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BossContext extends ParserRuleContext {
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public List<PuzzlesContext> puzzles() {
			return getRuleContexts(PuzzlesContext.class);
		}
		public PuzzlesContext puzzles(int i) {
			return getRuleContext(PuzzlesContext.class,i);
		}
		public List<MovesContext> moves() {
			return getRuleContexts(MovesContext.class);
		}
		public MovesContext moves(int i) {
			return getRuleContext(MovesContext.class,i);
		}
		public BossContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boss; }
	}

	public final BossContext boss() throws RecognitionException {
		BossContext _localctx = new BossContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_boss);
		int _la;
		try {
			int _alt;
			setState(37);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(13); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(12);
						puzzles();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(15); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(18); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(17);
					moves();
					}
					}
					setState(20); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SECTION_BEGIN) | (1L << SECTION_END) | (1L << SECTION_TYPE) | (1L << VALUE_ASSIGNMENT) | (1L << VALUE_SEPERATOR) | (1L << MOVES) | (1L << LIST_BEGIN) | (1L << LIST_END))) != 0) );
				setState(22);
				eof();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(25); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(24);
						moves();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(27); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(30); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(29);
					puzzles();
					}
					}
					setState(32); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SECTION_BEGIN) | (1L << SECTION_END) | (1L << SECTION_TYPE) | (1L << VALUE_ASSIGNMENT) | (1L << VALUE_SEPERATOR) | (1L << NUMERICAL) | (1L << ROW_SEPERATOR) | (1L << BOARD_BEGIN) | (1L << BOARD_END))) != 0) );
				setState(34);
				eof();
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				eof();
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

	public static class MovesContext extends ParserRuleContext {
		public Token SECTION_BEGIN;
		public Token SECTION_TYPE;
		public Token VALUE_ASSIGNMENT;
		public Token SECTION_END;
		public TerminalNode SECTION_BEGIN() { return getToken(csce322hmwrk01prt01Parser.SECTION_BEGIN, 0); }
		public TerminalNode SECTION_TYPE() { return getToken(csce322hmwrk01prt01Parser.SECTION_TYPE, 0); }
		public TerminalNode VALUE_ASSIGNMENT() { return getToken(csce322hmwrk01prt01Parser.VALUE_ASSIGNMENT, 0); }
		public TerminalNode LIST_BEGIN() { return getToken(csce322hmwrk01prt01Parser.LIST_BEGIN, 0); }
		public Move_symbolContext move_symbol() {
			return getRuleContext(Move_symbolContext.class,0);
		}
		public TerminalNode LIST_END() { return getToken(csce322hmwrk01prt01Parser.LIST_END, 0); }
		public TerminalNode SECTION_END() { return getToken(csce322hmwrk01prt01Parser.SECTION_END, 0); }
		public MovesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moves; }
	}

	public final MovesContext moves() throws RecognitionException {
		MovesContext _localctx = new MovesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_moves);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTION_BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				((MovesContext)_localctx).SECTION_BEGIN = match(SECTION_BEGIN);
				System.out.println("Start Section: " + (((MovesContext)_localctx).SECTION_BEGIN!=null?((MovesContext)_localctx).SECTION_BEGIN.getText():null));
				}
				break;
			case SECTION_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				((MovesContext)_localctx).SECTION_TYPE = match(SECTION_TYPE);
				System.out.println("Section: " + (((MovesContext)_localctx).SECTION_TYPE!=null?((MovesContext)_localctx).SECTION_TYPE.getText():null));
				}
				break;
			case VALUE_ASSIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				((MovesContext)_localctx).VALUE_ASSIGNMENT = match(VALUE_ASSIGNMENT);
				System.out.println("Assignment: " + (((MovesContext)_localctx).VALUE_ASSIGNMENT!=null?((MovesContext)_localctx).VALUE_ASSIGNMENT.getText():null));
				}
				break;
			case LIST_BEGIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(45);
				match(LIST_BEGIN);
				}
				break;
			case VALUE_SEPERATOR:
			case MOVES:
				enterOuterAlt(_localctx, 5);
				{
				setState(46);
				move_symbol();
				}
				break;
			case LIST_END:
				enterOuterAlt(_localctx, 6);
				{
				setState(47);
				match(LIST_END);
				}
				break;
			case SECTION_END:
				enterOuterAlt(_localctx, 7);
				{
				setState(48);
				((MovesContext)_localctx).SECTION_END = match(SECTION_END);
				System.out.println("End Section: " + (((MovesContext)_localctx).SECTION_END!=null?((MovesContext)_localctx).SECTION_END.getText():null));
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

	public static class Move_symbolContext extends ParserRuleContext {
		public Token MOVES;
		public TerminalNode MOVES() { return getToken(csce322hmwrk01prt01Parser.MOVES, 0); }
		public TerminalNode VALUE_SEPERATOR() { return getToken(csce322hmwrk01prt01Parser.VALUE_SEPERATOR, 0); }
		public Move_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_symbol; }
	}

	public final Move_symbolContext move_symbol() throws RecognitionException {
		Move_symbolContext _localctx = new Move_symbolContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_move_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVES:
				{
				setState(52);
				((Move_symbolContext)_localctx).MOVES = match(MOVES);
				System.out.println("Move: " + (((Move_symbolContext)_localctx).MOVES!=null?((Move_symbolContext)_localctx).MOVES.getText():null));
				}
				break;
			case VALUE_SEPERATOR:
				{
				setState(54);
				match(VALUE_SEPERATOR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class PuzzlesContext extends ParserRuleContext {
		public Token SECTION_BEGIN;
		public Token SECTION_TYPE;
		public Token VALUE_ASSIGNMENT;
		public Token BOARD_BEGIN;
		public Token BOARD_END;
		public Token SECTION_END;
		public TerminalNode SECTION_BEGIN() { return getToken(csce322hmwrk01prt01Parser.SECTION_BEGIN, 0); }
		public TerminalNode SECTION_TYPE() { return getToken(csce322hmwrk01prt01Parser.SECTION_TYPE, 0); }
		public TerminalNode VALUE_ASSIGNMENT() { return getToken(csce322hmwrk01prt01Parser.VALUE_ASSIGNMENT, 0); }
		public TerminalNode BOARD_BEGIN() { return getToken(csce322hmwrk01prt01Parser.BOARD_BEGIN, 0); }
		public Puzzle_symbolContext puzzle_symbol() {
			return getRuleContext(Puzzle_symbolContext.class,0);
		}
		public TerminalNode BOARD_END() { return getToken(csce322hmwrk01prt01Parser.BOARD_END, 0); }
		public TerminalNode SECTION_END() { return getToken(csce322hmwrk01prt01Parser.SECTION_END, 0); }
		public PuzzlesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puzzles; }
	}

	public final PuzzlesContext puzzles() throws RecognitionException {
		PuzzlesContext _localctx = new PuzzlesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_puzzles);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTION_BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				((PuzzlesContext)_localctx).SECTION_BEGIN = match(SECTION_BEGIN);
				System.out.println("Start Section: " + (((PuzzlesContext)_localctx).SECTION_BEGIN!=null?((PuzzlesContext)_localctx).SECTION_BEGIN.getText():null));
				}
				break;
			case SECTION_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				((PuzzlesContext)_localctx).SECTION_TYPE = match(SECTION_TYPE);
				System.out.println("Section: " + (((PuzzlesContext)_localctx).SECTION_TYPE!=null?((PuzzlesContext)_localctx).SECTION_TYPE.getText():null));
				}
				break;
			case VALUE_ASSIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				((PuzzlesContext)_localctx).VALUE_ASSIGNMENT = match(VALUE_ASSIGNMENT);
				System.out.println("Assignment: " + (((PuzzlesContext)_localctx).VALUE_ASSIGNMENT!=null?((PuzzlesContext)_localctx).VALUE_ASSIGNMENT.getText():null));
				}
				break;
			case BOARD_BEGIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(63);
				((PuzzlesContext)_localctx).BOARD_BEGIN = match(BOARD_BEGIN);
				System.out.println("Start Puzzle: " + (((PuzzlesContext)_localctx).BOARD_BEGIN!=null?((PuzzlesContext)_localctx).BOARD_BEGIN.getText():null));
				}
				break;
			case VALUE_SEPERATOR:
			case NUMERICAL:
			case ROW_SEPERATOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				puzzle_symbol();
				}
				break;
			case BOARD_END:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				((PuzzlesContext)_localctx).BOARD_END = match(BOARD_END);
				System.out.println("End Puzzle: " + (((PuzzlesContext)_localctx).BOARD_END!=null?((PuzzlesContext)_localctx).BOARD_END.getText():null));
				}
				break;
			case SECTION_END:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				((PuzzlesContext)_localctx).SECTION_END = match(SECTION_END);
				System.out.println("End Section: " + (((PuzzlesContext)_localctx).SECTION_END!=null?((PuzzlesContext)_localctx).SECTION_END.getText():null));
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

	public static class Puzzle_symbolContext extends ParserRuleContext {
		public Token NUMERICAL;
		public Token ROW_SEPERATOR;
		public TerminalNode NUMERICAL() { return getToken(csce322hmwrk01prt01Parser.NUMERICAL, 0); }
		public TerminalNode VALUE_SEPERATOR() { return getToken(csce322hmwrk01prt01Parser.VALUE_SEPERATOR, 0); }
		public TerminalNode ROW_SEPERATOR() { return getToken(csce322hmwrk01prt01Parser.ROW_SEPERATOR, 0); }
		public Puzzle_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puzzle_symbol; }
	}

	public final Puzzle_symbolContext puzzle_symbol() throws RecognitionException {
		Puzzle_symbolContext _localctx = new Puzzle_symbolContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_puzzle_symbol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERICAL:
				{
				setState(72);
				((Puzzle_symbolContext)_localctx).NUMERICAL = match(NUMERICAL);
				System.out.println("Tile: " + (((Puzzle_symbolContext)_localctx).NUMERICAL!=null?((Puzzle_symbolContext)_localctx).NUMERICAL.getText():null));
				}
				break;
			case VALUE_SEPERATOR:
				{
				setState(74);
				match(VALUE_SEPERATOR);
				}
				break;
			case ROW_SEPERATOR:
				{
				setState(75);
				((Puzzle_symbolContext)_localctx).ROW_SEPERATOR = match(ROW_SEPERATOR);
				System.out.println("End Row: " + (((Puzzle_symbolContext)_localctx).ROW_SEPERATOR!=null?((Puzzle_symbolContext)_localctx).ROW_SEPERATOR.getText():null));
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class EofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(csce322hmwrk01prt01Parser.EOF, 0); }
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(EOF);
			System.out.println("End of File");
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17U\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\2\6\2"+
		"\25\n\2\r\2\16\2\26\3\2\3\2\3\2\6\2\34\n\2\r\2\16\2\35\3\2\6\2!\n\2\r"+
		"\2\16\2\"\3\2\3\2\3\2\5\2(\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\65\n\3\3\4\3\4\3\4\5\4:\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5I\n\5\3\6\3\6\3\6\3\6\3\6\5\6P\n\6\3\7\3\7\3\7\3"+
		"\7\2\2\b\2\4\6\b\n\f\2\2\2c\2\'\3\2\2\2\4\64\3\2\2\2\69\3\2\2\2\bH\3\2"+
		"\2\2\nO\3\2\2\2\fQ\3\2\2\2\16\20\5\b\5\2\17\16\3\2\2\2\20\21\3\2\2\2\21"+
		"\17\3\2\2\2\21\22\3\2\2\2\22\24\3\2\2\2\23\25\5\4\3\2\24\23\3\2\2\2\25"+
		"\26\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\30\3\2\2\2\30\31\5\f\7\2\31"+
		"(\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36"+
		"\3\2\2\2\36 \3\2\2\2\37!\5\b\5\2 \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#"+
		"\3\2\2\2#$\3\2\2\2$%\5\f\7\2%(\3\2\2\2&(\5\f\7\2\'\17\3\2\2\2\'\33\3\2"+
		"\2\2\'&\3\2\2\2(\3\3\2\2\2)*\7\3\2\2*\65\b\3\1\2+,\7\5\2\2,\65\b\3\1\2"+
		"-.\7\6\2\2.\65\b\3\1\2/\65\7\r\2\2\60\65\5\6\4\2\61\65\7\16\2\2\62\63"+
		"\7\4\2\2\63\65\b\3\1\2\64)\3\2\2\2\64+\3\2\2\2\64-\3\2\2\2\64/\3\2\2\2"+
		"\64\60\3\2\2\2\64\61\3\2\2\2\64\62\3\2\2\2\65\5\3\2\2\2\66\67\7\t\2\2"+
		"\67:\b\4\1\28:\7\7\2\29\66\3\2\2\298\3\2\2\2:\7\3\2\2\2;<\7\3\2\2<I\b"+
		"\5\1\2=>\7\5\2\2>I\b\5\1\2?@\7\6\2\2@I\b\5\1\2AB\7\13\2\2BI\b\5\1\2CI"+
		"\5\n\6\2DE\7\f\2\2EI\b\5\1\2FG\7\4\2\2GI\b\5\1\2H;\3\2\2\2H=\3\2\2\2H"+
		"?\3\2\2\2HA\3\2\2\2HC\3\2\2\2HD\3\2\2\2HF\3\2\2\2I\t\3\2\2\2JK\7\b\2\2"+
		"KP\b\6\1\2LP\7\7\2\2MN\7\n\2\2NP\b\6\1\2OJ\3\2\2\2OL\3\2\2\2OM\3\2\2\2"+
		"P\13\3\2\2\2QR\7\2\2\3RS\b\7\1\2S\r\3\2\2\2\13\21\26\35\"\'\649HO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
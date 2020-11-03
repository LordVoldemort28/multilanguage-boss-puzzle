// Generated from /Users/rahulprajapati/Google Drive/CSCE Courses/CSCE 322/Homework/1/startercode/part2/csce322hmwrk01prt02.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322hmwrk01prt02Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SECTION_BEGIN=1, SECTION_END=2, SECTION_TYPE=3, VALUE_ASSIGNMENT=4, VALUE_SEPERATOR=5, 
		PUZZLE_VALUE=6, MOVES=7, ROW_SEPERATOR=8, BOARD_BEGIN=9, BOARD_END=10, 
		LIST_BEGIN=11, LIST_END=12, WS=13, ERROR=14;
	public static final int
		RULE_boss = 0, RULE_section = 1, RULE_move_section = 2, RULE_moves = 3, 
		RULE_puzzle_section = 4, RULE_puzzle = 5, RULE_value_assignment = 6, RULE_section_type = 7, 
		RULE_section_begin = 8, RULE_section_end = 9, RULE_error = 10, RULE_eof = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"boss", "section", "move_section", "moves", "puzzle_section", "puzzle", 
			"value_assignment", "section_type", "section_begin", "section_end", "error", 
			"eof"
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

	@Override
	public String getGrammarFileName() { return "csce322hmwrk01prt02.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public csce322hmwrk01prt02Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class BossContext extends ParserRuleContext {
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public List<SectionContext> section() {
			return getRuleContexts(SectionContext.class);
		}
		public SectionContext section(int i) {
			return getRuleContext(SectionContext.class,i);
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
			setState(32);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTION_BEGIN:
			case SECTION_END:
			case SECTION_TYPE:
			case VALUE_ASSIGNMENT:
			case VALUE_SEPERATOR:
			case PUZZLE_VALUE:
			case MOVES:
			case ROW_SEPERATOR:
			case BOARD_BEGIN:
			case BOARD_END:
			case LIST_BEGIN:
			case LIST_END:
			case ERROR:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(24);
					section();
					}
					}
					setState(27); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SECTION_BEGIN) | (1L << SECTION_END) | (1L << SECTION_TYPE) | (1L << VALUE_ASSIGNMENT) | (1L << VALUE_SEPERATOR) | (1L << PUZZLE_VALUE) | (1L << MOVES) | (1L << ROW_SEPERATOR) | (1L << BOARD_BEGIN) | (1L << BOARD_END) | (1L << LIST_BEGIN) | (1L << LIST_END) | (1L << ERROR))) != 0) );
				setState(29);
				eof();
				}
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				eof();
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

	public static class SectionContext extends ParserRuleContext {
		public Section_beginContext section_begin() {
			return getRuleContext(Section_beginContext.class,0);
		}
		public Section_typeContext section_type() {
			return getRuleContext(Section_typeContext.class,0);
		}
		public Value_assignmentContext value_assignment() {
			return getRuleContext(Value_assignmentContext.class,0);
		}
		public List<Puzzle_sectionContext> puzzle_section() {
			return getRuleContexts(Puzzle_sectionContext.class);
		}
		public Puzzle_sectionContext puzzle_section(int i) {
			return getRuleContext(Puzzle_sectionContext.class,i);
		}
		public List<Move_sectionContext> move_section() {
			return getRuleContexts(Move_sectionContext.class);
		}
		public Move_sectionContext move_section(int i) {
			return getRuleContext(Move_sectionContext.class,i);
		}
		public Section_endContext section_end() {
			return getRuleContext(Section_endContext.class,0);
		}
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_section);
		try {
			int _alt;
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTION_BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				section_begin();
				}
				break;
			case SECTION_TYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				section_type();
				}
				break;
			case VALUE_ASSIGNMENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				value_assignment();
				}
				break;
			case VALUE_SEPERATOR:
			case PUZZLE_VALUE:
			case MOVES:
			case ROW_SEPERATOR:
			case BOARD_BEGIN:
			case BOARD_END:
			case LIST_BEGIN:
			case LIST_END:
				enterOuterAlt(_localctx, 4);
				{
				setState(47);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(38); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(37);
							puzzle_section();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(40); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				case 2:
					{
					setState(43); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(42);
							move_section();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(45); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				}
				break;
			case SECTION_END:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				section_end();
				}
				break;
			case ERROR:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				error();
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

	public static class Move_sectionContext extends ParserRuleContext {
		public TerminalNode LIST_BEGIN() { return getToken(csce322hmwrk01prt02Parser.LIST_BEGIN, 0); }
		public List<MovesContext> moves() {
			return getRuleContexts(MovesContext.class);
		}
		public MovesContext moves(int i) {
			return getRuleContext(MovesContext.class,i);
		}
		public TerminalNode LIST_END() { return getToken(csce322hmwrk01prt02Parser.LIST_END, 0); }
		public Move_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_section; }
	}

	public final Move_sectionContext move_section() throws RecognitionException {
		Move_sectionContext _localctx = new Move_sectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_move_section);
		try {
			int _alt;
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LIST_BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				match(LIST_BEGIN);
				}
				break;
			case VALUE_SEPERATOR:
			case MOVES:
				enterOuterAlt(_localctx, 2);
				{
				setState(55); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(54);
						moves();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(57); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case LIST_END:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(LIST_END);
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

	public static class MovesContext extends ParserRuleContext {
		public Token MOVES;
		public TerminalNode MOVES() { return getToken(csce322hmwrk01prt02Parser.MOVES, 0); }
		public TerminalNode VALUE_SEPERATOR() { return getToken(csce322hmwrk01prt02Parser.VALUE_SEPERATOR, 0); }
		public MovesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moves; }
	}

	public final MovesContext moves() throws RecognitionException {
		MovesContext _localctx = new MovesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_moves);
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MOVES:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				((MovesContext)_localctx).MOVES = match(MOVES);
				System.out.println("Move: " + (((MovesContext)_localctx).MOVES!=null?((MovesContext)_localctx).MOVES.getText():null));
				}
				break;
			case VALUE_SEPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				match(VALUE_SEPERATOR);
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

	public static class Puzzle_sectionContext extends ParserRuleContext {
		public Token BOARD_BEGIN;
		public Token BOARD_END;
		public TerminalNode BOARD_BEGIN() { return getToken(csce322hmwrk01prt02Parser.BOARD_BEGIN, 0); }
		public List<PuzzleContext> puzzle() {
			return getRuleContexts(PuzzleContext.class);
		}
		public PuzzleContext puzzle(int i) {
			return getRuleContext(PuzzleContext.class,i);
		}
		public TerminalNode BOARD_END() { return getToken(csce322hmwrk01prt02Parser.BOARD_END, 0); }
		public Puzzle_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puzzle_section; }
	}

	public final Puzzle_sectionContext puzzle_section() throws RecognitionException {
		Puzzle_sectionContext _localctx = new Puzzle_sectionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_puzzle_section);
		try {
			int _alt;
			setState(76);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOARD_BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				((Puzzle_sectionContext)_localctx).BOARD_BEGIN = match(BOARD_BEGIN);
				System.out.println("Start Puzzle: " + (((Puzzle_sectionContext)_localctx).BOARD_BEGIN!=null?((Puzzle_sectionContext)_localctx).BOARD_BEGIN.getText():null));
				}
				break;
			case VALUE_SEPERATOR:
			case PUZZLE_VALUE:
			case ROW_SEPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(70); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(69);
						puzzle();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(72); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case BOARD_END:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				((Puzzle_sectionContext)_localctx).BOARD_END = match(BOARD_END);
				System.out.println("End Puzzle: " + (((Puzzle_sectionContext)_localctx).BOARD_END!=null?((Puzzle_sectionContext)_localctx).BOARD_END.getText():null));
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

	public static class PuzzleContext extends ParserRuleContext {
		public Token PUZZLE_VALUE;
		public Token ROW_SEPERATOR;
		public TerminalNode PUZZLE_VALUE() { return getToken(csce322hmwrk01prt02Parser.PUZZLE_VALUE, 0); }
		public TerminalNode VALUE_SEPERATOR() { return getToken(csce322hmwrk01prt02Parser.VALUE_SEPERATOR, 0); }
		public TerminalNode ROW_SEPERATOR() { return getToken(csce322hmwrk01prt02Parser.ROW_SEPERATOR, 0); }
		public PuzzleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_puzzle; }
	}

	public final PuzzleContext puzzle() throws RecognitionException {
		PuzzleContext _localctx = new PuzzleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_puzzle);
		try {
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PUZZLE_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				((PuzzleContext)_localctx).PUZZLE_VALUE = match(PUZZLE_VALUE);
				System.out.println("Tile: " + (((PuzzleContext)_localctx).PUZZLE_VALUE!=null?((PuzzleContext)_localctx).PUZZLE_VALUE.getText():null));
				}
				break;
			case VALUE_SEPERATOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(VALUE_SEPERATOR);
				}
				break;
			case ROW_SEPERATOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				((PuzzleContext)_localctx).ROW_SEPERATOR = match(ROW_SEPERATOR);
				System.out.println("End Row: " + (((PuzzleContext)_localctx).ROW_SEPERATOR!=null?((PuzzleContext)_localctx).ROW_SEPERATOR.getText():null));
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

	public static class Value_assignmentContext extends ParserRuleContext {
		public Token VALUE_ASSIGNMENT;
		public TerminalNode VALUE_ASSIGNMENT() { return getToken(csce322hmwrk01prt02Parser.VALUE_ASSIGNMENT, 0); }
		public Value_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_assignment; }
	}

	public final Value_assignmentContext value_assignment() throws RecognitionException {
		Value_assignmentContext _localctx = new Value_assignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			((Value_assignmentContext)_localctx).VALUE_ASSIGNMENT = match(VALUE_ASSIGNMENT);
			System.out.println("Assignment: " + (((Value_assignmentContext)_localctx).VALUE_ASSIGNMENT!=null?((Value_assignmentContext)_localctx).VALUE_ASSIGNMENT.getText():null));
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

	public static class Section_typeContext extends ParserRuleContext {
		public Token SECTION_TYPE;
		public TerminalNode SECTION_TYPE() { return getToken(csce322hmwrk01prt02Parser.SECTION_TYPE, 0); }
		public Section_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section_type; }
	}

	public final Section_typeContext section_type() throws RecognitionException {
		Section_typeContext _localctx = new Section_typeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_section_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			((Section_typeContext)_localctx).SECTION_TYPE = match(SECTION_TYPE);
			System.out.println("Section: " + (((Section_typeContext)_localctx).SECTION_TYPE!=null?((Section_typeContext)_localctx).SECTION_TYPE.getText():null));
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

	public static class Section_beginContext extends ParserRuleContext {
		public Token SECTION_BEGIN;
		public TerminalNode SECTION_BEGIN() { return getToken(csce322hmwrk01prt02Parser.SECTION_BEGIN, 0); }
		public Section_beginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section_begin; }
	}

	public final Section_beginContext section_begin() throws RecognitionException {
		Section_beginContext _localctx = new Section_beginContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_section_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			((Section_beginContext)_localctx).SECTION_BEGIN = match(SECTION_BEGIN);
			System.out.println("Start Section: " + (((Section_beginContext)_localctx).SECTION_BEGIN!=null?((Section_beginContext)_localctx).SECTION_BEGIN.getText():null));
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

	public static class Section_endContext extends ParserRuleContext {
		public Token SECTION_END;
		public TerminalNode SECTION_END() { return getToken(csce322hmwrk01prt02Parser.SECTION_END, 0); }
		public Section_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section_end; }
	}

	public final Section_endContext section_end() throws RecognitionException {
		Section_endContext _localctx = new Section_endContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_section_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((Section_endContext)_localctx).SECTION_END = match(SECTION_END);
			System.out.println("End Section: " + (((Section_endContext)_localctx).SECTION_END!=null?((Section_endContext)_localctx).SECTION_END.getText():null));
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
		public Token ERROR;
		public TerminalNode ERROR() { return getToken(csce322hmwrk01prt02Parser.ERROR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			((ErrorContext)_localctx).ERROR = match(ERROR);
			System.out.println("Line "+(((ErrorContext)_localctx).ERROR!=null?((ErrorContext)_localctx).ERROR.getLine():0)+" Contains Unrecognized Token "+ (((ErrorContext)_localctx).ERROR!=null?((ErrorContext)_localctx).ERROR.getText():null)+"."); System.exit(1);
					
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
		public TerminalNode EOF() { return getToken(csce322hmwrk01prt02Parser.EOF, 0); }
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(EOF);
			System.out.print("End of File");
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\20j\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\2\3\2\3\2\5\2#\n\2\3\3\3\3"+
		"\3\3\3\3\6\3)\n\3\r\3\16\3*\3\3\6\3.\n\3\r\3\16\3/\5\3\62\n\3\3\3\3\3"+
		"\5\3\66\n\3\3\4\3\4\6\4:\n\4\r\4\16\4;\3\4\5\4?\n\4\3\5\3\5\3\5\5\5D\n"+
		"\5\3\6\3\6\3\6\6\6I\n\6\r\6\16\6J\3\6\3\6\5\6O\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\5\7V\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\2\2p\2\"\3\2"+
		"\2\2\4\65\3\2\2\2\6>\3\2\2\2\bC\3\2\2\2\nN\3\2\2\2\fU\3\2\2\2\16W\3\2"+
		"\2\2\20Z\3\2\2\2\22]\3\2\2\2\24`\3\2\2\2\26c\3\2\2\2\30f\3\2\2\2\32\34"+
		"\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36\37"+
		"\3\2\2\2\37 \5\30\r\2 #\3\2\2\2!#\5\30\r\2\"\33\3\2\2\2\"!\3\2\2\2#\3"+
		"\3\2\2\2$\66\5\22\n\2%\66\5\20\t\2&\66\5\16\b\2\')\5\n\6\2(\'\3\2\2\2"+
		")*\3\2\2\2*(\3\2\2\2*+\3\2\2\2+\62\3\2\2\2,.\5\6\4\2-,\3\2\2\2./\3\2\2"+
		"\2/-\3\2\2\2/\60\3\2\2\2\60\62\3\2\2\2\61(\3\2\2\2\61-\3\2\2\2\62\66\3"+
		"\2\2\2\63\66\5\24\13\2\64\66\5\26\f\2\65$\3\2\2\2\65%\3\2\2\2\65&\3\2"+
		"\2\2\65\61\3\2\2\2\65\63\3\2\2\2\65\64\3\2\2\2\66\5\3\2\2\2\67?\7\r\2"+
		"\28:\5\b\5\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<?\3\2\2\2=?\7\16"+
		"\2\2>\67\3\2\2\2>9\3\2\2\2>=\3\2\2\2?\7\3\2\2\2@A\7\t\2\2AD\b\5\1\2BD"+
		"\7\7\2\2C@\3\2\2\2CB\3\2\2\2D\t\3\2\2\2EF\7\13\2\2FO\b\6\1\2GI\5\f\7\2"+
		"HG\3\2\2\2IJ\3\2\2\2JH\3\2\2\2JK\3\2\2\2KO\3\2\2\2LM\7\f\2\2MO\b\6\1\2"+
		"NE\3\2\2\2NH\3\2\2\2NL\3\2\2\2O\13\3\2\2\2PQ\7\b\2\2QV\b\7\1\2RV\7\7\2"+
		"\2ST\7\n\2\2TV\b\7\1\2UP\3\2\2\2UR\3\2\2\2US\3\2\2\2V\r\3\2\2\2WX\7\6"+
		"\2\2XY\b\b\1\2Y\17\3\2\2\2Z[\7\5\2\2[\\\b\t\1\2\\\21\3\2\2\2]^\7\3\2\2"+
		"^_\b\n\1\2_\23\3\2\2\2`a\7\4\2\2ab\b\13\1\2b\25\3\2\2\2cd\7\20\2\2de\b"+
		"\f\1\2e\27\3\2\2\2fg\7\2\2\3gh\b\r\1\2h\31\3\2\2\2\16\35\"*/\61\65;>C"+
		"JNU";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
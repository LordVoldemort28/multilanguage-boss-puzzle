// Generated from sample.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sampleParser}.
 */
public interface sampleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sampleParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(sampleParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link sampleParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(sampleParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link sampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(sampleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link sampleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(sampleParser.ExprContext ctx);
}
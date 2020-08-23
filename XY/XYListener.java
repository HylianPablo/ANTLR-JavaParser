// Generated from XY.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XYParser}.
 */
public interface XYListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XYParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(XYParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link XYParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(XYParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link XYParser#x}.
	 * @param ctx the parse tree
	 */
	void enterX(XYParser.XContext ctx);
	/**
	 * Exit a parse tree produced by {@link XYParser#x}.
	 * @param ctx the parse tree
	 */
	void exitX(XYParser.XContext ctx);
	/**
	 * Enter a parse tree produced by {@link XYParser#y}.
	 * @param ctx the parse tree
	 */
	void enterY(XYParser.YContext ctx);
	/**
	 * Exit a parse tree produced by {@link XYParser#y}.
	 * @param ctx the parse tree
	 */
	void exitY(XYParser.YContext ctx);
}
// Generated from XY.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link XYParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface XYVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link XYParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(XYParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link XYParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitX(XYParser.XContext ctx);
	/**
	 * Visit a parse tree produced by {@link XYParser#y}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitY(XYParser.YContext ctx);
}
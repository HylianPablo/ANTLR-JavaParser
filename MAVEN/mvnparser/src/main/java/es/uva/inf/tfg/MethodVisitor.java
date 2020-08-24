package es.uva.inf.tfg;
// Generated from Method.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MethodParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MethodVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MethodParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(MethodParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link MethodParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(MethodParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link MethodParser#mainheader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainheader(MethodParser.MainheaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link MethodParser#sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentence(MethodParser.SentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MethodParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(MethodParser.WordContext ctx);
}
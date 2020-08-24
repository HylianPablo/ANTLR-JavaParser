package es.uva.inf.tfg;
// Generated from Method.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MethodParser}.
 */
public interface MethodListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MethodParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(MethodParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link MethodParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(MethodParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link MethodParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(MethodParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MethodParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(MethodParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MethodParser#mainheader}.
	 * @param ctx the parse tree
	 */
	void enterMainheader(MethodParser.MainheaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MethodParser#mainheader}.
	 * @param ctx the parse tree
	 */
	void exitMainheader(MethodParser.MainheaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MethodParser#sentence}.
	 * @param ctx the parse tree
	 */
	void enterSentence(MethodParser.SentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MethodParser#sentence}.
	 * @param ctx the parse tree
	 */
	void exitSentence(MethodParser.SentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MethodParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(MethodParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MethodParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(MethodParser.WordContext ctx);
}
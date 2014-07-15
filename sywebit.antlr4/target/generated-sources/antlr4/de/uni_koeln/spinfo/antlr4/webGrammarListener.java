// Generated from de/uni_koeln/spinfo/antlr4/webGrammar.g4 by ANTLR 4.2.2
package de.uni_koeln.spinfo.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link webGrammarParser}.
 */
public interface webGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link webGrammarParser#startSymb}.
	 * @param ctx the parse tree
	 */
	void enterStartSymb(@NotNull webGrammarParser.StartSymbContext ctx);
	/**
	 * Exit a parse tree produced by {@link webGrammarParser#startSymb}.
	 * @param ctx the parse tree
	 */
	void exitStartSymb(@NotNull webGrammarParser.StartSymbContext ctx);

	/**
	 * Enter a parse tree produced by {@link webGrammarParser#dot}.
	 * @param ctx the parse tree
	 */
	void enterDot(@NotNull webGrammarParser.DotContext ctx);
	/**
	 * Exit a parse tree produced by {@link webGrammarParser#dot}.
	 * @param ctx the parse tree
	 */
	void exitDot(@NotNull webGrammarParser.DotContext ctx);

	/**
	 * Enter a parse tree produced by {@link webGrammarParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(@NotNull webGrammarParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link webGrammarParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(@NotNull webGrammarParser.WordContext ctx);
}
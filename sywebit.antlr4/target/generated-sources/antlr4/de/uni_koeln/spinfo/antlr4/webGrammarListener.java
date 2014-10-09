// Generated from de\u005Cuni_koeln\spinfo\antlr4\webGrammar.g4 by ANTLR 4.2.2
package de.uni_koeln.spinfo.antlr4;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link webGrammarParser}.
 */
public interface webGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link webGrammarParser#qs}.
	 * @param ctx the parse tree
	 */
	void enterQs(@NotNull webGrammarParser.QsContext ctx);
	/**
	 * Exit a parse tree produced by {@link webGrammarParser#qs}.
	 * @param ctx the parse tree
	 */
	void exitQs(@NotNull webGrammarParser.QsContext ctx);

	/**
	 * Enter a parse tree produced by {@link webGrammarParser#alternat}.
	 * @param ctx the parse tree
	 */
	void enterAlternat(@NotNull webGrammarParser.AlternatContext ctx);
	/**
	 * Exit a parse tree produced by {@link webGrammarParser#alternat}.
	 * @param ctx the parse tree
	 */
	void exitAlternat(@NotNull webGrammarParser.AlternatContext ctx);

	/**
	 * Enter a parse tree produced by {@link webGrammarParser#pos}.
	 * @param ctx the parse tree
	 */
	void enterPos(@NotNull webGrammarParser.PosContext ctx);
	/**
	 * Exit a parse tree produced by {@link webGrammarParser#pos}.
	 * @param ctx the parse tree
	 */
	void exitPos(@NotNull webGrammarParser.PosContext ctx);

	/**
	 * Enter a parse tree produced by {@link webGrammarParser#nomen}.
	 * @param ctx the parse tree
	 */
	void enterNomen(@NotNull webGrammarParser.NomenContext ctx);
	/**
	 * Exit a parse tree produced by {@link webGrammarParser#nomen}.
	 * @param ctx the parse tree
	 */
	void exitNomen(@NotNull webGrammarParser.NomenContext ctx);

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
	 * Enter a parse tree produced by {@link webGrammarParser#verb}.
	 * @param ctx the parse tree
	 */
	void enterVerb(@NotNull webGrammarParser.VerbContext ctx);
	/**
	 * Exit a parse tree produced by {@link webGrammarParser#verb}.
	 * @param ctx the parse tree
	 */
	void exitVerb(@NotNull webGrammarParser.VerbContext ctx);

	/**
	 * Enter a parse tree produced by {@link webGrammarParser#qsLemma}.
	 * @param ctx the parse tree
	 */
	void enterQsLemma(@NotNull webGrammarParser.QsLemmaContext ctx);
	/**
	 * Exit a parse tree produced by {@link webGrammarParser#qsLemma}.
	 * @param ctx the parse tree
	 */
	void exitQsLemma(@NotNull webGrammarParser.QsLemmaContext ctx);

	/**
	 * Enter a parse tree produced by {@link webGrammarParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(@NotNull webGrammarParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link webGrammarParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(@NotNull webGrammarParser.ErrorContext ctx);

	/**
	 * Enter a parse tree produced by {@link webGrammarParser#verbstamm}.
	 * @param ctx the parse tree
	 */
	void enterVerbstamm(@NotNull webGrammarParser.VerbstammContext ctx);
	/**
	 * Exit a parse tree produced by {@link webGrammarParser#verbstamm}.
	 * @param ctx the parse tree
	 */
	void exitVerbstamm(@NotNull webGrammarParser.VerbstammContext ctx);

	/**
	 * Enter a parse tree produced by {@link webGrammarParser#stem}.
	 * @param ctx the parse tree
	 */
	void enterStem(@NotNull webGrammarParser.StemContext ctx);
	/**
	 * Exit a parse tree produced by {@link webGrammarParser#stem}.
	 * @param ctx the parse tree
	 */
	void exitStem(@NotNull webGrammarParser.StemContext ctx);

	/**
	 * Enter a parse tree produced by {@link webGrammarParser#konjugation}.
	 * @param ctx the parse tree
	 */
	void enterKonjugation(@NotNull webGrammarParser.KonjugationContext ctx);
	/**
	 * Exit a parse tree produced by {@link webGrammarParser#konjugation}.
	 * @param ctx the parse tree
	 */
	void exitKonjugation(@NotNull webGrammarParser.KonjugationContext ctx);

	/**
	 * Enter a parse tree produced by {@link webGrammarParser#endEntry}.
	 * @param ctx the parse tree
	 */
	void enterEndEntry(@NotNull webGrammarParser.EndEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link webGrammarParser#endEntry}.
	 * @param ctx the parse tree
	 */
	void exitEndEntry(@NotNull webGrammarParser.EndEntryContext ctx);
}
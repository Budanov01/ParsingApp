// Generated from C:/Users/Alexandr/IdeaProjects/untitled/src/com/example/calculator\mathExp.g4 by ANTLR 4.9.1
package com.example.calculator;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mathExpParser}.
 */
public interface mathExpListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mathExpParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(mathExpParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathExpParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(mathExpParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ADDORSUB}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterADDORSUB(mathExpParser.ADDORSUBContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ADDORSUB}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitADDORSUB(mathExpParser.ADDORSUBContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PARENTHESES}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPARENTHESES(mathExpParser.PARENTHESESContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PARENTHESES}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPARENTHESES(mathExpParser.PARENTHESESContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UNARYOP}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUNARYOP(mathExpParser.UNARYOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UNARYOP}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUNARYOP(mathExpParser.UNARYOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MULORDIV}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMULORDIV(mathExpParser.MULORDIVContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MULORDIV}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMULORDIV(mathExpParser.MULORDIVContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONSTANT}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCONSTANT(mathExpParser.CONSTANTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONSTANT}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCONSTANT(mathExpParser.CONSTANTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FUNCTIONCALL}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFUNCTIONCALL(mathExpParser.FUNCTIONCALLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FUNCTIONCALL}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFUNCTIONCALL(mathExpParser.FUNCTIONCALLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code POW}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPOW(mathExpParser.POWContext ctx);
	/**
	 * Exit a parse tree produced by the {@code POW}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPOW(mathExpParser.POWContext ctx);
}
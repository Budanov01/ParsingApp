// Generated from C:/Users/Alexandr/IdeaProjects/untitled/src/com/example/calculator\mathExp.g4 by ANTLR 4.9.1
package com.example.calculator;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mathExpParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mathExpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mathExpParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(mathExpParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ADDORSUB}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitADDORSUB(mathExpParser.ADDORSUBContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PARENTHESES}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPARENTHESES(mathExpParser.PARENTHESESContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UNARYOP}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUNARYOP(mathExpParser.UNARYOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MULORDIV}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMULORDIV(mathExpParser.MULORDIVContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CONSTANT}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONSTANT(mathExpParser.CONSTANTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FUNCTIONCALL}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFUNCTIONCALL(mathExpParser.FUNCTIONCALLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code POW}
	 * labeled alternative in {@link mathExpParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPOW(mathExpParser.POWContext ctx);
}
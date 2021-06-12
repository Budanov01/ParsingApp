package com.example.calculator;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;

public class calculatorVisitor extends mathExpBaseVisitor<Double>{

    HashMap<String, main.Function> functions;

    calculatorVisitor(HashMap<String, main.Function> functions){
        this.functions = functions;
    }

    @Override
    public Double visitStart(mathExpParser.StartContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Double visitADDORSUB(mathExpParser.ADDORSUBContext ctx) {
        Double loperand = visit(ctx.getChild(0));
        Double roperand = visit(ctx.getChild(2));
        if (ctx.PLUSMINUS().toString().equals("+")){
            return loperand + roperand;
        }else{return loperand - roperand;}
    }

    @Override
    public Double visitPARENTHESES(mathExpParser.PARENTHESESContext ctx) {
        return visit(ctx.getChild(1));
    }

    @Override
    public Double visitMULORDIV(mathExpParser.MULORDIVContext ctx) {
        Double loperand = visit(ctx.getChild(0));
        Double roperand = visit(ctx.getChild(2));
        if (ctx.MULDIV().getText().equals("*")){
            return loperand * roperand;
        }else{
            return loperand / roperand;
        }
    }

    @Override
    public Double visitUNARYOP(mathExpParser.UNARYOPContext ctx) {
        if (ctx.PLUSMINUS().getText().equals("-")){
            return -visit(ctx.getChild(1));
        }else{
            return visit(ctx.getChild(1));
        }
    }

    @Override
    public Double visitCONSTANT(mathExpParser.CONSTANTContext ctx) {
        return Double.parseDouble(ctx.NUMBER().toString());
    }

    @Override
    public Double visitPOW(mathExpParser.POWContext ctx) {
        Double loperand = visit(ctx.getChild(0));
        Double roperand = visit(ctx.getChild(2));
        return Math.pow(loperand, roperand);
    }

    @Override
    public Double visitFUNCTIONCALL(mathExpParser.FUNCTIONCALLContext ctx) {
        ArrayList<Double> arguments = new ArrayList<>();
        for (int i = 2; i < ctx.getChildCount(); i = i + 2){
            arguments.add(visit(ctx.getChild(i)));
        }
        return functions.get(ctx.IDENTIFIER().toString()).call(arguments);
    }
}

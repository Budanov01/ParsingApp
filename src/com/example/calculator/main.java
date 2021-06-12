package com.example.calculator;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.ArrayList;
import java.util.HashMap;

public class main{
    public static void main(String[] args) {
        HashMap<String, Function> functions = new HashMap<String, Function>();
        Function sin = (arguments) -> Math.sin(arguments.get(0));
        Function cos = (arguments) -> Math.cos(arguments.get(0));
        Function tan = (arguments) -> Math.tan(arguments.get(0));
        Function ctn = (arguments) -> 1 / Math.tan(arguments.get(0));
        Function percent = (argument) -> argument.get(0) / argument.get(1) * 100;
        functions.put("sin", sin);
        functions.put("cos", cos);
        functions.put("tan", tan);
        functions.put("ctn", ctn);
        functions.put("percent", percent);

        String st = "cos(0)";
        mathExpLexer lexer = new mathExpLexer(CharStreams.fromString(st));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        mathExpParser parser = new mathExpParser(tokens);
        ParseTree tree = parser.expr();
        Double res = new calculatorVisitor(functions).visit(tree);

        System.out.println(tree.toStringTree(parser));
        System.out.println(res);
    }

    interface Function{
        double call(ArrayList<Double> arguments);
    }
}
package org.example;

import java.math.BigDecimal;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.example.parser.ExpressionLexer;
import org.example.parser.ExpressionParser;

public class Calculator {
  public BigDecimal execute(String expression) {
    CharStream cs = CharStreams.fromString(expression);
    ExpressionLexer lexer = new ExpressionLexer(cs);
    CommonTokenStream tokens = new CommonTokenStream(lexer);
    ExpressionParser parser = new ExpressionParser(tokens);
    ExpressionParser.CalcContext context = parser.calc();
    BigDecimalExpressionVisitor visitor = new BigDecimalExpressionVisitor();
    return visitor.visit(context);
  }
}

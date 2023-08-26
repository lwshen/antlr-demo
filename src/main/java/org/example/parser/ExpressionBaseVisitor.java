// Generated from Expression.g4 by ANTLR 4.13.0

// 定义package
package org.example.parser;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link ExpressionVisitor}, which can be extended
 * to create a visitor which only needs to handle a subset of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for operations with no return
 *     type.
 */
@SuppressWarnings("CheckReturnValue")
public class ExpressionBaseVisitor<T> extends AbstractParseTreeVisitor<T>
    implements ExpressionVisitor<T> {
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
   * ctx}.
   */
  @Override
  public T visitCalculationBlock(ExpressionParser.CalculationBlockContext ctx) {
    return visitChildren(ctx);
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
   * ctx}.
   */
  @Override
  public T visitExpressionWithBr(ExpressionParser.ExpressionWithBrContext ctx) {
    return visitChildren(ctx);
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
   * ctx}.
   */
  @Override
  public T visitExpressionTimesOrDivide(ExpressionParser.ExpressionTimesOrDivideContext ctx) {
    return visitChildren(ctx);
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
   * ctx}.
   */
  @Override
  public T visitExpressionNumeric(ExpressionParser.ExpressionNumericContext ctx) {
    return visitChildren(ctx);
  }
  /**
   * {@inheritDoc}
   *
   * <p>The default implementation returns the result of calling {@link #visitChildren} on {@code
   * ctx}.
   */
  @Override
  public T visitExpressionPlusOrMinus(ExpressionParser.ExpressionPlusOrMinusContext ctx) {
    return visitChildren(ctx);
  }
}

// Generated from Expression.g4 by ANTLR 4.13.0

// 定义package
package org.example.parser;

import java.util.List;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExpressionParser extends Parser {
  static {
    RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION);
  }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
  public static final int BR_OPEN = 1,
      BR_CLOSE = 2,
      PLUS = 3,
      MINUS = 4,
      TIMES = 5,
      DIVIDE = 6,
      POW = 7,
      PERCENT = 8,
      POINT = 9,
      PERCENT_NUMBER = 10,
      NUMBER = 11,
      DIGIT = 12,
      SPACE = 13;
  public static final int RULE_calc = 0, RULE_expr = 1;

  private static String[] makeRuleNames() {
    return new String[] {"calc", "expr"};
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {
      null, "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'^'", "'%'", "'.'", null, null, null, "' '"
    };
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[] {
      null,
      "BR_OPEN",
      "BR_CLOSE",
      "PLUS",
      "MINUS",
      "TIMES",
      "DIVIDE",
      "POW",
      "PERCENT",
      "POINT",
      "PERCENT_NUMBER",
      "NUMBER",
      "DIGIT",
      "SPACE"
    };
  }

  private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  /** @deprecated Use {@link #VOCABULARY} instead. */
  @Deprecated public static final String[] tokenNames;

  static {
    tokenNames = new String[_SYMBOLIC_NAMES.length];
    for (int i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }

      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override
  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }

  @Override
  public String getGrammarFileName() {
    return "Expression.g4";
  }

  @Override
  public String[] getRuleNames() {
    return ruleNames;
  }

  @Override
  public String getSerializedATN() {
    return _serializedATN;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public ExpressionParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  @SuppressWarnings("CheckReturnValue")
  public static class CalcContext extends ParserRuleContext {
    public CalcContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_calc;
    }

    public CalcContext() {}

    public void copyFrom(CalcContext ctx) {
      super.copyFrom(ctx);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class CalculationBlockContext extends CalcContext {
    public ExprContext expr() {
      return getRuleContext(ExprContext.class, 0);
    }

    public TerminalNode EOF() {
      return getToken(ExpressionParser.EOF, 0);
    }

    public CalculationBlockContext(CalcContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ExpressionVisitor)
        return ((ExpressionVisitor<? extends T>) visitor).visitCalculationBlock(this);
      else return visitor.visitChildren(this);
    }
  }

  public final CalcContext calc() throws RecognitionException {
    CalcContext _localctx = new CalcContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_calc);
    try {
      _localctx = new CalculationBlockContext(_localctx);
      enterOuterAlt(_localctx, 1);
      {
        setState(4);
        expr(0);
        setState(5);
        match(EOF);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ExprContext extends ParserRuleContext {
    public ExprContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_expr;
    }

    public ExprContext() {}

    public void copyFrom(ExprContext ctx) {
      super.copyFrom(ctx);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ExpressionWithBrContext extends ExprContext {
    public TerminalNode BR_OPEN() {
      return getToken(ExpressionParser.BR_OPEN, 0);
    }

    public ExprContext expr() {
      return getRuleContext(ExprContext.class, 0);
    }

    public TerminalNode BR_CLOSE() {
      return getToken(ExpressionParser.BR_CLOSE, 0);
    }

    public ExpressionWithBrContext(ExprContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ExpressionVisitor)
        return ((ExpressionVisitor<? extends T>) visitor).visitExpressionWithBr(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ExpressionTimesOrDivideContext extends ExprContext {
    public Token op;

    public List<ExprContext> expr() {
      return getRuleContexts(ExprContext.class);
    }

    public ExprContext expr(int i) {
      return getRuleContext(ExprContext.class, i);
    }

    public TerminalNode TIMES() {
      return getToken(ExpressionParser.TIMES, 0);
    }

    public TerminalNode DIVIDE() {
      return getToken(ExpressionParser.DIVIDE, 0);
    }

    public ExpressionTimesOrDivideContext(ExprContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ExpressionVisitor)
        return ((ExpressionVisitor<? extends T>) visitor).visitExpressionTimesOrDivide(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ExpressionNumericContext extends ExprContext {
    public Token sign;
    public Token num;

    public TerminalNode NUMBER() {
      return getToken(ExpressionParser.NUMBER, 0);
    }

    public TerminalNode PERCENT_NUMBER() {
      return getToken(ExpressionParser.PERCENT_NUMBER, 0);
    }

    public TerminalNode PLUS() {
      return getToken(ExpressionParser.PLUS, 0);
    }

    public TerminalNode MINUS() {
      return getToken(ExpressionParser.MINUS, 0);
    }

    public ExpressionNumericContext(ExprContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ExpressionVisitor)
        return ((ExpressionVisitor<? extends T>) visitor).visitExpressionNumeric(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ExpressionPlusOrMinusContext extends ExprContext {
    public Token op;

    public List<ExprContext> expr() {
      return getRuleContexts(ExprContext.class);
    }

    public ExprContext expr(int i) {
      return getRuleContext(ExprContext.class, i);
    }

    public TerminalNode PLUS() {
      return getToken(ExpressionParser.PLUS, 0);
    }

    public TerminalNode MINUS() {
      return getToken(ExpressionParser.MINUS, 0);
    }

    public ExpressionPlusOrMinusContext(ExprContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof ExpressionVisitor)
        return ((ExpressionVisitor<? extends T>) visitor).visitExpressionPlusOrMinus(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ExprContext expr() throws RecognitionException {
    return expr(0);
  }

  private ExprContext expr(int _p) throws RecognitionException {
    ParserRuleContext _parentctx = _ctx;
    int _parentState = getState();
    ExprContext _localctx = new ExprContext(_ctx, _parentState);
    ExprContext _prevctx = _localctx;
    int _startState = 2;
    enterRecursionRule(_localctx, 2, RULE_expr, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(16);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case BR_OPEN:
            {
              _localctx = new ExpressionWithBrContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;

              setState(8);
              match(BR_OPEN);
              setState(9);
              expr(0);
              setState(10);
              match(BR_CLOSE);
            }
            break;
          case PLUS:
          case MINUS:
          case PERCENT_NUMBER:
          case NUMBER:
            {
              _localctx = new ExpressionNumericContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(13);
              _errHandler.sync(this);
              _la = _input.LA(1);
              if (_la == PLUS || _la == MINUS) {
                {
                  setState(12);
                  ((ExpressionNumericContext) _localctx).sign = _input.LT(1);
                  _la = _input.LA(1);
                  if (!(_la == PLUS || _la == MINUS)) {
                    ((ExpressionNumericContext) _localctx).sign =
                        (Token) _errHandler.recoverInline(this);
                  } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                  }
                }
              }

              setState(15);
              ((ExpressionNumericContext) _localctx).num = _input.LT(1);
              _la = _input.LA(1);
              if (!(_la == PERCENT_NUMBER || _la == NUMBER)) {
                ((ExpressionNumericContext) _localctx).num =
                    (Token) _errHandler.recoverInline(this);
              } else {
                if (_input.LA(1) == Token.EOF) matchedEOF = true;
                _errHandler.reportMatch(this);
                consume();
              }
            }
            break;
          default:
            throw new NoViableAltException(this);
        }
        _ctx.stop = _input.LT(-1);
        setState(26);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(24);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                case 1:
                  {
                    _localctx =
                        new ExpressionTimesOrDivideContext(
                            new ExprContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                    setState(18);
                    if (!(precpred(_ctx, 2)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                    setState(19);
                    ((ExpressionTimesOrDivideContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == TIMES || _la == DIVIDE)) {
                      ((ExpressionTimesOrDivideContext) _localctx).op =
                          (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(20);
                    expr(3);
                  }
                  break;
                case 2:
                  {
                    _localctx =
                        new ExpressionPlusOrMinusContext(new ExprContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                    setState(21);
                    if (!(precpred(_ctx, 1)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 1)");
                    setState(22);
                    ((ExpressionPlusOrMinusContext) _localctx).op = _input.LT(1);
                    _la = _input.LA(1);
                    if (!(_la == PLUS || _la == MINUS)) {
                      ((ExpressionPlusOrMinusContext) _localctx).op =
                          (Token) _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(23);
                    expr(2);
                  }
                  break;
              }
            }
          }
          setState(28);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      unrollRecursionContexts(_parentctx);
    }
    return _localctx;
  }

  public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
    switch (ruleIndex) {
      case 1:
        return expr_sempred((ExprContext) _localctx, predIndex);
    }
    return true;
  }

  private boolean expr_sempred(ExprContext _localctx, int predIndex) {
    switch (predIndex) {
      case 0:
        return precpred(_ctx, 2);
      case 1:
        return precpred(_ctx, 1);
    }
    return true;
  }

  public static final String _serializedATN =
      "\u0004\u0001\r\u001e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"
          + "\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"
          + "\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u000e\b\u0001\u0001\u0001\u0003"
          + "\u0001\u0011\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"
          + "\u0001\u0001\u0001\u0005\u0001\u0019\b\u0001\n\u0001\f\u0001\u001c\t\u0001"
          + "\u0001\u0001\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0003\u0001\u0000"
          + "\u0003\u0004\u0001\u0000\n\u000b\u0001\u0000\u0005\u0006\u001f\u0000\u0004"
          + "\u0001\u0000\u0000\u0000\u0002\u0010\u0001\u0000\u0000\u0000\u0004\u0005"
          + "\u0003\u0002\u0001\u0000\u0005\u0006\u0005\u0000\u0000\u0001\u0006\u0001"
          + "\u0001\u0000\u0000\u0000\u0007\b\u0006\u0001\uffff\uffff\u0000\b\t\u0005"
          + "\u0001\u0000\u0000\t\n\u0003\u0002\u0001\u0000\n\u000b\u0005\u0002\u0000"
          + "\u0000\u000b\u0011\u0001\u0000\u0000\u0000\f\u000e\u0007\u0000\u0000\u0000"
          + "\r\f\u0001\u0000\u0000\u0000\r\u000e\u0001\u0000\u0000\u0000\u000e\u000f"
          + "\u0001\u0000\u0000\u0000\u000f\u0011\u0007\u0001\u0000\u0000\u0010\u0007"
          + "\u0001\u0000\u0000\u0000\u0010\r\u0001\u0000\u0000\u0000\u0011\u001a\u0001"
          + "\u0000\u0000\u0000\u0012\u0013\n\u0002\u0000\u0000\u0013\u0014\u0007\u0002"
          + "\u0000\u0000\u0014\u0019\u0003\u0002\u0001\u0003\u0015\u0016\n\u0001\u0000"
          + "\u0000\u0016\u0017\u0007\u0000\u0000\u0000\u0017\u0019\u0003\u0002\u0001"
          + "\u0002\u0018\u0012\u0001\u0000\u0000\u0000\u0018\u0015\u0001\u0000\u0000"
          + "\u0000\u0019\u001c\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000"
          + "\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u0003\u0001\u0000\u0000"
          + "\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u0004\r\u0010\u0018\u001a";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}

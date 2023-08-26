// Generated from Expression.g4 by ANTLR 4.13.0

// 定义package
package org.example.parser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExpressionLexer extends Lexer {
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
  public static String[] channelNames = {"DEFAULT_TOKEN_CHANNEL", "HIDDEN"};

  public static String[] modeNames = {"DEFAULT_MODE"};

  private static String[] makeRuleNames() {
    return new String[] {
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

  public ExpressionLexer(CharStream input) {
    super(input);
    _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
  public String[] getChannelNames() {
    return channelNames;
  }

  @Override
  public String[] getModeNames() {
    return modeNames;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public static final String _serializedATN =
      "\u0004\u0000\rI\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"
          + "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"
          + "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"
          + "\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"
          + "\u0007\u000b\u0002\f\u0007\f\u0001\u0000\u0001\u0000\u0001\u0001\u0001"
          + "\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"
          + "\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"
          + "\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t0\b\t\u0001\t\u0001\t\u0001"
          + "\n\u0004\n5\b\n\u000b\n\f\n6\u0001\n\u0001\n\u0004\n;\b\n\u000b\n\f\n"
          + "<\u0003\n?\b\n\u0001\u000b\u0004\u000bB\b\u000b\u000b\u000b\f\u000bC\u0001"
          + "\f\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0001\u0001\u0003\u0002\u0005"
          + "\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"
          + "\u0015\u000b\u0017\f\u0019\r\u0001\u0000\u0001\u0001\u000009M\u0000\u0001"
          + "\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"
          + "\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"
          + "\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"
          + "\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"
          + "\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"
          + "\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"
          + "\u0000\u0000\u0001\u001b\u0001\u0000\u0000\u0000\u0003\u001d\u0001\u0000"
          + "\u0000\u0000\u0005\u001f\u0001\u0000\u0000\u0000\u0007!\u0001\u0000\u0000"
          + "\u0000\t#\u0001\u0000\u0000\u0000\u000b%\u0001\u0000\u0000\u0000\r\'\u0001"
          + "\u0000\u0000\u0000\u000f)\u0001\u0000\u0000\u0000\u0011+\u0001\u0000\u0000"
          + "\u0000\u0013-\u0001\u0000\u0000\u0000\u00154\u0001\u0000\u0000\u0000\u0017"
          + "A\u0001\u0000\u0000\u0000\u0019E\u0001\u0000\u0000\u0000\u001b\u001c\u0005"
          + "(\u0000\u0000\u001c\u0002\u0001\u0000\u0000\u0000\u001d\u001e\u0005)\u0000"
          + "\u0000\u001e\u0004\u0001\u0000\u0000\u0000\u001f \u0005+\u0000\u0000 "
          + "\u0006\u0001\u0000\u0000\u0000!\"\u0005-\u0000\u0000\"\b\u0001\u0000\u0000"
          + "\u0000#$\u0005*\u0000\u0000$\n\u0001\u0000\u0000\u0000%&\u0005/\u0000"
          + "\u0000&\f\u0001\u0000\u0000\u0000\'(\u0005^\u0000\u0000(\u000e\u0001\u0000"
          + "\u0000\u0000)*\u0005%\u0000\u0000*\u0010\u0001\u0000\u0000\u0000+,\u0005"
          + ".\u0000\u0000,\u0012\u0001\u0000\u0000\u0000-/\u0003\u0015\n\u0000.0\u0005"
          + " \u0000\u0000/.\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001"
          + "\u0000\u0000\u000012\u0003\u000f\u0007\u00002\u0014\u0001\u0000\u0000"
          + "\u000035\u0003\u0017\u000b\u000043\u0001\u0000\u0000\u000056\u0001\u0000"
          + "\u0000\u000064\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007>\u0001"
          + "\u0000\u0000\u00008:\u0003\u0011\b\u00009;\u0003\u0017\u000b\u0000:9\u0001"
          + "\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000"
          + "<=\u0001\u0000\u0000\u0000=?\u0001\u0000\u0000\u0000>8\u0001\u0000\u0000"
          + "\u0000>?\u0001\u0000\u0000\u0000?\u0016\u0001\u0000\u0000\u0000@B\u0007"
          + "\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"
          + "CA\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000D\u0018\u0001\u0000"
          + "\u0000\u0000EF\u0005 \u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0006\f"
          + "\u0000\u0000H\u001a\u0001\u0000\u0000\u0000\u0006\u0000/6<>C\u0001\u0006"
          + "\u0000\u0000";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}

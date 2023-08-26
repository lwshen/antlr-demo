# Antlr4 demo

1. Install

To play around with ANTLR, you can use antlr4-tools, which only requires Python3.

```shell
pip install antlr4-tools
```

2. Build Java code

```shell
antlr4 -o src/main/java/org/example/parser -visitor -no-listener Expression.g4
```

3. Add custom override function in `BigDecimalCalculatorVisitor.java`

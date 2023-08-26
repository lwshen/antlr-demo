package org.example;

import static org.junit.jupiter.params.provider.Arguments.arguments;

import java.util.stream.Stream;
import junit.framework.TestCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class CalculatorTest extends TestCase {

  @DisplayName("Test Calculator")
  @ParameterizedTest(name = "expression={0}, expected={1}")
  @MethodSource("data")
  public void testExecute(String expression, String expected) {
    Calculator calculator = new Calculator();
    assertEquals(expected, calculator.execute(expression).toPlainString());
  }

  private static Stream<Arguments> data() {
    return Stream.of(
        arguments("1 + 2", "3"),
        arguments("3 - 2", "1"),
        arguments("2 * 3", "6"),
        arguments("6 / 3", "2"),
        arguments("6 / (1 + 2)", "2"),
        arguments("1.1 * 2", "2.2"),
        arguments("50%", "0.5"),
        arguments("100 * 30%", "30.0"));
  }
}

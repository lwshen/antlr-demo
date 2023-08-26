package org.example;

public class Main {
  public static void main(String[] args) {
    String expression = "-1+2+2*3+3*(3+2)";
    Calculator calculator = new Calculator();
    System.out.println(calculator.execute(expression));
  }
}

package my.goit.java;

import java.util.Scanner;

public class ParsedExpression {
    private double firstOperand, secondOperand;
    private String symbol;

    public ParsedExpression(String expression) {
        parse(expression);
    }

    void parse(String expression){
        try(Scanner scanner = new Scanner(expression)){
            String[] operands = expression.split("[\\D+&&[^\\.?]]");
            String[] operators = expression.split("\\d+\\.?\\d*");
            firstOperand = Double.valueOf(operands[0]);
            secondOperand = Double.valueOf(operands[1]);
            symbol = operators[1];
            scanner.close();
        }
    }

    public double getFirstOperand() {
        return firstOperand;
    }

    public double getSecondOperand() {
        return secondOperand;
    }

    public String getSymbol() {
        return symbol;
    }
}

package my.goit.java.operator;

public class Addition implements Operator {
    private String symbol = "+";
    public Double calculate(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }
}

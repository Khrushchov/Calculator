package my.goit.java.operator;

public class Division implements Operator {
    private String symbol = "/";
    public Double calculate(double firstOperand, double secondOperand) {
        return firstOperand/secondOperand;
    }
}

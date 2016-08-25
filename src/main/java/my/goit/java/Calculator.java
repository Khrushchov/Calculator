package my.goit.java;

import my.goit.java.operator.*;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private ParsedExpression expression;
    private Map<String, Operator> operators  = new HashMap<>();

    public Calculator(ParsedExpression expression) {
        this.expression = expression;
        populateListOfOperators();
    }

    private void populateListOfOperators(){
        operators.put("+", new Addition());
        operators.put("-", new Subtraction());
        operators.put("*", new Multiplication());
        operators.put("/", new Division());
    }

    public Double calculate(){
        double firstOperand = expression.getFirstOperand();
        double secondOperand = expression.getSecondOperand();
        Operator operator = operators.get(expression.getSymbol());
        return operator.calculate(firstOperand, secondOperand);

    }
}

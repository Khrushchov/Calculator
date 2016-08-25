package my.goit.java;

import java.util.Scanner;

public class Bootstrap {
    public static void main(String[] args) {

        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            while(true){
            System.out.println("Enter math expression without space, example 5+3.");
            System.out.println("Enter quit for exit from program.");
            String expression = scanner.nextLine();
            if (expression.equalsIgnoreCase("quit")){
                System.out.println("Bye - bye");
                return;
            }
            ParsedExpression parsedExpression = new ParsedExpression(expression);
            Calculator calculator = new Calculator(parsedExpression);

            System.out.println("Result: " + calculator.calculate());
            }
        } finally {
            scanner.close();
        }
    }
}

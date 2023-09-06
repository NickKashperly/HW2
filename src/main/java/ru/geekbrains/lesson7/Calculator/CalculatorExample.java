package ru.geekbrains.lesson7.Calculator;



import java.util.Scanner;

public class CalculatorExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a math expression (e.g., 10 / 0): ");
        String expression = scanner.nextLine();

        try {
            double result = calculate(expression);
            System.out.println("Result: " + result);
        } catch (CalculationException e) {
            System.out.println("CalculationException caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    public static double calculate(String expression) throws CalculationException {
        String[] tokens = expression.split(" ");
        if (tokens.length != 3) {
            throw new CalculationException("Invalid expression format: " + expression);
        }

        double operand1 = Double.parseDouble(tokens[0]);
        double operand2 = Double.parseDouble(tokens[2]);
        String operator = tokens[1];

        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
                return operand1 / operand2;
            default:
                throw new CalculationException("Unknown operator: " + operator);
        }
    }
}



package ru.geekbrains.lesson7.For;

import java.util.Scanner;

public class CalculatorUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            double num1 = getNumberFromUser(scanner, "Enter first number: ");
            double num2 = getNumberFromUser(scanner, "Enter second number: ");

            double result = Calculator.divide(num1, num2);
            System.out.println("Result: " + result);
        } catch (UIException e) {
            System.out.println("UI Error: " + e.getMessage());
        } catch (BusinessLogicException e) {
            System.out.println("Business Logic Error: " + e.getMessage());
        }
    }

    public static double getNumberFromUser(Scanner scanner, String prompt) throws UIException {
        System.out.print(prompt);
        double number;
        try {
            number = scanner.nextDouble();
            if (number <= 0) {
                throw new UIException("Invalid number. Please enter a positive number.");
            }
        } catch (Exception e) {
            throw new UIException("Invalid input. Please enter a valid number.");
        }
        return number;
    }
}
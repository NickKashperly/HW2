package ru.geekbrains.lesson7.Task3;

import java.util.Scanner;

public class CalculatorUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        try {
            double result = Calculator.divide(num1, num2);
            System.out.println("Result: " + result);
        } catch (CalculatorException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

package ru.geekbrains.lesson7.Task3;

public class Calculator {
    public static double divide(double num1, double num2) throws CalculatorException {
        if (num2 == 0) {
            throw new CalculatorException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}
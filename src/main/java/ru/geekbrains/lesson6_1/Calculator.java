package ru.geekbrains.lesson6_1;

public class Calculator {
    public static double divide(int dividend, int divisor) throws DivisionException {
        if (divisor == 0) {
            throw new DivisionException("Division by zero is not allowed.", dividend);
        }
        return (double) dividend / divisor;
    }

    public static void main(String[] args) {
        try {
            double result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            System.out.println("Exception caught: " + e.getMessage());
            System.out.println("Dividend: " + e.getDividend());
        }
    }
}
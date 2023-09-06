package ru.geekbrains.lesson6_1;

public class DivisionException extends Exception {
    private int dividend;

    public DivisionException(String message, int dividend) {
        super(message);
        this.dividend = dividend;
    }

    public int getDividend() {
        return dividend;
    }
}
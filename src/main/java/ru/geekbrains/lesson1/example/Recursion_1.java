package ru.geekbrains.lesson1.example;

public class Recursion_1 {
    public static void main(String[] args) {
        f(4);

    }
    /**
     * n = 4
     */

    static void f(int n){
        System.out.println(n);
        if (n >= 3) {
            f(n-1);
            f(n-2);
            f(n-2);

        }
    }
}

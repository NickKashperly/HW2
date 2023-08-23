package ru.geekbrains.lesson1.example;

import java.util.Scanner;

public class Ex4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(fiboRecursion(n));
    }

    /**
     * apiNote Algoritm fibonchi
     *
     * @param pos - position to find
     * @return value of the element
     */
    public static int fiboRecursion(int pos) {
        if (pos == 1 || pos == 2) {
            return 1;
        }
        return fiboRecursion(pos - 1) + fiboRecursion(pos - 2);
    }
}

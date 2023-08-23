package ru.geekbrains.lesson1.example;

import java.util.Scanner;

public class Ex5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(fiboLoop(n));
    }

    /**
     * apiNote Algoritm fibonchi
     *
     * @param pos - position to find
     * @return value of the element
     */
    public static int fiboLoop(int pos) {
        int f0=1, f1=1, f2=1;
        for (int i = 2; i < pos; i++) {
            f0 = f1 +f2;
            f2 = f1;
            f1 = f0;

        }
        return f0;
    }
}


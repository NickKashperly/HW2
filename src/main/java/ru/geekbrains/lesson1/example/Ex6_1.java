package ru.geekbrains.lesson1.example;

import java.util.Scanner;

public class Ex6_1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 5; i < 50; i+=10) {
            long t1 = System.currentTimeMillis();
            System.out.println(Ex5_1.fiboLoop(i));
            long t2 = System.currentTimeMillis();
            System.out.println(Ex4_1.fiboRecursion(i));
            long t3 = System.currentTimeMillis();
            System.out.println("Loop" + i+' '+ (t2 - t1) + "ms");
            System.out.println("fibo" + i+' '+(t3 - t2) + "ms");
        }

    }

}

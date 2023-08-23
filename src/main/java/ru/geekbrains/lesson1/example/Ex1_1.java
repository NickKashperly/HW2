package ru.geekbrains.lesson1.example;

import java.util.Scanner;

public class Ex1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = getSum(n);  // todo: переделать метод
        System.out.println("sum = " + sum);
    }

    /**
     * @apiNote необходимо составить алгоритм вычисления суммы чисел от 1 до n
     * @param n - число до которого необходимо ссумировать
     * @return сумма
     */
    private static int getSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1;

        }
        return sum;
    }

}

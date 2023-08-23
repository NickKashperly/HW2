package ru.geekbrains.lesson1.example;

import java.util.Scanner;

public class Ex3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int facet = scanner.nextInt();
        scanner.close();
        System.out.println(getCount(facet));
    }

    /**
     * @apiNote Алгоритм поиска всех доступнух комбинаций для кубиков с количеством граней N.
     * @param facet - количество граней
     * @return - возвращаем счетчик
     */
    private static int getCount(int facet) {
        int count = 0;
        for (int i = 0; i < facet; i++) {
            for (int j = 0; j < facet; j++) {
                for (int k = 0; k < facet; k++) {
                    for (int l = 0; l < facet; l++) {
                        count++;

                    }

                }

            }

        }
        return count;
    }
}

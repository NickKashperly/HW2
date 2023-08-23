package ru.geekbrains.lesson2;

import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int size = 100;
        int min = 1;
        int max = 100;
        int [] array = Ex1.getRandomArr(size, min, max);
        Ex1.printArr(array);
        Arrays.sort(array);
        Ex1.printArr(array);
        System.out.println(sort(array));

    }

    public static int sort(int[] array) {
        // Построение кучу (Перегрупируем массив)
        for (int i = array.length/2-1; i >=0 ; i--)
            heapify(array, array.length, i);

         // один за другим извлекаем элементы из кучи
        for (int i = array.length-1; i >=0 ; i--) {
            // перегружаем текущий корень в конец
            int temp = array[0];
            array[0]=array[i];
            array[i]=temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(array, i, 0);
        }
        return 0;
    }
    public static void heapify(int [] array, int heapSize, int rootIndex) {
        int largest = rootIndex; // инициализируем наибольший элемент как корень
        int leftChild = 2*rootIndex+1; // левый ребенок
        int rightChild = 2*rootIndex +2; // правый ребенок

        // если левый ребенок больше родителя
        if (leftChild<heapSize && array[leftChild]>array[largest])
            largest = leftChild;

        //если правый ребенок больше родителя
        if (rightChild<heapSize && array[rightChild]>array[largest])
            largest=rightChild;

        // если самый большой элемент не корень
        if (largest !=rootIndex){
            int temp = array[rootIndex];
            array[rootIndex]=array[largest];
            array[largest]=temp;

            // Рекурсивно преобразуем в двоичную кучу затронутое дерево
            heapify(array, heapSize, rootIndex);
        }
    }
}

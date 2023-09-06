package ru.geekbrains.lesson3;

public class Main {
    public static void main(String[] args) {
        TwoLinkedList list = new TwoLinkedList();
        list.addFirst(1);
        list.addFirst(2);
//        System.out.println(list);
        list.addFirst(3);
        list.addFirst(4);
 //       System.out.println(list);
        list.addLast(8);
        list.addLast(5);
       list.print();
 //       list.deleteFirst();
  //      System.out.println(list);
  //      list.removeLast();
//        list.print();
        list.sort();
        System.out.println(" === ");
        list.print();



    }

}
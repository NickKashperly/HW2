package ru.geekbrains.lesson3;

public class LinkedList {
    private Node head;

    public void addFirst(int value) {
        Node node = new Node(value);
        // todo: Посмотреть позже, необходимо ли условие для данного метода
        if (head != null) {
            node.next = head;
        }
        head = node;
    }

    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
            System.out.println(value);
        }
    }

    public boolean isContains(int target) {
        return find(target) != null ? true : false;
    }

    public Node find(int target) {
        while (head != null) {
            if (head.value == target) {
                return head;
            }
            head = head.next;
        }
        return null;
    }


    public void addLast(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }


    public void removeLast() {
        if (head != null) {
            Node current = head;
            while (current.next.next != null) {
                if (current.next.next == null) {
                    current.next = null;
                    return;
                }
                current = current.next;
            }
            head = null;
        }
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        Node current = head;
        str.append(current.value).append(" ,");
        while (current.next != null) {
            str.append(current.value).append(" ,");
            current = current.next;
        }
        return ("LinkedList{" + str + '}');
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println("currentNode" + current.value);
            current = current.next;
        }
    }
}






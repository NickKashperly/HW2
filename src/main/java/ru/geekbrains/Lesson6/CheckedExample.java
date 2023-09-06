package ru.geekbrains.Lesson6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExample {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
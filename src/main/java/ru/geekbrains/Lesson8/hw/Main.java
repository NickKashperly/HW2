package ru.geekbrains.Lesson8.hw;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ProductNotFoundException, IllegalArgumentException {

        List<Product> products = Arrays.asList(
                new Product(1,"Apple",2.50),
                new Product(2,"Orange",1.50));

        ShopManager shopManager = Manager.createShop(products);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product ID: ");
        int productId = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter quantity: ");
        int quantity = Integer.parseInt(scanner.nextLine());

        double totalPrice = shopManager.purchaseProduct(productId, quantity);
        System.out.println("Total price: " + totalPrice);
    }
}
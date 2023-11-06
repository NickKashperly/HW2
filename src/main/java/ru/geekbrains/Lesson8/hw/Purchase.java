package ru.geekbrains.Lesson8.hw;

public interface Purchase {
    default double purchaseProduct(int productId, int quantity) throws ProductNotFoundException {
        if (quantity <= 0) {
            throw new IllegalArgumentException();
        }
        Product product = getProductById(productId);
        if (product == null) {
            throw new ProductNotFoundException();
        }
        double totalPrice = quantity * product.getPrice();
        System.out.printf("Purchased %d quantity(s) of product %s (%s)\n", quantity, product.getName(), totalPrice);
        return totalPrice;
    }

    Product getProductById(int productId) throws ProductNotFoundException;
}

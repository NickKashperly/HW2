package ru.geekbrains.Lesson8.hw;
import java.util.*;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class AbstractShop implements Purchase {
    protected List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    @Override
    public Product getProductById(int productId) throws ProductNotFoundException {
        for (Product product : products) {
            if (product.getId() == productId) {
                return product;
            }
        }
        throw new ProductNotFoundException();
    }
}

class Shop extends AbstractShop {
    public Shop() {
        addProduct(new Product(1, "“Apple”", 2.50));
        addProduct(new Product(2, "“Orange”", 1.50));
    }
}

class Manager {
    Shop shop;

    public Manager(Shop shop) {
        this.shop = shop;
    }

    public static ShopManager createShop(List<Product> products) {
        Shop shop = new Shop();
        shop.addProduct(products.get(0));
        shop.addProduct(products.get(1));
        return new ShopManager(shop);
    }
}

class ShopManager extends Manager implements Purchase {

    public ShopManager(Shop shop){
        super(shop);
    }

    @Override
    public Product getProductById(int productId) throws ProductNotFoundException{
        return super.shop.getProductById(productId);
    }
}



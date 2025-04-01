package abstractClassesAndMethods;

import java.util.ArrayList;
import java.util.List;

class ShoppingCartDemo {
	public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(new ElectronicsProduct("Laptop", 50000, "Dell"));
        cart.addProduct(new ClothingProduct("T-Shirt", 250, "M"));
        cart.addProduct(new BookProduct("Java Programming", 200, "Herbert Schildt"));
        cart.displayCart();
    }
}
abstract class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract double getPrice();
    public abstract String getDescription();
}

// Electronics Product class
class ElectronicsProduct extends Product {
    private String brand;

    public ElectronicsProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Electronics: " + name + " by " + brand + " - Price: " + price;
    }
}

// Clothing Product class
class ClothingProduct extends Product {
    private String size;

    public ClothingProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Clothing: " + name + " (Size: " + size + ") - Price: " + price;
    }
}

// Book Product class
class BookProduct extends Product {
    private String author;

    public BookProduct(String name, double price, String author) {
        super(name, price);
        this.author = author;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return "Book: " + name + " by " + author + " - Price: " + price;
    }
}

// Shopping Cart class
class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayCart() {
        double total = 0;
        for (Product product : products) {
            System.out.println(product.getDescription());
            total += product.getPrice();
        }
        System.out.println("Total Price (₹): " + total);
    }
}

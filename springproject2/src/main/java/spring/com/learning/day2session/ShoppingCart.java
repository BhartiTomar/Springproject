package spring.com.learning.day2session;


import java.util.ArrayList;
import java.util.List;
 
public class ShoppingCart {
    private List<Product> products;
 
    // Injected dependencies
    private Product product;
    private Battery battery;
    private Disc disc;
 
    public ShoppingCart(Product product, Battery battery, Disc disc) {
        this.products = new ArrayList<>();
        this.product = product;
        this.battery = battery;
        this.disc = disc;
    }
 
    public void addProduct(Product product) {
        products.add(product);
    }
 
    public double calculateTotal() {
        double total = 0.0;
        for (Product p : products) {
            total += p.getPrice() * (1 - p.getDiscount());
        }
        return total;
    }
}
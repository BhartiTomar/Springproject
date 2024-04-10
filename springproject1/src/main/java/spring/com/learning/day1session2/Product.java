package spring.com.learning.day1session2;

public abstract class Product {
    private int productId;
    private String productName;
    private double price;
	public int getProductId() {
		return productId;
	}
	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
}

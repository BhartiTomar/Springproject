package spring.com.learning.day1session2;

public class Disc extends Product {
   public Disc(int productId, String productName, double price) {
		super(productId, productName, price);

	}

private int capacity;

public int getCapacity() {
	return capacity;
}

public void setCapacity(int capacity) {
	this.capacity = capacity;
}

}
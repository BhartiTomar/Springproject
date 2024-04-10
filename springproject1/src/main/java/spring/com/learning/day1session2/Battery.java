package spring.com.learning.day1session2;

public class Battery extends Product {
    public Battery(int productId, String productName, double price) {
		super(productId, productName, price);

	}

	private boolean rechargeable;

	public boolean isRechargeable() {
		return rechargeable;
	}

	public void setRechargeable(boolean rechargeable) {
		this.rechargeable = rechargeable;
	}

}
package spring.com.learning.day1session1;

public class Battery extends Product {
    private boolean rechargeable;

	public boolean isRechargeable() {
		return rechargeable;
	}

	public void setRechargeable(boolean rechargeable) {
		this.rechargeable = rechargeable;
	}

}
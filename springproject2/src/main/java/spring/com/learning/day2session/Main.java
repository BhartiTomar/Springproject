package spring.com.learning.day2session;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("shopping-beans.xml");
		
		Product product = (Product) context.getBean("product");
		Battery battery = (Battery) context.getBean("battery");
		Disc disc = (Disc) context.getBean("disc");
		
		context.close();

	}
	
//	void testCalculateTotal() {
//       
//        ShoppingCart.addProduct(new Product("Product1", 100.0));
//        ShoppingCart.addProduct(new Battery("Battery1", 50.0));
//        ShoppingCart.addProduct(new Disc("Disc1", 20.0));
//
//        double total = ShoppingCart.calculateTotal();
//
//        Assertions.assertEquals(140.0, total);
//    }
}


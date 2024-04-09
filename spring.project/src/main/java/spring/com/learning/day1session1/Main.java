package spring.com.learning.day1session1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Main {
    public static void main(String[] args) {
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }
}
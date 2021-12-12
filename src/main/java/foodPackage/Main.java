package foodPackage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Food dinnerobj = (Food) context.getBean("dinner");
		dinnerobj.displayMenu();
		Food lunchobj = (Food) context.getBean("lunch");
		lunchobj.displayMenu();
		Food breakfastobj = (Food) context.getBean("breakfast");
		breakfastobj.displayMenu();
	
		
	}

}

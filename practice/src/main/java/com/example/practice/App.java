package com.example.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Car car = new Car();
        //car.drive();
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
        //Vehicle obj = (Vehicle)context.getBean("vehicle");
    	
    	//annotation based configuration
    	//Vehicle obj = (Vehicle)context.getBean("car");
    	//Vehicle obj = (Vehicle)context.getBean("bike");
        //obj.drive();
    	
    	//Bean property
//    	Tyre t = (Tyre) context.getBean("Tyre");
//    	System.out.println(t);
    	
    	//Autowired annotation
    	Car obj = (Car)context.getbean("car");
    	obj.drive();
    	
    }
}

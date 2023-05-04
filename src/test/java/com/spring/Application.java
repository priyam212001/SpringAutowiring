package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		NonVegPizza obj=(NonVegPizza)context.getBean("a");
		System.out.println(obj.getPizza());
		
		VegPizza obj1=(VegPizza)context.getBean("b");
		System.out.println(obj1.getPizza());
		

	}

}

package com.rajkumar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListPropertiesApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rajkumar/spring/beans/spring-beans.xml");
		FruitBasket fruitBasket = (FruitBasket)context.getBean("fruitbasket");
		System.out.println(fruitBasket);
		((ClassPathXmlApplicationContext)context).close();
		
	}

}

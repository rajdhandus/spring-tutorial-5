package com.rajkumar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PNameSpaceApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rajkumar/spring/beans/beans.xml");
		Address address = (Address)context.getBean("address2");
		System.out.println(address);
		((ClassPathXmlApplicationContext)context).close();
		
	}

}

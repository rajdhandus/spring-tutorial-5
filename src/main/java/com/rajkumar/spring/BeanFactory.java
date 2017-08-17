package com.rajkumar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanFactory {
	
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rajkumar/spring/beans/beans.xml");
		Person person = (Person)context.getBean("person2");
		System.out.println(person);
		((ClassPathXmlApplicationContext)context).close();
	}

}

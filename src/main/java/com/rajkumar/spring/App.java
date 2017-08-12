package com.rajkumar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("src/main/java/com/rajkumar/spring/beans/beans.xml");
		Person person = (Person)context.getBean("person");
		person.speak();
		((FileSystemXmlApplicationContext)context).close();
		
		System.out.println(person);
		
		ApplicationContext context1 = new ClassPathXmlApplicationContext("com/rajkumar/spring/beans/beans.xml");
		Person person1 = (Person)context1.getBean("person");
		person1.speak();
		
		Address address = (Address)context1.getBean("address");
		
		((ClassPathXmlApplicationContext)context1).close();
		
		System.out.println(person1);
		System.out.println(address);


	}

}

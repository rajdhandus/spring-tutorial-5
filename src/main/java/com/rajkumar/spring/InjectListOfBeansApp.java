package com.rajkumar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectListOfBeansApp {

	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("com/rajkumar/spring/beans/listOfBeans.xml");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/rajkumar/spring/beans/InnerBeans.xml");
		Jungle jungle = (Jungle)context.getBean("jungle");
		System.out.println(jungle);
		((ClassPathXmlApplicationContext)context).close();
	}

}

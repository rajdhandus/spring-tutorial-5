package com.rajkumar.spring;

public class PersonFactory {
	
	public Person createPerson(int id, String name) {
		System.out.println("Using factory method to create Person");
		return new Person(id, name);
	}

}

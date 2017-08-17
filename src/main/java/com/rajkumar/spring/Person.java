package com.rajkumar.spring;

public class Person {
	
	private int id;
	private String name;
	
	private int taxId;
	private Address address;

	/**
	 * 
	 */
	public Person() {
	}
	
	public static Person getInstance(int id, String name) {
		System.out.println("Creating Person using factory method");
		return new Person(id, name);
	}

	/**
	 * @param id
	 * @param name
	 */
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void onInit() {
		System.out.println("Person Object Initialized :" + this);
	}
	
	public void onDestroy() {
		System.out.println("Person Object Destroyed :" + this);
	}
	
	

	/**
	 * @param taxId the taxId to set
	 */
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	public void speak() {
		System.out.println("Hello World!");
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

	
}

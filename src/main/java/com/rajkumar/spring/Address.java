package com.rajkumar.spring;

public class Address {
	
	private String street;
	private int postalCode;
	
	/**
	 * 
	 */
	public Address() {
	}
	
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * @param street
	 * @param postalCode
	 */
	public Address(String street, int postalCode) {
		this.street = street;
		this.postalCode = postalCode;
	}
	
	public void init() {
		System.out.println("init method called");
	}
	
	public void destroy() {
		System.out.println("destroy method called");
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [street=" + street + ", postalCode=" + postalCode + "]";
	}
	
	

}

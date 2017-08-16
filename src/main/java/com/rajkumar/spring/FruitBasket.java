package com.rajkumar.spring;

import java.util.List;

public class FruitBasket {
	
	private String name;
	private List<String> fruits;
	
	/**
	 * @param name
	 * @param fruits
	 */
	public FruitBasket(String name, List<String> fruits) {
		this.name = name;
		this.fruits = fruits;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FruitBasket [name=" + name + ", contains fruits=" + fruits + "]";
	}
	
}

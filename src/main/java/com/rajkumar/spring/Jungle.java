package com.rajkumar.spring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Jungle {
	
	private Animal largest;
	private List<Animal> animals;
	private Map<String, String> foodsForAnimals = new HashMap<String, String>();

	
	
	/**
	 * @param foodsForAnimals the foodsForAnimals to set
	 */
	public void setFoodsForAnimals(Map<String, String> foodsForAnimals) {
		this.foodsForAnimals = foodsForAnimals;
	}

	/**
	 * @return the largest
	 */
	public Animal getLargest() {
		return largest;
	}

	/**
	 * @param largest the largest to set
	 */
	public void setLargest(Animal largest) {
		this.largest = largest;
	}

	/**
	 * @return the animals
	 */
	public List<Animal> getAnimals() {
		return animals;
	}

	/**
	 * @param animals the animals to set
	 */
	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Jungle [largest=" + largest + ", animals=" + animals + ", foodsForAnimals=" + foodsForAnimals + "]";
	}

	
	
	

}

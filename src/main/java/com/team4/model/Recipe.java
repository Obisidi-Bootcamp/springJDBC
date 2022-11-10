package com.team4.model;

public class Recipe {
	
	private String ingredients;
	private String measurement;
	
	
	public Recipe() {
		super();	
	}
	public Recipe(String ingredients, String measurement) {
		super();
		
		this.ingredients = ingredients;
		this.measurement = measurement;
	}


	public String getIngredients() {
		return ingredients;
	}


	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}


	public String getMeasurement() {
		return measurement;
	}


	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}
	
	@Override
	public String toString() {
		
		return "ReceipeModel[ingredients = " + ingredients + 
				",measurement = " + measurement + "]"; 		
	}
}

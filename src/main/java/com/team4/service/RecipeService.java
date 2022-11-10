package com.team4.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team4.dao.RecipeDao;
import com.team4.model.Recipe;

@Service
public class RecipeService {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	RecipeDao recipedao;
	
	public List<Recipe> listIngredients() {
		
		List<Recipe> ingredients = recipedao.listIngredients();
		
		ingredients.forEach(r -> LOGGER.debug("{}", r));
		
		return ingredients;
	}
	
	public Recipe findRecipe(String ingredients) {
		
		Recipe recipe = recipedao.findByIngredients(ingredients);
		
		LOGGER.debug("{}", recipe);	
		
		return recipe;
	}
	
	public void createIngredient(Recipe ingredients) {
		this.recipedao.createRecipe(ingredients);
		
		LOGGER.debug("Ingredient added: {}", ingredients);
	}

}

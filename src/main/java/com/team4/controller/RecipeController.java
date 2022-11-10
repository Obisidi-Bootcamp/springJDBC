package com.team4.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.team4.model.Recipe;
import com.team4.service.RecipeService;

//import cpm.team4.service.RecipeService;

@RestController
public class RecipeController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	RecipeService recipeService;
	
//	getting all ingredients
	@GetMapping(value = "/recipe")
	public List<Recipe> listIngredients() {
		LOGGER.debug("Listing Ingredients");
		List<Recipe> ingredients = this.recipeService.listIngredients();
		return ingredients;
	}
	
	
	@GetMapping(value = "/recipe/{ingredients}")
	public Recipe findRecipe(@PathVariable String ingredients) {
		LOGGER.debug("Finding Ingeredient, ingredients: {}");
		Recipe recipe = this.recipeService.findRecipe(ingredients);
		return recipe;
	}
	
	@PostMapping(value = "/recipe/create")
	public String createIngredient(@RequestBody Recipe ingredients) {
		LOGGER.debug("Creating Ingredient: {}", ingredients);
		this.recipeService.createIngredient(ingredients);
		return "ingredients created succesfully";
	}
	
	
}

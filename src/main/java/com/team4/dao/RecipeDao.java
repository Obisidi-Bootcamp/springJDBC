package com.team4.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.team4.model.Recipe;


@Repository
public class RecipeDao {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Recipe> listIngredients() {

		String sql = "SELECT * FROM \"Recipe\"";

		return jdbcTemplate.query(sql, new RecipeMapper());
	}
//	find by ingredient
	public Recipe findByIngredients(String ingredients) {

		String sql = "SELECT * FROM \"Recipe\" WHERE ingredients = ?";

		List<Recipe> recipes = jdbcTemplate.query(sql, new RecipeMapper(), ingredients);

		return recipes.isEmpty()?null:recipes.get(0);
	}
	
//	create an ingredient object in the Recipe table
	public void createRecipe(Recipe recipe) {
		
        String sql = "INSERT INTO \"Recipe\"(ingredients,measurement) " +
                     "VALUES(?,?)";
	
        logger.debug("Insert Query: {}",sql);
        
        jdbcTemplate.update(sql,new Object[] {recipe.getIngredients(), recipe.getMeasurement(),
                });
	}
}
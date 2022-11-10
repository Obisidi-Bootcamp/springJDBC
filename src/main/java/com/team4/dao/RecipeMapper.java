package com.team4.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.team4.model.Recipe;

public class RecipeMapper implements RowMapper<Recipe>{
	
	@Override
	public Recipe mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Recipe recipe = new Recipe();
		
		recipe.setIngredients(rs.getString("ingredients"));
		recipe.setMeasurement(rs.getString("measurement"));
		
		return recipe;
	}

}

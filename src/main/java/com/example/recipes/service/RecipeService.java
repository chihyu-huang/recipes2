package com.example.recipes.service;

import com.example.recipes.model.Recipe;

import java.util.List;

public interface RecipeService {
    List<Recipe> getAllRecipes();

    Recipe getRecipeById(Long id);

    Recipe createRecipe(Recipe recipe);

    Recipe updateRecipe(Long id, Recipe recipe);

    void deleteRecipe(Long id);
}

package com.example.recipes.controller;


import com.example.recipes.model.Recipe;
import com.example.recipes.repository.RecipeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    private final RecipeRepository recipeRepository;


    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping
    public Iterable<Recipe> findAll() {
        return recipeRepository.findAll();
    }
}

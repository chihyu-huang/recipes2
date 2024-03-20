package com.example.recipes.controller;

import com.example.recipes.model.Recipe;
import com.example.recipes.repository.RecipeRepository;
//import com.example.recipes.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    private final RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    // Get all recipes
    @GetMapping
    public ResponseEntity<List<Recipe>> getAllRecipes() {
        Iterable<Recipe> recipeIterable = recipeRepository.findAll();
        List<Recipe> recipes = new ArrayList<>();
        recipeIterable.forEach(recipes::add); // Convert Iterable to List
        return ResponseEntity.ok(recipes);
    }

    // Get recipe by ID
    @GetMapping("/{id}")
    public ResponseEntity<Recipe> getRecipeById(@PathVariable Integer id) {
        System.out.println("Received request for recipe with ID: " + id); // Add this logging statement
        Optional<Recipe> recipeOptional = recipeRepository.findById(id);
        return recipeOptional.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Create a new recipe
    @PostMapping
    public ResponseEntity<Recipe> createRecipe(@RequestBody Recipe recipe) {
        if (recipe == null) {
            return ResponseEntity.badRequest().build();
        }
        Recipe savedRecipe = recipeRepository.save(recipe);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedRecipe);
    }

    // Update an existing recipe
    @PutMapping("/{id}")
    public ResponseEntity<Recipe> updateRecipe(@PathVariable Integer id, @RequestBody Recipe updatedRecipe) {
        if (updatedRecipe == null) {
            return ResponseEntity.badRequest().build();
        }
        Optional<Recipe> existingRecipeOptional = recipeRepository.findById(id);
        if (existingRecipeOptional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        updatedRecipe.setId(id);
        Recipe savedRecipe = recipeRepository.save(updatedRecipe);
        return ResponseEntity.ok(savedRecipe);
    }

    // Delete a recipe by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRecipe(@PathVariable Integer id) {
        if (!recipeRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        recipeRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

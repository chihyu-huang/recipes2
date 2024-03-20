package com.example.recipes.controller;


import com.example.recipes.model.Recipe;
import org.springframework.ui.Model;
import com.example.recipes.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    private final RecipeRepository recipeRepository;


    @Autowired
    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

//    @GetMapping
//    public Iterable<Recipe> findAll() {
//        return recipeRepository.findAll();
//    }
//
//    @GetMapping
//    public String showRecipes(Model model) {
//        model.addAttribute("recipes", recipeRepository.findAll());
//        return "recipes";
//    }

    @GetMapping
    public String showRecipes(Model model) {
        Iterable<Recipe> recipes = recipeRepository.findAll();
        model.addAttribute("recipes", recipes);
        return "recipes"; // Thymeleaf template name
    }



}

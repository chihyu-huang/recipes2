package com.example.recipes.service;

import com.example.recipes.model.Recipe;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//public class RecipeService {
//
//    private List<Recipe> recipeList;
//
//    public RecipeService() {
//        recipeList = new ArrayList<>();
//
//        Recipe recipe1 = new Recipe(1,"Pasta", "Pasta with tomato sauce", 30, "Lunch");
//        Recipe recipe2 = new Recipe(2, "Pizza", "Pizza with pepperoni", 60, "Dinner");
//        Recipe recipe3 = new Recipe(3, "Salad", "Salad with vinaigrette", 15, "Lunch");
//
//    }
//
//    public Optional<Recipe> getRecipe(Integer id){
//        Optional optional = Optional.empty();
//        for (Recipe recipe : recipeList) {
//            if (recipe.getId().equals(id)) {
//                optional = Optional.of(recipe);
//                return optional;
//            }
//        }
//        return optional;
//    }
//}

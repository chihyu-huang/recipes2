package com.example.recipes.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import org.springframework.data.annotation.Id;

import java.util.List;

public class Recipe {

    @Id
    private Long id;
    private String name;
    private String description;
    private int timeRequired;
    private String mealType;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    private List<Ingredient> ingredients;


    // Constructors
    public Recipe() {}

    public Recipe(Long id, String name, String description, int timeRequired, String mealType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.timeRequired = timeRequired;
        this.mealType = mealType;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTimeRequired() {
        return timeRequired;
    }

    public void setTimeRequired(int timeRequired) {
        this.timeRequired = timeRequired;
    }

    public String getMealType() {
        return mealType;
    }

    public void setMealType(String mealType) {
        this.mealType = mealType;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public void addIngredient(Ingredient ingredient) {
        this.ingredients.add(ingredient);
    }

    public void removeIngredient(Ingredient ingredient) {
        this.ingredients.remove(ingredient);
    }

    public void clearIngredients() {
        this.ingredients.clear();
    }

    public void updateIngredient(Ingredient ingredient) {
        for (int i = 0; i < this.ingredients.size(); i++) {
            if (this.ingredients.get(i).getId() == ingredient.getId()) {
                this.ingredients.set(i, ingredient);
                return;
            }
        }
    }

    public Ingredient getIngredientById(Long id) {
        for (Ingredient ingredient : this.ingredients) {
            if (ingredient.getId() == id){
                return ingredient;
            }
        }
        return null;
    }

//    public boolean hasIngredient(Ingredient ingredient) {
//        return this.ingredients.contains(ingredient);
//    }
}

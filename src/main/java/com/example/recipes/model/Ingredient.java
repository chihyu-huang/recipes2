package com.example.recipes.model;

import jakarta.persistence.ManyToOne;
import org.springframework.data.annotation.Id;

public class Ingredient{
    @Id
    private Long id;

    private String name;
    private String amount;

    @ManyToOne
    private Recipe recipe;


    // Constructors, getters, and setters
    public Ingredient() {}

    public Ingredient(Long id, String name, String amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

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

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }


}

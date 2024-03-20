package com.example.recipes.model;

import org.springframework.data.annotation.Id;

public class Recipe {

    @Id
    private Integer id;
    private String name;
    private String description;
    private int timeRequired;
    private String mealType;

    // Constructors
    public Recipe() {}

    public Recipe(Integer id, String name, String description, int timeRequired, String mealType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.timeRequired = timeRequired;
        this.mealType = mealType;
    }

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}

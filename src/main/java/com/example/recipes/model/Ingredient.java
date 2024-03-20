package com.example.recipes.model;

import org.springframework.data.annotation.Id;

public record Ingredient (@Id Integer recipe_id, String name, String amount) {
}

package com.example.recipes;

import com.example.recipes.model.Recipe;
import com.example.recipes.model.Ingredient;
import com.example.recipes.repository.IngredientRepository;
import com.example.recipes.repository.RecipeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RecipesApplication {

	public static void main(String[] args) {

		SpringApplication.run(RecipesApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(RecipeRepository recipeRepository, IngredientRepository ingredientRepository) {
//		return args -> {
//			recipeRepository.save(new Recipe(null, "Pasta", "Pasta with tomato sauce", 30, "Lunch"));
////			ingredientRepository.save(new Ingredient(null, "Pasta", "200g"));
//		};
//	}

}

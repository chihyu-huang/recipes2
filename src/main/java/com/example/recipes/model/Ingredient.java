package com.example.recipes.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;


@Entity
public class Ingredient{

    @jakarta.persistence.Id
//    @Id
    private Long id;



    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String amount;



    @ManyToOne
    @JoinColumn(name = "recipe_id")
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


}

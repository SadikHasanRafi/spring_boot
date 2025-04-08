package com.rafi.simpleWebApp.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Component
@Entity
public class Product {
    
    @Id
    public int id;
    private String name;
    private int price;
    private String category;
    private boolean inStock;
    private float rating;

    public float getRating(){
        return this.rating;
    }

    public boolean getInStock(){
        return this.inStock;
    }

    public String getCategory(){
        return this.category;
    }

    // Constructor
    public Product(int id, String name, int price, String category, boolean inStock, float ratting) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Default Constructor
    public Product() {}

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

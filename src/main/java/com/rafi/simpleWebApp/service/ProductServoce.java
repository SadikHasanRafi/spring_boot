package com.rafi.simpleWebApp.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.rafi.simpleWebApp.model.Product;

@Service
public class ProductServoce {

    List<Product> products = Arrays.asList(
        new Product(110, "iPhone 15", 1200),
        new Product(111, "iPhone 16", 1300),
        new Product(112, "Samsung Galaxy S24", 1100),
        new Product(113, "Google Pixel 8", 1000),
        new Product(114, "OnePlus 12", 900),
        new Product(115, "Xiaomi 14 Pro", 850)
    );

    public List<Product> getAllProducts(){


        return products;
        // return "All products";
    }


    public Product getProductById(int id){
        // return "Product with id: " + id;
        return products.stream().filter(product -> product.id == id).findFirst().orElse(new Product(100, "No such Mobile", 0));
    }
}

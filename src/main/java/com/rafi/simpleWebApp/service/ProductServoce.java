package com.rafi.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafi.simpleWebApp.model.Product;
import com.rafi.simpleWebApp.repository.ProductRepo;

@Service
public class ProductServoce {


    @Autowired
    ProductRepo repo;

    // List<Product> products = new ArrayList<>(Arrays.asList(
    //         new Product(110, "iPhone 15", 1200),
    //         new Product(111, "iPhone 16", 1300),
    //         new Product(112, "Samsung Galaxy S24", 1100),
    //         new Product(113, "Google Pixel 8", 1000),
    //         new Product(114, "OnePlus 12", 900),
    //         new Product(115, "Xiaomi 14 Pro", 850)));

    public List<Product> getAllProducts() {
        return repo.findAll();        
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product) {
        return repo.save(product);        
    }

    public Product updateProduct(int id, Product updatedProduct) {
        return repo.save(updatedProduct);
    }

    public String deleteProduct(int id) {
         repo.deleteById(id);
         return "Product with id: " + id + " is deleted.";
    }
}

package com.rafi.simpleWebApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafi.simpleWebApp.model.Product;
import com.rafi.simpleWebApp.repository.ProductRepo;

@Service
public class ProductServoce {


    @Autowired
    ProductRepo repo;

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

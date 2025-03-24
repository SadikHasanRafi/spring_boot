package com.rafi.simpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafi.simpleWebApp.model.Product;
import com.rafi.simpleWebApp.service.ProductServoce;



@RestController
public class ProductController {
    

    
    @Autowired
    ProductServoce service;

    @RequestMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        // Implement logic to get product by id
        return service.getProductById(prodId);
    }


    @PostMapping("/products")
    public Product requestMethodName(@RequestBody Product param) {
        return service.addProduct(param);
    }
    
}

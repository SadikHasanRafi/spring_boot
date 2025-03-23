package com.rafi.simpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rafi.simpleWebApp.model.Product;
import com.rafi.simpleWebApp.service.ProductServoce;

@RestController
public class ProductController {
    

    
    @Autowired
    ProductServoce service;

    @RequestMapping("/get-products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
}

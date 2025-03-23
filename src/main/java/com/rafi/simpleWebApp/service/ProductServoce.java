package com.rafi.simpleWebApp.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rafi.simpleWebApp.model.Product;

@Service
public class ProductServoce {


    public List<Product> getAllProducts(){

        List<Product> products = Arrays.asList(new Product(110,"Iphone 15",1200),new Product(111,"Iphone 16",1200));

        return products;
        // return "All products";
    }
}

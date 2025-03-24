package com.rafi.simpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.rafi.simpleWebApp.model.Product;

@Service
public class ProductServoce {

    List<Product> products = new ArrayList<>(Arrays.asList(
        new Product(110, "iPhone 15", 1200),
        new Product(111, "iPhone 16", 1300),
        new Product(112, "Samsung Galaxy S24", 1100),
        new Product(113, "Google Pixel 8", 1000),
        new Product(114, "OnePlus 12", 900),
        new Product(115, "Xiaomi 14 Pro", 850)
    ));

    public List<Product> getAllProducts(){

        return products;
        // return "All products";
    }

    public Product getProductById(int id){
        // return "Product with id: " + id;
        return products.stream().filter(product -> product.id == id).findFirst().orElse(new Product(100, "No such Mobile", 0));
    }

    public Product addProduct(Product product) {
        products.add(product);
        
        return getProductById(product.id);
    }

    public Product updateProduct(int id, Product updatedProduct) {
        Product product = getProductById(id);
        if(product != null) {
            product.setName(updatedProduct.getName());
            product.setPrice(updatedProduct.getPrice());
        }
        return product;
    }

    public String deleteProduct(int id) {
        if(products.removeIf(product -> product.id == id)){
            return "Product with id: " + id + " is deleted";
        } else{
            return "No product found with id: " + id;
        }

    }
}

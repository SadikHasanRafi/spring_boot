package com.myApp.MyApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Product {
    
    @RequestMapping("/")
    public String greet() {
        return "Hello World";
    }
}



package com.rafi.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HoneController {


    @RequestMapping("/")
    public String greed(){
        return "Hello !";
    }

}

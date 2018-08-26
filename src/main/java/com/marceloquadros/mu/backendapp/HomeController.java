package com.marceloquadros.mu.backendapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/persons")
    public Person persons(){
        return new Person();
    }

    @GetMapping
    public String index(){
        return "backend app";
    }
}

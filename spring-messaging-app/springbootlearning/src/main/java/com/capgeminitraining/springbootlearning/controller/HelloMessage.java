package com.capgeminitraining.springbootlearning.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMessage {
    @GetMapping("/hello")
    public String sayHello(){

        return "Hello,from Bridgelabz";
    }

@GetMapping("/query")
public String sayHello2(@RequestParam String name) {
    return "Hello " + name + " from BridgeLabz!";
}
}


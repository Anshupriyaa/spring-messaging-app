package com.capgeminitraining.springbootlearning.controller;


import com.capgeminitraining.springbootlearning.DTO.UserDTO;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{name}")
    public String sayHello3(@PathVariable String name){
        return  "Hello " + name +" , Welcome to BridgeLabz!";
}
    @PostMapping("/post")
    public String hello4(@RequestBody UserDTO user){

        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }

}



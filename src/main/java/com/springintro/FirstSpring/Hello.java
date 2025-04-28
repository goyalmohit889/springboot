package com.springintro.FirstSpring;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hii")
public class Hello {

    //----------------------UC_1  Run spring ----------------------------------

    @GetMapping
    public String sayHi(){
        return "Hello";
    }

    //----------------------UC_2  get name from URL----------------------------------

    @GetMapping("/query")
    public String sayHello(@RequestParam String name){
        return "hello "  + name + ", Welcom to Bridgelabz";
    }

    //------------------------------UC_3 Get name from path variable ------------------------------------

    @GetMapping("/param/{name}")
    public String sayhi(@PathVariable String name){
        return "Hello "+name;
    }

    // ------------------------------UC_4 Post Request on Postman --------------------------------------------

    @PostMapping("/post")
    public String sayHelloPost(@RequestBody User user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz";
    }

    // ------------------------------UC_5 PUt request -----------------------------------------

    @PutMapping("/put/{firstName}/query")
    public String sayHii(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz!";
    }
}

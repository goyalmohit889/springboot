package com.restapi.apicalls;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService greetingService;

    @GetMapping("/simple")
    public Greeting getSimpleGreeting() {
        String message = greetingService.getSimpleGreeting();
        return new Greeting(message);
    }
    @GetMapping
    public Greeting getGreeting() {
        return new Greeting("GET: Hello from Spring Boot!");
    }

    @PostMapping
    public Greeting postGreeting(@RequestBody Greeting greeting) {
        return new Greeting("POST: You sent - " + greeting.getMessage());
    }

    @PutMapping
    public Greeting putGreeting(@RequestBody Greeting greeting) {
        return new Greeting("PUT: Updated to - " + greeting.getMessage());
    }

    @DeleteMapping
    public Greeting deleteGreeting() {
        return new Greeting("DELETE: Greeting deleted.");
    }
}


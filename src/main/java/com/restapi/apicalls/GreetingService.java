package com.restapi.apicalls;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String getSimpleGreeting() {
        return "Hello World";
    }
}
package com.springintro.FirstSpring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hii(Model model){
        model.addAttribute("message", "Hello from BridgeLabz!");
        return "hello";
    }
}

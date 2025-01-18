package net.sixtusdev.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    // Handler method to handle /hello world request
    // http://localhost:8080/hello-world
    @GetMapping("/hello-world")
    public String helloWorld(Model model) {
        // Add attribute to model
        model.addAttribute("message", "Hello World");
        // Return view name
        return "hello-world";
    }

}

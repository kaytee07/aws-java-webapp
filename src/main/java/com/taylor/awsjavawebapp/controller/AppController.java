package com.taylor.awsjavawebapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class AppController {
    @GetMapping("/")
    public String home() {
        return "forward:/index.html";  // Serve index.html
    }
}
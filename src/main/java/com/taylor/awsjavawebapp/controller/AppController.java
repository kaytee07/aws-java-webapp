package com.taylor.awsjavawebapp.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AppController {
    @GetMapping("/")
    public String home() {
        return "Redirecting to static UI";  // Serve index.html
    }
}
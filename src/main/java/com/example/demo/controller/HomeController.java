package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  
    @GetMapping({"/", "/home"})
    public String home(Model model) {
        model.addAttribute("message", "Welcome to My Spring Boot Web Application NCPL CANADA!");
        return "home";
    }
}

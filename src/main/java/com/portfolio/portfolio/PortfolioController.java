package com.portfolio.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Shubham Ambre - Full Stack Developer");
        model.addAttribute("name", "Shubham Ambre");
        model.addAttribute("description", "A showcase of my full-stack development projects and skills.");
        return "index";
    }
}
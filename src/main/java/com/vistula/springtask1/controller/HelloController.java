package com.vistula.springtask1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("message", "Hello, Vistula!");
        model.addAttribute("additionalMessage", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vestibulum dignissim malesuada.");
        return "greeting";
    }
}

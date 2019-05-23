package com.greenfoxacademy.programmersfoxclub.controllers;

import com.greenfoxacademy.programmersfoxclub.models.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
  @GetMapping("/")
  public String home() {
    return "index";
  }

  @GetMapping("/login")
  public String login(Model model) {
    model.addAttribute("fox", new Fox());
    return "login";
  }

  @PostMapping("/login")
  public String loggedIn(Model model, @ModelAttribute Fox fox) {
    model.addAttribute("fox", fox);
    return "redirect:/";
  }
}

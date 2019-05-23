package com.greenfoxacademy.programmersfoxclub.controllers;

import com.greenfoxacademy.programmersfoxclub.models.Drink;
import com.greenfoxacademy.programmersfoxclub.models.Food;
import com.greenfoxacademy.programmersfoxclub.models.Fox;
import com.greenfoxacademy.programmersfoxclub.services.FoxKennel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;

@Controller
public class MainController {
  FoxKennel foxKennel;

  public MainController(FoxKennel foxKennel) {
    this.foxKennel = foxKennel;
  }

  @GetMapping("/")
  public String home(Model model) {
    Fox defaultFox = new Fox("Karak", new Food("pudding"), new Drink("beer"), Arrays.asList("pushups", "killing birds"));
    foxKennel.addFox(defaultFox);
    model.addAttribute("fox", defaultFox);
    return "index";
  }

  @PostMapping("/")
  public String home(Model model, @ModelAttribute Fox fox) {
    model.addAttribute("fox", fox);
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

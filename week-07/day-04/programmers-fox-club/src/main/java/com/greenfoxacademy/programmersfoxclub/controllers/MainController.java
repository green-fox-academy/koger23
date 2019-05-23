package com.greenfoxacademy.programmersfoxclub.controllers;

import com.greenfoxacademy.programmersfoxclub.models.Fox;
import com.greenfoxacademy.programmersfoxclub.services.FoxKennel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
  private FoxKennel foxKennel;
  private int activeFoxIndex = 0;

  public MainController(FoxKennel foxKennel) {
    this.foxKennel = foxKennel;
  }

  @GetMapping("/")
  public String home(Model model) {
    model.addAttribute("fox", foxKennel.getFoxList().get(activeFoxIndex));
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
    if (foxKennel.addFox(fox)) {
      activeFoxIndex = foxKennel.getFoxID(fox);
      model.addAttribute(fox);
      return "redirect:/";
    }
    model.addAttribute(fox);
    return "login";
  }

  @GetMapping("/nutritionstore")
  public String nutritionStore() {
    return "nutritionstore";
  }
}

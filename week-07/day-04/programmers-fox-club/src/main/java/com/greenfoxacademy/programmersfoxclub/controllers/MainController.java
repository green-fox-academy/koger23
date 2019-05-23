package com.greenfoxacademy.programmersfoxclub.controllers;

import com.greenfoxacademy.programmersfoxclub.models.Fox;
import com.greenfoxacademy.programmersfoxclub.services.FoxKennel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    } else {
      activeFoxIndex = foxKennel.getFoxID(fox);
      model.addAttribute(fox);
      return "login";
    }
  }

  @GetMapping("/nutritionstore")
  public String nutritionStore() {
    return "nutritionstore";
  }

  @GetMapping("/nutritionsave")
  public String saveNutritions(Model model, @RequestParam("food") String food,
                               @RequestParam("drink") String drink) {
    foxKennel.getFoxList().get(activeFoxIndex).getFood().setName(food.toLowerCase());
    foxKennel.getFoxList().get(activeFoxIndex).getDrink().setName(drink.toLowerCase());
    model.addAttribute("fox", foxKennel.getFoxList().get(activeFoxIndex));
    return "redirect:/";
  }

  @GetMapping("/trickcenter")
  public String trickCenter() {
    return "trickcenter";
  }

  @GetMapping("/tricksave")
  public String saveTrick(Model model, @RequestParam("trick") String trick) {
    System.out.println(trick);
    foxKennel.getFoxList().get(activeFoxIndex).addTrick(trick);
    model.addAttribute("fox", foxKennel.getFoxList().get(activeFoxIndex));
    return "redirect:/";
  }
}

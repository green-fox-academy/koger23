package com.greenfoxacademy.programmersfoxclub.controllers;

import com.greenfoxacademy.programmersfoxclub.models.Fox;
import com.greenfoxacademy.programmersfoxclub.repositories.Logger;
import com.greenfoxacademy.programmersfoxclub.services.FoxKennel;
import com.greenfoxacademy.programmersfoxclub.services.SessionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
  private FoxKennel foxKennel;
  private Logger logger;
  private SessionService sessionService;
  private int activeFoxIndex = 0;

  public MainController(FoxKennel foxKennel, Logger logger, SessionService sessionService) {
    this.foxKennel = foxKennel;
    this.logger = logger;
    this.sessionService = sessionService;
    this.sessionService.setMainController(this);
  }

  @GetMapping("/")
  public String home(Model model) {
    model.addAttribute("activeFoxIndex", activeFoxIndex);
    if (activeFoxIndex == 0) {
      model.addAttribute("fox", new Fox());
      return "redirect:/login";
    }
    model.addAttribute("actionHistoryLogger", logger);
    model.addAttribute("fox", foxKennel.getFoxList().get(activeFoxIndex));
    return "index";
  }

  @PostMapping("/")
  public String home(Model model, @ModelAttribute Fox fox) {
    model.addAttribute("activeFoxIndex", activeFoxIndex);
    model.addAttribute("fox", fox);
    return "index";
  }

  @GetMapping("/login")
  public String login(Model model) {
    model.addAttribute("activeFoxIndex", activeFoxIndex);
    model.addAttribute("fox", new Fox());
    return "login";
  }

  @PostMapping("/login")
  public String loggedIn(Model model, @ModelAttribute Fox fox) {
    if ((foxKennel.addFox(fox) && !fox.getName().isEmpty()) || foxKennel.checkFoxExists(fox.getName()) && !fox.getName().isEmpty()) {
    } else {
      model.addAttribute("activeFoxIndex", activeFoxIndex);
      return "redirect:/login";
    }
    sessionService.login(fox);
    logger.saveLoginAction();
    model.addAttribute("fox", fox);
    model.addAttribute("activeFoxIndex", activeFoxIndex);
    return "redirect:/";
  }

  @GetMapping("/nutritionstore")
  public String nutritionStore(Model model) {
    model.addAttribute("activeFoxIndex", activeFoxIndex);
    if (activeFoxIndex == 0) {
      model.addAttribute("fox", new Fox());
      return "redirect:/login";
    }
    return "nutritionstore";
  }

  @PostMapping("/nutritionsave")
  public String saveNutritions(Model model, @RequestParam("food") String food,
                               @RequestParam("drink") String drink) {
    String foodBefore = foxKennel.getFoxList().get(activeFoxIndex).getFood().getName();
    String drinkBefore = foxKennel.getFoxList().get(activeFoxIndex).getDrink().getName();

    foxKennel.getFoxList().get(activeFoxIndex).getFood().setName(food.toLowerCase());
    logger.saveNutritionChange(foxKennel.getFoxList().get(activeFoxIndex).getFood(), foodBefore, foxKennel.getFoxList().get(activeFoxIndex).getFood().getName());
    foxKennel.getFoxList().get(activeFoxIndex).getDrink().setName(drink.toLowerCase());
    logger.saveNutritionChange(foxKennel.getFoxList().get(activeFoxIndex).getDrink(), drinkBefore, foxKennel.getFoxList().get(activeFoxIndex).getDrink().getName());

    model.addAttribute("activeFoxIndex", activeFoxIndex);
    model.addAttribute("fox", foxKennel.getFoxList().get(activeFoxIndex));
    return "redirect:/";
  }

  @GetMapping("/trickcenter")
  public String trickCenter(Model model) {
    model.addAttribute("activeFoxIndex", activeFoxIndex);
    if (activeFoxIndex == 0) {
      model.addAttribute("fox", new Fox());
      return "redirect:/login";
    }
    return "trickcenter";
  }

  @PostMapping("/tricksave")
  public String saveTrick(Model model, @RequestParam("trick") String trick) {
    foxKennel.getFoxList().get(activeFoxIndex).addTrick(trick);
    logger.saveTrickAction(trick);

    model.addAttribute("activeFoxIndex", activeFoxIndex);
    model.addAttribute("fox", foxKennel.getFoxList().get(activeFoxIndex));
    return "redirect:/";
  }

  @GetMapping("/actionhistory")
  public String actionHistory(Model model) {
    model.addAttribute("activeFoxIndex", activeFoxIndex);
    if (activeFoxIndex == 0) {
      model.addAttribute("fox", new Fox());
      return "redirect:/login";
    }
    model.addAttribute("actionHistoryLogger", logger);
    return "actionhistory";
  }

  @GetMapping("/logout")
  public String logout(Model model) {
    model.addAttribute("activeFoxIndex", activeFoxIndex);
    sessionService.logout();
    return "redirect:/login";
  }

  public int getActiveFoxIndex() {
    return activeFoxIndex;
  }

  public void setActiveFoxIndex(int activeFoxIndex) {
    this.activeFoxIndex = activeFoxIndex;
  }

  public FoxKennel getFoxKennel() {
    return foxKennel;
  }

  public void setFoxKennel(FoxKennel foxKennel) {
    this.foxKennel = foxKennel;
  }

  public Logger getLogger() {
    return logger;
  }

  public void setLogger(Logger logger) {
    this.logger = logger;
  }

  public SessionService getSessionService() {
    return sessionService;
  }

  public void setSessionService(SessionService sessionService) {
    this.sessionService = sessionService;
  }
}

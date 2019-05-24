package com.greenfoxacademy.programmersfoxclub.services;

import com.greenfoxacademy.programmersfoxclub.controllers.MainController;
import com.greenfoxacademy.programmersfoxclub.models.Fox;
import com.greenfoxacademy.programmersfoxclub.repositories.Logger;
import org.springframework.stereotype.Service;

@Service
public class SessionService {
  private MainController mainController;

  public SessionService() {
  }

  public void login(Fox fox) {
    mainController.setActiveFoxIndex(mainController.getFoxKennel().getFoxIndex(fox));
    mainController.setColor(mainController.getFoxKennel().getFoxList().get(mainController.getFoxKennel().getFoxIndex(fox)).getColor());
  }
  public void logout() {
    mainController.setActiveFoxIndex(0);
  }

  public MainController getMainController() {
    return mainController;
  }

  public void setMainController(MainController mainController) {
    this.mainController = mainController;
  }

  public void saveNutrition(String food, String drink) {
    int activeFoxIndex = mainController.getActiveFoxIndex();
    FoxKennel foxKennel = mainController.getFoxKennel();
    Logger logger = mainController.getLogger();
    String foodBefore = foxKennel.getFoxList().get(activeFoxIndex).getFood().getName();
    String drinkBefore = foxKennel.getFoxList().get(activeFoxIndex).getDrink().getName();

    foxKennel.getFoxList().get(activeFoxIndex).getFood().setName(food.toLowerCase());
    logger.saveNutritionChange(foxKennel.getFoxList().get(activeFoxIndex).getFood(), foodBefore, foxKennel.getFoxList().get(activeFoxIndex).getFood().getName());
    
    foxKennel.getFoxList().get(activeFoxIndex).getDrink().setName(drink.toLowerCase());
    logger.saveNutritionChange(foxKennel.getFoxList().get(activeFoxIndex).getDrink(), drinkBefore, foxKennel.getFoxList().get(activeFoxIndex).getDrink().getName());
  }
}

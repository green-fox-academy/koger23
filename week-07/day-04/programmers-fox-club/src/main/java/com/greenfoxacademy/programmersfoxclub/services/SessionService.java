package com.greenfoxacademy.programmersfoxclub.services;

import com.greenfoxacademy.programmersfoxclub.controllers.MainController;
import com.greenfoxacademy.programmersfoxclub.models.Fox;
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
}

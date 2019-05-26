package com.greenfoxacademy.programmersfoxclub.services;

import com.greenfoxacademy.programmersfoxclub.models.charachter.Fox;
import org.springframework.stereotype.Service;

@Service
public class HealthService {
  public void healTotally(Fox fox) {
    fox.setHealthPoints(fox.getMAX_HEALTH());
  }

  public void heal(Fox fox, int healBy) {
    fox.setHealthPoints(fox.getHealthPoints() + healBy);
  }

  public void harm(Fox fox, int damage) {
    if (fox.getHealthPoints() > 0) {
      fox.setHealthPoints(fox.getHealthPoints() - damage);
    }
  }
}

package com.greenfoxacademy.programmersfoxclub.services;

import com.greenfoxacademy.programmersfoxclub.models.charachter.Fox;
import com.greenfoxacademy.programmersfoxclub.models.nutrition.Nutrition;
import com.greenfoxacademy.programmersfoxclub.utils.date.DateUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutritionService {
  private long startMinutes;

  public NutritionService() {
    startMinutes = DateUtils.getCurrentDateTimeInMinutes();
  }

  public void reduceNutritionLevel(Fox fox) {
    List<Nutrition> foxNutritionList = fox.getNutritions();

    for (Nutrition nutrition : foxNutritionList) {
      long currentMinutes = DateUtils.getCurrentDateTimeInMinutes();

      if (startMinutes + nutrition.getReductionTimeMinutes() <= currentMinutes) {
        int beforeLevel = nutrition.getLevel();

        if (beforeLevel > 0) {
          nutrition.setLevel(beforeLevel - 1);
        } else if (beforeLevel == 0) {
          if (fox.getHealthPoints() > 0) {
            fox.setHealthPoints(fox.getHealthPoints() - 1);
          }
        }
        if (fox.getHealthPoints() == 0) {
          fox.setAlive(false);
        }
      }
    }
  }
}

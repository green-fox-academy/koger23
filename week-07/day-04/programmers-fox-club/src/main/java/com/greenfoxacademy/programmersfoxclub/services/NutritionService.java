package com.greenfoxacademy.programmersfoxclub.services;

import com.greenfoxacademy.programmersfoxclub.models.Fox;
import com.greenfoxacademy.programmersfoxclub.models.Nutrition;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class NutritionService {
  private long startMinutes;

  public NutritionService() {
    startMinutes = getCurrentMinutes();
  }

  public void reduceNutritionLevel(Fox fox) {
    List<Nutrition> foxNutritionList = fox.getNutritions();

    for (Nutrition nutrition : foxNutritionList) {
      long currentMinutes = getCurrentMinutes();

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

  public long getCurrentMinutes() {
    DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
    Date date = new Date();
    return date.getTime() / 60000;
  }
}

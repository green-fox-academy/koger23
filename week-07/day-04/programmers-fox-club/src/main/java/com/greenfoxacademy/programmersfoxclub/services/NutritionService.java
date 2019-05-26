package com.greenfoxacademy.programmersfoxclub.services;

import com.greenfoxacademy.programmersfoxclub.models.charachter.Fox;
import com.greenfoxacademy.programmersfoxclub.models.nutrition.Nutrition;
import com.greenfoxacademy.programmersfoxclub.utils.date.DateUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutritionService {
  private long startMinutes;
  private long lastFoodMinutes = 0;
  private long lastDrinkMinutes = 0;

  public NutritionService() {
    this.startMinutes = DateUtils.getCurrentDateTimeInMinutes();
    this.lastFoodMinutes = startMinutes;
    this.lastDrinkMinutes = startMinutes;
  }

  public void reduceNutritionLevel(Fox fox) {
    List<Nutrition> foxNutritionList = fox.getNutritions();
    long currentMinutes = DateUtils.getCurrentDateTimeInMinutes();
    long foodDelta = currentMinutes - lastFoodMinutes;
    long drinkDelta = currentMinutes - lastDrinkMinutes;
    boolean foodUpdateAble = false;
    boolean drinkUpdateAble = false;

    for (Nutrition nutrition : foxNutritionList) {
      switch (nutrition.getType()) {
        case FOOD:
          double elapsedFood = foodDelta / nutrition.getReductionTimeMinutes();
          if (elapsedFood >= 1) {
            foodUpdateAble = true;
          }
          if (lastFoodMinutes != 0 && foodUpdateAble) {
            for (int i=0; i < elapsedFood; i++) {
              checkLevels(fox, nutrition);
            }
            lastFoodMinutes = currentMinutes;
            foodUpdateAble = false;
          }
        case DRINK:
          double elapsedDrink = drinkDelta / nutrition.getReductionTimeMinutes();
          if (elapsedDrink >= 1) {
            drinkUpdateAble = true;
          }
          if (lastDrinkMinutes != 0 && drinkUpdateAble) {
            for (int i=0; i < elapsedDrink; i++) {
              checkLevels(fox, nutrition);
            }
            lastDrinkMinutes = currentMinutes;
            drinkUpdateAble = false;
          }
      }
    }
  }

  private void checkLevels(Fox fox, Nutrition nutrition) {
    int beforeLevel = nutrition.getLevel();
    if (beforeLevel > 0) {
      nutrition.setLevel(beforeLevel - 1);
    } else if (beforeLevel == 0) {
      if (fox.getHealthPoints() > 0) {
        fox.setHealthPoints(fox.getHealthPoints() - 1);
      } else {
        fox.setAlive(false);
      }
    }
  }

  public void feed(Fox fox, Nutrition nutrition) {
    if (fox.getFood() == nutrition) {
      fox.setHungerLevel(nutrition.getHungerReductionPoints());
    } else {
      fox.setThirstLevel(nutrition.getThirstReductionPoints());
    }
    startMinutes = DateUtils.getCurrentDateTimeInMinutes();
  }
}

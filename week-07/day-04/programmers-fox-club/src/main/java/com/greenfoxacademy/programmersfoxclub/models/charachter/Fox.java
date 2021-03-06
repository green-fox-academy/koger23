package com.greenfoxacademy.programmersfoxclub.models.charachter;


import com.greenfoxacademy.programmersfoxclub.utils.date.DateUtils;
import com.greenfoxacademy.programmersfoxclub.models.nutrition.Drink;
import com.greenfoxacademy.programmersfoxclub.models.nutrition.Food;
import com.greenfoxacademy.programmersfoxclub.models.nutrition.Nutrition;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private final int MAX_HEALTH = 100;
  private String name;
  private int healthPoints = 100;
  private Food food;
  private Drink drink;
  private String color = "green";
  private List<String> trickList = new ArrayList<>();
  private boolean alive = true;
  private String birthDayString = "";
  private long birthDateInMinutes = 0;
  private int thirstLevel = 0;
  private int hungerLevel = 0;
  private final int MAX_HUNGER_LEVEL = 10;
  private final int MAX_THIRST_LEVEL = 5;

  public Fox() {
    this("", new Food("pudding"), new Drink("beer"));
  }

  public Fox(String name, Food food, Drink drink) {
    this.name = name;
    this.food = food;
    this.drink = drink;
    trickList.add("Hunting");
    this.birthDayString = DateUtils.getStringDateTime();
    this.birthDateInMinutes = DateUtils.getCurrentDateTimeInMinutes();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Food getFood() {
    return food;
  }

  public void setFood(Food food) {
    this.food = food;
  }

  public Drink getDrink() {
    return drink;
  }

  public void setDrink(Drink drink) {
    this.drink = drink;
  }

  public List<String> getTrickList() {
    return trickList;
  }

  public void setTrickList(List<String> trickList) {
    this.trickList = trickList;
  }

  public boolean addTrick(String trick) {
    if (trickList.contains(trick)) {
      return false;
    } else {
      trickList.add(trick);
      return true;
    }
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public List<Nutrition> getNutritions() {
    List<Nutrition> nutritionList = new ArrayList<>();
    nutritionList.add(food);
    nutritionList.add(drink);
    return nutritionList;
  }

  public int getMAX_HEALTH() {
    return MAX_HEALTH;
  }

  public int getHealthPoints() {
    return healthPoints;
  }

  public void setHealthPoints(int healthPoints) {
    this.healthPoints = healthPoints;
  }

  public boolean isAlive() {
    return alive;
  }

  public void setAlive(boolean alive) {
    this.alive = alive;
  }

  public String getBirthDayString() {
    return birthDayString;
  }

  public void setBirthDayString(String birthDayString) {
    this.birthDayString = birthDayString;
  }

  public long getBirthDateInMinutes() {
    return birthDateInMinutes;
  }

  public void setBirthDateInMinutes(long birthDateInMinutes) {
    this.birthDateInMinutes = birthDateInMinutes;
  }

  public int getThirstLevel() {
    return thirstLevel;
  }

  public void setThirstLevel(int thirstLevel) {
    this.thirstLevel = thirstLevel;
  }

  public int getHungerLevel() {
    return hungerLevel;
  }

  public void setHungerLevel(int hungerLevel) {
    this.hungerLevel = hungerLevel;
  }

  public int getMAX_HUNGER_LEVEL() {
    return MAX_HUNGER_LEVEL;
  }

  public int getMAX_THIRST_LEVEL() {
    return MAX_THIRST_LEVEL;
  }
}

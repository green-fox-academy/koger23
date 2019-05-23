package com.greenfoxacademy.programmersfoxclub.models;

import java.util.List;

public class Fox {
  private String name;
  private Food food;
  private Drink drink;
  private List<String> trickList;

  public Fox() {
  }

  public Fox(String name, Food food, Drink drink, List<String> trickList) {
    this.name = name;
    this.food = food;
    this.drink = drink;
    this.trickList = trickList;
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
}

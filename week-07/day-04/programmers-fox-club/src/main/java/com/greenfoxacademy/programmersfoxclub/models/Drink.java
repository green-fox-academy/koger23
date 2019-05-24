package com.greenfoxacademy.programmersfoxclub.models;

public class Drink extends Nutrition {
  private String name;
  private int reductionTimeMinutes = 1;

  public Drink() {
    super("Drink");
    setReductionTimeMinutes(reductionTimeMinutes);
  }

  public Drink(String name) {
    super("Drink");
    this.name = name;
    setReductionTimeMinutes(reductionTimeMinutes);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

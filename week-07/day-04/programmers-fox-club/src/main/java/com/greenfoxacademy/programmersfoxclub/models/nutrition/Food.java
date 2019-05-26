package com.greenfoxacademy.programmersfoxclub.models.nutrition;

public class Food extends Nutrition {
  private String name;
  private int reductionTimeMinutes = 2;

  public Food() {
    super(Type.FOOD);
    setReductionTimeMinutes(reductionTimeMinutes);
  }

  public Food(String name) {
    super(Type.FOOD);
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

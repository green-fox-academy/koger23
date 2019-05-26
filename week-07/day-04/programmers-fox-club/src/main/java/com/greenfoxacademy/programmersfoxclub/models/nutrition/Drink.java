package com.greenfoxacademy.programmersfoxclub.models.nutrition;

public class Drink extends Nutrition {
  private String name;
  private int reductionTimeMinutes = 1;

  public Drink() {
    super(Type.DRINK);
    setReductionTimeMinutes(reductionTimeMinutes);
  }

  public Drink(String name) {
    super(Type.DRINK);
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

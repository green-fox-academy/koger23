package com.greenfoxacademy.programmersfoxclub.models.nutrition;

public class Nutrition {
  private String type;
  private final int MAX_LEVEL = 10;
  private int level;
  private int reductionTimeMinutes;
  private int hungerReductionPoints;
  private int thirstReductionPoints;

  public Nutrition(String type) {
    this.type = type;
    this.level = MAX_LEVEL;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getMAX_LEVEL() {
    return MAX_LEVEL;
  }

  public int getLevel() {
    return level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  public int getReductionTimeMinutes() {
    return reductionTimeMinutes;
  }

  public void setReductionTimeMinutes(int reductionTimeMinutes) {
    this.reductionTimeMinutes = reductionTimeMinutes;
  }

  public int getHungerReductionPoints() {
    return hungerReductionPoints;
  }

  public void setHungerReductionPoints(int hungerReductionPoints) {
    this.hungerReductionPoints = hungerReductionPoints;
  }

  public int getThirstReductionPoints() {
    return thirstReductionPoints;
  }

  public void setThirstReductionPoints(int thirstReductionPoints) {
    this.thirstReductionPoints = thirstReductionPoints;
  }
}

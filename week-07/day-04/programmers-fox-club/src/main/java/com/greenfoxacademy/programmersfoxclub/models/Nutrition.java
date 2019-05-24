package com.greenfoxacademy.programmersfoxclub.models;

public class Nutrition {
  private String type;
  private final int MAX_LEVEL = 10;
  private int level;
  private int reductionTimeMinutes;

  public Nutrition(String type) {
    this.type = type;
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
}

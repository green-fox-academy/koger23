package com.greenfoxacademy.programmersfoxclub.models;

public class Food extends Nutrition {
  private String name;

  public Food() {
    super("Food");
  }

  public Food(String name) {
    super("Food");
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

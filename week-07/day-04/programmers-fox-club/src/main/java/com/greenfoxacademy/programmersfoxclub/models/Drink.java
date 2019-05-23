package com.greenfoxacademy.programmersfoxclub.models;

public class Drink extends Nutrition {
  private String name;

  public Drink() {
    super("Drink");
  }

  public Drink(String name) {
    super("Drink");
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

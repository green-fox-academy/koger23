package main.java.animals;

public abstract class Animal {
  private String name;
  private int age;

  public String getName(){
    return name;
  }

  abstract void breed();

}

package main.java.animals;

public class Bird extends Animal {
  public Bird(String name) {
    super.setName(name);
  }
  public String breed() {
    return "laying eggs";
  }
}

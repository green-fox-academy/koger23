package main.java.animals;

public class Reptile extends Animal {
  public Reptile(String name) {
    super.setName(name);
  }

  public String breed() {
    return "laying eggs";
  }
}

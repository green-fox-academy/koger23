package main.java.animals;

public class Reptile extends Animal {
  public Reptile(String name) {
    setName(name);
  }

  public String breed() {
    return "laying eggs";
  }
}

public class Bird extends Animal implements Flyable {
  public Bird(String name) {
    setName(name);
  }
  public String breed() {
    return "laying eggs";
  }

  public void land() {
  }

  public void fly() {
  }

  public void takeOff() {
  }
}

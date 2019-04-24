public class Bird extends Animal implements Flyable {
  public Bird(String name) {
    setName(name);
  }
  public String breed() {
    return "laying eggs";
  }

  @Override
  public void land() {
  }

  @Override
  public void fly() {
  }

  @Override
  public void takeOff() {
  }
}

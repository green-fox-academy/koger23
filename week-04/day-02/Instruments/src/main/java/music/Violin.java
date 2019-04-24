package main.java.music;

public class Violin extends StringedInstrument {
  public Violin() {
    super.setName("Violin");
    super.setNumberOfStrings(4);
  }

  public Violin(int strings){
    super.setName("Violin");
    super.setNumberOfStrings(strings);
  }

  public String sound() {
    return "Screech";
  }
}

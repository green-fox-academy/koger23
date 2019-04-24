package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  public ElectricGuitar() {
    setName("Electric Guitar");
    setNumberOfStrings(6);
  }

  public ElectricGuitar(int strings){
    super.setName("Electric Guitar");
    super.setNumberOfStrings(strings);
  }

  public String sound() {
    return "Twang";
  }
}

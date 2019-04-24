package main.java.music;

public class ElectricGuitar extends StringedInstrument {
  private final String NAME = "Electric Guitar";
  private final String SOUND = "Twang";

  public ElectricGuitar() {
    super.setName(NAME);
    super.setNumberOfStrings(6);
  }

  public ElectricGuitar(int strings){
    super.setName(NAME);
    super.setNumberOfStrings(strings);
  }

  public String sound() {
    return SOUND;
  }

  public void play() {
    System.out.println(NAME + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}

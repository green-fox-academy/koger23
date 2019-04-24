package main.java.music;

public class Violin extends StringedInstrument {
  private final String NAME = "Violin";
  private final String SOUND = "Screech";

  public Violin() {
    super.setName(NAME);
    super.setNumberOfStrings(4);
  }

  public Violin(int strings){
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

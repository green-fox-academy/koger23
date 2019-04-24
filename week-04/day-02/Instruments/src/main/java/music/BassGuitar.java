package main.java.music;

public class BassGuitar extends StringedInstrument {
  private final String NAME = "Bass Guitar";
  private final String SOUND = "Duum-duum-duum";

  public BassGuitar() {
    super.setName(NAME);
    super.setNumberOfStrings(4);
  }

  public BassGuitar(int strings) {
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

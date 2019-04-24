package main.java.music;

public class BassGuitar extends StringedInstrument {
  public BassGuitar() {
    super.setName("Bass Guitar");
    super.setNumberOfStrings(4);
  }

  public BassGuitar(int strings) {
    super.setName("Bass Guitar");
    super.setNumberOfStrings(strings);
  }

  public String sound() {
    return "Duum-duum-duum";
  }
}

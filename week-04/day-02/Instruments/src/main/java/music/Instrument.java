package main.java.music;

public abstract class Instrument {
  public String name;

  public String getName() {
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public abstract void play();
}

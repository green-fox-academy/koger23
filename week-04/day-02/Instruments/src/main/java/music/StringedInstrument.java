package main.java.music;

public abstract class StringedInstrument extends Instrument{
  public int numberOfStrings;

  public void setNumberOfStrings(int numOfStrings){
    this.numberOfStrings = numOfStrings;
  }

  public abstract String sound();

  public void play(){
    System.out.println(getName() + ", a " + numberOfStrings + "-stringed instrument that goes " + sound());
  }
}

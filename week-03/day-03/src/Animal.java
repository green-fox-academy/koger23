public class Animal {

  private int hunger;
  private int thirst;

  public Animal(){
    this(50, 50);
  }

  public Animal(int hunger, int thirst) {
    this.hunger = hunger;
    this.thirst = thirst;
  }

  public int getHunger() {
    return hunger;
  }

  public void setHunger(int hunger) {
    this.hunger = hunger;
  }

  public int getThirst() {
    return thirst;
  }

  public void setThirst(int thirst) {
    this.thirst = thirst;
  }

  public void eat(){

    if (this.hunger != 0){
      this.hunger--;
    }
  }

  public void drink(){

    if (this.thirst != 0){
      this.thirst--;
    }
  }

  public void play(){
    this.thirst++;
    this.hunger++;
  }

}

public class Car {

  private int gasAmount;
  private int capacity;

  public Car() {
    this(0, 100);
  }

  public Car(int gasAmount, int capacity) {
    this.gasAmount = gasAmount;
    this.capacity = capacity;
  }

  public int getGasAmount() {
    return gasAmount;
  }

  public void setGasAmount(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public int getCapacity() {
    return capacity;
  }

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

}

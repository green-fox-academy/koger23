public class Station {

  private int gasAmount;

  public Station(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public int getGasAmount() {
    return gasAmount;
  }

  public void setGasAmount(int gasAmount) {
    this.gasAmount = gasAmount;
  }

  public void refill(Car car){

    setGasAmount(this.gasAmount - car.getCapacity());
    car.setGasAmount(car.getCapacity());

  }
}

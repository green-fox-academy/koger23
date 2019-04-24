public abstract class Vehicle {
  public int numberOfWheels;
  public int numberOfDoors;
  public int performance;

  public Vehicle() {
  }

  public Vehicle(int numberOfWheels, int numberOfDoors, int performance) {
    this.numberOfWheels = numberOfWheels;
    this.numberOfDoors = numberOfDoors;
    this.performance = performance;
  }

  public int getNumberOfWheels() {
    return numberOfWheels;
  }

  public void setNumberOfWheels(int numberOfWheels) {
    this.numberOfWheels = numberOfWheels;
  }

  public int getNumberOfDoors() {
    return numberOfDoors;
  }

  public void setNumberOfDoors(int numberOfDoors) {
    this.numberOfDoors = numberOfDoors;
  }

  public int getPerformance() {
    return performance;
  }

  public void setPerformance(int performance) {
    this.performance = performance;
  }
}

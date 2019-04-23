public class Plant {
  private String name;
  private String color;
  private double waterLevel;
  private double absorbEffiecency;
  private int water_alarm_level;

  public void watering(int waterAmount) {
    this.waterLevel += waterAmount * getAbsorbEffiecency();
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public double getWaterLevel() {
    return waterLevel;
  }
  public void setWaterLevel(double waterLevel) {
    this.waterLevel = waterLevel;
  }
  public double getAbsorbEffiecency() {
    return absorbEffiecency;
  }
  public void setAbsorbEffiecency(double absorbEffiecency) {
    this.absorbEffiecency = absorbEffiecency;
  }
  public int getWater_alarm_level() {
    return water_alarm_level;
  }
  public void setWater_alarm_level(int water_alarm_level) {
    this.water_alarm_level = water_alarm_level;
  }
  public Plant(String name, String color, double absorbEffiecency, int water_alarm_level) {
    this.name = name;
    this.color = color;
    this.waterLevel = 0;
    this.absorbEffiecency = absorbEffiecency;
    this.water_alarm_level = water_alarm_level;
  }
  public Plant() {
  }
  public boolean needWater(){
    return getWaterLevel() < getWater_alarm_level();
  }
  public void printStatus() {
    if (needWater()) {
      System.out.println("The " + getColor() + " " + getName() + " needs water");
    } else {
      System.out.println("The " + getColor() + " " + getName() + " doesn't need water");
    }
  }
}

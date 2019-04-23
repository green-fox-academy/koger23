public class Flower {
  final private String NAME = "Flower";
  private String color;
  private double waterLevel;
  private final double ABSORB_EFFICIENCY = 0.75;
  private final int WATER_ALARM_LEVEL = 5;

  public void watering(int waterAmount){
    this.waterLevel += waterAmount * getABSORB_EFFICIENCY();
  }

  public String getName() {
    return NAME;
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
  public double getABSORB_EFFICIENCY() {
    return ABSORB_EFFICIENCY;
  }
  public int getWATER_ALARM_LEVEL() {
    return WATER_ALARM_LEVEL;
  }
}


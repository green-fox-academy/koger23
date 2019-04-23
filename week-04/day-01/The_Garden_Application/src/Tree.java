public class Tree extends Plant {
  final private String NAME = "Tree";
  private final double ABSORB_EFFICIENCY = 0.40;
  private final int WATER_ALARM_LEVEL = 10;

  public Tree(String color) {
    super();
    super.setColor(color);
    this.setName(NAME);
    this.setAbsorbEffiecency(ABSORB_EFFICIENCY);
    this.setWater_alarm_level(WATER_ALARM_LEVEL);
  }
}

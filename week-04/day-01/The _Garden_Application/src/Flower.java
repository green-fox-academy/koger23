public class Flower extends Plant {
  final private String NAME = "Flower";
  private final double ABSORB_EFFICIENCY = 0.75;
  private final int WATER_ALARM_LEVEL = 5;

  public Flower() {
    super();
    this.setName(NAME);
    this.setAbsorbEffiecency(ABSORB_EFFICIENCY);
    this.setWater_alarm_level(WATER_ALARM_LEVEL);
  }
}


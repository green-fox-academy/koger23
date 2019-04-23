import java.util.ArrayList;
import java.util.List;

public class Carrier {
  List<Aircrafts> aircrafts = new ArrayList<>();
  int ammoStorage;
  int healthPoints;

  public Carrier(){
  }

  public Carrier(int ammoStorage, int healthPoints) {
    this.ammoStorage = ammoStorage;
    this.healthPoints = healthPoints;
  }

  public int getHealthPoints(){
    return healthPoints;
  }

  public void setHealthPoints(int healthPoints){
    if (healthPoints > getHealthPoints()){
      this.healthPoints = 0;
    } else {
      this.healthPoints = healthPoints;
    }
  }

  public void add(Aircrafts aircraft) {
    aircrafts.add(aircraft);
  }

  public void fill() {
    if (ammoStorage > 0) {
      if (getAmmoNeed() <= ammoStorage){
        for (int index : getMustRefillAircrafts()){
          ammoStorage = aircrafts.get(index).refill(ammoStorage);
        }
      } else {
        for (int index : getMustRefillAircrafts()){
          if (aircrafts.get(index).isPriority()){
            ammoStorage = aircrafts.get(index).refill(ammoStorage);
          }
        }
      }
    } else {
      throw new java.lang.RuntimeException("Carrier is Out of Ammo");
    }
  }

  public List<Integer> getMustRefillAircrafts() {
    List<Integer> mustRefill = new ArrayList<>();
    for (int i = 0; i < aircrafts.size(); i++) {
      if (aircrafts.get(i).getAmmoLevel() == 0) {
        mustRefill.add(i);
      }
    }
    return mustRefill;
  }

  public int getAmmoNeed(){
    int need = 0;
    for (int index : getMustRefillAircrafts()){
      need += aircrafts.get(index).getMaxAmmo();
    }
    return need;
  }

  public void fight(Carrier anotherCarrier){
    int totalDamage = 0;
    for (Aircrafts aircraft : aircrafts){
      aircraft.fight();
      totalDamage += aircraft.getMaxAmmo() * aircraft.getBaseDamage();
    }
    anotherCarrier.setHealthPoints(anotherCarrier.getHealthPoints() - totalDamage);
  }
}

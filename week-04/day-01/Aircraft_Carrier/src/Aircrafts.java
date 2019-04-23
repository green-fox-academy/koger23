public class Aircrafts {
  private String name;
  private int maxAmmo;
  private int baseDamage;
  private int ammoLevel;

  public int fight(){
    int damage = baseDamage * ammoLevel;
    this.ammoLevel = 0;
    return damage;
  }

  public int refill(int plusAmmo){
    int newAmmo = ammoLevel + plusAmmo;

    if (newAmmo > maxAmmo) {
      newAmmo = maxAmmo;
    }
    ammoLevel = newAmmo;
    return plusAmmo - ammoLevel;
  }
}

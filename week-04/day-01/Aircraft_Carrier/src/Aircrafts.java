public class Aircrafts {
  private String name;
  private int maxAmmo;
  private int baseDamage;
  private int ammo;

  public int fight(){
    int damage = baseDamage * ammo;
    this.ammo = 0;
    return damage;
  }
}

public class Aircrafts {
  private String type;
  private int maxAmmo;
  private int baseDamage;
  private int ammoLevel;

  public int fight() {
    int damage = baseDamage * ammoLevel;
    this.ammoLevel = 0;
    return damage;
  }

  public int refill(int plusAmmo) {
    int newAmmo = ammoLevel + plusAmmo;
    if (newAmmo > maxAmmo) {
      newAmmo = maxAmmo;
    }
    ammoLevel = newAmmo;
    return plusAmmo - ammoLevel;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getMaxAmmo() {
    return maxAmmo;
  }

  public void setMaxAmmo(int maxAmmo) {
    this.maxAmmo = maxAmmo;
  }

  public int getBaseDamage() {
    return baseDamage;
  }

  public void setBaseDamage(int baseDamage) {
    this.baseDamage = baseDamage;
  }

  public int getAmmoLevel() {
    return ammoLevel;
  }

  public void setAmmoLevel(int ammoLevel) {
    this.ammoLevel = ammoLevel;
  }
}

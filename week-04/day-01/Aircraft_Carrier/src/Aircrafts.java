public class Aircrafts {
  private String type;
  private int maxAmmo;
  private int baseDamage;
  private int ammoLevel;

  public Aircrafts(){
  }

  public Aircrafts(String type, int maxAmmo, int baseDamage) {
    this.type = type;
    this.maxAmmo = maxAmmo;
    this.baseDamage = baseDamage;
  }

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

  public boolean isPriority(){
    if (getType().equals("F16")){
      return false;
    } else {
      return true;
    }
  }

  public String status(){
    String returnString = "Type: " + getType() + ", Ammo: " + getMaxAmmo() + ", Damage: " + getBaseDamage() + ", All Damage: " + getMaxAmmo() * getBaseDamage();
    return returnString;
  }

  public void getStatus(){
    System.out.println(status());
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

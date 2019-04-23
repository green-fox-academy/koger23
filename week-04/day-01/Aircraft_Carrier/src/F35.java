public class F35 extends Aircrafts {
  String TYPE = "F35";

  public F35(){
    super("F35", 12, 50);
  }

  public F35(int maxAmmo, int baseDamage){
    super.setMaxAmmo(maxAmmo);
    super.setBaseDamage(baseDamage);
    super.setType(TYPE);
  }
}

public class F35 extends Aircrafts {
  String TYPE = "F35";

  public void F35(){
  }

  public void F35(int maxAmmo, int baseDamage){
    super.setMaxAmmo(maxAmmo);
    super.setBaseDamage(baseDamage);
    super.setType(TYPE);
  }
}

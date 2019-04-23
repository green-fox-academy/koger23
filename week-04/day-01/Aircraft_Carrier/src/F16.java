public class F16 extends Aircrafts {
  String TYPE = "F16";

  public void F16(){
  }

  public void F16(int maxAmmo, int baseDamage){
    super.setMaxAmmo(maxAmmo);
    super.setBaseDamage(baseDamage);
    super.setType(TYPE);
  }
}

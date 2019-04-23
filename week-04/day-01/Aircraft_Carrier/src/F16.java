public class F16 extends Aircrafts {
  String TYPE = "F16";

  public F16(){
    super("F16", 8, 30);
  }

  public F16(int maxAmmo, int baseDamage){
    super.setMaxAmmo(maxAmmo);
    super.setBaseDamage(baseDamage);
    super.setType(TYPE);
  }
}

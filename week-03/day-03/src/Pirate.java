public class Pirate {

  private int id;
  private boolean isIntoxicated;
  private int toxicLevel;
  private boolean hasParrot;
  private boolean isAlive;

  public Pirate(int id, boolean isIntoxicated, boolean hasParrot) {
    this.id = id;
    this.isIntoxicated = isIntoxicated;
    this.hasParrot = hasParrot;
    this.isAlive = true;
    this.toxicLevel = 0;
  }

  public void drinkSomeRum(){
    if (isAlive){
      this.isIntoxicated = true;
      toxicLevel++;
    } else {
      System.out.println("He is dead.");
    }

  }

  public void howsItGoingMate(){

    if (isAlive){

      if ((!isIntoxicated) && (this.toxicLevel < 5)) {
        System.out.println("Pour me anudder!");

      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        setIntoxicated(true);
      }

    } else {
      System.out.println("He is dead.");
    }

  }

  public void die(){
    setAlive(false);
  }

  public void brawl(Pirate pirate){
    if (isAlive){
      int result = (int) (Math.random()*3);

      if (result == 0){
        die();
      } else if (result == 1){
        pirate.die();
      } else {
        pirate.die();
        die();
      }

    } else {
      System.out.println("He is dead.");
    }

  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public boolean isIntoxicated() {
    return isIntoxicated;
  }

  public void setIntoxicated(boolean intoxicated) {
    isIntoxicated = intoxicated;
  }

  public boolean isHasParrot() {
    return hasParrot;
  }

  public void setHasParrot(boolean hasParrot) {
    this.hasParrot = hasParrot;
  }

  public boolean isAlive() {
    if (!isAlive){
      System.out.println("He's dead.");
    }
    return isAlive;
  }

  public void setAlive(boolean alive) {
    isAlive = alive;
  }

  public int getToxicLevel() {
    return toxicLevel;
  }

  public void setToxicLevel(int toxicLevel) {

    if (isAlive()){

      if (toxicLevel < 5){
        this.toxicLevel = toxicLevel;
      } else {
        this.toxicLevel = toxicLevel;
        setIntoxicated(true);
      }
    }
  }

}

public class Pirate {

  private String name;
  private boolean isIntoxicated;
  private boolean hasParrot;
  private boolean isAlive;

  public Pirate(String name, boolean isIntoxicated, boolean hasParrot) {
    this.name = name;
    this.isIntoxicated = isIntoxicated;
    this.hasParrot = hasParrot;
    this.isAlive = true;
  }

  public void drinkSomeRum(){
    if (isAlive){
      this.isIntoxicated = true;
    } else {
      System.out.println("He is dead.");
    }

  }

  public void howsItGoingMate(){
    if (isAlive){
      if (this.isIntoxicated){
        for (int i = 0; i < 5; i++){
          System.out.println("Pour me anudder!");
        }
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
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

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
    return isAlive;
  }

  public void setAlive(boolean alive) {
    isAlive = alive;
  }
}

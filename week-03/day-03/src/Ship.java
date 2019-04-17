import java.util.ArrayList;
import java.util.List;

public class Ship {

  private List<Pirate> crew = new ArrayList<>();
  private Pirate captain;
  private String name;
  private int score;
  private int numberOfWins;
  private int numberOfBattles;


  public Ship() {
    setNumberOfBattles(0);
    setNumberOfWins(0);
  }

  public int getNumberOfWins() {
    return numberOfWins;
  }

  public void setNumberOfWins(int numberOfWins) {
    this.numberOfWins = numberOfWins;
  }

  public int getNumberOfBattles() {
    return numberOfBattles;
  }

  public void setNumberOfBattles(int numberOfBattles) {
    this.numberOfBattles = numberOfBattles;
  }

  public int getScore(){
    return score;
  }

  public List<Pirate> getCrew() {
    return crew;
  }

  public void setCrew(List<Pirate> crew) {
    this.crew = crew;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Pirate getCaptain() {
    return captain;
  }

  public void setCaptain(Pirate captain) {
    this.captain = captain;
  }

  public void calcScore(){

    int livePirates = 0;

    for (Pirate p : crew){

      if (p.isAlive()){
        livePirates++;
      }

    }

    this.score = livePirates - captain.getToxicLevel();

  }

  public void fillShip(){

    int numberOfPirates = (int) (Math.random() * 100);

    for (int i = 0; i < numberOfPirates; i++){

      crew.add(new Pirate(i, false, false));

    }

    setCaptain(new Pirate(0, false, true));
    getCaptain().setToxicLevel((int) (Math.random() * 4));

    calcScore(); // setting score of the ship

  }

  public void shipInfo(){

    System.out.println(">>> " + getName().toUpperCase() + " <<<<" +
            "\n\nScore: \t\t\t\t\t\t" + getScore() + " pts" +
            "\nWins: \t\t\t\t\t\t" + getNumberOfWins() + " pcs" +
            "\nBattles: \t\t\t\t\t" + getNumberOfBattles() + " pcs" +
            "\n\nCaptain's rum consumption: \t" + captain.getToxicLevel() + " mugs" +
            "\nCaptain has parrot? \t\t" + captain.isHasParrot() +
            "\nCaptain is passed out? \t\t" + captain.isIntoxicated() +
            "\nCaptain is alive? \t\t\t" + captain.isAlive() +
            "\n\nNumber of alive pirates: \t" + crew.size());
  }

  public boolean battle(Ship otherShip){

    int numberOfLoss = (int) (Math.random() * 50);

    setNumberOfBattles(getNumberOfBattles() + 1);
    otherShip.setNumberOfBattles(getNumberOfBattles() + 1);

    if (this.score > otherShip.getScore()){

      setNumberOfWins(getNumberOfWins() + 1);

      winnerParty();

      otherShip.losePirates(numberOfLoss);

      return true;

    } else {

      otherShip.setNumberOfWins(getNumberOfWins() + 1);

      otherShip.winnerParty();

      losePirates(numberOfLoss);

      return false;
    }

  }

  public void losePirates(int deaths){

    if (crew.size() > 0){

      if (deaths > crew.size()){
        crew.clear();
        captain.setAlive(false);
      } else {
        crew = crew.subList(0, deaths);
      }
    } else {
      System.out.println("Ship is unfilled with crew and captain.");
    }
  }

  public void winnerParty(){

    if (getCrew().size() != 0){
      for (Pirate p : crew){
        if(p.isAlive()){
          p.setToxicLevel((int) (p.getToxicLevel() + Math.random() * 3));
        }
      }
    } else {
      System.out.println("Ship is unfilled with crew and captain.");
    }
  }

  public static void main(String[] args) {

    Ship ship1 = new Ship();

    ship1.setName("Black Pearl");

    ship1.fillShip();

    ship1.shipInfo();

  }
}

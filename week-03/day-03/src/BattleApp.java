public class BattleApp {

  public static void main(String[] args) {

    Ship ship1 = new Ship();
    Ship ship2 = new Ship();

    ship1.setName("Black Pearl");
    ship2.setName("Flying Dutchman");

    ship1.fillShip();
    ship2.fillShip();

    ship1.battle(ship2);

    ship1.shipInfo();
    ship2.shipInfo();

  }
}

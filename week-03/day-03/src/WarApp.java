public class WarApp {

  public static void main(String[] args) {

    Armada armada_1 = new Armada("Armada Española");
    Armada armada_2 = new Armada("Counter Armada");

    armada_1.fillupArmada();
    armada_2.fillupArmada();

    if (armada_1.war(armada_2)){
      System.out.println("\nArmada 1 won the battle.");
      System.out.println("Remained number of ships: " + armada_1.getLiveShips() + " / " + armada_1.getArmada().size());
      System.out.println("Number of beaten ships: " + armada_2.getArmada().size());

    } else {
      System.out.println("\nArmada 2 won the battle.");
      System.out.println("Remained number of ships: " + armada_2.getLiveShips() + " / " + armada_2.getArmada().size());
      System.out.println("Number of beaten ships: " + armada_1.getArmada().size());
    }

  }
}

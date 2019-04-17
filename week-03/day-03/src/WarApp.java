public class WarApp {

  public static void main(String[] args) {

    Armada armada_1 = new Armada();
    Armada armada_2 = new Armada();

    armada_1.fillupArmada();
    armada_2.fillupArmada();

    if (armada_1.war(armada_2)){
      System.out.println("Armada 1 won the battle.");
    } else {
      System.out.println("Armada 2 won the battle.");
    }

  }
}

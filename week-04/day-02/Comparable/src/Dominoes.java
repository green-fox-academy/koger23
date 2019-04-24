import java.util.*;

public class Dominoes {


  private static List<Domino> orderedDominoes = new ArrayList<>();

  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    System.out.println(dominoes);
    orderDominoes(dominoes);

  }

  private static void orderDominoes(List<Domino> dominoes) {
    orderedDominoes.add(dominoes.get(0)); // init Domino

    while (dominoes.size() != orderedDominoes.size()) {

      for (int i = 1; i < dominoes.size(); i++) {
        int result = orderedDominoes.get(orderedDominoes.size()-1).compareTo(dominoes.get(i));

        if (result == 0) {
          orderedDominoes.add(dominoes.get(i));
          System.out.println("Adding " + dominoes.get(i));
        }
      }
    }
    System.out.println(orderedDominoes);
  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    return dominoes;
  }
}
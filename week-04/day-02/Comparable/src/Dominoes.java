import java.util.*;

public class Dominoes {


  private static List<Domino> orderedDominoes = new ArrayList<>();

  public static void main(String[] args) {
    List<Domino> dominoes = initializeDominoes();
    // You have the list of Dominoes
    // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
    // eg: [2, 4], [4, 3], [3, 5] ...
    System.out.println(dominoes);

  }

  static List<Domino> initializeDominoes() {
    List<Domino> dominoes = new ArrayList<>();
    dominoes.add(new Domino(5, 2));
    dominoes.add(new Domino(4, 6));
    dominoes.add(new Domino(1, 5));
    dominoes.add(new Domino(6, 7));
    dominoes.add(new Domino(2, 4));
    dominoes.add(new Domino(7, 1));
    Collections.sort(dominoes, new Comparator<Domino>(){

      public int compare(Domino o1, Domino o2)
      {
        return o1.compareTo(o2);
      }
    });
    return dominoes;
  }
}
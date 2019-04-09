import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListIntroduction2 {

  public static void main(String[] args) {

    List<String> listA =  new ArrayList<>();
    listA.add("Apple");
    listA.add("Avocado");
    listA.add("Blueberries");
    listA.add("Durian");
    listA.add("Lychee");

    List<String> listB = new ArrayList<>();
    listB.addAll(listA);

    listB.remove("Durian");

    listA.add(4, "Kiwifruit");

    System.out.println(listA.size() == listB.size());

    int indexOfAvocado = listA.indexOf("Avocado");

    int indexOfDurian = listB.indexOf("Durian");


    String[] toAdd = {"Passion Fruit", "Pummelo"};
    Collections.addAll(listB, toAdd);

    System.out.println(listA.get(2));

  }
}

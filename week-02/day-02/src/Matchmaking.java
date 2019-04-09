import java.util.*;

public class Matchmaking {
  public static void main(String... args) {
    ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
    ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

    // Write a method that joins the two lists by matching one girl with one boy into a new list
    // If someone has no pair, he/she should be the element of the list too
    // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

    System.out.println(makingMatches(girls, boys));
  }

  public static ArrayList<String> makingMatches(ArrayList<String> girlList, ArrayList<String> boyList) {

    ArrayList<String> unifiedList = new ArrayList<>();

    int counterBoys = 0;
    int counterGirls = 0;

    for (int i = 0; i < (boyList.size() + girlList.size()); i++) {

      if (i % 2 == 0) {

        if (girlList.size() > counterGirls) {
          unifiedList.add(girlList.get(counterGirls));
          counterGirls++;
        }
      } else {

        if (boyList.size() > counterBoys) {
          unifiedList.add(boyList.get(counterBoys));
          counterBoys++;
        }
      }

    }

    return unifiedList;
  }
}
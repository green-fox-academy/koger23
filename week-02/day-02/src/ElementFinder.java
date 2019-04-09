import java.util.*;

public class ElementFinder {
  public static void main(String... args) {
    ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
    System.out.println(containsSeven(arrayList));
    // Write a method that checks if the arrayList contains "7" if it contains return "Hoorray" otherwise return "Noooooo"
    // The output should be: "Noooooo"
    // Do this again with a different solution using different list methods!


    System.out.println(containSeven_v2(arrayList));

  }

  public static String containsSeven(ArrayList<Integer> arrayList){

    String result = "Noooooo";

    if (arrayList.contains(7)){
      result = "Hoorray";
    }
    return result;
  }

  public static String containSeven_v2(ArrayList<Integer> arrayList){

    String result = "Noooooo";

    boolean isInIt = false;

    Object[] array = arrayList.toArray();

    for (Object item : array){

      if (item.equals(7)){

        isInIt = true;
        break;
      }
    }

    if (isInIt){
      result = "Hoorray";
    }
    return result;
  }

}
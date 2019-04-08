import java.util.ArrayList;
import java.util.List;

public class Unique {

  public static void main(String[] args) {
    //  Create a function that takes a list of numbers as a parameter
    //  Returns a list of numbers where every number in the list occurs only once

    //  Example
    System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`
  }

  public static List unique(int[] numList){

    List resultList = new ArrayList<Integer>();

    for(int i = 0; i < numList.length; i++){

      if (!(resultList.contains(numList[i]))){
        resultList.add(numList[i]);
      }

    }
    return resultList;
  }

}
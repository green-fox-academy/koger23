import java.util.Arrays;
import java.util.Comparator;

public class Bubble {

  public static void main(String[] args) {

    //  Create a function that takes a list of numbers as parameter
    //  Returns a list where the elements are sorted in ascending numerical order
    //  Make a second boolean parameter, if it's `true` sort that list descending

    //  Example:
    //    System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
    //  should print [5, 9, 12, 24, 34]
    System.out.println(bubble(new int[] {34, 12, 24, 9, 5}, false));
    System.out.println(bubble(new int[] {34, 12, 24, 9, 5}, true));
    //  should print [34, 24, 12, 9, 5]

  }

  private static Integer[] bubbleArrays(int[] numList, boolean order) {

    Integer[] resultList = new Integer[numList.length];

    for (int i = 0; i < numList.length; i++){

      resultList[i] = numList[i];
    }

    if (order){
      Arrays.sort(resultList, Comparator.reverseOrder());
    } else {
      Arrays.sort(resultList);
    }


    return resultList;

  }

  public static String bubble(int[] numList, boolean order){

    /*
    Printing the list from bubbleArrays as string list
    Because with array it cannot be printed this way.
    With ArrayList<>() or List<>() it is possible
     */

    Integer[] result = bubbleArrays(numList, order);

    return Arrays.toString(result);
  }

}
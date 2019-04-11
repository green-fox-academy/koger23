import java.util.Arrays;

public class MaximumFinder {

  public static void main(String[] args) {

    /*
    * Write a function that finds the largest element of an array using recursion.
    */

    int[] array = {0, -5, 8, -21};

    System.out.println(printArraysFirstItem(findMax(array)));
  }

  public static int printArraysFirstItem(int[] array){

    return array[0];
  }

  private static int[] findMax(int[] array) {

    int[] newArray;


    if (array.length == 1){
      return array;
    }


    if (array[0] > array[array.length -1]){

      newArray = Arrays.copyOfRange(array, 0, array.length - 1);

    } else {

      newArray = Arrays.copyOfRange(array, 1, array.length);

    }


    return findMax(newArray);
  }


}

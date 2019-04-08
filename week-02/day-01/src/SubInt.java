import java.util.ArrayList;
import java.util.List;

public class SubInt {

  public static void main(String[] args) {
    //  Create a function that takes a number and an array of integers as a parameter
    //  Returns the indices of the integers in the array of which the first number is a part of
    //  Or returns an empty array if the number is not part of any of the integers in the array

    //  Example:
    System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
    //  should print: `[0, 1, 4]`
    System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
    //  should print: '[]'

  }

  public static List subInt(int inputNumber, int[] numList){

    List indexes = new ArrayList<Integer>();

    for (int i = 0; i < numList.length; i++){

      String checkedNumberAsString = String.valueOf(numList[i]);

      if (checkedNumberAsString.contains(String.valueOf(inputNumber))){
        indexes.add(i);

      }

    }
    return indexes;
  }

}
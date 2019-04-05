import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Anagram {
  public Anagram() {
  }

  public static void main(String[] args) {
    System.out.println(anagram("green-fox", "foxgreen"));
  }

  private static boolean anagram(String input1, String input2) {
    // removing unnecessary elements
    input1 = input1.replaceAll(" ", "").replaceAll("-", "");
    input2 = input2.replaceAll(" ", "").replaceAll("-", "");

    char[] input1_List = input1.toCharArray();
    char[] input2_List = input2.toCharArray();

    if (input1.length() == input2.length()) {
      // sorting content for comparison
      Arrays.sort(input1_List);
      Arrays.sort(input2_List);
      if (Arrays.equals(input1_List, input2_List)) {
        return true;
      }
    }
    return false;
  }

  // my first solution
  private static boolean anagram2(String input1, String input2) {
    ArrayList input1_List = new ArrayList();
    ArrayList input2_List = new ArrayList();
    input1 = input1.replaceAll(" ", "").replaceAll("-", "");
    input2 = input2.replaceAll(" ", "").replaceAll("-", "");
    if (input1.length() != input2.length()) {
      return false;
    } else {
      for(int i = 0; i < input1.length(); ++i) {
        input1_List.add(input1.charAt(i));
        input2_List.add(input2.charAt(i));
      }

      return (new HashSet(input1_List)).equals(new HashSet(input2_List)) && (new HashSet(input2_List)).equals(new HashSet(input1_List));
    }
  }
}
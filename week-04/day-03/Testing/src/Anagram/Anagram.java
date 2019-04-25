package Anagram;


import java.util.Arrays;


public class Anagram {
  public static boolean anagram(String input1, String input2) {
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
}
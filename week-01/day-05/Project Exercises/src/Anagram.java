public class Anagram {

  public static void main(String[] args) {

    System.out.println(anagram("greenfox", "xofneerg"));

  }

  private static boolean anagram(String input1, String input2){

    for (int i=0; i<input1.length(); i++){

      char check1 = input1.charAt(i);
      char check2 = input2.charAt(input2.length() -1 - i);

      if (check1 != check2){
        return false;
      }
    }
    return true;
  }

}

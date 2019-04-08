public class Palindrome {
  public static void main(String[] args) {

    System.out.println(createPalindrome("word"));

  }

  public static String createPalindrome(String inputString){

    String outputString = inputString;
    char[] inputChars = inputString.toCharArray();

    for (int i=inputChars.length-1; i>-1; i--){
      outputString += inputChars[i];
      System.out.println(i);
    }

    return outputString;
  }
}

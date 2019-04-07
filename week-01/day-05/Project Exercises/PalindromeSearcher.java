import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeSearcher {

  public static void main(String[] args) {

    searchPalindromes();

  }

  private static void searchPalindromes() {

    String textInput;

    ArrayList output = new ArrayList<String>();

    System.out.print("Type something: ");
    Scanner scanner = new Scanner(System.in);
    textInput = scanner.nextLine();


    for (int j=0; j<textInput.length()-3; j++){

      for (int i=2; i<textInput.length()-j; i++){
        String textToCheck = textInput.substring(j, i+1+j);
//        System.out.println(textToCheck);
        if (palindromeChecker(textToCheck)){
          output.add(textToCheck);
        }
      }
    }

    System.out.println("\n\nPalindromes: " + output);
  }

  public static boolean palindromeChecker(String text){

    boolean result = false;
    char[] textCharArray = text.toCharArray();
    int textLength = textCharArray.length;

    // this loop checks if the text a palindrome
    for (int j=0; j < textLength; j++) {

      if (textCharArray[0+j] == textCharArray[textLength-1-j]) {

        result = true;
//        System.out.println(textCharArray[0+j] + " vs " + textCharArray[textLength-1-j] + " - " + result);

      } else {

        result = false;
//        System.out.println(textCharArray[0+j] + " vs " + textCharArray[textLength-1-j] + " - " + result);
//        System.out.println("This is not a palindrome");
        break;
      }

    }

    return result;
  }

}

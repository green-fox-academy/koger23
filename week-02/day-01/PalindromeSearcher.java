import java.util.ArrayList;
import java.util.Scanner;

public class PalindromeSearcher {

  public static void main(String[] args) {

    searchPalindromes();

  }

  private static void searchPalindromes() {

    String textInput;
    Scanner scanner = new Scanner(System.in);
    ArrayList output = new ArrayList<String>();

    // get text from the user
    System.out.print("Type something (at least 3 letter): ");

    do{
      textInput = scanner.nextLine();

      if (textInput.length() < 3){
        System.out.print("Please type at least 3 letter long text:");
      }

    }while (textInput.length() < 3);


    // Search for palindromes
    if (textInput.length() == 3){

      if (palindromeChecker(textInput)){
        output.add(textInput);

      }
    } else {
      // run through the string combinations
      for (int j=0; j<textInput.length()-2; j++){

        for (int i=2; i<textInput.length()-j+1; i++){
          String textToCheck = textInput.substring(j, i+j);
          System.out.println(textToCheck);

          if (palindromeChecker(textToCheck)){

            // Check if it is already in the list
            if (output.contains(textToCheck)) {
              break;
            } else {
              output.add(textToCheck);
            }
          }
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

      if ((textCharArray[0+j] == textCharArray[textLength-1-j]) && (text.length() >= 3)) {

        result = true;
//        System.out.println(textCharArray[0+j] + " vs " + textCharArray[textLength-1-j] + " - " + result);

      } else {

        result = false;
//        System.out.println(textCharArray[0+j] + " vs " + textCharArray[textLength-1-j] + " - " + result);
//        System.out.println("This is not a palindrome.");
          break;

      }

    }

    return result;
  }

}

package cowsandbulls;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CowsAndBulls {
  private final int NUM_DIGITS = 4;
  private int fourDigitNumber = 0;
  private String state;
  private final String FINISHED = "finished";
  private final String PLAYING = "playing";
  private int guessCounter = 1;
  private Scanner scanner;

  public CowsAndBulls() {
    this.fourDigitNumber = initNumber();
    System.out.println(fourDigitNumber);
    setState(PLAYING);
  }

  public int initNumber(){
    return (int) (Math.random() * 8999 + 1000);
  }

  public String guess() {
    int userInput;
    scanner = new Scanner(System.in);
    System.out.print("Guess the four digit number: ");
    userInput = askNumber();
    isValidNumber(userInput);
    System.out.println(checkCows(userInput));

    while (fourDigitNumber != userInput) {
      System.out.println(guessCounter + ".: " + userInput);
      System.out.print("A-a... Guess again: ");
      userInput = askNumber();
      isValidNumber(userInput);
      System.out.println(checkCows(userInput));
      guessCounter++;
    }
    System.out.println("You won! :)");
    setState(FINISHED);
    return "";
  }

  public int askNumber(){
    try {
      return scanner.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("It is not a valid integer what you entered.");
      return -1;
    }
  }

  public void setState(String word) {
    this.state = word;
  }

  public String checkCows(int inputNumber){
    int cows = 0;
    int bulls = 0;
    char[] inputNumList = String.valueOf(inputNumber).toCharArray();
    char[] fourDigitNumList = String.valueOf(fourDigitNumber).toCharArray();
    for (int i = 0; i < NUM_DIGITS; i++) {
      if (inputNumList[i] == fourDigitNumList[i]) {
        cows++;
      } else {
        for (int n : fourDigitNumList) {
          if (n == inputNumList[i]){
            bulls++;
            break;
          }
        }
      }
    }
    String returnString = "Cows: " + cows + ", Bulls: " + bulls;
    return returnString;
  }

  public boolean isValidNumber(int number) {
    int stringNumberLength = String.valueOf(number).length();
    String msg = "You entered too great number. Guess between 1000-9999";

    if (stringNumberLength == NUM_DIGITS) {
      return true;
    } else {
      if (stringNumberLength > NUM_DIGITS){
        System.out.println(msg);
      } else {
        System.out.println(msg.replaceAll("great", "small"));
      }
      return false;
    }
  }
}

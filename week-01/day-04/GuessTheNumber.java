import java.util.Scanner;

public class GuessTheNumber {
  public static void main(String[] args) {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stried number is lower
    // You found the number: 8
    double number = 16;
    double input;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Guess the number: ");

    do{

      input = scanner.nextDouble();

      if(input < number){
        System.out.println("The stored number is higher");
      }else if(input > number){
        System.out.println("The stored number is lower");
      }

    }while (input != number);

    System.out.println("You found the number: " + number);
  }
}

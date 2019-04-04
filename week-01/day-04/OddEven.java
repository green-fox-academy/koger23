import java.util.Scanner;

public class OddEven {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input,
    // Then prints "Odd" if the number is odd, or "Even" if it is even.

    int number;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter a whole number: ");
    number = scanner.nextInt();

    if (number % 2 != 0){
      System.out.println("Odd");
    }else{
      System.out.println("Even");
    }
  }
}

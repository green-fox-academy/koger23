import java.util.Scanner;

public class Sum {

  public static void main(String[] args) {

    // Create the usual class wrapper and main method on your own.
    // Write a function called `sum` that returns the sum of numbers from zero to the given parameter

    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter a whole number till you would like to summarize (more than 0): ");
    System.out.println(sum(scanner.nextInt()));

  }

  public static int sum(int inputNumber){

    int sum = 0;

    for (int i=0; i<inputNumber; i++){

      sum += i + 1;

    }
    return sum;
  }

}

import java.util.Scanner;

public class ParametricAverage {
  public static void main(String[] args) {
    // Write a program that asks for a number.
    // It would ask this many times to enter an integer,
    // if all the integers are entered, it should print the sum and average of these
    // integers like:
    //
    // Sum: 22, Average: 4.4

    int inputNumber;
    double calcInputNumber;
    double avg = 0;
    double sum = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter a whole number: ");
    inputNumber = scanner.nextInt();

    for (int i=0; i<inputNumber; i++){

      int order = i + 1;
      System.out.print("Please input the " + order + ". number for the calculation: ");

      calcInputNumber = scanner.nextDouble();

      sum += calcInputNumber;

    }

    avg = sum / inputNumber;

    System.out.println("Sum: " + sum + ", Average: " + avg);

  }
}

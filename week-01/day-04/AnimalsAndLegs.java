import java.util.Scanner;

public class AnimalsAndLegs {
  public static void main(String[] args) {
    // Write a program that asks for two integers
    // The first represents the number of chickens the farmer has
    // The second represents the number of pigs owned by the farmer
    // It should print how many legs all the animals have

    int numberOfChickens;
    int numberOfPigs;
    int numberOfLegs;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of chickens: ");
    numberOfChickens = scanner.nextInt();

    System.out.print("Enter the number of pigs: ");
    numberOfPigs = scanner.nextInt();

    numberOfLegs = numberOfChickens *2 + numberOfPigs * 4;

    System.out.println("The animals have " + numberOfLegs + " legs.");

  }
}
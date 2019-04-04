import java.util.Scanner;

public class PrintBigger {
  public static void main(String[] args) {
    // Write a program that asks for two numbers and prints the bigger one
    double numOne, numTwo;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number: ");
    numOne = scanner.nextDouble();
    System.out.print("Enter another number: ");
    numTwo = scanner.nextDouble();

    if(numOne > numTwo){
      System.out.println(numOne);
    }else if(numOne < numTwo){
      System.out.println(numTwo);
    }
  }
}

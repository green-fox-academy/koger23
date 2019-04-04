import java.util.Scanner;

public class AverageOfInput {

  // Write a program that asks for 5 integers in a row,
  // then it should print the sum and the average of these numbers like:
  //
  // Sum: 22, Average: 4.4

  public static void main(String[] args) {

    int numOne, numTwo, numThree, numFour, numFive, sum, avg;

    Scanner scan = new Scanner(System.in);

    System.out.print("Please enter the 1st number: ");
    numOne = scan.nextInt();
    System.out.print("Please enter the 2nd number: ");
    numTwo = scan.nextInt();
    System.out.print("Please enter the 3rd number: ");
    numThree = scan.nextInt();
    System.out.print("Please enter the 4th number: ");
    numFour = scan.nextInt();
    System.out.print("Please enter the 5th number: ");
    numFive = scan.nextInt();

    sum = numOne + numTwo + numThree + numFour + numFive;
    avg = sum / 5;

    System.out.println("Sum: " + sum + ", Average: " + avg);

  }

}

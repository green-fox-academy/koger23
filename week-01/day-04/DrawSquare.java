import java.util.Scanner;

public class DrawSquare {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // square like this:
    //
    //
    // %%%%%%
    // %    %
    // %    %
    // %    %
    // %    %
    // %%%%%%
    //
    // The square should have as many lines as the number was

    String character;
    String space;
    int inputNumber;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Give a number: ");
    inputNumber = scanner.nextInt();

    // i for rows and j for columns
    for(int i=0; i<inputNumber; i++){

      for(int j=0; j<inputNumber; j++){

        if((i == 0) || (j == 0) || (j == inputNumber-1) || (i == inputNumber-1)){
          character = "%";
        }else{
          character = " ";
        }

        System.out.print(character);
      }
      System.out.println();
    }
  }
}
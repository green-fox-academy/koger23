import java.util.Scanner;

public class DrawPyramid {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was

    int inputNumber;
    String character;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Give a number for the height of the pyramid: ");
    inputNumber = scanner.nextInt();


    // i for stepping rows, j for stepping cols
    for(int i=1; i<inputNumber+1; i++) {

      for (int j = 1; j < inputNumber * 2; j++) {

        if ((j <= inputNumber - i) || (j >= inputNumber + i)) {
          character = " ";
        } else {
          character = "*";
        }
        System.out.print(character);
      }
      System.out.println("");
    }
  }
}

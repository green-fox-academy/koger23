import java.util.Scanner;

public class DrawDiamond {

  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // diamond like this:
    //
    //
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    //
    // The diamond should have as many lines as the number was
    // Discuss with mentor what in that case if the number is even: make double of the widest line

    int inputNumber, columNumber, correctionForSymmetry;
    String character = "*";

    Scanner scanner = new Scanner(System.in);

    System.out.print("Give a number for the height of the diamond: ");
    inputNumber = scanner.nextInt();

    if (inputNumber % 2 == 0) {
      columNumber = inputNumber - 1;
      correctionForSymmetry = 2;
    } else {
      columNumber = inputNumber;
      correctionForSymmetry = 1;
    }

    System.out.println("The column number is: " + columNumber);

    int cntr = 1;

    // i for stepping rows, j for stepping cols
    for (int i = 1; i < inputNumber + 1; i++) {

      for (int j = 1; j < columNumber + 1; j++) {

        int colMiddle = (columNumber + 1) / 2; // works both even-odd cases because of the integer type

        // Upper part like pyramid
        if (i <= colMiddle) {

          if ((j <= (colMiddle - i)) || (j >= (colMiddle + i))) {
            character = " ";
          } else {
            character = "*";
          }

          // Lower part
        } else {

          if (((j <= cntr) && (i > (inputNumber + correctionForSymmetry) / 2)) || ((j >= columNumber + 1 - cntr) && (i > (inputNumber + correctionForSymmetry) / 2))) {
            character = " ";
          } else {
            character = "*";
          }
        }
        System.out.print(character);

      }
      // stepping counter for lower part
      if (i > (inputNumber + correctionForSymmetry) / 2) {
        cntr++;
      }

      System.out.println("");
    }
  }
}

//TODO: make it more simple somehow...
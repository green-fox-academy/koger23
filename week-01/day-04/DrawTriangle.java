import java.util.Scanner;

public class DrawTriangle {
  public static void main(String[] args) {
    // Write a program that reads a number from the standard input, then draws a
    // triangle like this:
    //
    // *
    // **
    // ***
    // ****
    //
    // The triangle should have as many lines as the number was
    String star = "*";
    int inputNumber;

    Scanner scanner = new Scanner(System.in);

    System.out.print("Give a number: ");
    inputNumber = scanner.nextInt();

    for(int i=0; i<inputNumber; i++){
      for (int j = 0; j <i+1; j++){
        System.out.print(star);
      }
      System.out.print("\n");
    }
  }
}

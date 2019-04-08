import java.util.Scanner;

public class Factorio {

  public static void main(String[] args) {

    //  Create the usual class wrapper
    //  and main method on your own.

    // - Create a function called `factorio`
    //   that returns it's input's factorial

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please enter a whole number: ");
    System.out.println(factorio(scanner.nextInt()));

  }

  public static int factorio(int inputNumber){

    int factorial = 1;

    for (int i=inputNumber; i>1; i--) {

      factorial *= i;

    }
    return factorial;
  }


}

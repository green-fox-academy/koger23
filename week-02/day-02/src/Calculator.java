import java.util.List;
import java.util.Scanner;

public class Calculator {
  public static void main(String... args) {
    // Create a simple calculator application which reads the parameters from the prompt
    // and prints the result to the prompt.
    // It should support the following operations,
    // create a method named "calculate()":
    // +, -, *, /, % and it should support two operands.
    // The format of the expressions must be: {operation} {operand} {operand}.
    // Examples: "+ 3 3" (the result will be 6) or "* 4 4" (the result will be 16)

    // You can use the Scanner class
    // It should work like this:

    // Start the program
    // It prints: "Please type in the expression:"
    // Waits for the user input
    // Print the result to the prompt
    // Exit

    calculate();
  }

  public static void calculate(){

    Scanner scanner = new Scanner(System.in);

    System.out.println("Please type in the expression: ");
    String input = scanner.nextLine();


    String[] expression = input.split(" ");
    String operation = expression[0];
    String operand1 = expression[1];
    String operand2 = expression[2];

    Double result = 0d;
    
    if (operation.equals("+")){

      result = Double.valueOf(operand1) + Double.valueOf(operand2);

    } else if (operation.equals("-")){

      result = Double.valueOf(operand1) - Double.valueOf(operand2);


    } else if (operation.equals("*")){

      result = Double.valueOf(operand1) * Double.valueOf(operand2);


    } else if (operation.equals("/")){

      result = Double.valueOf(operand1) / Double.valueOf(operand2);


    } else if (operation.equals("%")){

      result = Double.valueOf(operand1) % Double.valueOf(operand2);

    } else {

      System.out.println("Error in typed expression");
      return;
    }

    System.out.println(result);
  }

}
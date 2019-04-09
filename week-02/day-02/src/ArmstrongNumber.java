import java.util.Scanner;

public class ArmstrongNumber {

  public static void main(String[] args) {

    checkNumber();

  }

  public static void checkNumber(){

    int inputNumber;
    int numLength;
    double[] cubicNumberList;
    boolean isArmstrongNum = false;

    System.out.print("Please enter a whole number: ");
    Scanner scanner = new Scanner(System.in);

    inputNumber = scanner.nextInt();

    numLength = String.valueOf(inputNumber).length();
    cubicNumberList = new double[numLength];

    // populate lists:
    for (int i=0; i<numLength; i++){
      int numberChar = Integer.valueOf(String.valueOf(inputNumber).substring(i, i+1));
      cubicNumberList[i] = Math.pow(numberChar, numLength);
    }

    int checkNumber = 0;
    for (double i:cubicNumberList){
      checkNumber += i;
    }

    if (checkNumber == inputNumber){
      System.out.println("The " + inputNumber + " is an Armstrong number.");
    } else {
      System.out.println("The " + inputNumber + " is NOT an Armstrong number.");
    }

  }

}

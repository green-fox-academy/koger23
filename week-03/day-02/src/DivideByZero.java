public class DivideByZero {

  public static void main(String[] args) {


    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0


    divideByZero(0);

  }

  public static void divideByZero(int number){

    int result;

    try {

      result= 10 / number;

      System.out.println(result);

    } catch (Exception e) {

      System.out.println("fail");
    }


  }

}

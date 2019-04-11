public class GreatestCommonDivisor {

  public static void main(String[] args) {

    /*
    * Find the greatest common divisor of two numbers using recursion.
    */

    System.out.println(gcd(18, 12));

  }

  public static int gcd(int num1, int num2){

    if (num1 % num2 == 0){
      return  num2;
    }

    int remainder = num1 % num2;

    return gcd(num2, remainder);
  }

}

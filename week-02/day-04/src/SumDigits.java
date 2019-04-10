public class SumDigits {

  /*
  Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields
  the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
   */

  public static void main(String[] args) {

    System.out.println(sumDigits(2566));

  }

  private static int sumDigits(int n) {

    int num = 0;

    if (n < 10){
      return num + n;

    } else {
        num += n % 10;
        num += sumDigits(n / 10);


      return num;

    }

  }

}

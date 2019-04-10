public class PowerN {

  /*
  * Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power,
  * so powerN(3, 2) is 9 (3 squared).
  * */

  public static void main(String[] args) {

    System.out.println(powerN(3, -3));

  }

  private static double powerN(double num, int power) {

    if (power == 0){
      return 1;
    } else {

      if (power > 0){
        return num * powerN(num, power - 1);
      } else {
        return 1 / (num * powerN(num, -power - 1));
      }

    }

  }
}

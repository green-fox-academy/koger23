public class Bunnies {

  public static void main(String[] args) {

    /*
     * We have a number of bunnies and each bunny has two big floppy ears. We want to compute
     * the total number of ears across all the bunnies recursively (without loops or multiplication).
     */

    System.out.println(countBunniesLoop(16));
    System.out.println(countBunnies(16));

  }

  private static int countBunnies(int number) {

    if (number == 0){
      return number;

    } else {

      return 2 + countBunnies(--number);

    }
  }

  private static int countBunniesLoop(int number) {

    int ears = 0;

    for (int i = number; i > 0; i--){

      ears += 2;
    }

    return ears;

  }
}

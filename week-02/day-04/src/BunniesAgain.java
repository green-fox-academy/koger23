public class BunniesAgain {

  public static void main(String[] args) {

    /*
    * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
    * The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot.
    * Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
    * */

//    System.out.println(bunniesAgainLoop(16));
    System.out.println(bunniesAgain(8));

  }

  private static int bunniesAgain(int number) {

    if (number == 0){
      return number;

    } else {

      if (number % 2 != 0){
        return 2 + bunniesAgain(--number);
      } else {
        return 3 + bunniesAgain(--number);

      }
    }
  }

  private static int bunniesAgainLoop(int number){

    int ears = 0;

    for (int i = number; i > 0; i--){

      if (number % 2 != 0){
        ears += 2;
      } else {
        ears += 3;
      }
    }
    return ears;
  }


}

import java.util.Arrays;
import java.util.Comparator;

public class Reverse {

  public static void main(String[] args) {

    // - Create an array variable named `aj`
    //   with the following content: `[3, 4, 5, 6, 7]`
    // - Reverse the order of the elements in `aj`
    // - Print the elements of the reversed `aj`

    Integer[] aj = {3, 4, 5, 6, 7};

    Arrays.sort(aj, Comparator.reverseOrder());

    System.out.println(Arrays.toString(aj));

  }

}

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Math.sqrt;

public class Exercise3 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
    List<Integer> squareMoreThan20;

    squareMoreThan20 = numbers.stream()
        .map(n -> n * n)
        .filter(n -> n > 20)
        .map(n -> (int) sqrt(n))
        .collect(Collectors.toList());

    System.out.println(squareMoreThan20);
  }
}

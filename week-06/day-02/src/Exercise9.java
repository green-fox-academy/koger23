import java.util.Map;
import java.util.stream.Collectors;

public class Exercise9 {
  /*
  * Write a Stream Expression to find the frequency of characters in a given string!
  */
  static final String GIVEN_STRING = "Given string";

  public static void main(String[] args) {
    Map<Character, Integer> occurances;

    occurances = GIVEN_STRING.chars().boxed()
            .collect(Collectors.toMap(k -> (char) k.intValue(), v -> 1, (i, i1) -> Integer.sum(i, i1)));

    System.out.println(occurances);
  }
}

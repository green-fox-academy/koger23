import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
  /*
  Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:
   */
  final static List<String> CITIES = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");

  public static void main(String[] args) {
    System.out.println(findStartWidth("A"));
  }

  public static List<String> findStartWidth(String letter) {
    List<String> result;

    result = CITIES.stream()
            .filter(w -> w.startsWith(letter))
            .collect(Collectors.toList());
    return result;
  }
}

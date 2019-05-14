import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Exercise11 {
  /*
   * Find a random Wikipedia article and copy the contents to a txt file.
   * Create a Stream expression which reads all text from this file, and prints the 100 most common words in descending
   * order. Keep in mind that the text contains punctuation characters which should be ignored. The result should be
   * something like this:
   * */
  public static void main(String[] args) {
    try {
      Map<String, Integer> occurances = Files.lines(Paths.get("assets/wiki.txt"))
              .flatMap(charSequence -> Pattern.compile("\\s+").splitAsStream(charSequence))
              .collect(Collectors.toMap(k -> k, v -> 1, Integer::sum));

      System.out.println(occurances);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

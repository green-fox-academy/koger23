import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise8 {
  /*
  Write a Stream Expression to concatenate a Character list to a string!
   */
  public static void main(String[] args) {
    List<Character> charachterList = Arrays.asList('T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'S', 'p', 'a', 'r', 't', 'a', '!');
    String strings = charachterList.stream()
            .map(c -> c.toString())
            .collect(Collectors.joining());

    System.out.println(strings);
  }
}

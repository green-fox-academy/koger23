import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercise12 {
  /*
  * Create Stream expressions to perform the following exercises:

    - Print the name of the heaviest character (if the mass is unknown, ignore that character)
    - Print the average height of the male characters
    - Print the average height of the female characters
    - Get the age distribution of the characters by gender (where the gender can be "male", "female" and "other")
        - The age groups are: "below 21", "between 21 and 40", "above 40" and "unknown"
        - The result should be a Map<String, Map<String, Integer>>
  */
  static final String FILENAME = "assets/swcharacters.csv";

  public static void main(String[] args) {
    System.out.println(getTheHeaviestCharacter(FILENAME));
//    System.out.println(getAverageHeightOfMales(FILENAME));
  }
//
//  public static int getAverageHeightOfMales(String fileName) {
//    try {
//      Files.readAllLines(Paths.get(fileName)).stream()
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//    return -1;
//  }

  public static String getTheHeaviestCharacter(String fileName) {
    try {
      Optional<String[]> maximum = Files.readAllLines(Paths.get(fileName)).stream()
              .map(k -> {
                String[] strArr = k.split(";");
                for (int i = 0; i < strArr.length; i++) {
                  if (strArr[2].contains(",")) {
                    strArr[2] = strArr[2].replaceAll(",", "");
                    System.out.println(strArr[i]);
                  }
                  if ((strArr[i].equals("unknown") || strArr[i].equals("mass") || strArr[i].equals("height"))) {
                    strArr[i] = null;
                  }
                }
                return strArr;
              })
              .collect(Collectors.toList())
              .stream()
              .max(Comparator.comparing(String::valueOf));
      return maximum.get()[2];

    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }
}

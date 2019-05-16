import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
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
  List<SWCharacter> SWCharacterList = new ArrayList<>();

  public static void main(String[] args) {
    Exercise12 task = new Exercise12();

    task.SWCharacterList = task.populateList(task.readFile(FILENAME));
    System.out.print("The heaviest character: ");
    System.out.println(task.getTheHeaviest());
    System.out.print("The average height of the male characters: ");
    System.out.println(task.getAverageHeightOfGender("male"));
    System.out.print("The average height of the female characters: ");
    System.out.println(task.getAverageHeightOfGender("female"));

    System.out.print("Distribution of age on genders: ");
    System.out.println(task.getAgeDistributionOnGenders());
  }

  public Map<String, Map<String, Integer>> getAgeDistributionOnGenders() {
    return SWCharacterList.stream()
            .collect(
                    Collectors.groupingBy((SWCharacter swCharacter) -> swCharacter.getGender(),
                            Collectors.groupingBy((SWCharacter swCharacter1) -> swCharacter1.getAgeGroup(), Collectors.summingInt(x -> 1)))
            );
  }

  public Double getAverageHeightOfGender(String gender) {
    return SWCharacterList.stream()
            .filter(c -> c.isHasHeight())
            .filter(c -> c.getGender().equals(gender))
            .mapToDouble(swCharacter -> swCharacter.getHeight())
            .average()
            .orElse(-1);
  }

  public String getTheHeaviest() {
    return SWCharacterList.stream()
            .filter(SWCharacter::isHasMass)
            .max(Comparator.comparingDouble(c -> c.getMass()))
            .orElseThrow(() -> new NoSuchElementException())
            .getName();
  }

  public List<String> readFile(String fileName) {
    List<String> content = new ArrayList<>();
    try {
     content = Files.readAllLines(Paths.get(fileName));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return content;
  }

  private List<SWCharacter> populateList(List<String> rows) {
    return rows.stream()
            .skip(1)
            .map(row -> createCharacter(row.split(";")))
            .collect(Collectors.toList());
  }

  public SWCharacter createCharacter(@NotNull String[] stringArray) {
    SWCharacter swCharacter = new SWCharacter();

    if (SWCharacter.checkValue(stringArray[0])) {
      swCharacter.setName(stringArray[0]);
    }
    if (SWCharacter.checkValue(stringArray[1])) {
      if (stringArray[1].contains(",")) {
        stringArray[1].replaceAll(",", "");
      }
      swCharacter.setHeight(Double.valueOf(stringArray[1]));
      swCharacter.setHasHeight(true);
    }
    if (SWCharacter.checkValue(stringArray[2])) {
      if (stringArray[2].contains(",")) {
        stringArray[2] = stringArray[2].replaceAll(",", "");
      }
      swCharacter.setMass(Double.valueOf(stringArray[2]));
      swCharacter.setHasMass(true);
    }
    if (SWCharacter.checkValue(stringArray[3])) {
      swCharacter.setHairColour(stringArray[3]);
      swCharacter.setHasHairColour(true);
    }
    if (SWCharacter.checkValue(stringArray[4])) {
      swCharacter.setSkinColour(stringArray[4]);
      swCharacter.setHasSkinColour(true);
    }
    if (SWCharacter.checkValue(stringArray[5])) {
      swCharacter.setEyeColour(stringArray[5]);
      swCharacter.setHasEyeColour(true);
    }
    if (SWCharacter.checkValue(stringArray[6])) {
      stringArray[6] = stringArray[6].replaceAll("BBY", "");
      swCharacter.setBirthYear(Double.valueOf(stringArray[6]));
      swCharacter.setHasBirthYear(true);
    } else {
      swCharacter.setBirthYear(-1d);
      swCharacter.setHasBirthYear(false);
    }
    if (SWCharacter.checkValue(stringArray[7])) {
      if (!stringArray[7].equals("male") && !stringArray[7].equals("female")) {
        stringArray[7] = "other";
      }
      swCharacter.setGender(stringArray[7]);
      swCharacter.setHasGender(true);
    }
    return swCharacter;
  }
}

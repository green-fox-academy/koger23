import java.util.ArrayList;
import java.util.List;

public class Exercise10 {
  /*
    Create a Fox class with 3 properties:name, color and age Fill a list with at least 5 foxes and:

    - Write a Stream Expression to find the foxes with green color!
    - Write a Stream Expression to find the foxes with green color, and age less then 5 years!
    - Write a Stream Expression to find the frequency of foxes by color!
  */
  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<>();

    Fox fox1 = new Fox("Mr.GreenFox", 12, "green");
    foxes.add(fox1);
    Fox fox2 = new Fox("Mrs.GreenFox", 4, "green");
    foxes.add(fox2);
    Fox fox3 = new Fox("Miss BrownFox", 7, "brow");
    foxes.add(fox3);
    Fox fox4 = new Fox("The RedFox", 12, "red");
    foxes.add(fox4);
    Fox fox5 = new Fox("Mr. BlueFox", 12, "blue");
    foxes.add(fox5);
    Fox fox6 = new Fox("Mrs YellowFox", 12, "yellow");
    foxes.add(fox6);

    getGreenFoxes(foxes);
    getGreenFoxesLessThan5Years(foxes);
  }

  public static void getGreenFoxes(List<Fox> foxes) {
    foxes.stream()
            .filter(f -> f.getColor().equals("green"))
            .forEach(f -> System.out.println(f.getName()));
  }

  public static void getGreenFoxesLessThan5Years(List<Fox> foxes) {
    foxes.stream()
            .filter(f -> f.getColor().equals("green"))
            .filter(f -> f.getAge() < 5)
            .forEach(f -> System.out.println(f.getName()));
  }
}

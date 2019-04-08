import java.util.ArrayList;
import java.util.List;

public class ListIntroduction1 {

  public static void main(String[] args) {

    List<String> names = new ArrayList<>();

    System.out.println(names.size());

    names.add("William");

    System.out.println(names.isEmpty());

    names.add("John");
    names.add("Amanda");

    System.out.println(names.size());

    System.out.println(names.get(2));

    for (int i = 0; i < names.size(); i++) {

      System.out.println(names.get(i));

    }

    for (int i = 0; i < names.size(); i++) {

      System.out.println(i + 1 + ". " + names.get(i));

    }

    names.remove(1);

    for (int i = names.size()-1; i > -1; i--) {

      System.out.println(names.get(i));

    }

    names.clear();

  }

}

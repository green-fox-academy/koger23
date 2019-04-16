import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

  public static void main(String[] args) {
    // Create a method that decrypts reversed-order.txt

    reorder("assets/reversed-order.txt");
  }

  public static void reorder(String path) {

    Path src = Paths.get(path);

    try {

      List<String> content = Files.readAllLines(src);

      List<String> reorderedContent = new ArrayList<>();

      for (String line : content) {

        reorderedContent.add(0, line);
      }
      Files.write(src, reorderedContent);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

  public static void main(String[] args) {
    // Create a method that decrypts the duplicated-chars.txt

    String path = "assets/duplicated-chars.txt";

    Path src = Paths.get(path);

    try {
      List<String> content = Files.readAllLines(src);
      List<String> newContent = new ArrayList<>();

      String decodedLine;

      for (String line : content){

        decodedLine = "";

        char[] lineChars = line.toCharArray();

        for (int i = 0; i < lineChars.length; i++){

          if (i % 2 == 0){
            decodedLine += lineChars[i];
          }
        }

        newContent.add(decodedLine);
        System.out.println(decodedLine + "\n");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
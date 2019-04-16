import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

  public static void main(String[] args) {
    // Create a method that decrypts encoded-lines.txt

    encrypt("assets/encoded-lines.txt");

  }

  public static void encrypt(String path){

    Path src = Paths.get(path);

    try {
      List<String> content = Files.readAllLines(src);

      List<String> encryptedContent = new ArrayList<>();

      String decodedLine;

      for (String line : content){

        char[] lineChar = line.toCharArray();

        decodedLine = "";

        for (char letter : lineChar){

          if (letter != ' '){

            int iLetter = (int) letter;

            char originalLetter = (char) (iLetter-1);

            decodedLine += originalLetter;

          } else {
            decodedLine += letter;
          }
        }
        encryptedContent.add(decodedLine);
      }
      Files.write(src, encryptedContent);

    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
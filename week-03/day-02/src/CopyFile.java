import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {

  public static void main(String[] args) {
    // Write a function that copies the contents of a file into another
    // It should take the filenames as parameters
    // It should return a boolean that shows if the copy was successful

    String source = "assets/my-file.txt";
    String target = "assets/my-file_2.txt";

    System.out.println(copyContent(source, target));
  }

  public static boolean copyContent(String source, String target){

    Path sourceFile = Paths.get(source);
    Path targetFile = Paths.get(target);

    try {
      List<String> sourceContent = Files.readAllLines(sourceFile);

      List<String> targetContent = Files.readAllLines(targetFile);

      for (String souceLine : sourceContent){
        targetContent.add(souceLine);
      }

      Files.write(targetFile, targetContent);

      return true;

    } catch (IOException e) {
      return false;
    }

  }
}

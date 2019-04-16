import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {

  public static void main(String[] args) {
    // Write a function that takes a filename as string,
    // then returns the number of lines the file contains.
    // It should return zero if it can't open the file, and
    // should not raise any error.


    System.out.println(countLines("day-02.iml"));

  }

  public static int countLines(String path){

    Path src = Paths.get(path);

    try {

      List<String> lines = Files.readAllLines(src);
      return lines.size();

    } catch (IOException e) {
      return 0;
    }

  }

}
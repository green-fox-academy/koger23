import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {

  public static void main(String[] args) {

    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.

    List<String> log = readFile("assets/log.txt");

    getUniqIPs(log);

  }

  public static List<String> readFile(String path){

    Path src = Paths.get(path);

    try {
      List<String> content = Files.readAllLines(src);
      return content;

    } catch (IOException e) {
      System.out.println("Error while opening the file.");

      List<String> content = new ArrayList<>();

      return content;
    }


  }

  public static List<String> getUniqIPs(List<String> fileContent){

    List<String> uniqIPs = new ArrayList<>();

    return uniqIPs;
  }

  public static int getGetPostRatio(List<String> fileContent){

    int ratio = 0;

    return ratio;
  }

}

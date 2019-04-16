import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Logs {

  public static void main(String[] args) {

    // Read all data from 'log.txt'.
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses.
    // Write a function that returns the GET / POST request ratio.

    List<String[]> log = readFile("assets/log.txt");

    System.out.println(Arrays.toString(log.get(0)));

  }

  public static List<String[]> readFile(String path){

    Path src = Paths.get(path);
    String sep = "   ";

    try {
      List<String> data = Files.readAllLines(src);

      List<String[]> sepContent = new ArrayList<>();

      for (String s : data) {
        s = s.replace(" /", "");
        String[] arr = s.split(sep);
        sepContent.add(arr);
      }

      return sepContent;

    } catch (IOException e) {
      System.out.println("Error while opening the file.");

      List<String[]> emptyList = new ArrayList<>();

      return emptyList;
    }


  }

  public static List<String> getUniqIPs(List<String[]> fileContent){

    List<String> uniqIPs = new ArrayList<>();

    return uniqIPs;
  }

  public static int getGetPostRatio(List<String[]> fileContent){

    int ratio = 0;

    return ratio;
  }

}

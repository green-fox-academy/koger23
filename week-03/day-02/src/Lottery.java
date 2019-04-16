import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lottery {

  public static void main(String[] args) {
    // Create a method that find the 5 most common lottery numbers in lottery.csv

    getMostCommonNums("assets/lottery.csv");
  }

  public static void getMostCommonNums(String path){

    Path src = Paths.get(path);

    try {

      List<String> content = Files.readAllLines(src);

      List<String[]> rowsArray = new ArrayList<>();

      int[] numbers = new int[90];

      for (String line : content){

        String[] arr = line.split(";");

        rowsArray.add(arr);
      }

      for (String[] row : rowsArray){

        for (int i = 0; i < 5; i++) {

          String num = row[row.length - 1 - i];

          int index = Integer.valueOf(num);
          System.out.println(index);

          numbers[index - 1] += 1;
        }

      }

      System.out.println(Arrays.toString(numbers));

    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
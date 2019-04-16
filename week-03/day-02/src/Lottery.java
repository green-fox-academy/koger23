import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {

  public static void main(String[] args) {
    // Create a method that find the 5 most common lottery numbers in lottery.csv

    getMostCommonNums("assets/lottery.csv");
  }

  public static void getMostCommonNums(String path) {

    Path src = Paths.get(path);

    try {

      List<String> content = Files.readAllLines(src);

      List<String[]> rowsArray = new ArrayList<>();

      List<Integer> top5_occur = new ArrayList<>();

      Map<Integer, Integer> numberOfOccurances = new HashMap<>();

      int[] numbers = new int[90];

      // converting lines from strings into string[]
      for (String line : content) {

        String[] arr = line.split(";");

        rowsArray.add(arr);
      }

      // add number of occurances to numbers[]
      for (String[] row : rowsArray) {

        for (int i = 0; i < 5; i++) {

          String num = row[row.length - 1 - i];

          int index = Integer.valueOf(num);

          numbers[index - 1] += 1;
        }

      }

      // Put numbers into map
      // TODO this step should be merged with the prev. one
      for (int i = 0; i < numbers.length; i++) {

        numberOfOccurances.put(numbers[i], i + 1);
        top5_occur.add(numbers[i]);
      }

      Collections.sort(top5_occur);

      // remains top 5 occurances
      top5_occur = top5_occur.subList(top5_occur.size() - 5, top5_occur.size());

      for (int i = top5_occur.size() - 1; i >= 0; i--){

        int occur = top5_occur.get(i);
        int number = numberOfOccurances.get(occur);

        List<Integer> moreOcc = new ArrayList<>();

        for (Integer key: numberOfOccurances.keySet()){

          if (key == occur){
            moreOcc.add(numberOfOccurances.get(key));
            System.out.println("Value num: " + numberOfOccurances.get(key));
          }

        }

        System.out.println(number + ": " + occur);
      }


    } catch (IOException e) {
      e.printStackTrace();
    }


  }
}
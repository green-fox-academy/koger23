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

      int[][] lottery = new int[90][2];
      // Put numbers into map
      // TODO this step should be merged with the prev. one
      for (int i = 0; i < numbers.length; i++) {

        numberOfOccurances.put(numbers[i], i + 1);
        top5_occur.add(numbers[i]);

        lottery[i][0] = i+1;
        lottery[i][1] = numbers[i];
      }

      sortbyColumn(lottery, 1);

      System.out.println("TOP 5 most common lottery numbers:\nnumber : occurance (times)");
      for (int i = lottery.length - 1; i >= 0; i--){

        if (i == lottery.length - 6){
          break;
        }

        System.out.println(lottery[i][0] + ": " + lottery[i][1]);
      }



    } catch (IOException e) {
      e.printStackTrace();
    }


  }

  public static void sortbyColumn(int arr[][], int col)
  {
    // Using built-in sort function Arrays.sort
    Arrays.sort(arr, new Comparator<int[]>() {

      @Override
      // Compare values according to columns
      public int compare(int[] entry1, int[] entry2) {

        // To sort in descending order revert
        // the '>' Operator
        if (entry1[col] > entry2[col])
          return 1;
        else
          return -1;
      }
    });  // End of function call sort().
  }
}
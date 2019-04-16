import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {

  public static void main(String[] args) {
    // Write a function that takes a filename as a parameter
    // The file contains an ended Tic-Tac-Toe match
    // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
    // Return "X", "O" or "Draw" based on the input file

    System.out.println(ticTacResult("assets/win-o.txt"));
    // Should print "O"

//    System.out.println(ticTacResult("assets/win-x.txt"));
    // Should print "X"

//    System.out.println(ticTacResult("assets/draw.txt"));
    // Should print "Draw"
  }

  public static String ticTacResult(String path){

    Path src = Paths.get(path);

    try {

      List<String> rows = Files.readAllLines(src);

      String[][] matrix = new String[3][3];

      // populate matrix
      for (int i = 0; i < 3; i++){


        for (int j = 0; j < 3; j++){

          String s = rows.get(i).substring(j, j + 1);

          matrix[i][j] = s;
        }

      }

      for (String row[] : matrix){

        System.out.println(Arrays.toString(row));

      }


    } catch (IOException e) {
      e.printStackTrace();
    }

    return "s";
  }
}
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

    System.out.println(ticTacResult("assets/win-x.txt"));
    // Should print "X"

    System.out.println(ticTacResult("assets/draw.txt"));
    // Should print "Draw"
  }

  public static String ticTacResult(String path) {

    Path src = Paths.get(path);

    try {

      List<String> rows = Files.readAllLines(src);

      String[][] matrix = new String[3][3];

      // populate matrix
      for (int i = 0; i < matrix.length; i++) {


        for (int j = 0; j < matrix[i].length; j++) {

          String s = rows.get(i).substring(j, j + 1);

          matrix[i][j] = s;
        }

      }

      String winner = "Draw";

      // check winner in rows
      for (int j = 0; j < matrix.length; j++) {

        String firstItem = matrix[j][0];

        if (firstItem.equals(matrix[j][1]) && firstItem.equals(matrix[j][2])) {
          winner = firstItem;
          break;
        }
      }
      // check winner in columns
      for (int j = 0; j < matrix.length; j++) {

        String firstItem = matrix[0][j];

        if (firstItem.equals(matrix[1][j]) && firstItem.equals(matrix[2][j])) {
          winner = firstItem;
          break;
        }
      }
      // check winner diagonally
      if (matrix[2][2].equals(matrix[0][0]) && matrix[2][2].equals(matrix[1][1]) || matrix[2][2].equals(matrix[2][0]) && matrix[2][2].equals(matrix[0][2])){
        winner = matrix[2][2];
      }

      return winner;

    } catch (IOException e) {
      e.printStackTrace();
      return "Error";
    }


  }
}
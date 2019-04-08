import java.util.Arrays;

public class DiagonalMatrix {

  public static void main(String[] args) {

    // - Create (dynamically) a two dimensional array
    //   with the following matrix. Use a loop!
    //
    //   1 0 0 0
    //   0 1 0 0
    //   0 0 1 0
    //   0 0 0 1
    //
    // - Print this two dimensional array to the output

    int[][] twoDimArr = new int[4][4];

    for (int i=0; i<twoDimArr.length; i++){

      for (int j=0; j<twoDimArr[i].length; j++){

        if (j == i){
          twoDimArr[i][j] = 1;
          System.out.print(twoDimArr[i][j] + " ");
        } else {
          twoDimArr[i][j] = 0;
          System.out.print(twoDimArr[i][j] + " ");
        }
      }
      System.out.println("");
    }
  }

}

public class DrawChessTable {
  public static void main(String[] args) {
    // Crate a program that draws a chess table like this
    //
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // % % % %
    //  % % % %
    // 8x8

    int COLROWS = 8;
    String CHAR;

    for(int i=0; i<COLROWS; i++){

      for(int j=0; j<COLROWS; j++){

        if ((i % 2 == 0) && (j % 2 != 0) || (i % 2 != 0) && (j % 2 == 0)) {
          CHAR = " ";
        } else {
          CHAR = "%";
        }

        System.out.print(CHAR);
      }
      System.out.print("\n");
    }

  }
}

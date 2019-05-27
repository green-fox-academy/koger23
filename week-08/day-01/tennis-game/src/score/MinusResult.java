package score;

public class MinusResult {
  public static String getScoreIfMinusResultIsOne(int playerOneScore, int playerTwoScore) {
    int minusResult = playerOneScore - playerTwoScore;
    if (minusResult == 1) {
      return "Advantage player1";
    } else if (minusResult == -1) {
      return "Advantage player2";
    } else if (minusResult >= 2) {
      return "Win for player1";
    } else {
      return "Win for player2";
    }
  }
}

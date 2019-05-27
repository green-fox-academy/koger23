package score;

public class TempScore {
  public static int getTempScore(int playerOneScore, int playerTwoScore, int i) {
    if (i == 1) {
      return playerOneScore;
    } else {
      return playerTwoScore;
    }
  }
}

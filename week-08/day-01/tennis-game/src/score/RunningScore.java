package score;

public class RunningScore {
  public static String getRunningScore(int playerOneScore, int playerTwoScore) {
    StringBuilder score = new StringBuilder();
    for (int i = 1; i < 3; i++) {
      score.append(ScoreBuilder.buildScore(playerOneScore, playerTwoScore, i));
    }
    return score.toString();
  }
}

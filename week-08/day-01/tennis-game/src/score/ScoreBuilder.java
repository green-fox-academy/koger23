package score;

public class ScoreBuilder {
  public static String buildScore(int playerOneScore, int playerTwoScore, int round) {
    StringBuilder score = new StringBuilder();
    if (round != 1) {
      score.append("-");
    }
    switch (TempScore.getTempScore(playerOneScore, playerTwoScore, round)) {      case 0:
        score.append("Love");
        break;
      case 1:
        score.append("Fifteen");
        break;
      case 2:
        score.append("Thirty");
        break;
      case 3:
        score.append("Forty");
        break;
    }
    return score.toString();
  }
}

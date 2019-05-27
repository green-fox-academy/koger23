package score;

public class Score {
  public static String getScoreIfDraw(int m_score1) {
    switch (m_score1) {
      case 0:
        return "Love-All";
      case 1:
        return "Fifteen-All";
      case 2:
        return "Thirty-All";
      case 3:
        return "Forty-All";
      default:
        return "Deuce";
    }
  }

  public static String getScore(int playerOneScore, int playerTwoScore) {
    if (playerOneScore == playerTwoScore) {
      return Score.getScoreIfDraw(playerOneScore);
    } else if (playerOneScore >= 4 || playerTwoScore >= 4) {
      return MinusResult.getScoreIfMinusResultIsOne(playerOneScore, playerTwoScore);
    } else {
      return RunningScore.getRunningScore(playerOneScore, playerTwoScore);
    }
  }
}

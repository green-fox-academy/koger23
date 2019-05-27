import score.Score;

public class TennisGame1 implements TennisGame {

  private int playerOneScore = 0;
  private int playerTwoScore = 0;
  private String playerOneName;
  private String playerTwoName;

  public TennisGame1(String playerOneName, String playerTwoName) {
    this.playerOneName = playerOneName;
    this.playerTwoName = playerTwoName;
  }

  public void wonPoint(String playerName) {
    if (playerName.equals("player1")) {
      playerOneScore += 1;
    } else {
      playerTwoScore += 1;
    }
  }

  public String getScore() {
    if (playerOneScore == playerTwoScore) {
      return Score.getScoreIfDraw(playerOneScore);
    } else if (playerOneScore >= 4 || playerTwoScore >= 4) {
      return getScoreIfMinusResultIsOne();
    } else {
      return getRunningScore();
    }
  }

  private String getScoreIfMinusResultIsOne() {
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

  private String getRunningScore() {
    StringBuilder score = new StringBuilder();
    for (int i = 1; i < 3; i++) {
      score.append(buildScore(i));
    }
    return score.toString();
  }

  private int getTempScore(int i) {
    if (i == 1) {
      return playerOneScore;
    } else {
      return playerTwoScore;
    }
  }

  private String buildScore(int round) {
    StringBuilder score = new StringBuilder();
    if (round != 1) {
      score.append("-");
    }
    switch (getTempScore(round)) {      case 0:
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

  public int getPlayerOneScore() {
    return playerOneScore;
  }

  public void setPlayerOneScore(int playerOneScore) {
    this.playerOneScore = playerOneScore;
  }

  public int getPlayerTwoScore() {
    return playerTwoScore;
  }

  public void setPlayerTwoScore(int playerTwoScore) {
    this.playerTwoScore = playerTwoScore;
  }

  public String getPlayerOneName() {
    return playerOneName;
  }

  public void setPlayerOneName(String playerOneName) {
    this.playerOneName = playerOneName;
  }

  public String getPlayerTwoName() {
    return playerTwoName;
  }

  public void setPlayerTwoName(String playerTwoName) {
    this.playerTwoName = playerTwoName;
  }
}


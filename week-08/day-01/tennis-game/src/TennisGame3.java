
public class TennisGame3 implements TennisGame {
  private int playerTwoScore;
  private int playerOneScore;
  private String playerOneName;
  private String playerTwoName;

  public TennisGame3(String playerOneName, String playerTwoName) {
    this.playerOneName = playerOneName;
    this.playerTwoName = playerTwoName;
  }

  public String getScore() {
    String score;
    if (playerOneScore < 4 && playerTwoScore < 4) {
      String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
      score = p[playerOneScore];
      return (playerOneScore == playerTwoScore) ? score + "-All" : score + "-" + p[playerTwoScore];
    } else {
      if (playerOneScore == playerTwoScore) {
        return "Deuce";
      }
      score = playerOneScore > playerTwoScore ? playerOneName : playerTwoName;
      return ((playerOneScore - playerTwoScore) * (playerOneScore - playerTwoScore) == 1) ? "Advantage " + score : "Win for " + score;
    }
  }

  public void wonPoint(String playerName) {
    if (playerName == "player1") {
      this.playerOneScore += 1;
    }
    else {
      this.playerTwoScore += 1;
    }
  }

  public int getPlayerTwoScore() {
    return playerTwoScore;
  }

  public void setPlayerTwoScore(int playerTwoScore) {
    this.playerTwoScore = playerTwoScore;
  }

  public int getPlayerOneScore() {
    return playerOneScore;
  }

  public void setPlayerOneScore(int playerOneScore) {
    this.playerOneScore = playerOneScore;
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

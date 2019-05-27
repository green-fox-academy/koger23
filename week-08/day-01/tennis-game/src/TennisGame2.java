import score.Score;

public class TennisGame2 implements TennisGame {
  public int playerOneScore = 0;
  public int playerTwoScore = 0;

  private String playerOneName;
  private String playerTwoName;

  public TennisGame2(String playerOneName, String playerTwoName) {
    this.playerOneName = playerOneName;
    this.playerTwoName = playerTwoName;
  }

  public void wonPoint(String player) {
    if (player.equals("player1")) {
      increasePlayerOneScoreByOne();
    } else {
      increasePlayerTwoScoreByOne();
    }
  }

  public String getScore() {
    return Score.getScore(playerOneScore, playerTwoScore);
  }

  public void increasePlayerOneScoreByOne() {
    playerOneScore++;
  }

  public void increasePlayerTwoScoreByOne() {
    playerTwoScore++;
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

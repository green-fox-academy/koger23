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
    return Score.getScore(playerOneScore, playerTwoScore);
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


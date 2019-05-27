import score.Score;

public class TennisGame2 implements TennisGame {
  public int playerOneScore = 0;
  public int playerTwoScore = 0;

  public String P1res = "";
  public String P2res = "";
  private String playerOneName;
  private String playerTwoName;

  public TennisGame2(String playerOneName, String playerTwoName) {
    this.playerOneName = playerOneName;
    this.playerTwoName = playerTwoName;
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

  public void wonPoint(String player) {
    if (player == "player1")
      increasePlayerOneScoreByOne();
    else
      increasePlayerTwoScoreByOne();
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

  public String getP1res() {
    return P1res;
  }

  public void setP1res(String p1res) {
    P1res = p1res;
  }

  public String getP2res() {
    return P2res;
  }

  public void setP2res(String p2res) {
    P2res = p2res;
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

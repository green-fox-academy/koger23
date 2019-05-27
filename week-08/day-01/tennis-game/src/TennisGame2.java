
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
    String score = "";
    if (playerOneScore == playerTwoScore && playerOneScore < 4) {
      if (playerOneScore == 0)
        score = "Love";
      if (playerOneScore == 1)
        score = "Fifteen";
      if (playerOneScore == 2)
        score = "Thirty";
      if (playerOneScore == 3)
        score = "Forty";
      score += "-All";
    }
    if (playerOneScore == playerTwoScore && playerOneScore > 3)
      score = "Deuce";
    if (playerOneScore > 0 && playerTwoScore == 0) {
      if (playerOneScore == 1)
        P1res = "Fifteen";
      if (playerOneScore == 2)
        P1res = "Thirty";
      if (playerOneScore == 3)
        P1res = "Forty";
      P2res = "Love";
      score = P1res + "-" + P2res;
    }
    if (playerTwoScore > 0 && playerOneScore == 0) {
      if (playerTwoScore == 1)
        P2res = "Fifteen";
      if (playerTwoScore == 2)
        P2res = "Thirty";
      if (playerTwoScore == 3)
        P2res = "Forty";
      P1res = "Love";
      score = P1res + "-" + P2res;
    }
    if (playerOneScore > playerTwoScore && playerOneScore < 4) {
      if (playerOneScore == 2)
        P1res = "Thirty";
      if (playerOneScore == 3)
        P1res = "Forty";
      if (playerTwoScore == 1)
        P2res = "Fifteen";
      if (playerTwoScore == 2)
        P2res = "Thirty";
      score = P1res + "-" + P2res;
    }
    if (playerTwoScore > playerOneScore && playerTwoScore < 4) {
      if (playerTwoScore == 2)
        P2res = "Thirty";
      if (playerTwoScore == 3)
        P2res = "Forty";
      if (playerOneScore == 1)
        P1res = "Fifteen";
      if (playerOneScore == 2)
        P1res = "Thirty";
      score = P1res + "-" + P2res;
    }
    if (playerOneScore > playerTwoScore && playerTwoScore >= 3) {
      score = "Advantage player1";
    }
    if (playerTwoScore > playerOneScore && playerOneScore >= 3) {
      score = "Advantage player2";
    }
    if (playerOneScore >= 4 && playerTwoScore >= 0 && (playerOneScore - playerTwoScore) >= 2) {
      score = "Win for player1";
    }
    if (playerTwoScore >= 4 && playerOneScore >= 0 && (playerTwoScore - playerOneScore) >= 2) {
      score = "Win for player2";
    }
    return score;
  }

  public void SetP1Score(int number) {
    for (int i = 0; i < number; i++) {
      increasePlayerOneScoreByOne();
    }
  }

  public void SetP2Score(int number) {
    for (int i = 0; i < number; i++) {
      increasePlayerTwoScoreByOne();
    }
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

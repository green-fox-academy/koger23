
public class TennisGame1 implements TennisGame {

  private int m_score1 = 0;
  private int m_score2 = 0;
  private String player1Name;
  private String player2Name;

  public TennisGame1(String player1Name, String player2Name) {
    this.player1Name = player1Name;
    this.player2Name = player2Name;
  }

  public void wonPoint(String playerName) {
    if (playerName.equals("player1")) {
      m_score1 += 1;
    } else {
      m_score2 += 1;
    }
  }

  public String getScore() {
    if (m_score1 == m_score2) {
      return getScoreIfDraw();
    } else if (m_score1 >= 4 || m_score2 >= 4) {
      return getScoreIfMinusResultIsOne();
    } else {
      return getRunningScore();
    }
  }

  private String getScoreIfDraw() {
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

  private String getScoreIfMinusResultIsOne() {
    int minusResult = m_score1 - m_score2;
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
      return m_score1;
    } else {
      return m_score2;
    }
  }

  private String buildScore(int i) {
    StringBuilder score = new StringBuilder();
    if (i != 1) {
      score.append("-");
    }
    switch (getTempScore(i)) {
      case 0:
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


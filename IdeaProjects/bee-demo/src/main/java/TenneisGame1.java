public class TenneisGame1 {
    private int m_score1 = 0;
    private int m_score2 = 0;
    private final String player1Name;
    private final String player2Name;

    public TenneisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public void wonPoint(String playerName) {
        if (playerName.equals(this.player1Name))
            m_score1 += 1;
        else
            m_score2 += 1;
    }

    public String getScore() {
        StringBuilder score = new StringBuilder();
        String[] scoreResults = new String[]{"Love", "Fifteen", "Thirty", "Forty" };
        if (m_score1 == m_score2 && m_score1 <= 2) {
            return scoreResults[m_score1] + "-All";
        }
        else if (m_score1 == m_score2) {
            return "Deuce";
        }
        int diffScore = m_score1-m_score2;

        if((m_score1>=4 || m_score2>=4) && Math.abs(diffScore) == 1) {
            if (diffScore == 1) score = new StringBuilder("Advantage ").append(this.player1Name);
            else if (diffScore == -1) score = new StringBuilder("Advantage ").append(this.player2Name);
            return score.toString();
        }

        if((m_score1>=4 || m_score2>=4) && Math.abs(diffScore) >= 2) {
        if (diffScore >= 2) score = new StringBuilder("Win for ").append(this.player1Name);
            else score = new StringBuilder("Win for ").append(player2Name);
            return score.toString();
        }

        else
        {
            score.append(scoreResults[m_score1]).append("-").append((scoreResults[m_score2]));
        }
        return score.toString();
    }
}

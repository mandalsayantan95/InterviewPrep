package main.java.cricinfo;

public class Match {
    private Team team1;
    private Team team2;
    private Scorecard scorecard;
    private int maxInnings;

    public Match(Team team1, Team team2, int maxInnings) {
        this.team1 = team1;
        this.team2 = team2;
        this.scorecard = new Scorecard();
        this.maxInnings = maxInnings;
    }

    public void startInning(Team battingTeam, Team bowlingTeam) {
        if (scorecard.getInnings().size() < maxInnings) {
            scorecard.addInning(new Inning(scorecard.getInnings().size() + 1, battingTeam, bowlingTeam));
        }
    }

    public Scorecard getScorecard() {
        return scorecard;
    }
}

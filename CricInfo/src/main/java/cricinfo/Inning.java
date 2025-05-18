package main.java.cricinfo;

import java.util.ArrayList;
import java.util.List;

public class Inning {
    private int inningNumber;
    private Team battingTeam;
    private Team bowlingTeam;
    private List<Over> overs;
    private PlayerStats playerStats;

    public Inning(int inningNumber, Team battingTeam, Team bowlingTeam) {
        this.inningNumber = inningNumber;
        this.battingTeam = battingTeam;
        this.bowlingTeam = bowlingTeam;
        this.overs = new ArrayList<>();
        this.playerStats = new PlayerStats();
    }

    public void addBall(Player bowler, Player batsman, int outcome) {
        if (overs.isEmpty() || overs.get(overs.size() - 1).getBalls().size() == 6) {
            overs.add(new Over(overs.size() + 1));
        }
        Over currentOver = overs.get(overs.size() - 1);
        currentOver.addBall(new Ball(bowler, batsman, outcome));

        if (outcome == -1) {
            playerStats.updateWickets(bowler.getPlayerId());
        } else if (outcome >= 0) {
            playerStats.updateRuns(batsman.getPlayerId(), outcome);
        }
    }

    public PlayerStats getPlayerStats() {
        return playerStats;
    }

    public int getTotalRuns() {
        return playerStats.getTotalRuns();
    }

    public int getTotalWickets() {
        return playerStats.getTotalWickets();
    }

    public int getTotalOvers() {
        return overs.size();
    }

    public List<Over> getOvers() {
        return overs;
    }

    public Team getBattingTeam() {
        return battingTeam;
    }

    public Team getBowlingTeam() {
        return bowlingTeam;
    }
}

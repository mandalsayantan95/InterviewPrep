package main.java.cricinfo;

public class Ball {
    private Player bowler;
    private Player batsman;
    private int outcome;

    public Ball(Player bowler, Player batsman, int outcome) {
        this.bowler = bowler;
        this.batsman = batsman;
        this.outcome = outcome;
    }

    public Player getBowler() {
        return bowler;
    }

    public Player getBatsman() {
        return batsman;
    }

    public int getOutcome() {
        return outcome;
    }

    public boolean isLegalDelivery() {
        return outcome != -2 && outcome != -3;
    }

    public boolean isWicket() {
        return outcome == -1;
    }
}

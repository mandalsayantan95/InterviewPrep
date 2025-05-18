package main.java.cricinfo;

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("Team A");
        Team team2 = new Team("Team B");

        Player batsman1 = new Player("1", "Batsman A");
        Player bowler1 = new Player("2", "Bowler B");

        team1.addPlayer(batsman1);
        team2.addPlayer(bowler1);

        Match match = new Match(team1, team2, 2); // Max 2 innings (e.g., Test match)

        match.startInning(team1, team2);
        Inning inning1 = match.getScorecard().getInnings().get(0);

        // Simulate some balls
        inning1.addBall(bowler1, batsman1, 4);  // 4 runs
        inning1.addBall(bowler1, batsman1, 0);  // dot ball
        inning1.addBall(bowler1, batsman1, -1); // wicket

        System.out.println("Inning 1 Runs: " + inning1.getTotalRuns());
        System.out.println("Inning 1 Wickets: " + inning1.getTotalWickets());

        // Start second innings
        match.startInning(team2, team1);
        Inning inning2 = match.getScorecard().getInnings().get(1);

        Player batsman2 = new Player("3", "Batsman C");
        Player bowler2 = new Player("4", "Bowler D");
        team2.addPlayer(batsman2);
        team1.addPlayer(bowler2);

        inning2.addBall(bowler2, batsman2, 6);
        inning2.addBall(bowler2, batsman2, 1);

        System.out.println("Inning 2 Runs: " + inning2.getTotalRuns());
        System.out.println("Inning 2 Wickets: " + inning2.getTotalWickets());
    }
}

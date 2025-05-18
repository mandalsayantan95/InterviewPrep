package main.java.cricinfo;

import java.util.ArrayList;
import java.util.List;

public class Over {
    private int overNumber;
    private List<Ball> balls;

    public Over(int overNumber) {
        this.overNumber = overNumber;
        this.balls = new ArrayList<>();
    }

    public void addBall(Ball ball) {
        balls.add(ball);
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public int getOverNumber() {
        return overNumber;
    }
}


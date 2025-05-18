package main.java.cricinfo;

import java.util.ArrayList;
import java.util.List;

public class Scorecard {
    private List<Inning> innings;

    public Scorecard() {
        this.innings = new ArrayList<>();
    }

    public void addInning(Inning inning) {
        innings.add(inning);
    }

    public List<Inning> getInnings() {
        return innings;
    }
}

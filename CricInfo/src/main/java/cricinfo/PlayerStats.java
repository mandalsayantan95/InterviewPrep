package main.java.cricinfo;

import java.util.HashMap;
import java.util.Map;

public class PlayerStats {
    private Map<String, Integer> runs = new HashMap<>();
    private Map<String, Integer> wickets = new HashMap<>();
    private Map<String, Integer> centuries = new HashMap<>();

    public void updateRuns(String playerId, int runsScored) {
        runs.put(playerId, runs.getOrDefault(playerId, 0) + runsScored);
        if (runs.get(playerId) >= 100 && (runs.get(playerId) - runsScored) < 100) {
            centuries.put(playerId, centuries.getOrDefault(playerId, 0) + 1);
        }
    }

    public void updateWickets(String playerId) {
        wickets.put(playerId, wickets.getOrDefault(playerId, 0) + 1);
    }

    public String getMostCenturies() {
        return centuries.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No centuries yet");
    }

    public String getMostWickets() {
        return wickets.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No wickets yet");
    }
}

package leetcode.design;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

public class UndergroundSystem{
    // calculate average time for traval, needs total time and count of travel
    // Map<String, Pair<Integer, Integer>> checkoutMap = new HashMap<>();
    // checkin info
    // Map<Integer, Pair<String, Integer>> checkinMap = new HashMap<>();
    
    private Map<String, Pair<Integer, Integer>> checkoutMap = new HashMap<>();
    private Map<Integer, Pair<String, Integer>> checkinMap = new HashMap<>();

    public UndergroundSystem() {
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkinMap.put(id, new Pair<>(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair<String, Integer> checkin = checkinMap.get(id);
        String route = checkin.getKey() + "_" + stationName;
        int totalTime = t - checkin.getValue();
        Pair<Integer, Integer> checkout = checkoutMap.getOrDefault(route, new Pair<>(0, 0));
        checkoutMap.put(route, new Pair<>(checkout.getKey() + totalTime, checkout.getValue() + 1));
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "_" + endStation;
        return (double) checkoutMap.get(route).getKey() / checkoutMap.get(route).getValue();
    }
}
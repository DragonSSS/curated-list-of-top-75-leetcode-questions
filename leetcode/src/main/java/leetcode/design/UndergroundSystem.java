package leetcode.design;

import java.util.HashMap;
import java.util.Map;

public class UndergroundSystem{
    class Checkout {
        int totalTime;
        int count;
        
        public Checkout(int totalTime, int count){
            this.totalTime = totalTime;
            this.count = count;
        }
    }
    
    class Checkin {
        String station;
        int timestamp;
        
        public Checkin(String station, int timestamp) {
            this.station = station;
            this.timestamp = timestamp;
        }
    }
    // calculate average time for traval, needs total time and count of travel
    // Map<String, Checkout> checkoutMap = new HashMap<>();
    // checkin info, station name and timestamp
    // Map<Integer, Checkin> checkinMap = new HashMap<>();
    
    Map<String, Checkout> checkoutMap;
    Map<Integer, Checkin> checkinMap;

    public UndergroundSystem() {
        checkoutMap = new HashMap<>();
        checkinMap = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        checkinMap.put(id, new Checkin(stationName, t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Checkin checkin = checkinMap.get(id);
        String route = checkin.station + "_" + stationName;
        int totalTime = t - checkin.timestamp;
        Checkout curCheckout = checkoutMap.getOrDefault(route, new Checkout(0, 0));
        checkoutMap.put(route, new Checkout(curCheckout.totalTime + totalTime, curCheckout.count + 1));
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "_" + endStation;
        return (double) checkoutMap.get(route).totalTime / checkoutMap.get(route).count;
    }
}
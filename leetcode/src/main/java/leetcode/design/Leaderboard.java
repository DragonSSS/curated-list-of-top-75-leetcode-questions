package leetcode.design;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Leaderboard {
    // HashMap to find the id -> score
    // PriorityQueue to figure out the top k
    // or
    // TreeMap to track the score -> how many players has this score
    Map<Integer, Integer> map;
    public Leaderboard() {
        map = new HashMap<>();
    }
    
    public void addScore(int playerId, int score) {
        map.put(playerId, map.getOrDefault(playerId, 0) + score);
    }
    
    public int top(int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int score : map.values()) {
            pq.offer(score);
        }
        
        int res = 0;
        int count = K;
        while(!pq.isEmpty() && count > 0) {
            res += pq.poll();
            count--;
        }
        return res;
    }
    
    public void reset(int playerId) {
        map.remove(playerId);
    }    
}

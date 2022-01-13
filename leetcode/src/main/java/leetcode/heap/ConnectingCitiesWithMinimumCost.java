package leetcode.heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class ConnectingCitiesWithMinimumCost {
    class City {
        int label;
        int cost;
        
        public City(int label, int cost) {
            this.label = label;
            this.cost = cost;
        }
    }
    
    public int minimumCost(int n, int[][] connections) {
        Set<Integer> visited = new HashSet<>();
        // graph map
        Map<Integer, List<City>> graph = new HashMap<>();
        // build graph
        
        for (int[] connection : connections) {
            int start = connection[0];
            int end = connection[1];
            int cost = connection[2];
            graph.putIfAbsent(start, new ArrayList<>());
            graph.putIfAbsent(end, new ArrayList<>());
            graph.get(start).add(new City(end, cost));
            graph.get(end).add(new City(start, cost));
        }
        
        PriorityQueue<City> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);
        pq.offer(new City(1, 0));
        int res = 0;
        while(!pq.isEmpty()){
            City cur = pq.poll();
            if (visited.contains(cur.label))
                continue;
            visited.add(cur.label);
            res += cur.cost;
            if (visited.size() == n)
                return res;
            
            if (graph.containsKey(cur.label)) {
                for(City next : graph.get(cur.label)) {
                    pq.offer(next);
                }
            }
            
        }
        
        return visited.size() == n ? res : -1;
    }
}

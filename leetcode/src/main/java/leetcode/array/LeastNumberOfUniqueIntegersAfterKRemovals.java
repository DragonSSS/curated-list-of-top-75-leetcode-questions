package leetcode.array;

import java.util.PriorityQueue;
import java.util.Map;
import java.util.HashMap;

public class LeastNumberOfUniqueIntegersAfterKRemovals {
    // count frequency
    // priorityQueue by frequency
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        pq.addAll(map.keySet());
        while(!pq.isEmpty() && k > 0) {
            k -= map.get(pq.poll());
        }
        
        return k < 0? pq.size() + 1 : pq.size();
    }
}

package leetcode.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Queue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            heap.offer(entry);
        }

        int[] res = new int[k];

        for(int i = 0; i < k; i++) {
            res[i] = heap.poll().getKey();
        }

        return res;
    }
}

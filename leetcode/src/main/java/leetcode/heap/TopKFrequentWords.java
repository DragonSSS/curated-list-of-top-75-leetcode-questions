package leetcode.heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {
    public List<String> topKFrequent(String[] words, int k) {
        List<String> res = new ArrayList<>();
        Map<String, Integer> freq = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> {
            if (a.getValue() != b.getValue()) {
                return b.getValue() - a.getValue();
            } else {
                return a.getKey().compareTo(b.getKey());
            }
        });

        for(String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        for(Map.Entry<String, Integer> entry : freq.entrySet()) {
            pq.offer(entry);
        }

        while(k-- > 0) {
            res.add(pq.poll().getKey());
        }

        return res;
    }    
}

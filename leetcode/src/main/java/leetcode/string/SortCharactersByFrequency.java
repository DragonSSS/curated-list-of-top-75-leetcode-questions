package leetcode.string;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public String frequencySort(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for(char c : map.keySet()) {
            int index = c - 'a';
            int freq = map.get(c);
            pq.offer(new int[]{index, freq});
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()) {
            int[] cur = pq.poll();
            char curChar = (char)(cur[0] + 'a');
            int freq = map.get(curChar);
            for(int i  = 0; i < freq; i++) {
                sb.append(curChar);
            } 
        }
        return sb.toString();
    }    
}

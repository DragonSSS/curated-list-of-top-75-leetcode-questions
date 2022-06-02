package leetcode.heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ReorganizeString {
    public String reorganizeString(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            int count = map.getOrDefault(c, 0) + 1;
            if (count > ((s.length() + 1) / 2))
                return "";
            map.put(c, count);
        }
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for(char c : map.keySet()) {
            pq.offer(new int[]{c, map.get(c)});
        }
        
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            int[] first = pq.poll();
            if(sb.length() == 0 || first[0] != sb.charAt(sb.length() - 1)) {
                sb.append((char) first[0]);
                first[1]--;
                if(first[1] > 0) {
                    pq.offer(first);
                }
            } else {
                int[] second = pq.poll();
                sb.append((char) second[0]);
                second[1]--;
                if(second[1] > 0) {
                    pq.offer(second);
                }
                pq.offer(first);
            }
        }
        return sb.toString();
    }
}

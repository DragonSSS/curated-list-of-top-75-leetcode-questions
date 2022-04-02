package leetcode.heap;

import java.util.PriorityQueue;

public class LongestHappyString {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((i, j) -> j[1] - i[1]);
        if (a != 0) {
            pq.offer(new int[]{0, a});
        }
        
        if (b != 0) {
            pq.offer(new int[]{1, b});
        }
        
        if (c != 0) {
            pq.offer(new int[]{2, c});
        }
        
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()) {
            int[] cur = pq.poll();
            char curChar = (char) ('a' + cur[0]);
            int freq = cur[1];
            if(sb.length() > 1 && sb.charAt(sb.length() - 1) == curChar && sb.charAt(sb.length() - 2) == curChar) {
                if (pq.isEmpty())
                    break;
                int[] next = pq.poll();
                char nextChar = (char) ('a' + next[0]);
                int nextFreq = next[1];
                sb.append(nextChar);
                nextFreq--;
                if (nextFreq > 0) {
                    pq.offer(new int[] {(int)(nextChar - 'a'), nextFreq});
                }
            } else {
                sb.append(curChar);
                freq--;
            }
            
            
            if (freq > 0) {
                pq.offer(new int[] {(int)(curChar - 'a'), freq});
            }
        }
        return sb.toString();
    }
}

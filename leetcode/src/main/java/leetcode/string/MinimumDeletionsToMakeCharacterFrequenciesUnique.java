package leetcode.string;

import java.util.PriorityQueue;

public class MinimumDeletionsToMakeCharacterFrequenciesUnique {
    // hashset + greedy
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for(char c : s.toCharArray()) {
            int index = c - 'a';
            freq[index]++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for(int val : freq) {
            if (val > 0) {
                pq.offer(val);
            }
        }

        int delete = 0;
        while(pq.size() > 1) {
            int cur = pq.poll();
            if (cur == pq.peek()) {
                if (cur - 1 > 0) {
                    pq.offer(cur - 1);
                }
                delete++;
            }
        }
        return delete;
    }    
}

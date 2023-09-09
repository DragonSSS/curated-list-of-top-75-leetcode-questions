package leetcode.string;

import java.util.PriorityQueue;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> (b + a).compareTo(a + b));
        StringBuilder sb = new StringBuilder();

        for (int num : nums) {
            pq.offer(String.valueOf(num));
        }

        while(!pq.isEmpty()) {
            sb.append(pq.poll());
        }

        String res = sb.toString();

        if (res.startsWith("0")) {
            return "0";
        }

        return res;
    }    
}

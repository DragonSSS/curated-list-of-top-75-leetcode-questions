package leetcode.heap;

import java.util.List;
import java.util.PriorityQueue;

public class SmallestRangeCoveringElementsFromKLists {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> nums.get(a[0]).get(a[1]) - nums.get(b[0]).get(b[1]));
        int max = Integer.MIN_VALUE;
        int start = 0, end = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size(); i++) {
            pq.offer(new int[]{i, 0});
            max = Math.max(max, nums.get(i).get(0));
        }
        // every time we have nums.size() nums in the pq from lists
        // like sliding window to find the minimum range that contains nums from lists
        // track the max nums every time and poll() minimum num from minHeap
        // until one of lists exhausted
        // e.g, imagine that each list only contains one number
        while(pq.size() == nums.size()) {
            int[] cur = pq.poll();
            int row = cur[0], col = cur[1];
            if(end - start > max - nums.get(row).get(col)) {
                start = nums.get(row).get(col);
                end = max;
            }

            if(col < nums.get(row).size() - 1) {
                pq.offer(new int[]{row, col + 1});
                max = Math.max(max, nums.get(row).get(col + 1));
            }
        }
        return new int[]{start, end};
    }    
}

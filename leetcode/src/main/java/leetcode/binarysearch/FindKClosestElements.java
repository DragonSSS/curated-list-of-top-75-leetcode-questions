package leetcode.binarysearch;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        Integer[] res = new Integer[k];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] != b[0]? a[0] - b[0] : a[1] - b[1]);
        for(int num : arr) {
            pq.offer(new int[]{Math.abs(num - x), num});
        }

        int index = 0;
        while(index < k) {
            int[] cur = pq.poll();
            res[index++] = cur[1];
        }
        Arrays.sort(res);
        return Arrays.asList(res);
    }    
}

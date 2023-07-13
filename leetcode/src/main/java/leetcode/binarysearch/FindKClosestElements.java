package leetcode.binarysearch;

import java.util.ArrayList;
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

    public List<Integer> findClosestElements_binary_search(int[] arr, int k, int x) {
        int left = 0, right = arr.length - 1;
        while(right - left >= k) {
            if(Math.abs(arr[left] - x) > Math.abs(arr[right] - x)) {
                left++;
            } else {
                right--;
            }
        }

        List<Integer> res = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            res.add(arr[i]);
        }
        return res;
    }
}

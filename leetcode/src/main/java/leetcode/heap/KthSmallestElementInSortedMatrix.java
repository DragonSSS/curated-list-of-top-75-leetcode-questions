package leetcode.heap;

import java.util.PriorityQueue;

public class KthSmallestElementInSortedMatrix {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                pq.offer(matrix[i][j]);
            }
        }

        int res = 0;
        while(k-- > 0) {
            res = pq.poll();
        }

        return res;
    }

    public int kthSmallest_binarySearch(int[][] matrix, int k) {
        return 0;
    }

    private int CountLessOrEqual(int[][] matrix, int val, int n) {
        return 0;
    }
}

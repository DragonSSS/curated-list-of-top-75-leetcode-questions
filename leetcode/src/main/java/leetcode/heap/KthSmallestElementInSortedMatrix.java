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
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = CountLessOrEqual(matrix, mid);
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    private int CountLessOrEqual(int[][] matrix, int val) {
        int n = matrix.length;
        int i = 0;
        int j = n - 1;
        int count = 0;
        while (i < n) {
            while (j >= 0 && matrix[i][j] > val) {
                j--;
            }
            count += j + 1;
            i++;
        }
        return count;
    }
}

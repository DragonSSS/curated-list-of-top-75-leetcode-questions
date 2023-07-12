package leetcode.array;

import java.util.Random;

public class RandomPickWithWeight {
    int[] prefixSum;
    int totalSum;
    
    Random ran;

    public RandomPickWithWeight(int[] w) {
        this.prefixSum = new int[w.length];
        this.totalSum = 0;
        ran = new Random();
        
        for (int i = 0; i < w.length; i++) {
            totalSum += w[i];
            prefixSum[i] = totalSum;
        }
    }
    
    public int pickIndex() {
//         int num = ran.nextInt(totalSum);
//         for (int i = 0; i < prefixSum.length; i++) {
//             if (num < prefixSum[i]) {
//                 return i;
//             }
//         }
        
//         return -1;
        int num = ran.nextInt(totalSum) + 1;
        int start = 0, end = prefixSum.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if (prefixSum[mid] == num) {
                return mid;
            } else if (prefixSum[mid] < num) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    
    public int pickIndex_2r() {
        int num = ran.nextInt(totalSum) + 1;
        int left = 0;
        int right = prefixSum.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;

            if (prefixSum[mid] == num) {
                return mid;
            }

            if (prefixSum[mid] > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}

package leetcode.array;

public class NumOfSubarrays {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        // 1 2 3 4 5
        int min = k * threshold;
        int sum = 0;
        int res = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            // 0 < 3 - 1, 1 < 3 - 1, 2 < 3 - 1
            if (i < k - 1) {
               continue;
            }
            // if i == k - 1, we should just compare
             if ( i > k - 1) {
                sum -= arr[i - k];
            }

            if (sum >= min) {
                res++;
            }
        }
        return res;
    }    
}

package leetcode.binarysearch;

public class CapacityToShipPackagesWithinDays {
    // [1,2,3,4,5,6,7,8,9,10]
    // sum = 55;
    // left = 10, right = 55
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int max = 0;
        for (int weight : weights) {
            sum += weight;
            max = Math.max(max, weight);
        }

        int left = max, right = sum;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            boolean pass = helper(weights, mid, days);
            if (pass) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean helper(int[] weights, int limit, int days) {
        int count = 1;
        int cur = 0;

        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > limit || count > days) {
                return false;
            }
            if (weights[i] + cur <= limit) {
                cur += weights[i];
            } else {
                cur = weights[i];
                count++;
            }
        }
        return count <= days;
    }    
}

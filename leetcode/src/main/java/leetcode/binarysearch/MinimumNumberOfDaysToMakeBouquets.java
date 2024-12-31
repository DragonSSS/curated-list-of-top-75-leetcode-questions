package leetcode.binarysearch;

public class MinimumNumberOfDaysToMakeBouquets {
    public int minDays(int[] bloomDay, int m, int k) {
        int left = 0;
        int right  = 0;
        for(int  day : bloomDay) {
            right = Math.max(right, day);
        }
        int res = -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(helper(bloomDay, mid, k) >= m) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
    // this is a test
    private int helper(int[] bloomDay, int mid, int k) {
        int numOfBouquests = 0;
        int curCount = 0;
        for(int i = 0; i < bloomDay.length; i++) {
            if(bloomDay[i] <= mid) {
                curCount++;
            } else {
                curCount = 0;
            }

            if (curCount == k) {
                numOfBouquests++;
                curCount = 0;
            }
        }
        return numOfBouquests;
    }    
}

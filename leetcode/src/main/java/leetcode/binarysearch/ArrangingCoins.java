package leetcode.binarysearch;

public class ArrangingCoins {
    // 1 + 2 + + 3 + ... + k = k(k + 1) / 2
    // find max k with k(k + 1) / 2 <= n
    public int arrangeCoins(int n) {
        long left = 0, right = n;
        while(left <= right) {
            long mid = left + (right - left) / 2;
            long total = (mid * (mid + 1)) / 2;
            if (total == n) {
                return (int) mid;
            } else if (total > n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return (int) right;
    }    
}

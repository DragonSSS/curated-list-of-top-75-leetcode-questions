package leetcode.binarysearch;

public class CuttingRibbons {
    // binary search idea
    public int maxLength(int[] ribbons, int k) {
        int res = 0;
        int left = 1;
        int right = 0;
        
        // find right boundary
        for(int ribbon : ribbons) {
            right = Math.max(right, ribbon);
        }
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int curK = 0;
            for(int ribbon : ribbons) {
                curK += ribbon / mid;
            }
            
            if (curK >= k) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }    
}

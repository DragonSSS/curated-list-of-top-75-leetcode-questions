package leetcode.binarysearch;

public class KokoEatingBananas {
    // k is speed
    // worst k could be max(piles[x])
    public int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = 0;
        
        for (int pile : piles) {
            end = Math.max(end, pile);
        }
        
        int res = end;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            int cur = 0;
            for (int pile : piles) {
                cur += Math.ceil(pile * 1.0 / mid);
            }
            
            if (cur <= h) {
                res = Math.min(res, mid);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        return res;
    }    
}

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
    // binary search based on speed k;
    // h is total hours
    // k is the number of bananas to eat per hour
    // the range of k is 1 to max(array of piles)
    // the curTime is for(int pile : piles) { curTime += Math.ceil(pile / curSpeed) };
    // compare curTime with h
    public int minEatingSpeed_2r(int[] piles, int h) {
        int start = 1;
        int end = Integer.MIN_VALUE;
        for (int pile : piles) {
            end = Math.max(end, pile);
        }
        
        int res = Integer.MAX_VALUE;
        while(start <= end) {
            int curSpeed = start + (end - start) / 2;
            int curTime = 0;
            for (int pile : piles) {
                curTime += Math.ceil(pile * 1.0 / curSpeed);
            }
            
            if(curTime <= h) {
                res = Math.min(res, curSpeed);
                end = curSpeed - 1;
            } else {
                start = curSpeed + 1;
            }
        }
        
        return res;
    }

    public int minEatingSpeed_3r(int[] piles, int h) {
        int maxSpeed = Integer.MIN_VALUE;
        for(int pile : piles) {
            maxSpeed = Math.max(maxSpeed, pile);
        }

        int left = 1, right = maxSpeed;
        int res = maxSpeed;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            int curTime = 0;
            for(int pile : piles) {
                curTime += Math.ceil(pile * 1.0 / mid);
            }

            if(curTime <= h) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
}

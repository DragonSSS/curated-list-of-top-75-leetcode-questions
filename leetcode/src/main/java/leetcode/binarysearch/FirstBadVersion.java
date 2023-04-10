package leetcode.binarysearch;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(isBadVersion(mid)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    // fake one
    public boolean isBadVersion(int version) {
        return true;
    }
}

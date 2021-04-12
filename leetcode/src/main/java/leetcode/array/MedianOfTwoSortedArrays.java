package leetcode.array;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;

        // make sure we always start cutting on shortest array
        if(m > n)
            return findMedianSortedArrays(nums2, nums1);

        // edge case
        if(m == 0) {
            if(n % 2 == 0) {
                return (nums2[ (n - 1) / 2] + nums2[n / 2]) / 2.0;
            } else {
                return nums2[n / 2] * 1.0;
            }
        }

        int total = m + n;
        int i = 0, j = m;

//      0, 1, | 3, 5, 9    m = 5
//      2, 4, 6, | 7, 8    n = 5
//      0, 1, 2, 3, 4, 5, 6, 7, 8, 9    total = 10, half = 5

        while(i <= j) {
            int partA = i + (j - i) / 2;
            int partB = (total + 1) / 2 - partA;

            int leftMaxA = partA == 0 ? Integer.MIN_VALUE : nums1[partA - 1];
            int leftMaxB = partB == 0 ? Integer.MIN_VALUE : nums2[partB - 1];
            int rightMinA = partA == m ? Integer.MAX_VALUE : nums1[partA];
            int rightMinB = partB == n ? Integer.MAX_VALUE : nums2[partB];

            if (leftMaxA > rightMinB) {
                j = partA - 1;
            } else if (leftMaxB > rightMinA) {
                i = partA + 1;
            } else {
                if(total % 2 == 0) {
                    return (Math.max(leftMaxA, leftMaxB) + Math.min(rightMinA, rightMinB)) / 2.0;
                } else {
                    return Math.max(leftMaxA, leftMaxB) * 1.0;
                }
            }
        }

        return -1 * 1.0;
    }
}

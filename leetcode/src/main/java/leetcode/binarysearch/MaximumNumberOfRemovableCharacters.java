package leetcode.binarysearch;

public class MaximumNumberOfRemovableCharacters {
    public int maximumRemovals(String s, String p, int[] removable) {
        StringBuilder sb = new StringBuilder(s);
        int left = 0, right = removable.length - 1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            for(int i = 0; i <= mid; i++) {
                sb.setCharAt(removable[i], '/');
            }

            if (helper(sb.toString(), p)) {
                left = mid + 1; // it is why we don't need to plus 1 in return statement, the index + 1 = number of chars
            } else {
                right = mid - 1;
            }
            sb = new StringBuilder(s);
        }
        return left;
    }

    private boolean helper(String s, String p) {
        int index1 = 0, index2 = 0;
        while(index1 < s.length() && index2 < p.length()) {
            if (s.charAt(index1) == p.charAt(index2)) {
                index2++; 
            }
            index1++;
        }
        return index2 == p.length();
    }    
}

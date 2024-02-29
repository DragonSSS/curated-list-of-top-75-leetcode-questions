package leetcode.string;

public class ShortestPalindrome {
    public String shortestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }

        int n = s.length();
        int left = 0, right = s.length() - 1;

        for(; right >= 0; right--) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
            }
        }
        if (left == n) {
            return s;
        }

        String remainRev = new StringBuilder(s.substring(left)).reverse().toString();
        return remainRev + shortestPalindrome(s.substring(0, left)) + s.substring(left);
    }    
}

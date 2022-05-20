package leetcode.string;

public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res+=helper(i, i, s);
            res+=helper(i, i + 1, s);
        }

        return res;
    }


    private int helper(int i, int j, String s) {
        int count = 0;
        while(i >=0 && j <= s.length() - 1 && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
            count++;
        }
        return count;
    }

    // O(n)
    public int countSubstrings_2r(String s) {
        if (s.length() == 1)
            return 1;
        
        int res = 0;
        for(int i = 0 ; i < s.length(); i++) {
            res += helper_2r(i, i, s);
            res += helper_2r(i, i + 1, s);
        }
        return res;
    }
    
    private int helper_2r(int left, int right, String s) {
        int count = 0;
        while(left >= 0 && right <= s.length() - 1 && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }

    public int countSubstrings_3r(String s) {
        int res = 0;
        for(int i = 0; i < s.length(); i++) {
            res += helper_3r(i, i + 1, s);
            res += helper_3r(i, i, s);
        }
        return res;
    }
    
    private int helper_3r(int left, int right, String s) {
        int count = 0;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
            count++;
        }
        return count;
    }
}

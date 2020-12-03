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
}

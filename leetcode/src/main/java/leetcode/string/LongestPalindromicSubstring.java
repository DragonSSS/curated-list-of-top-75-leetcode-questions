package leetcode.string;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s.length() == 1)
            return s;
        String res = s.substring(0, 1);
        for(int i = 0; i < s.length(); i++) {
            String odd = helper(i, i, s);
            if (odd.length() > res.length())
                res = odd;

            String even = helper(i, i + 1, s);

            if (even.length() > res.length())
                res = even;
        }
        return res;
    }

    private String helper(int i, int j, String s) {
        while(i >= 0 && j <= s.length() - 1 && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }

        return s.substring(i + 1, j);
    }
}

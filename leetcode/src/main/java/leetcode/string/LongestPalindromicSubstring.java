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

    public String longestPalindrome_2r(String s) {
        if(s.length()  == 1)
            return s;
        
        String res = s.substring(0, 1);
        
        for(int i = 0; i < s.length(); i++) {
            String odd = helper_2r(i, i, s);
            if (odd.length() > res.length()) {
                res = odd;
            }
            
            String even = helper_2r(i, i + 1, s);
            if (even.length() > res.length()) {
                res = even;
            }
        }
        return res;
    }
    
    private String helper_2r(int left, int right, String s) {
        while(left >= 0 && right <= s.length() - 1 && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        
        return s.substring(left + 1, right);
    }

    public String longestPalindrome_3r(String s) {
        String res = "";
        for(int i = 0; i < s.length(); i++) {
            String even = helper_3r(i, i + 1, s);
            String odd = helper_3r(i, i, s);

            if (even.length() > res.length()) {
                res = even;
            }
            
            if (odd.length() > res.length()) {
                res = odd;
            }
        }
        return res;
    }
    
    
    private String helper_3r(int left, int right, String s) {
        while(left >= 0 && right <= s.length() - 1 && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        
        return s.substring(left + 1, right);
    }
}

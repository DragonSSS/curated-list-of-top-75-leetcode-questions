package leetcode.string;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }

        String str = s.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left <= right) {
            while (left <= right && !Character.isLetterOrDigit(str.charAt(left))) {
                left++;
            }
            while (left <= right && !Character.isLetterOrDigit(str.charAt(right))) {
                right--;
            }

            if (left <= right && str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public boolean isPalindrome_2r(String s) {
        if(s.trim() == "")
            return true;
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
    
        while (left <= right) {
            while (left <= right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left <= right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (left <= right && s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}

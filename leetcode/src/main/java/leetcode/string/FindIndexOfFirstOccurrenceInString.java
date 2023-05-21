package leetcode.string;

public class FindIndexOfFirstOccurrenceInString {
    // two pointers
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length())
            return -1;
        
        int index = 0;
        while(index <= haystack.length() - needle.length()) {
            int i = index;
            int j = 0;
            while(j < needle.length() && needle.charAt(j) == haystack.charAt(i)) {
                i++;
                j++;
            }
            if (j == needle.length()) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int strStr_2r(String haystack, String needle) {
        for(int i = 0; i < haystack.length(); i++) {
            int index = 0;
            int start = i;
            while(start < haystack.length() && index < needle.length() && haystack.charAt(start) == needle.charAt(index)) {
                start++;
                index++;
            }

            if(index == needle.length()) {
                return start - needle.length();
            }
        }
        return -1;
    }
}

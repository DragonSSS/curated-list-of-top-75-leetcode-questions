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
}

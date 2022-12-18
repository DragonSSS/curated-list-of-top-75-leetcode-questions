package leetcode.string;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];
        
        Arrays.sort(strs);
        int index = 0;
        String first = strs[0];
        String last = strs[strs.length - 1];
        while(index < first.length() && first.charAt(index) == last.charAt(index)) {
            index++;
        }
        
        return index == 0 ? "" : first.substring(0, index);
    }    
}

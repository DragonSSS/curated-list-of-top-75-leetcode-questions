package leetcode.dfs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MaximumLengthOfConcatenatedStringWithUniqueCharacters {
    public int maxLength(List<String> arr) {
        // dfs
        return helper(arr, 0, "");
    }

    private int helper(List<String> arr, int curIndex, String curStr) {
        // we don't need to check curIndex >= arr.size() here to return 0
        // as the whole arr strings have to be covered
        // for-loop will be skipped and maxLen is returned
        Set<Character> set = new HashSet<>();
        for(char c : curStr.toCharArray()) {
            set.add(c);
        }

        if (set.size() != curStr.length()) {
            return 0;
        }

        int maxLen = curStr.length();
        for(int i = curIndex; i < arr.size(); i++) {
            maxLen = Math.max(maxLen, helper(arr, i + 1, curStr + arr.get(i)));
        }
        return maxLen;
    }    
}

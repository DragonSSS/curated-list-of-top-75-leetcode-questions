package leetcode.dp;

public class EditDistance {
    // dfs + memorization
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        Integer[][] memo = new Integer[n + 1][m + 1];
        
        return helper(word1, word2, n, m, memo);
    }
    
    private int helper(String word1, String word2, int len1, int len2, Integer[][] memo){
        if (len1 == 0)
            return len2;
        
        if (len2 == 0)
            return len1;
        
        if (memo[len1][len2] != null) {
            return memo[len1][len2];
        }
        
        if (word1.charAt(len1 - 1) == word2.charAt(len2 - 1)) {
            return helper(word1, word2, len1 - 1, len2 - 1, memo);
        }
        
        
        // word1 insert or word2 delete
        int deleteOrInsert1 =  helper(word1, word2, len1, len2 - 1, memo) + 1;
        // word2 insert or word1 delete
        int deleteOrInsert2 =  helper(word1, word2, len1 - 1, len2, memo) + 1;
        // replace
        int replace = helper(word1, word2, len1 - 1, len2 - 1, memo) + 1;
        
        memo[len1][len2] = Math.min(replace, Math.min(deleteOrInsert1, deleteOrInsert2));
        
        return  memo[len1][len2];
    }    
}

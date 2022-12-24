package leetcode.dp;

public class FillingBookcaseShelves {
    // Minimum height with index i to 0 books
    Integer[] memo;
    public int minHeightShelves(int[][] books, int shelfWidth) {
        memo = new Integer[books.length];
        return helper(0, books, shelfWidth);
    }
    
    private int helper(int index, int[][] books, int shelfWidth) {
        if (index >= books.length)
            return 0;
        
        if (memo[index] != null)
            return memo[index];
        
        int curWidth = 0;
        int curMaxHeight = Integer.MIN_VALUE;
        int curResult = Integer.MAX_VALUE;
        
        // This simulates to put the books into one leve or not
        for(int i = index; i < books.length && curWidth + books[i][0] <= shelfWidth; i++) {
            curMaxHeight = Math.max(curMaxHeight, books[i][1]);
            curResult = Math.min(curResult, curMaxHeight + helper(i + 1, books, shelfWidth));
            curWidth += books[i][0];
        }
        
        memo[index] = curResult;
        return curResult;
    }    
}

package leetcode.backtracking;

public class BeautifulArrangement {
    int count = 0;
    public int countArrangement(int N) {
        // try every number at each index position
        // dfs + backtracking
        boolean[] visited = new boolean[N + 1]; // index starts with 1 instead of 0
        helper(N, 1, visited);
        
        return count;
    }
    
    private void helper(int N, int curIndex, boolean[] visited) {
        if (curIndex > N) {
            count++;
            return;
        }
        for(int i = 1; i <= N; i++) {
            if (!visited[i] && (i % curIndex == 0 || curIndex % i == 0)) {
                visited[i] = true;
                helper(N, curIndex + 1, visited);
                visited[i] = false;
            }
        }
    }
}

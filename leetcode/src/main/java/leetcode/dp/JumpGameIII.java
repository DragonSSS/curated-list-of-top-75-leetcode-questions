package leetcode.dp;

public class JumpGameIII {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        return helper(arr, start, visited);
    }

    private boolean helper(int[] arr, int index, boolean[] visited) {
        if(index < 0 || index > arr.length - 1)
            return false;

        if(visited[index])
            return false;

        if(arr[index] == 0)
            return true;

        visited[index] = true;

        return helper(arr, index + arr[index], visited) || helper(arr, index - arr[index], visited);
    }
}

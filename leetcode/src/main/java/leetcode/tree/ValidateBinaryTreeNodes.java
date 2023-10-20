package leetcode.tree;

import java.util.HashSet;
import java.util.Set;

public class ValidateBinaryTreeNodes {
    // all nodes connected
    // no cycle
    // directed graph
    // dfs or bfs
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        // check if all node has parent, return false
        // dfs to check if it is valid
        Set<Integer> set = new HashSet<>();
        for (int child : leftChild) {
            if (child != -1) {
                set.add(child);
            }
        }

        for (int child : rightChild) {
            if (child != -1) {
                set.add(child);
            }
        }

        if (set.size() == n) {
            return false;
        }

        int root = -1;
        for (int i = 0; i < n ; i++) {
            if (!set.contains(i)) {
                root = i;
                break;
            }
        }

        Set<Integer> visited = new HashSet<>();
        return helper(root, visited, leftChild, rightChild) && visited.size() == n;
    }

    private boolean helper(int node, Set<Integer> visited, int[] leftChild, int[] rightChild){
        if (node == -1) {
            return true;
        }

        if (visited.contains(node)) {
            return false;
        }

        visited.add(node);

        return helper(leftChild[node], visited, leftChild, rightChild) && helper(rightChild[node], visited, leftChild, rightChild);
    }    
}

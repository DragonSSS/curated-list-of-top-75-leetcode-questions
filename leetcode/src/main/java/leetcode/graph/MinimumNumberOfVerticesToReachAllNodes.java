package leetcode.graph;

import java.util.ArrayList;
import java.util.List;

public class MinimumNumberOfVerticesToReachAllNodes {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> res = new ArrayList<>();
        if(n == 0 || edges == null)
            return res;

        int[] inDegree = new int[n];
        for(List<Integer> list : edges) {
            inDegree[list.get(1)]++;
        }

        for(int i = 0; i < n; i++) {
            if(inDegree[i] == 0) {
                res.add(i);
            }
        }

        return res;
    }
}

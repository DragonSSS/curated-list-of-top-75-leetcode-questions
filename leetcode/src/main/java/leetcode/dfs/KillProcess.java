package leetcode.dfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KillProcess {
    Map<Integer, List<Integer>> graph = new HashMap<>();
    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        List<Integer> res = new ArrayList<>();
        
        // build graph;
        for (int i = 0; i < ppid.size(); i++) {
            int parentNode = ppid.get(i);
            int childNode = pid.get(i);
            if (parentNode > 0) {
                graph.putIfAbsent(parentNode, new ArrayList<>());
                graph.get(parentNode).add(childNode);
            }
        }
        
        helper(kill, res);
        return res;
    }
    
    private void helper(int kill, List<Integer> res) {
        res.add(kill);
        if(graph.containsKey(kill)) {
            for(int next : graph.get(kill)) {
                helper(next, res);
            }
        }
    }    
}

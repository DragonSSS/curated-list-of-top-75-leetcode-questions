package leetcode.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ThroneInheritance {
    String kingName;
    Set<String> dead = new HashSet<>();
    Map<String, List<String>> graph = new HashMap<>();
    public ThroneInheritance(String kingName) {
        this.kingName = kingName;
        graph.put(kingName, new ArrayList<>());
    }
    
    public void birth(String parentName, String childName) {
        graph.putIfAbsent(parentName, new ArrayList<>());
        graph.get(parentName).add(childName);
    }
    
    public void death(String name) {
        dead.add(name);
    }
    
    public List<String> getInheritanceOrder() {
        List<String> res = new ArrayList<>();
        helper(kingName, res);
        return res;
    }

    private void helper(String ppl, List<String> res) {
        if(!dead.contains(ppl)) {
            res.add(ppl);
        }

        if (!graph.containsKey(ppl)) {
            return;
        }

        for(String next : graph.get(ppl)) {
            helper(next, res);
        }
    }    
}

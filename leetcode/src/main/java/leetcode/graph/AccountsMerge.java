package leetcode.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AccountsMerge {
    // name => all emails belong to person
    // name could be same between ppl
    // email is identical to ppl
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> res = new ArrayList<>();
        if (accounts == null || accounts.size() == 0)
            return res;

        Map<String, String> emailToName = new HashMap<>();
        Map<String, List<String>> graph = new HashMap<>();
        Set<String> visited = new HashSet<>();

        for(List<String> account : accounts) {
            String name = account.get(0);
            for(int i = 1; i < account.size(); i++) {
                emailToName.putIfAbsent(account.get(i), name);
                graph.putIfAbsent(account.get(i), new ArrayList<>());

                // build graph
                if (i == 1)
                    continue;

                graph.get(account.get(i - 1)).add(account.get(i));
                graph.get(account.get(i)).add(account.get(i - 1));
            }
        }

        for(String email: emailToName.keySet()) {
            if(!visited.contains(email)) {
                List<String> temp = new ArrayList<>();
                helper(email, graph, visited, temp);
                Collections.sort(temp);
                temp.add(0, emailToName.get(email));
                res.add(temp);
            }
        }

        return res;
    }

    private void helper(String email, Map<String, List<String>> graph, Set<String> visited, List<String> res) {
        visited.add(email);
        res.add(email);
        for(String node : graph.get(email)) {
            if(!visited.contains(node)) {
                helper(node, graph, visited, res);
            }
        }
    }
}

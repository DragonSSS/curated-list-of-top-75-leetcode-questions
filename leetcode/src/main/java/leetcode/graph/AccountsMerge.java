package leetcode.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

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

    // name, email1, email2, email3
    // name, email3, email5, email6

    // name, email1, email2, email3, email5, email6
    int[] parents;
    int[] ranking;
    public List<List<String>> accountsMerge_2r(List<List<String>> accounts) {
        int n = accounts.size();
        parents = new int[n];
        ranking = new int[n];
        for(int i = 0; i < n; i++) {
            parents[i] = i;
        }

        Map<String, Integer> emailToId = new HashMap<>();
        for(int i = 0; i < n; i++) {
            List<String> emails = accounts.get(i);
            for(int j = 1; j < emails.size(); j++) {
                String email = emails.get(j);
                if(emailToId.containsKey(email)) {
                    int id = emailToId.get(email);
                    union(i, id);
                } else {
                    emailToId.put(email, i);
                }
            }
        }

        Map<Integer, Set<String>> users = new HashMap<>();
        for(int i = 0; i < n; i++) {
            int parent = find(i);
            List<String> emails = accounts.get(i);
            users.putIfAbsent(parent, new TreeSet<>());
            users.get(parent).addAll(emails.subList(1, emails.size()));
        }

        List<List<String>> res = new ArrayList<>();
        for(int index : users.keySet()) {
            String name = accounts.get(index).get(0);
            List<String> emails = new ArrayList<>(users.get(index));
            emails.add(0, name);
            res.add(emails);
        }
        return res;
    }

    private void union(int id1, int id2) {
        int p1 = find(id1);
        int p2 = find(id2);

        if (p1 == p2) {
            return;
        }

        if(ranking[p1] > ranking[p2]) {
            parents[p2] = p1;
        } else if(ranking[p2] > ranking[p1]){
             parents[p1] = p2;
        } else {
            parents[p2] = p1;
            ranking[p1]++;
        }
    }

    private int find(int id) {
        while(parents[id] != id) {
            id = parents[id];
        }
        return parents[id];
    }
}

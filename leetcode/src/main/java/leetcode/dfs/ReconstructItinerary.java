package leetcode.dfs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class ReconstructItinerary {
    // dfs
    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> res = new ArrayList<>();
        Map<String, Queue<String>> graph = new HashMap<>();

        // build graph using PriorityQueue
        for(List<String> ticket : tickets) {
            graph.putIfAbsent(ticket.get(0), new PriorityQueue<>());
            graph.get(ticket.get(0)).offer(ticket.get(1));
        }

        helper("JFK", graph, res);
        return res;
    }

    private void helper(String ticket, Map<String, Queue<String>> graph, List<String> res) {
        // trick 1 kind of post traversal with removing previous edge
        while(graph.containsKey(ticket) && !graph.get(ticket).isEmpty()) {
            String next = graph.get(ticket).poll();
            helper(next, graph, res);
        }
        // trick 2 kind of adding to stack then reverse it by pop
        res.add(0, ticket);
    }

    // backtracking version
    public List<String> findItinerary_backtracking(List<List<String>> tickets) {
        List<String> res = new ArrayList<>();
        Map<String, List<String>> graph = new HashMap<>();

        for(List<String> ticket : tickets) {
            graph.putIfAbsent(ticket.get(0), new ArrayList<>());
            graph.get(ticket.get(0)).add(ticket.get(1));
        }

        for(List<String> list : graph.values()) {
            Collections.sort(list);
        }

        int total = tickets.size() + 1;
        res.add("JFK");
        helper_backtracking("JFK", total, graph, res);
        return res;
    }

    private boolean helper_backtracking(String start, int total, Map<String, List<String>> graph, List<String> res){
        if(res.size() == total)
            return true;

        if(!graph.containsKey(start) || graph.get(start).isEmpty())
            return false;

        List<String> list = graph.get((start));
        for(int i = 0; i < list.size(); i++) {
            String to = list.get(i);
            res.add(to);
            list.remove(i);

            // try dfs
            if(helper_backtracking(to, total, graph, res)) {
                return true;
            }

            //backtracking
            res.remove(res.size() - 1);
            list.add(i, to);
        }

        return false;
    }

}

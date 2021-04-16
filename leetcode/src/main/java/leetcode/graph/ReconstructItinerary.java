package leetcode.graph;

import java.util.ArrayList;
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

    private boolean helper_backtracking(String start, Map<String, List<String>> graph, List<String> res){
        return false;
    }
}

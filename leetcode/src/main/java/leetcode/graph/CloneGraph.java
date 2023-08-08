package leetcode.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import util.Node;

public class CloneGraph {
    // dfs
    public Node cloneGraph(Node node) {
        if (node == null)
            return node;
        Map<Integer, Node> map = new HashMap<>();
        return helper(node, map);
    }


    private Node helper(Node node, Map<Integer, Node> map) {
        if (map.containsKey(node.val)) {
            return map.get(node.val);
        } else {
            map.put(node.val, new Node(node.val));
            for (Node n : node.neighbors) {
                map.get(node.val).neighbors.add(helper(n, map));
            }
        }

        return map.get(node.val);
    }

    // dfs
    Map<Integer, Node> map = new HashMap<>();
    public Node cloneGraph_2r_dfs(Node node) {
        if(node == null)
            return node;
        
        if(map.containsKey(node.val)) {
            return map.get(node.val);
        } else {
            map.put(node.val, new Node(node.val));
            for(Node neighbor : node.neighbors) {
                map.get(node.val).neighbors.add(cloneGraph_2r_dfs(neighbor));
            }
        }
        
        return map.get(node.val);
    }

    public Node cloneGraph_2r_bfs(Node node) {
        if (node == null)
            return null;
        Map<Node, Node> visited = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        visited.put(node, new Node(node.val));
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                Node cur = queue.poll();
                for(Node next : cur.neighbors) {
                    if(!visited.containsKey(next)) {
                        visited.put(next, new Node(next.val));
                        queue.offer(next);
                    }
                    visited.get(cur).neighbors.add(visited.get(next));
                }
            }
        }
        
        return visited.get(node);
    }

    // Map<Integer, Node> map = new HashMap<>();
    public Node cloneGraph_3r_dfs(Node node) {
        if (node == null)
            return node;
        
        if (map.containsKey(node.val)) {
            return map.get(node.val);
        } else {
            map.put(node.val, new Node(node.val));
            for(Node next: node.neighbors) {
                map.get(node.val).neighbors.add(cloneGraph_3r_dfs(next));
            }
        }
        
        return map.get(node.val);
    }

    public Node cloneGraph_3r_bfs(Node node) {
        if (node == null)
            return node;
        
        Map<Integer, Node> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        map.put(node.val, new Node(node.val));
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                Node cur = queue.poll();
                for(Node next : cur.neighbors) {
                    if(!map.containsKey(next.val)) {
                        map.put(next.val, new Node(next.val));
                        queue.offer(next);
                    }
                    map.get(cur.val).neighbors.add(map.get(next.val));
                }
            }
        }

        return map.get(node.val);
    }

    // Map<Integer, Node> map = new HashMap<>();
    public Node cloneGraph_4r(Node node) {
        if (node == null) {
            return node;
        }

        if (map.containsKey(node.val)) {
            return map.get(node.val);
        }

        map.put(node.val, new Node(node.val));
        for(Node next : node.neighbors) {
            map.get(node.val).neighbors.add(cloneGraph(next));
        }

        return map.get(node.val);
    }
}

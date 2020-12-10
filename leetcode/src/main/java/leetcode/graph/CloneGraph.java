package leetcode.graph;

import util.Node;

import java.util.HashMap;
import java.util.Map;

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
}

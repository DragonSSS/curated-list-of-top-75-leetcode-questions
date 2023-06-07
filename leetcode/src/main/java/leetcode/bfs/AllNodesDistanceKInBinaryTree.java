package leetcode.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import util.TreeNode;

public class AllNodesDistanceKInBinaryTree {
    // build graph using hashmap;
    // avoid duplicates using hashset;
    // bfs queue or dfs with recursion;
    Map<TreeNode, List<TreeNode>> graph = new HashMap<>();
    Set<TreeNode> visited = new HashSet<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> res = new ArrayList<>();

        // edge case
        if(K == 0)
            return Arrays.asList(target.val);

        buildGraph(root, null);
        // dfs
        helper(target, K, res);

//         bfs
//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.offer(target);
//         visited.add(target);

//         while(!queue.isEmpty()){
//             int size = queue.size();
//             // find all node we need
//             if(K == 0) {
//                 for(int i = 0; i < size; i++){
//                     res.add(queue.poll().val);
//                 }
//                 return res;
//             }

//             for(int i = 0; i < size; i++){
//                 TreeNode cur = queue.poll();
//                 for(TreeNode n : graph.get(cur)){
//                     if(!visited.contains(n)){
//                         queue.offer(n);
//                         visited.add(n);
//                     }
//                 }
//             }
//             K--;
//         }

        return res;
    }

    private void helper(TreeNode node, int K, List<Integer> res){
        if(K < 0 || node == null)
            return;

        if(K == 0) {
            res.add(node.val);
            return;
        }

        visited.add(node);

        for(TreeNode n : graph.get(node)){
            if(!visited.contains(n)){
                helper(n, K - 1, res);
            }
        }

        return;
    }

    private void buildGraph(TreeNode node, TreeNode parent){
        if (node == null)
            return;

        if(!graph.containsKey(node)) {
            graph.put(node, new ArrayList<>());
            if(parent != null) {
                graph.get(node).add(parent);
                graph.get(parent).add(node);
            }

            buildGraph(node.left, node);
            buildGraph(node.right, node);
        }
    }

    Map<Integer, List<Integer>> graph_2r = new HashMap<>();
    public List<Integer> distanceK_2r(TreeNode root, TreeNode target, int k) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;
        
        buildGraph_2r(null, root);
        int distance = k;
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(target.val);
        visited.add(target.val);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                int cur = queue.poll();
                if (distance == 0) {
                    res.add(cur);
                    if (i == size - 1)
                        break;
                }
                
                for(int next : graph_2r.get(cur)) {
                    if (visited.contains(next))
                        continue;
                    queue.offer(next);
                    visited.add(next);
                }
                
                
            }
            distance--;
        }
        
        return res;
    }
    
    private void buildGraph_2r(TreeNode parent, TreeNode node) {
        if (node == null)
            return;
        
        graph_2r.putIfAbsent(node.val, new ArrayList<>());
        if (parent != null) {
            graph_2r.putIfAbsent(parent.val, new ArrayList<>());
            graph_2r.get(parent.val).add(node.val);
            graph_2r.get(node.val).add(parent.val);
        }
        
        
        buildGraph_2r(node, node.left);
        buildGraph_2r(node, node.right);
    }

    // Map<TreeNode, List<TreeNode>> graph;
    public List<Integer> distanceK_3r(TreeNode root, TreeNode target, int k) {
        // build graph
        graph = new HashMap<>();
        helper(root);

        // bfs to reach the target node
        Set<Integer> visited = new HashSet<>();
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        int count = 0;

        visited.add(target.val);
        queue.offer(target);
        
        while(!queue.isEmpty()) {
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode cur = queue.poll();
                if(count == k) {
                    res.add(cur.val);
                }
                for(TreeNode next : graph.get(cur)) {
                    if(visited.contains(next.val)) {
                        continue;
                    }
                    queue.offer(next);
                    visited.add(next.val);
                }
            }
            count++;
        }
        return res;
    }

    private void helper(TreeNode root) {
        if(root == null) {
            return;
        }

        graph.putIfAbsent(root, new ArrayList<>());
        if(root.left != null) {
            graph.putIfAbsent(root.left, new ArrayList<>());
            graph.get(root).add(root.left);
            graph.get(root.left).add(root);
            helper(root.left);
        }

        if(root.right != null) {
            graph.putIfAbsent(root.right, new ArrayList<>());
            graph.get(root).add(root.right);
            graph.get(root.right).add(root);
            helper(root.right);
        }
    }
}

package leetcode.tree;

import util.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
}

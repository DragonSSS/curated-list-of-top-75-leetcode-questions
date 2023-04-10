package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class NaryTreePreorderTraversal {
    
    class Node {
        public int val;
        public List<Node> children;
    
        public Node() {}
    
        public Node(int _val) {
            val = _val;
        }
    
        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    List<Integer> res = new ArrayList<>();
    public List<Integer> preorder(Node root) {
       if (root == null) {
           return res;
       }

       res.add(root.val);
       for(Node next : root.children) {
           preorder(next);
       }

       return res;
    }    
}

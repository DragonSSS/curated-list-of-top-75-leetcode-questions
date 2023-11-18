package leetcode.tree;

import java.util.LinkedList;
import java.util.List;

public class PathInZigzagLabelledBinaryTree {
    public List<Integer> pathInZigZagTree(int label) {
        LinkedList<Integer> result = new LinkedList<>();
        int parent = label;
        result.addFirst(parent);

        while(parent != 1) {
            int d = (int)(Math.log(parent)/Math.log(2)); // depth level
            int offset = (int)Math.pow(2, d+1) - 1 - parent; // offset in this level
            parent = ((int)Math.pow(2, d) + offset) / 2; // the parent node
            result.addFirst(parent);   
        }
        
        return result;        
    }    
}

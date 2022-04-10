package leetcode.tree;

import util.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return null;

        StringBuilder sb = new StringBuilder();
        serializeHelper(root, sb);

        String res = sb.toString();
        return res.substring(0, res.length() - 1);
    }

    private void serializeHelper(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("#");
            sb.append(",");
            return;
        }

        sb.append(String.valueOf(node.val));
        sb.append(",");
        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null)
            return null;
        String[] strs = data.split(",");
        LinkedList<String> list = new LinkedList<>(Arrays.asList(strs));

        return deserializeHelper(list);
    }

    private TreeNode deserializeHelper (LinkedList<String> list) {
        String cur = list.removeFirst();

        if ("#".equals(cur)) {
            return null;
        }

        TreeNode root = new TreeNode(Integer.valueOf(cur));
        root.left = deserializeHelper(list);
        root.right = deserializeHelper(list);

        return root;
    }

        // Encodes a tree to a single string.
    public String serialize_2r(TreeNode root) {
        if (root == null)
            return null;
        
        StringBuilder sb = new StringBuilder();
        serializeHelper_2r(root, sb);
        
        return sb.substring(0, sb.length() - 1);
    }
    
    private void serializeHelper_2r(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("null");
            sb.append(",");
            return;
        }
        
        sb.append(String.valueOf(node.val));
        sb.append(",");
        serializeHelper(node.left, sb);
        serializeHelper(node.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize_2r(String data) {
        if (data == null)
            return null;
        
        String[] nodes = data.split(",");
        Queue<String> queue = new LinkedList<>(Arrays.asList(nodes));
        TreeNode root = deserializeHelper_2r(queue);
        return root;
    }
    
    private TreeNode deserializeHelper_2r(Queue<String> queue) {
        String cur = queue.poll();
        if (cur.equals("null")) {
            return null;
        }
        
        TreeNode node = new TreeNode(Integer.valueOf(cur));
        node.left = deserializeHelper_2r(queue);
        node.right = deserializeHelper_2r(queue);
        return node;
    }
}

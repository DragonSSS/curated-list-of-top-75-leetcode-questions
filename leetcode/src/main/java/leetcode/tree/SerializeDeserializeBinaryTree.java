package leetcode.tree;

import util.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;

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
}

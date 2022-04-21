package leetcode.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SearchSuggestionsSystem {
    class TreeNode {
        TreeNode[] children;
        LinkedList<String> topThreeProducts;
        
        public TreeNode() {
            children = new TreeNode[26];
            topThreeProducts = new LinkedList<>();
        }
    }
    
    TreeNode root = new TreeNode();
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> res = new ArrayList<>();
        buildTrie(products);
        
        TreeNode node = root;
        for(char c : searchWord.toCharArray()) {
            if (node != null) {
                node = node.children[c - 'a'];
            }
            
            if (node == null) {
                res.add(new ArrayList<>());
            } else {
                res.add(node.topThreeProducts);
            }
        }
        
        return res;
    }
    
    private void buildTrie(String[] products) {
        for(String product : products) {
            TreeNode node = root;
            for(char c : product.toCharArray()) {
                if(node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TreeNode();
                }
                node = node.children[c - 'a'];
                node.topThreeProducts.offer(product);
                Collections.sort(node.topThreeProducts);
                if (node.topThreeProducts.size() > 3) {
                    node.topThreeProducts.pollLast();
                }
            }
        }
    }
}

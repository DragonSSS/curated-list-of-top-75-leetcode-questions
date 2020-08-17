package leetcode;
import org.junit.Before;
import org.junit.Test;
import util.TreeNode;

import java.util.List;

public class TestBinaryTreeInorderTraversal {

    private TreeNode root;

    @Before
    public void init() {

    }

    @Test
    public void testInorderTraversal(){
        BinaryTreeInorderTraversal btit = new BinaryTreeInorderTraversal();
        List<Integer> result = btit.inorderTraversal(root);
    }
}

package leetcode;
import org.junit.Before;
import org.junit.Test;
import util.TreeNode;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestBinaryTreeInorderTraversal {

    private TreeNode root;

    @Before
    public void init() {

    }

    @Test
    public void testInorderTraversal(){
        BinaryTreeInorderTraversal btit = new BinaryTreeInorderTraversal();
        List<Integer> result = btit.inorderTraversal(root);
        assertEquals(0, result.size());
    }
}

package leetcode.tree;

import org.junit.Before;
import org.junit.Test;
import util.TreeNode;

import static org.junit.Assert.assertEquals;
public class TestValidateBinarySearchTree {

    private TreeNode root ;

    @Before
    public void init() {

    }

    @Test
    public void testIsValidBST() {
        ValidateBinarySearchTree vbst = new ValidateBinarySearchTree();
        boolean result1 = vbst.isValidBST(root);
        boolean result2 = vbst.isValidBST_Inorder(root);
        assertEquals(result1 == result2, true);
    }
}

package leetcode;

import leetcode.util.TreeNode;

/**
 * Created by zhaorunqian on 2020/8/30.
 */
public class Leetcode_98 {

    public boolean isValidBST(TreeNode root) {
        return doIsValidBST(root, null, null);
    }

    private boolean doIsValidBST(TreeNode root, Integer downLimit, Integer upLimit) {

        if(root == null) {
            return true;
        }

        if(downLimit != null && root.val <= downLimit) {
            return false;
        }

        if(upLimit != null && root.val >= upLimit) {
            return false;
        }


        boolean leftTree = doIsValidBST(root.left, downLimit, root.val);
        boolean rightTree = doIsValidBST(root.right, root.val, upLimit);

        return leftTree && rightTree;
    }
}

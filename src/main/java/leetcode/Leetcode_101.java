package leetcode;

import leetcode.util.TreeNode;

/**
 * Created by zhaorunqian on 2020/8/31.
 */
public class Leetcode_101 {

    /**
     * https://leetcode-cn.com/problems/symmetric-tree/submissions/
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return doIsSymmetric(root.left, root.right);
    }

    private boolean doIsSymmetric(TreeNode left, TreeNode right) {

        if(left == null && right == null) {
            return true;
        }

        if(left == null || right == null) {
            return false;
        }

        if(left.val != right.val) {
            return false;
        }

        boolean isLeftSymmetric = doIsSymmetric(left.left, right.right);
        if(!isLeftSymmetric) {
            return false;
        }

        boolean isRightSymmetric = doIsSymmetric(left.right, right.left);
        if(!isRightSymmetric) {
            return false;
        }

        return true;
    }
}

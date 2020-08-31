package leetcode;

import leetcode.util.TreeNode;

/**
 * Created by zhaorunqian on 2020/8/30.
 */
public class Leetcode_100 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        if(q.val != p.val) {
            return false;
        }

        if(!isSameTree(p.left, q.left)) {
            return false;
        }
        if(!isSameTree(p.right, q.right)) {
            return false;
        }

        return true;
    }
}

package leetcode;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaorunqian on 2020/8/30.
 */
public class Leetcode_94 {

    /**
     * https://leetcode-cn.com/problems/binary-tree-inorder-traversal/
     * @param root
     * @return
     */
    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        doInorderTraversal(root, result);
        return result;
    }

    private void doInorderTraversal(TreeNode root, List<Integer> result) {
        if(root == null) {
            return;
        }
        doInorderTraversal(root.left, result);
        result.add(root.val);
        doInorderTraversal(root.right, result);
    }

}

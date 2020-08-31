package leetcode;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaorunqian on 2020/8/31.
 */
public class Leetcode_102 {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }

        List<TreeNode> rootList = new ArrayList<>();
        rootList.add(root);
        while(!rootList.isEmpty()) {
            List<Integer> levelVal = new ArrayList<>();
            List<TreeNode> levelRoot = new ArrayList<>();
            for(TreeNode tempRoot : rootList) {
                levelVal.add(tempRoot.val);
                if (tempRoot.left != null) {
                    levelRoot.add(tempRoot.left);
                }
                if (tempRoot.right != null) {
                    levelRoot.add(tempRoot.right);
                }
            }
            result.add(levelVal);
            rootList = levelRoot;
        }
        return result;
    }
}
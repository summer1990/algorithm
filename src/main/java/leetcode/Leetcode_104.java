package leetcode;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaorunqian on 2020/8/31.
 */
public class Leetcode_104 {

    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }

        List<TreeNode> levelRoots = new ArrayList<TreeNode>();
        levelRoots.add(root);
        int levelHeight = 0;

        while(!levelRoots.isEmpty()) {
            levelHeight++;
            List<TreeNode> tempLevelRoots = new ArrayList<TreeNode>();
            for(TreeNode levelRoot : levelRoots) {
                if(levelRoot.left != null) {
                    tempLevelRoots.add(levelRoot.left);
                }
                if(levelRoot.right != null) {
                    tempLevelRoots.add(levelRoot.right);
                }
            }
            levelRoots = tempLevelRoots;
        }
        return levelHeight;
    }

//    public int maxDepth(TreeNode root) {
//        if(root == null) {
//            return 0;
//        }
//
//        int leftDepth = maxDepth(root.left);
//        int rightDepth = maxDepth(root.right);
//        return Math.max(leftDepth, rightDepth) + 1;
//    }
}

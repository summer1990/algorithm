package leetcode;

import leetcode.util.TreeNode;

import java.util.*;

/**
 * Created by zhaorunqian on 2020/8/31.
 */
public class Leetcode_103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Deque<TreeNode> levelRoot = new ArrayDeque<>();
        levelRoot.add(root);
        boolean forward = true;
        while(!levelRoot.isEmpty()) {
            List<Integer> levelVal = new ArrayList<>();
            Deque<TreeNode> tempLevelRoot = new ArrayDeque<>();
            while(!levelRoot.isEmpty()){
                if (forward) {
                    TreeNode tempNode = levelRoot.removeFirst();
                    levelVal.add(tempNode.val);
                    if (tempNode.left != null) {
                        tempLevelRoot.addLast(tempNode.left);
                    }

                    if (tempNode.right != null) {
                        tempLevelRoot.addLast(tempNode.right);
                    }
                } else {
                    TreeNode tempNode = levelRoot.removeLast();
                    levelVal.add(tempNode.val);
                    if (tempNode.right != null) {
                        tempLevelRoot.addFirst(tempNode.right);
                    }
                    if (tempNode.left != null) {
                        tempLevelRoot.addFirst(tempNode.left);
                    }
                }

            }
            forward = !forward;
            levelRoot = tempLevelRoot;
            result.add(levelVal);
        }
        return result;
    }
}
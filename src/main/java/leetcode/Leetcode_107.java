package leetcode;

import leetcode.util.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * Created by zhaorunqian on 2020/8/31.
 */
public class Leetcode_107 {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        Deque<List<Integer>> deque = new ArrayDeque<>();

        List<TreeNode> levelRoots = new ArrayList<>();
        levelRoots.add(root);
        while(!levelRoots.isEmpty()){
            List<Integer> levelVal = new ArrayList<>();
            List<TreeNode> tempLevelRoots = new ArrayList<>();
            for(TreeNode levelRoot : levelRoots) {
                levelVal.add(levelRoot.val);
                if(levelRoot.left != null) {
                    tempLevelRoots.add(levelRoot.left);
                }
                if(levelRoot.right != null) {
                    tempLevelRoots.add(levelRoot.right);
                }
            }
            levelRoots = tempLevelRoots;
            deque.addFirst(levelVal);
        }

        while(!deque.isEmpty()){
            result.add(deque.removeFirst());
        }
        return result;
    }
}

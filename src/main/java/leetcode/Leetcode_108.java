package leetcode;

import leetcode.util.TreeNode;

/**
 * Created by zhaorunqian on 2020/8/31.
 */
public class Leetcode_108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) {
            return null;
        }

        int middle = nums.length / 2;

        TreeNode root = new TreeNode(nums[middle]);
        root.left = doSortedArrayToBST(nums, 0, middle - 1);
        root.right = doSortedArrayToBST(nums,  middle + 1, nums.length - 1);
        return root;
    }

    private TreeNode doSortedArrayToBST(int[] nums, int begin, int end) {
        if(begin > end) {
            return null;
        }
        int middle = (begin + end) / 2;

        TreeNode root = new TreeNode(nums[middle]);
        root.left = doSortedArrayToBST(nums, begin, middle - 1);
        root.right = doSortedArrayToBST(nums,  middle + 1, end);
        return root;
    }
}

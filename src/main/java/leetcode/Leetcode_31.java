package leetcode;

import java.util.Arrays;

/**
 * Created by zhaorunqian on 2020/8/21.
 */
public class Leetcode_31 {

    /**
     * https://leetcode-cn.com/problems/next-permutation/
     * @param nums
     */
    public void nextPermutation(int[] nums) {

        int swapMinIndex = -1;
        for (int i = nums.length -1 ; i > 0; i--) {
            if (nums[i] > nums[i-1]) {
                swapMinIndex = i - 1;
                break;
            }
        }
        if (swapMinIndex == -1) {
            Arrays.sort(nums);
            return;
        }

        int minGapIndex = swapMinIndex;
        for (int i = swapMinIndex + 1; i < nums.length; i++) {
            if (nums[i] > nums[swapMinIndex]) {
                if (minGapIndex == swapMinIndex) {
                    minGapIndex = i;
                } else {
                    minGapIndex = nums[i] - nums[swapMinIndex] < nums[minGapIndex] - nums[swapMinIndex] ? i : minGapIndex;
                }
            }
        }

        int t = nums[swapMinIndex];
        nums[swapMinIndex] = nums[minGapIndex];
        nums[minGapIndex] = t;

        Arrays.sort(nums, swapMinIndex+ 1, nums.length);
    }

    public static void main(String[] args) {
        new Leetcode_31().nextPermutation(new int[]{1,2});
    }
}
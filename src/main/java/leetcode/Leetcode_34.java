package leetcode;

/**
 * Created by zhaorunqian on 2020/8/23.
 */
public class Leetcode_34 {

    /**
     * https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/
     * @param nums
     * @param target
     * @return
     */
    public int[] searchRange(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }

        int begin = doSearchRange(nums, target, 0, nums.length - 1, false);
        if(begin == -1) {
            return new int[]{-1, -1};
        }

        int end = doSearchRange(nums, target, 0, nums.length - 1, true);
        return new int[]{begin, end};
    }

    private int doSearchRange(int[] nums, int target, int begin, int end, boolean last) {
        if(begin > end) {
            return -1;
        }

        if(begin == end) {
            if(nums[begin] == target) {
                return begin;
            } else {
                return -1;
            }
        }

        int middle = (begin + end) / 2;
        if(nums[middle] > target) {
            return doSearchRange(nums, target, begin, middle - 1, last);
        } else if(nums[middle] < target) {
            return doSearchRange(nums, target, middle + 1, end, last);
        } else {
            int index = -1;
            if(!last) {
                index = doSearchRange(nums, target, begin, middle - 1, last);
            } else {
                index = doSearchRange(nums, target, middle + 1, end, last);
            }

            return index == -1 ? middle : index;
        }
    }
}
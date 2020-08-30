package leetcode;

/**
 * Created by zhaorunqian on 2020/8/30.
 */
public class Leetcode_81 {

    /**
     * https://leetcode-cn.com/problems/search-in-rotated-sorted-array-ii/submissions/
     * @param nums
     * @param target
     * @return
     */
    public boolean search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {

            int middle = (start + end) / 2;
            if(nums[middle] == target) {
                return true;
            }

            if(nums[start] == nums[middle]) {
                start++;
            } else if(nums[start] < nums[middle]) {
                if(target >= nums[start] && target < nums[middle]) {
                    end = middle-1;
                } else {
                    start = middle+1;
                }
            } else {
                if(target <= nums[end] && target > nums[middle]) {
                    start = middle+1;
                } else {
                    end = middle-1;
                }
            }
        }
        return false;
    }

}

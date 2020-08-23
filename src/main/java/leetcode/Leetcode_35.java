package leetcode;

/**
 * Created by zhaorunqian on 2020/8/23.
 */
public class Leetcode_35 {

    /**
     * https://leetcode-cn.com/problems/search-insert-position/submissions/
     * @param nums
     * @param target
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return 0;
        }

        int begin = 0;
        int end = nums.length - 1;
        while(begin < end) {
            int middle = (begin + end) / 2;
            if(nums[middle] == target) {
                return middle;
            } else if(nums[middle] > target){
                end = middle - 1;
            } else {
                begin = middle + 1;
            }
        }
        if(nums[begin] >= target) {
            return begin;
        }

        return begin + 1;
    }
}

package leetcode;

/**
 * Created by zhaorunqian on 2020/8/20.
 */
public class Leetcode_26 {

    /**
     * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int nextOffset = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[nextOffset - 1]) {
                continue;
            } else {
                nums[nextOffset] = nums[i];
                nextOffset++;
            }
        }
        return nextOffset;
    }
}
package leetcode;

/**
 * Created by zhaorunqian on 2020/8/21.
 */
public class Leetcode_27 {

    /**
     * https://leetcode-cn.com/problems/remove-element/
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int nextOffset = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[nextOffset] = nums[i];
            nextOffset++;
        }
        return nextOffset;
    }
}
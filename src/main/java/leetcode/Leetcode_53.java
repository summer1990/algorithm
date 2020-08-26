package leetcode;

/**
 * Created by zhaorunqian on 2020/8/24.
 */
public class Leetcode_53 {

    /**
     * https://leetcode-cn.com/problems/maximum-subarray/submissions/
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            if(sum < nums[i]) {
                sum = nums[i];
            }
            maxSum = maxSum > sum ? maxSum : sum;
        }
        return maxSum;
    }
}

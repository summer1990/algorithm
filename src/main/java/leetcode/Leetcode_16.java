package leetcode;

import java.util.Arrays;

/**
 * Created by zhaorunqian on 2020/8/19.
 */
public class Leetcode_16 {

    /**
     * https://leetcode-cn.com/problems/3sum-closest/
     * @param nums
     * @param target
     * @return
     */
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);

        int closestSum = Integer.MAX_VALUE - Math.abs(target);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int begin = i + 1, end = nums.length - 1;
            while (begin < end) {
                int tempSum = nums[i] + nums[begin] + nums[end];
                closestSum = Math.abs(closestSum - target) >  Math.abs(target - tempSum)? tempSum : closestSum;
                if (target < tempSum) {
                    end--;
                    while (begin < end && nums[end] == nums[end + 1]) {
                        end--;
                    }
                } else if (target > tempSum) {
                    begin++;
                    while (begin < end && nums[begin] == nums[begin - 1]) {
                        begin++;
                    }
                }else {
                    return target;
                }
            }
        }
        return closestSum;
    }
}
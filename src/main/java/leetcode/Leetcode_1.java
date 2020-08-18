package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhaorunqian on 2020/8/17.
 */
public class Leetcode_1 {

    /**
     * https://leetcode-cn.com/problems/two-sum/
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];
            if (indexMap.get(rest) != null) {
                return new int[]{indexMap.get(rest), i};
            }
            indexMap.put(nums[i], i);
        }
        return new int[]{};
    }
}

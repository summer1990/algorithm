package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhaorunqian on 2020/8/19.
 */
public class Leetcode_15 {

    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length <= 2) {
            return new ArrayList<List<Integer>>();
        }

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int begin = i + 1, end = nums.length - 1;
            while (begin < end) {
                int tempNum = nums[i] + nums[begin] + nums[end];
                if (tempNum > 0) {
                    end--;
                } else if (tempNum < 0) {
                    begin++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[begin], nums[end]));
                    begin++;
                    end--;
                    while (begin < end && nums[begin] == nums[begin - 1]) {
                        begin++;
                    }
                    while (begin < end && nums[end] == nums[end + 1]) {
                        end--;
                    }
                }
            }
        }
        return result;
    }
}
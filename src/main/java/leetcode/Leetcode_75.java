package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaorunqian on 2020/8/29.
 */
public class Leetcode_75 {

    public void sortColors(int[] nums) {
        if( nums == null || nums.length == 0) {
            return;
        }

        int colorNum = 3;
        List<Integer> colorCountList = new ArrayList<>();
        for(int i = 0; i < colorNum; i++) {
            colorCountList.add(0);
        }

        for(int i = 0; i < nums.length; i++) {
            int count = colorCountList.get(nums[i]) + 1;
            colorCountList.set(nums[i], count);
        }

        int numsIndex = 0;
        for(int i = 0; i < colorCountList.size(); i++){
            for(int j = 0; j < colorCountList.get(i); j++){
                nums[numsIndex] = i;
                numsIndex++;
            }
        }
    }
}

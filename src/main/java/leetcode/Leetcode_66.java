package leetcode;

/**
 * Created by zhaorunqian on 2020/8/28.
 */
public class Leetcode_66 {


    /**
     * https://leetcode-cn.com/problems/plus-one/submissions/
     * @param digits
     * @return
     */
    public int[] plusOne(int[] digits) {

        int[] backup = new int[digits.length + 1];

        boolean levelUp = true;
        for(int i = digits.length - 1; i >= 0; i--) {
            if(levelUp) {
                int sum = digits[i] + 1;
                if(sum >= 10) {
                    sum = sum - 10;
                    levelUp = true;
                } else {
                    levelUp = false;
                }
                digits[i] = sum;
                backup[i+1] = sum;
            }
        }
        if(levelUp) {
            backup[0] = 1;
            return backup;
        }

        return digits;
    }
}

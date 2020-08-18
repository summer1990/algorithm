package leetcode;

/**
 * Created by zhaorunqian on 2020/8/17.
 */
public class Leetcode_7 {

    /**
     * https://leetcode-cn.com/problems/reverse-integer/
     */
    public int reverse(int x) {
        int reverseNum = 0;

        while(x != 0) {
            int mod = x % 10;

            if(reverseNum >Integer.MAX_VALUE / 10 || reverseNum == Integer.MAX_VALUE / 10 && mod > Integer.MAX_VALUE % 10){
                return 0;
            }
            if(reverseNum < Integer.MIN_VALUE / 10 || reverseNum == Integer.MIN_VALUE / 10 && mod % 10 < Integer.MAX_VALUE % 10) {
                return 0;
            }

            reverseNum = reverseNum * 10 + mod;
            x = x / 10;
        }

        return reverseNum;
    }
}

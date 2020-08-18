package leetcode;

/**
 * Created by zhaorunqian on 2020/8/18.
 */
public class Leetcode_9 {

    /**
     * https://leetcode-cn.com/problems/palindrome-number/
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        int num = x;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }
        return reverse == x;
    }
}
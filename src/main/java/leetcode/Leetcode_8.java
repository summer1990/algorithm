package leetcode;

/**
 * Created by zhaorunqian on 2020/8/18.
 */
public class Leetcode_8 {

    /**
     * https://leetcode-cn.com/problems/string-to-integer-atoi/
     * @param str
     * @return
     */
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int result = 0;

        boolean flag = false;
        boolean positive = true;
        for (int i = 0; i < str.length(); i++) {
            if (!flag && str.charAt(i) == ' ') {
                continue;
            }
            if (!flag && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
                if (str.charAt(i) == '-') {
                    positive = false;
                }
                flag = true;
                continue;
            }

            if (str.charAt(i) >= '0' && str.charAt(i) <='9') {
                int num = str.charAt(i) - '0';
                num = positive ? num : - num;
                if (positive && (result > Integer.MAX_VALUE / 10 || result == Integer.MAX_VALUE/10 && num > Integer.MAX_VALUE % 10)) {
                    return Integer.MAX_VALUE;
                } else if (!positive) {
                    if(result > 0) {
                        result = -result;
                    }
                    if((result < Integer.MIN_VALUE / 10 || result == Integer.MIN_VALUE / 10 && num < Integer.MIN_VALUE % 10)) {
                        return Integer.MIN_VALUE;
                    }
                }
                result = result * 10 + num;
            } else {
                break;
            }
            flag = true;
        }
        return result;
    }
}

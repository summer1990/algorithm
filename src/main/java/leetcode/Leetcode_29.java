package leetcode;

/**
 * Created by zhaorunqian on 2020/8/21.
 */
public class Leetcode_29 {


    /**
     * https://leetcode-cn.com/problems/divide-two-integers/
     * @param dividend
     * @param divisor
     * @return
     */
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        if (divisor == 1) {
            return dividend;
        }

        boolean isNegative = dividend < 0 && divisor > 0 || dividend > 0 && divisor < 0;
        dividend = dividend > 0 ? -dividend : dividend;
        divisor = divisor > 0 ? -divisor : divisor;
        int count = 0;
        while (dividend <= divisor) {
            int tempDivisor = divisor;
            int addCount = 1;
            while (dividend < (tempDivisor << 1) && (tempDivisor << 1 < tempDivisor)) {
                addCount = addCount << 1;
                tempDivisor = tempDivisor << 1;
            }
            if (dividend == tempDivisor << 1) {
                addCount = addCount << 1;
                count += addCount;
                break;
            }
            count += addCount;
            dividend -= tempDivisor;
        }
        if (isNegative) {
            return -count;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(new Leetcode_29().divide(2147483647, 3));
    }
}
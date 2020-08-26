package leetcode;

import java.math.BigDecimal;

/**
 * Created by zhaorunqian on 2020/8/24.
 */
public class Leetcode_50 {

    public double myPow(double x, int n) {
        long nlong = n;
        boolean isNNegative = false;
        if (nlong < 0) {
            isNNegative = true;
            nlong = -nlong;
        }
        double result = 1.0;
        double temp = x;
        while(nlong > 0) {
            if(nlong % 2 == 1) {
                result *=temp;
            }
            temp *= temp;
            nlong /= 2;
        }
        return isNNegative ? 1.0 / result : result;
    }
}

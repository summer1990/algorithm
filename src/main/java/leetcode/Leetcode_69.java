package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaorunqian on 2020/8/28.
 */
public class Leetcode_69 {

    /**
     * https://leetcode-cn.com/problems/sqrtx/submissions/
     * @param x
     * @return
     */
    public int mySqrt(int x) {
        if(x == 1) {
            return 1;
        }

        int begin = 1;
        int end = x / 2;

        while(begin <= end) {
            int middle = (begin + end) / 2;
            long tempMutiple = middle * (long)middle;
            if(tempMutiple == x) {
                return middle;
            }

            if(tempMutiple > x) {
                end = middle-1;
            } else {
                begin = middle+1;
            }
        }
        return begin - 1;
    }
}
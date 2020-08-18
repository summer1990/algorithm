package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhaorunqian on 2020/8/17.
 */
public class Leetcode_6 {

    /**
     * https://leetcode-cn.com/problems/zigzag-conversion/
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {
        if(s == null || s.length() == 0) {
            return "";
        }
        if (numRows == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int gap;
        for(int i = 0; i < numRows; i++) {
            gap = 2*i;

            for(int j = i; j < s.length(); j = j + gap) {
                sb.append(s.charAt(j));
                gap = 2*(numRows-1) - gap;
                if(gap == 0) {
                    gap = 2 * (numRows - 1);
                }
            }
        }
        return sb.toString();
    }
}
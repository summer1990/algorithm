package leetcode;

/**
 * Created by zhaorunqian on 2020/8/18.
 */
public class Leetcode_11 {

    /**
     * https://leetcode-cn.com/problems/container-with-most-water/
     * @param height
     * @return
     */
    public int maxArea(int[] height) {

        int begin = 0;
        int end = height.length - 1;

        int result = 0;
        while(begin < end) {
            int minHeight = height[begin] > height[end] ? height[end] : height[begin];
            int area = minHeight * (end -begin);
            result = result > area ? result : area;
            if (minHeight == height[begin]) {
                begin++;
            }else {
                end--;
            }
        }
        return result;
    }
}
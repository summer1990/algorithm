package leetcode;

/**
 * Created by zhaorunqian on 2020/8/29.
 */
public class Leetcode_70 {

    /**
     * https://leetcode-cn.com/problems/climbing-stairs/submissions/
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if(n <= 2) {
            return n;
        }
        int[] ways = new int[n];

        for(int i = 0; i < n; i++) {
            if(i == 0) {
                ways[i] = 1;
            }else if(i == 1) {
                ways[i] = 2;
            } else {
                ways[i] = ways[i-1] + ways[i-2];
            }
        }

        return ways[n-1];
    }
}

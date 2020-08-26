package leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by zhaorunqian on 2020/8/26.
 */
public class Leetcode_56 {

    /**
     * https://leetcode-cn.com/problems/merge-intervals/
     * @param intervals
     * @return
     */
    public int[][] merge(int[][] intervals) {
        if(intervals == null || intervals.length == 0) {
            return intervals;
        }

        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        int i = 0;
        for(int j = 1; j < intervals.length; j++) {
            if(intervals[i][1] >= intervals[j][0]) {
                int end = intervals[i][1] >= intervals[j][1] ? intervals[i][1] : intervals[j][1];
                intervals[i][1] = end;
            } else {
                i++;
                intervals[i][0] = intervals[j][0];
                intervals[i][1] = intervals[j][1];
            }
        }

        int[][] result = new int[i+1][2];
        for(int j = 0; j <= i; j++) {
            result[j] = new int[2];
            result[j][0] = intervals[j][0];
            result[j][1] = intervals[j][1];
        }
        return result;
    }
}
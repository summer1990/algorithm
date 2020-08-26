package leetcode;

/**
 * Created by zhaorunqian on 2020/8/26.
 */
public class Leetcode_57 {

    /**
     * https://leetcode-cn.com/problems/insert-interval/
     * @param intervals
     * @param newInterval
     * @return
     */
    public int[][] insert(int[][] intervals, int[] newInterval) {

        int[][] newIntervals = new int[intervals.length + 1][2];

        int index = 0;
        boolean inserted = false;
        for(int i = 0; i < intervals.length;) {
            if(!inserted && intervals[i][0] > newInterval[0]) {
                newIntervals[index][0] = newInterval[0];
                newIntervals[index][1] = newInterval[1];
                index++;
                inserted = true;
            } else {
                newIntervals[index][0] = intervals[i][0];
                newIntervals[index][1] = intervals[i][1];
                index++;
                i++;
            }
        }
        if(!inserted){
            newIntervals[index][0] = newInterval[0];
            newIntervals[index][1] = newInterval[1];
        }

        int p = 0;
        for(int i = 1; i < newIntervals.length; i++) {
            if(newIntervals[p][1] >= newIntervals[i][0]) {
                int end = newIntervals[p][1] >newIntervals[i][1] ?newIntervals[p][1] :newIntervals[i][1];
                newIntervals[p][1] = end;
            } else {
                p++;
                newIntervals[p][0] = newIntervals[i][0];
                newIntervals[p][1] = newIntervals[i][1];
            }
        }

        int[][] result = new int[p+1][2];
        for(int i = 0; i < result.length; i++) {
            result[i][0] = newIntervals[i][0];
            result[i][1] = newIntervals[i][1];
        }
        return result;
    }
}

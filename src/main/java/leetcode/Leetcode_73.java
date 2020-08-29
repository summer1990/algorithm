package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zhaorunqian on 2020/8/29.
 */
public class Leetcode_73 {

    /**
     * https://leetcode-cn.com/problems/set-matrix-zeroes/submissions/
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {

        Set<Integer> zeroRows = new HashSet<Integer>();
        Set<Integer> zeroColunms = new HashSet<Integer>();

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    zeroRows.add(i);
                    zeroColunms.add(j);
                }
            }
        }

        for(Integer row : zeroRows) {
            for(int j = 0; j < matrix[0].length; j++) {
                matrix[row][j] = 0;
            }
        }

        for(Integer colunm : zeroColunms) {
            for(int i = 0; i < matrix.length; i++) {
                matrix[i][colunm] = 0;
            }
        }
    }
}

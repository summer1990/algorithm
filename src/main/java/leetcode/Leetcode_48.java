package leetcode;

/**
 * Created by zhaorunqian on 2020/8/24.
 */
public class Leetcode_48 {

    /**
     * https://leetcode-cn.com/problems/rotate-image/
     * @param matrix
     */
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return;
        }

        for(int i = 1; i < matrix.length; i++) {
            for(int j = 0; j <= i; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length / 2; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = t;
            }
        }
    }
}

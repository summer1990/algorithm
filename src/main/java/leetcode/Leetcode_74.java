package leetcode;

/**
 * Created by zhaorunqian on 2020/8/29.
 */
public class Leetcode_74 {

    /**
     * https://leetcode-cn.com/problems/search-a-2d-matrix/submissions/
     * @param matrix
     * @param target
     * @return
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int j = matrix[0].length - 1;
        for(int i = 0; i < matrix.length && j >= 0 ;){
            if(matrix[i][j] == target) {
                return true;
            }else if( matrix[i][j] < target) {
                i++;
            } else {
                j--;
            }

        }

        return false;
    }
}

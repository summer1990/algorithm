package leetcode;

/**
 * Created by zhaorunqian on 2020/8/28.
 */
public class Leetcode_63 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        for(int i = 0; i < obstacleGrid.length; i++) {
            for(int j = 0; j < obstacleGrid[0].length; j++) {
                if(obstacleGrid[i][j] == 1) {
                    obstacleGrid[i][j] = 0;
                } else if(i == 0 && j == 0) {
                    obstacleGrid[i][j] = 1;
                } else if(i == 0) {
                    obstacleGrid[i][j] = obstacleGrid[i][j-1];
                } else if( j == 0){
                    obstacleGrid[i][j] = obstacleGrid[i-1][j];
                } else {
                    obstacleGrid[i][j] = obstacleGrid[i-1][j] + obstacleGrid[i][j-1];
                }
            }
        }
        return obstacleGrid[obstacleGrid.length - 1][obstacleGrid[0].length - 1];
    }
}

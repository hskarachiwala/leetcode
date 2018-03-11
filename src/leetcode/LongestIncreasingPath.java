package leetcode;

public class LongestIncreasingPath {

    public static int getLength(int[][] maze, int [][] dp, int row, int col) {
        if(dp[row][col] > 0) {
            return dp[row][col];
        }
        if(row>0 && maze[row-1][col]-maze[row][col]==1) {
            int length = 1 + getLength(maze, dp, row-1, col);
            dp[row][col] = length;
            return length;
        }
        if(row<maze.length-1 && maze[row+1][col]-maze[row][col]==1) {
            int length = 1 + getLength(maze, dp, row+1, col);
            dp[row][col] = length;
            return length;
        }
        if(col>0 && maze[row][col-1]-maze[row][col]==1) {
            int length = 1 + getLength(maze, dp, row, col-1);
            dp[row][col] = length;
            return length;
        }
        if(col<maze[0].length-1 && maze[row][col+1]-maze[row][col]==1) {
            int length = 1 + getLength(maze, dp, row, col+1);
            dp[row][col] = length;
            return length;
        }
        dp[row][col] = 1;
        return dp[row][col];
    }

}

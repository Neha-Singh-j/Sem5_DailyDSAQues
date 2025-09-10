// Last updated: 9/10/2025, 11:56:07 AM
class Solution {
    static int c = Integer.MAX_VALUE; // Initialize with a large value
    
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1; 
            }
        }
       
        return Minimum_Path(grid,0,0,dp);
    }

    public static int Minimum_Path(int[][] maze, int cr, int cc, int[][] dp) {
        if (cr >= maze.length || cc >= maze[0].length) {
            return Integer.MAX_VALUE;
        }

        if (cr == maze.length - 1 && cc == maze[0].length - 1) {
           return maze[cr][cc];
        }
        if(dp[cr][cc]!=-1){
            return dp[cr][cc];
        }
       int a= Minimum_Path(maze, cr + 1, cc, dp);
        int b= Minimum_Path(maze, cr, cc + 1, dp);
        dp[cr][cc]=maze[cr][cc]+Math.min(a,b);
        return dp[cr][cc];
    }
}

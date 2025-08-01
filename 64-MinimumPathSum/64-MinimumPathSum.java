// Last updated: 8/1/2025, 10:41:10 PM
class Solution {
    static int c = Integer.MAX_VALUE; // Initialize with a large value
    
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] memo = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                memo[i][j] = -1; // Marking uncomputed values
            }
        }
       
        return print(grid,0,0,memo);
    }

    public static int print(int[][] maze, int cr, int cc, int[][] memo) {
        if (cr >= maze.length || cc >= maze[0].length) {
            return Integer.MAX_VALUE;
        }

        if (cr == maze.length - 1 && cc == maze[0].length - 1) {
           return maze[cr][cc];
        }
        if(memo[cr][cc]!=-1){
            return memo[cr][cc];
        }
       int a= print(maze, cr + 1, cc, memo);
        int b= print(maze, cr, cc + 1, memo);
        memo[cr][cc]=maze[cr][cc]+Math.min(a,b);
        return memo[cr][cc];
    }
}

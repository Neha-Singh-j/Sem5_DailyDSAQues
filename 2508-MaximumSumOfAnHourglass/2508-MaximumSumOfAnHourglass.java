// Last updated: 8/1/2025, 10:32:26 PM
class Solution {
    public int maxSum(int[][] grid) {
        int maxS=Integer.MIN_VALUE;
        int rows=grid.length;
        int cols=grid[0].length;
       for (int i = 0; i <= rows - 3; i++) { 
        for (int j = 0; j <= cols - 3; j++) { 
            int curr = 0;
                curr+=grid[i][j]+grid[i][j+1]+grid[i][j+2];
                curr+=grid[i+1][j+1]+grid[i+2][j]+grid[i+2][j+1]+grid[i+2][j+2];
maxS=Math.max(curr,maxS);

            }
        }
        return maxS;
    }
}
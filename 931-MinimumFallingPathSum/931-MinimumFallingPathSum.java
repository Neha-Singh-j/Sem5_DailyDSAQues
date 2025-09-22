// Last updated: 9/23/2025, 12:42:20 AM
class Solution {
          static int c = Integer.MAX_VALUE; 
    public int minFallingPathSum(int[][] grid) {
       int m = grid.length, n = grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] a:dp){
            Arrays.fill(a,-66666);
        }
        //-66666 it can be any random value beyond -10^4 to 10^4 bcz this is range of dp values
        int res=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
         res=Math.min(Minimum_Path(grid,0,i,dp),res);
       }
       return res;
    }

    public static int Minimum_Path(int[][] grid, int cr, int cc, int[][] dp) {
        if (cc<0 || cc >= grid[0].length ) {
            return Integer.MAX_VALUE;
        }
        if(cr==grid.length-1){
            return grid[cr][cc];
        }

      
        if(dp[cr][cc]!=-66666){
            return dp[cr][cc];
        }
       int a= Minimum_Path(grid, cr + 1, cc-1, dp);
        int b= Minimum_Path(grid, cr+1, cc , dp);
         int c= Minimum_Path(grid, cr+1, cc+1 , dp);
        dp[cr][cc]=grid[cr][cc]+Math.min(Math.min(a,b),c);
        return dp[cr][cc];
    }
}

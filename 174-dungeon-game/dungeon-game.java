class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int m=dungeon.length;
        int n=dungeon[0].length;
        int[][] dp=new int[m][n];
        for(int[] d: dp){
            Arrays.fill(d,-1);
        }
        return calc(dungeon,0,0,dp);
        
    }
    public static int calc(int[][] dungeon,int i, int j,int[][]dp){
        if(i==dungeon.length-1 && j==dungeon[0].length-1){
            return Math.max(1, 1 - dungeon[i][j]);
        }
        if(i>=dungeon.length ||j>=dungeon[0].length){
            return Integer.MAX_VALUE / 2; 
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int a= calc(dungeon,i+1,j,dp);
        int b=calc(dungeon , i,j+1,dp);
        return dp[i][j]=Math.max(1,Math.min(a,b)-dungeon[i][j]);
    }
}
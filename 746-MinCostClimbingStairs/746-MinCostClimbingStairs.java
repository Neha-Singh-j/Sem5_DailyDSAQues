// Last updated: 9/9/2025, 4:41:42 PM
class Solution {
    public int minCostClimbingStairs(int[] cost) {
    
        int[] dp=new int[cost.length+1];
        Arrays.fill(dp,-1);
       return Math.min(find(cost,0,dp),find(cost,1,dp));
    }
    public static int find(int[] cost,int idx,int[] dp){
        if (idx >= cost.length) {
            return 0;
        }
        if (dp[idx] != -1) {
            return dp[idx];
        }
        int a=find(cost,idx+1,dp);
         int b=find(cost,idx+2,dp);
        dp[idx] = cost[idx] + Math.min(a,b);
        return dp[idx];
        

    }
}
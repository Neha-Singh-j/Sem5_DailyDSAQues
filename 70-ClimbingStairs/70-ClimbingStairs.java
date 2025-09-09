// Last updated: 9/9/2025, 4:29:55 PM
class Solution {
    
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
       return find(n,dp);
    }
    public static int find(int n,int[] dp){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(dp[n]!=-1)
        return dp[n];
        int a=find(n-1,dp);
        int b=find(n-2,dp);
        return dp[n]=a+b;

    }
}
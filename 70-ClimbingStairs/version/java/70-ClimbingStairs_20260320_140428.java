// Last updated: 3/20/2026, 2:04:28 PM
1class Solution {
2    public int climbStairs(int n) {
3        int[] dp=new int[n+1];
4        Arrays.fill(dp,-1);
5       return climb(n,dp);
6    }
7    public static int climb(int n, int[] dp){
8       if(n==0) return 1; // one path found reached to top
9       if(n<0) return 0;
10        if(dp[n]!=-1){
11            return dp[n];
12        }
13        int a=climb(n-1,dp);
14       int b= climb(n-2,dp);
15       return dp[n]=a+b;
16    }
17}
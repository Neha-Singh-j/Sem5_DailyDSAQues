// Last updated: 12/1/2025, 9:03:04 PM
1class Solution {
2    public int maxSubArray(int[] A) {
3        int n = A.length;
4        int[] dp = new int[n];
5        dp[0] = A[0];
6        int max = dp[0];
7        for(int i = 1; i < n; i++){
8            dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
9            max = Math.max(max, dp[i]);
10        }
11        return max;
12    }
13}
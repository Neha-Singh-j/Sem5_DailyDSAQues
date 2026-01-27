// Last updated: 1/27/2026, 1:35:15 PM
1class Solution {
2    public int minZeroArray(int[] nums, int[][] queries) {
3        int ans = -1;
4        for(int i = 0; i < nums.length; ++i){
5            int[][] dp = new int[nums[i]+1][queries.length];
6            for(int[]d:dp){
7                Arrays.fill(d,-1);
8            }
9            ans = Math.max(ans, solve(queries, i, nums[i], 0, dp));
10        }
11        return (ans > queries.length)?-1: ans;
12    }
13    public  int solve(int[][] q, int i, int target, int k, int[][] dp){
14        if(target == 0) return k;         
15        if(k >= q.length || target < 0) return q.length + 1;   
16
17        if(dp[target][k] != -1) return dp[target][k];
18        int res = solve(q, i, target, k+1, dp);   
19
20        if(q[k][0] <= i && i <= q[k][1]){
21
22            res = Math.min(res, solve(q, i, target - q[k][2], k+1, dp)); 
23        }
24        return dp[target][k] = res;
25    }
26}
27
28
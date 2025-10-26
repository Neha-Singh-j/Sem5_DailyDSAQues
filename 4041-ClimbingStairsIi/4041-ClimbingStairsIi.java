// Last updated: 10/26/2025, 10:04:54 PM
class Solution {
    public int climbStairs(int n, int[] costs) {
    
        int[] newcost = new int[n + 1]; // one based indexing
        newcost[0] = 0;
        for (int i = 1; i <= n; i++) {
            newcost[i] = costs[i - 1];
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return calc(0, n, newcost, dp);
    }

    private int calc(int i, int n, int[] costs, int[] dp) {
        if (i == n) return 0;
        
        if (dp[i] != -1) return dp[i];

        int ans = Integer.MAX_VALUE;
        for (int jmp = 1; jmp <= 3; jmp++) {
            int j = i + jmp;
            if (j <= n) {
                
                ans = Math.min(ans, costs[j] + (j - i) * (j - i) + calc(j, n, costs, dp));
            }
        }
        return dp[i] = ans;
    }
}

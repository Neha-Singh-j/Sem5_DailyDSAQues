// Last updated: 9/20/2025, 9:13:51 PM
class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length;
        // -1 = unvisited, 0 = false, 1 = true
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }
        return helper(0, nums, dp);
    }

    private boolean helper(int idx, int[] nums, int[] dp) {
        int n = nums.length;
        if (idx == n - 1) {
            return true;
        }

        if (dp[idx] != -1) {
            return dp[idx] == 1;
        }
        int maxJump = nums[idx];
        for (int i = 1; i <= maxJump; i++) {
            int next = idx + i;
            if (next < n && helper(next, nums, dp)) {
                dp[idx] = 1; 
                return true;
            }
        }
        dp[idx] = 0;
        return false;
    }
}

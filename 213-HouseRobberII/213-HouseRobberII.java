// Last updated: 9/6/2025, 8:12:13 PM
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);

        // Case 1: exclude last house
        int case1 = RobberBU(nums, 0, nums.length - 2);
        // Case 2: exclude first house
        int case2 = RobberBU(nums, 1, nums.length - 1);

        return Math.max(case1, case2);
    }

    public static int RobberBU(int[] arr, int start, int end) {
        int n = end - start + 1;
        if (n == 1) return arr[start];

        int[] dp = new int[n];
        dp[0] = arr[start];
        dp[1] = Math.max(arr[start], arr[start + 1]);

        for (int i = 2; i < n; i++) {
            int rob = arr[start + i] + dp[i - 2];
            int dontRob = dp[i - 1];
            dp[i] = Math.max(rob, dontRob);
        }
        return dp[n - 1];
    }
}

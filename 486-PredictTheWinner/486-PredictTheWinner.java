// Last updated: 8/1/2025, 10:36:41 PM
class Solution {
    public boolean predictTheWinner(int[] nums) {
        return dfs(0, nums.length - 1, 0, nums, true) >= 0;
        // if its returning something -ve then p2 is the winner
    }

    public static int dfs(int start, int end, int p1, int[] nums, boolean p1Turn) {
        // no element left unvisited
        if (start > end)
            return p1;
      
        if (p1Turn) {
            int bottom = dfs(start + 1, end, p1 + nums[start], nums, false);
            int top = dfs(start, end - 1, p1 + nums[end], nums, false);

            return Math.max(top, bottom);
        } else {
            int bottom = dfs(start + 1, end, p1 - nums[start], nums, true);
            int top = dfs(start, end - 1, p1 - nums[end], nums, true);
            return Math.min(bottom, top);
        }
    }
}
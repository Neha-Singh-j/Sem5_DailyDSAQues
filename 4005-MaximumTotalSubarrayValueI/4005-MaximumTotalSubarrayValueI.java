// Last updated: 9/25/2025, 9:37:57 AM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
       
        int max = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;

        for (int i : nums) {
            max = Math.max(max, i);
            mini = Math.min(mini, i);
        }
        long res = (long) max - mini;
        return res * k;
    }
}

class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int lo = 0, hi = 0;
        int c = 0;

        while (hi < nums.length) {
            while (nums[hi] - nums[lo] > 1) {
                lo++;
            }
             if (nums[hi] - nums[lo] == 1) {
                c = Math.max(c, hi - lo + 1);
            }

            hi++; // grow window
        }
        return c;
    }
}

// Last updated: 8/1/2025, 10:35:02 PM
class Solution {
    public int partitionDisjoint(int[] nums) {
        int n = nums.length;
        int indx = 0;
        int max = nums[0];
        int c = 0;
        int maxL = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] < maxL) {
                c = i;
                maxL = max;
            } else {
                max = Math.max(nums[i], max);
            }

        }
        return c + 1;

    }
}
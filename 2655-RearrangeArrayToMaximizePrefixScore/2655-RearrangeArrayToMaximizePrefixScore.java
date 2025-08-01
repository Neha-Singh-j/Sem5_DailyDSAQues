// Last updated: 8/1/2025, 10:32:09 PM
class Solution {
    public int maxScore(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        long sum = 0;
        long c = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (sum + nums[i] > 0) {
                    sum+=nums[i];
                c++;
            }
        }
        return (int) c;
    }
}
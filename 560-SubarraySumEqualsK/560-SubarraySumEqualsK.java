// Last updated: 8/1/2025, 10:36:21 PM
class Solution {
    public int subarraySum(int[] nums, int k) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {

            int sum = 0;
            for (int s = i ; s <  nums.length; s++) {
                sum += nums[s];
                if (sum == k) {
                    c++;
                }
            }
        }
        return c;
    }
}
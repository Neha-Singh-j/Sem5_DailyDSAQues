// Last updated: 8/1/2025, 10:33:14 PM
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
       int minPrefix = 0,maxPrefix = 0, maxSum = 0, prefixSum = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            maxSum = Math.max(maxSum, Math.abs(prefixSum - minPrefix));
            maxSum=Math.max(maxSum,  Math.abs(prefixSum - maxPrefix));
             maxPrefix = Math.max(maxPrefix,prefixSum);
            minPrefix = Math.min(minPrefix, prefixSum);
        }
        return maxSum;
    }
}
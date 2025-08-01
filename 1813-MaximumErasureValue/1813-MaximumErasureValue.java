// Last updated: 8/1/2025, 10:33:19 PM
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxSum = 0, currentSum = 0;
        int start = 0;

        for (int end = 0; end < nums.length; end++) {
            while (set.contains(nums[end])) {
                set.remove(nums[start]);
                currentSum -= nums[start];
                start++;
            }
            set.add(nums[end]);
            currentSum += nums[end];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

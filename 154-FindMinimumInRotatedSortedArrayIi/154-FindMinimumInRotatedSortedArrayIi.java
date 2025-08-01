// Last updated: 8/1/2025, 10:39:21 PM
class Solution {
    public int findMin(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[lo] == nums[mid] && nums[mid] == nums[hi]) {
                mini = Math.min(mini, nums[mid]);
                lo++;
                hi--;
            } else if (nums[lo] <= nums[mid]) {
                mini = Math.min(mini, nums[lo]);
                lo = mid + 1;
            } else {
                mini = Math.min(mini, nums[mid]);
                hi = mid - 1;
            }
        }
        return mini;
    }
}
// Last updated: 8/1/2025, 10:39:16 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0;
        int hi = nums.length - 1;
        
        while (l < hi) {
            int mid = l+(hi-l)/ 2;
            if (nums[mid] > nums[mid + 1]) {
                hi = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}

// Last updated: 8/1/2025, 10:31:17 PM
class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int len = nums.length;
        int s = 0;

        for (int i = 0; i < len; i++) {
            if (i - k >= 0 && i + k < len) {
                if (nums[i] > nums[i - k] && nums[i] > nums[i + k]) {
                    s+= nums[i];
                }
            } else if (i - k < 0 && i + k < len) {  
                if (nums[i] > nums[i + k]) {
                    s += nums[i];
                }
            } else if (i + k >= len && i - k >= 0) {  
                if (nums[i] > nums[i - k]) {
                    s += nums[i];
                }
            } else {  
                s += nums[i];  
            }
        }
        return s;
    }
}

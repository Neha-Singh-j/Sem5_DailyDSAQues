// Last updated: 8/1/2025, 10:35:40 PM
class Solution {
    public boolean isIdealPermutation(int[] nums) {
        int n=nums.length;
        int max = -1; 
        for (int i = 0; i < nums.length - 2; i++) {
            max = Math.max(max, nums[i]);
            if (max > nums[i + 2]) {
                return false;
            }
        }
        return true;
    }
}
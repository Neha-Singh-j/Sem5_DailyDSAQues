// Last updated: 9/26/2025, 3:48:29 PM
class Solution {
    public int firstMissingPositive(int[] nums) {

        int len = nums.length;

        for(int i =0 ; i<len; i++) {
            if (nums[i] <=0 ) {
                nums[i] = len + 1;
            }
        }

        for (int i = 0; i<len; i++) {
            int value = Math.abs(nums[i]);
            if (value <= len) {
                nums[value-1] = -Math.abs(nums[value-1]);
            }
        }

        for (int i = 0; i < len; i++) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        return len + 1;
    }


}
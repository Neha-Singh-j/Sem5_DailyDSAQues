// Last updated: 8/1/2025, 10:31:35 PM
class Solution {
    public int minOperations(int[] nums) {
        int c = 0;

        for (int i = 0; i < nums.length - 2; i++) { 
            if (nums[i] == 0) {
                nums[i] = flip(nums[i]);
                nums[i + 1] = flip(nums[i + 1]);
                nums[i + 2] = flip(nums[i + 2]);
                c++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1) return -1; 
        }

        return c;
    }

    public static int flip(int n) {
        return 1 - n; 
    }
}

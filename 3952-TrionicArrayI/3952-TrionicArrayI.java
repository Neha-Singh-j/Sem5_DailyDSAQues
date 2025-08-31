// Last updated: 8/31/2025, 4:12:45 PM
class Solution {
    public boolean isTrionic(int[] nums) {
        int len = nums.length;
        if (len < 3) return false;
        
        int i = 1;

        // 0 to p strictly increasing part
        while (i < len && nums[i] > nums[i - 1]) {
            i++;
        }
        if (i == 1 || i == len) return false;

        //p to q strictly decreasing part
        while (i < len && nums[i] < nums[i - 1]) {
            i++;
        }
        if (i == 1 || i == len) return false;

        // q to n-1 strictly increasing again
        while (i < len && nums[i] > nums[i - 1]) {
            i++;
        }

        return i == len;
    }
}

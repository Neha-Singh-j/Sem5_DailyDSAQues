// Last updated: 8/1/2025, 10:42:39 PM
import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length == 3) {
            return nums[0] + nums[1] + nums[2];
        }
        int n = nums.length;
        int mini = Integer.MAX_VALUE;
        int res = 0; 
        Arrays.sort(nums);
        for (int i = 0; i < n - 2; i++) {
            int p1 = i + 1;
            int p2 = n - 1;
            int currSum = 0;
            int val = 0;
            while (p1 < p2) {
                currSum = nums[i] + nums[p1] + nums[p2];
                val = Math.abs(target - currSum);
                if (val < mini) {
                    res = currSum;
                    mini = val;
                }
                if (currSum < target) {
                    p1++;
                } else {
                    p2--;
                }
            }
        }
        return res;
    }
}

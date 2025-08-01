// Last updated: 8/1/2025, 10:32:48 PM
class Solution {
    public long minimalKSum(int[] nums, int k) {
        Arrays.sort(nums);
        long res = 0;
        int j = 1, count = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
             while (count < k && j < nums[i]) {
                res += j;
                count++;
                j++;
            }
            
            if (j == nums[i]) j++;
        }
        
        while (count < k) {
            res += j;
            count++;
            j++;
        }

        return res;
    }
}

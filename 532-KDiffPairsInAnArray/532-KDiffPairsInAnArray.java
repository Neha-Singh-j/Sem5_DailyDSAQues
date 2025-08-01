// Last updated: 8/1/2025, 10:36:27 PM
class Solution {
    public int findPairs(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        int c = 0;
        for(int i=0;i<n;i++){
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n; j++) {
                 if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                if(Math.abs(nums[i]-nums[j])==k){
                    c++;
                }
            }

        }
        return c;

    }
}
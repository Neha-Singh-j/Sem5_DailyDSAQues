// Last updated: 8/31/2025, 4:12:01 PM
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==1 || nums.length==0){
            return nums.length;
        }
          int max = 1,c=1;
        for (int i = 1; i < nums.length; i++) {
              if (nums[i-1] <nums[i]) {
                    c++;
                }else{
                    c=1;
                }
            max = Math.max(max, c);
            }
        return max;
    }
}


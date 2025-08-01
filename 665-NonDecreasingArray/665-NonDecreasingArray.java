// Last updated: 8/1/2025, 10:35:59 PM
class Solution {
    public boolean checkPossibility(int[] nums) {
        boolean ans=false;
        int c=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                c++; 
                
                if (i == 1 || nums[i] >= nums[i - 2]) {
                    nums[i - 1] = nums[i]; 
                } else {
                    nums[i] = nums[i - 1]; 
                }
        }
        }
        if(c>=2){
            return false;
        }
        return true;
    }
}
// Last updated: 8/1/2025, 10:36:36 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<nums.length;i++){
            res[i]=-1;
            for(int j=1;j<nums.length;j++){
                if(nums[i]<nums[(i+j)%n]){
                    res[i]=nums[(i+j)%n];
                    break;
                }
            }
        }
        return res;
    }
}
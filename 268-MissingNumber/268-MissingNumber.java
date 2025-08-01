// Last updated: 8/1/2025, 10:38:03 PM
class Solution {
    public int missingNumber(int[] nums) {
        int[] f=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            f[nums[i]]++;
        }
        for(int i=0;i<f.length;i++){
           if(f[i]==0){
            return i;
           }
        }
return -1;
    }
}
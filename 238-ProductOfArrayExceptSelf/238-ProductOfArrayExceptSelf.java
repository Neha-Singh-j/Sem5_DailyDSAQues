// Last updated: 8/1/2025, 10:38:13 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] left=new int[n];
        int[] right=new int[n];
        // prefix suffix
        
        left[0]=1;
        for(int i=1;i<n;i++){
            left[i]=left[i-1]*nums[i-1];

        }
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*nums[i+1];

        }
        // int[] final=new int[n];
        for(int i=0;i<n;i++){
nums[i]=left[i]*right[i];
        }
        return nums;
    }
}
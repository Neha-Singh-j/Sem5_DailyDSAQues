// Last updated: 8/1/2025, 10:39:25 PM
class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int prod=Integer.MIN_VALUE;
        int suffix=1 ,prefix=1;
        for(int i=0;i<n;i++){
            if(suffix==0) suffix=1;
            if(prefix==0) prefix=1;
            suffix*=nums[n-i-1];
            prefix*=nums[i];
            prod=Math.max(prod,Math.max(suffix,prefix));
        }
        return prod;
    }
}
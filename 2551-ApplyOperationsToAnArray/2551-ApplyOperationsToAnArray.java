// Last updated: 8/1/2025, 10:32:23 PM
class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int c=0;
        int[] arr=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) c++;
           else{
                arr[j]=nums[i];
                j++;
            }
        }
        
        while(c>0){
            arr[j]=0;
            j++;
            c--;
        }
        
        return arr;
    }
}
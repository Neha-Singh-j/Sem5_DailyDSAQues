// Last updated: 8/1/2025, 10:42:06 PM
class Solution {
    public void nextPermutation(int[] nums) {
        int k=nums.length-2;
     while(k>=0 && nums[k]>=nums[k+1]){
         k--;
     }
     if(k>=0){
     int j=nums.length-1;
     while(nums[j]<=nums[k]){
         j--;
     }
     Swap(nums,k,j);
     }
     revrse(nums,k+1,nums.length-1);
 }
 public static void Swap(int[] nums,int k,int j){
     int curr=nums[k];
     nums[k]=nums[j];
     nums[j]=curr;
 }
public static void revrse(int[] nums,int k,int  j) {
	while(k<=j) {
	int curr=nums[k];
	nums[k]=nums[j];
	nums[j]=curr;
	k++;
	j--;
	}
}
    
}
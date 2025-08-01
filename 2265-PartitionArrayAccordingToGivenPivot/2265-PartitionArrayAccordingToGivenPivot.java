// Last updated: 8/1/2025, 10:32:50 PM
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       return partition(nums,pivot);

    }
    public static int[] partition(int[] nums,int pivot){
        int[] arr=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                arr[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                arr[j]=nums[i];
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>pivot){
                arr[j]=nums[i];
                j++;
            }
        }
        return arr;
    }
}
// Last updated: 8/1/2025, 10:42:24 PM
int removeDuplicates(int* nums, int numsSize) {
    int i,un=0;
    for(i=1;i<numsSize;i++){
        if(nums[i]!=nums[un]){
        un++;
        nums[un]=nums[i];
        }
    }
return un+1;
}
// Last updated: 8/1/2025, 10:39:39 PM
int singleNumber(int* nums, int numsSize) {
    int i,res=0;
    for(i=0;i<numsSize;i++)
    {
        res^=nums[i];
    }
    return res;
}
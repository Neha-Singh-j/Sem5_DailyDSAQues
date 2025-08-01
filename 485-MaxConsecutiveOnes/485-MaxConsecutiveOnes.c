// Last updated: 8/1/2025, 10:36:56 PM
int findMaxConsecutiveOnes(int* nums, int numsSize) {
    int i,maxcount=0;
    int currentcount=0;
    for(i=0;i<numsSize;i++)
    {
        if(nums[i]==1)
        {
            currentcount++;
            maxcount=(currentcount>maxcount)?currentcount:maxcount;

        }
        else{

        currentcount=0;
        }

    }
    return maxcount;
}
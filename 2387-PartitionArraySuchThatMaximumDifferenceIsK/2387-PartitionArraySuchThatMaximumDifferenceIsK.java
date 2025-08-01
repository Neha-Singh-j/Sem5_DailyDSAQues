// Last updated: 8/1/2025, 10:32:42 PM
class Solution {
    public int partitionArray(int[] nums, int k) {
        int c=0;
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length){
            int start=nums[i];
            while(i<nums.length && nums[i]<=start+k){
                i++;
            }
            c++;
        }
        return c;
    }
}
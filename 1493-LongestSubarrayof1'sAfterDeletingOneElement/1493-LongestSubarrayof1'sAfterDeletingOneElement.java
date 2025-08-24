// Last updated: 8/24/2025, 9:40:11 AM
class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int k = 1; 
        int st = 0; 
        int maxLength = 0;
        int end=0;
         int countZeros = 0; 
        while(end<n){
            if (nums[end] == 0) {
                countZeros++; 
            }

            while (countZeros > k) {
                if (nums[st] == 0) {
                    countZeros--; 
                       }
                st++;
            }
            maxLength = Math.max(maxLength, end - st );
            end++;
        }

        return maxLength;
    }
}

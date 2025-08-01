// Last updated: 8/1/2025, 10:33:38 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int k = 1; 
        int i = 0; 
        int maxLength = 0;
        int j=0;
         int countZeros = 0; 
        while(j<n){
            if (nums[j] == 0) {
                countZeros++; 
            }

            while (countZeros > k) {
                if (nums[i] == 0) {
                    countZeros--; 
                       }
                i++;
            }
            maxLength = Math.max(maxLength, j - i );
            j++;
        }

        return maxLength;
    }
}

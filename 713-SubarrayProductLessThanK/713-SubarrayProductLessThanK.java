// Last updated: 8/1/2025, 10:35:54 PM
class Solution {  
    public int numSubarrayProductLessThanK(int[] nums, int k) {  
        int c = 0;               
        int curr = 1;            
        int j = 0;            
        int i = 0;             
        while (i < nums.length) {  
            curr *= nums[i];   
             while (curr >= k && j <= i) {  
                curr /= nums[j];  
                j++;  
            }  
            c += (i - j + 1);  
            i++;               
             }  

        return c;         
         }  
}
// Last updated: 8/1/2025, 10:37:56 PM
import java.util.Arrays;

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);  
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];      }
        }
        
        return -1;  }
    //       for (int i = 0; i < nums.length; i++) {
    //         int curr = nums[i];
    //         for (int j = i + 1; j < nums.length; j++) {
    //             if (curr == nums[j]) {
    //                 return curr;
    //             }
    //         }
    //     }
    //     return -1;
    // }
}

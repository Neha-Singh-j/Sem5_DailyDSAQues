// Last updated: 8/1/2025, 10:42:40 PM
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            // for removing duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int left = i + 1;  // Second pointer
            int right = nums.length - 1;  // Third pointer
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                     
                     // for skip all duplicate elements
                     
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    // Move the pointers
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;  // Increase the sum
                } else {
                    right--;  // Decrease the sum
                }
            }
        }
        
        return result;
    }
}
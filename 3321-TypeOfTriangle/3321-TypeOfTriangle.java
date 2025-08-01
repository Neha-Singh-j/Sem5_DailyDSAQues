// Last updated: 8/1/2025, 10:31:48 PM
class Solution {
    public String triangleType(int[] nums) {
         if ((nums[0] + nums[1] > nums[2]) && 
            (nums[1] + nums[2] > nums[0]) && 
            (nums[0] + nums[2] > nums[1])) {
            
            if (nums[0] == nums[1] && nums[1] == nums[2]) {
                return "equilateral";
            } else if (nums[0] != nums[1] && nums[1] != nums[2] && nums[0] != nums[2]) {
                return "scalene";
            } else {
                return "isosceles";
            }
        } else {
            return "none";
        }
    
    }
}

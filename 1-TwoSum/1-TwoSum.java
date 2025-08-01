// Last updated: 8/1/2025, 10:43:11 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] nums2 = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
        }
        
        Arrays.sort(nums2);
        int i = 0;
        int j = nums.length - 1;
        int[] arr = new int[2];
        int n1 = -1;
        int n2 = -1;
        
        while (i < j) {
            if (nums2[i] + nums2[j] == target) {
                n1 = nums2[i];
                n2 = nums2[j];
                break;
            } else if (nums2[i] + nums2[j] < target) {
                i++;
            } else {
                j--;
            }
        }
        
        boolean foundFirst = false;
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == n1 && !foundFirst) {
                arr[0] = k;
                foundFirst = true;  
            } else if (nums[k] == n2) {
                arr[1] = k;
            }
        }

        return arr;
    }
    
}
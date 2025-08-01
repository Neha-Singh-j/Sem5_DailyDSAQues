// Last updated: 8/1/2025, 10:38:34 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }

            window.add(nums[i]);

            // Maintain window size
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;
    
    }
}
// Last updated: 8/31/2025, 4:12:43 PM
class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = n;
        
        for (int i = 0; i < n; i++) {
            int st = i, end = n - 1;
            int j = i;
            
            while (st <= end) {
                int mid = st + (end - st) / 2;
                if ((long)nums[mid] <= (long)nums[i] * k) {
                    j = mid;
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            
            int len = j - i + 1;
            ans = Math.min(ans, n - len);
        }
        
        return ans;
    }
}

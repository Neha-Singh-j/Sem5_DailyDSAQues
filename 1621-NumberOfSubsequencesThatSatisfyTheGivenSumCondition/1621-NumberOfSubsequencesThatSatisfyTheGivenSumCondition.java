// Last updated: 8/1/2025, 10:33:36 PM
class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod = 1000000007;
        Arrays.sort(nums);

        int p1 = 0, p2 = nums.length - 1;
        int count = 0;

        int[] pow2 = new int[nums.length];
        pow2[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            pow2[i] = (pow2[i - 1] * 2) % mod;
        }

        while (p1 <= p2) {
            if (nums[p1] + nums[p2] <= target) {
                count = (count + pow2[p2 - p1]) % mod;
                p1++;
            } else {
                p2--;
            }
        }

        return count;
    }
}

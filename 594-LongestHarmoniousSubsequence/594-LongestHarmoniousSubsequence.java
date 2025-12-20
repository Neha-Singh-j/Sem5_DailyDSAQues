// Last updated: 12/20/2025, 7:43:44 AM
1class Solution {
2    public int findLHS(int[] nums) {
3        Arrays.sort(nums);
4        int lo = 0, hi = 0;
5        int c = 0;
6
7        while (hi < nums.length) {
8            while (nums[hi] - nums[lo] > 1) {
9                lo++;
10            }
11             if (nums[hi] - nums[lo] == 1) {
12                c = Math.max(c, hi - lo + 1);
13            }
14
15            hi++; // grow window
16        }
17        return c;
18    }
19}
20
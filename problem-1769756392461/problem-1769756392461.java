// Last updated: 1/30/2026, 12:29:52 PM
1class Solution {
2    public boolean validPartition(int[] nums) {
3        Boolean[] dp = new Boolean[nums.length];
4
5        return solve(0, nums, dp);
6    }
7
8    boolean solve(int i, int[] nums, Boolean[] dp) {
9        if (i == nums.length) return true;
10        if (dp[i] != null) return dp[i];
11        
12        boolean res = false;
13        // Case 1: two equal elements
14        if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
15            res |= solve(i + 2, nums, dp);
16        }
17        // Case 2: three equal elements
18        if (i + 2 < nums.length &&
19            nums[i] == nums[i + 1] &&
20            nums[i + 1] == nums[i + 2]) {
21            res |= solve(i + 3, nums, dp);
22        }
23        // Case 3: three consecutive increasing elements
24        if (i + 2 < nums.length &&
25            nums[i + 1] == nums[i] + 1 &&
26            nums[i + 2] == nums[i] + 2) {
27            res |= solve(i + 3, nums, dp);
28        }
29        return dp[i] = res;
30    }
31}
32
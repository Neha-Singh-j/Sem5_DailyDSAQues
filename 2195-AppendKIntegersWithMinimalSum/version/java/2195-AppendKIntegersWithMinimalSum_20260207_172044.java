// Last updated: 2/7/2026, 5:20:44 PM
1class Solution {
2    public long minimalKSum(int[] nums, int k) {
3        Arrays.sort(nums);
4        long res = 0;
5        int j = 1, count = 0;
6        int n = nums.length;
7        
8        for (int i = 0; i < n; i++) {
9            if (i > 0 && nums[i] == nums[i - 1]) continue;
10             while (count < k && j < nums[i]) {
11                res += j;
12                count++;
13                j++;
14            }
15            
16            if (j == nums[i]) j++;
17        }
18        
19        while (count < k) {
20            res += j;
21            count++;
22            j++;
23        }
24
25        return res;
26    }
27}
28
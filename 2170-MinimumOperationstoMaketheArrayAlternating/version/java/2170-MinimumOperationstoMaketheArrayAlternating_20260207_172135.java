// Last updated: 2/7/2026, 5:21:35 PM
1class Solution {
2    public int minimumOperations(int[] nums) {
3       int n = nums.length;
4        Map<Integer, Integer> even = new HashMap<>();
5        Map<Integer, Integer> odd = new HashMap<>();
6        for (int i = 0; i < n; i++) {
7            if (i % 2 == 0)
8                even.put(nums[i], even.getOrDefault(nums[i], 0) + 1);
9            else
10                odd.put(nums[i], odd.getOrDefault(nums[i], 0) + 1);
11        }
12
13        int[][] e = topTwo(even);
14        int[][] o = topTwo(odd);
15
16        int maxKept = 0;
17        for (int i = 0; i < 2; i++) {
18            for (int j = 0; j < 2; j++) {
19                if (e[i][0] != o[j][0]) {
20                    maxKept = Math.max(maxKept, e[i][1] + o[j][1]);
21                }
22            }
23        }
24
25        return n - maxKept;
26    }
27
28    private int[][] topTwo(Map<Integer, Integer> map) {
29        int[][] res = {{-1, 0}, {-1, 0}};
30        for (int key : map.keySet()) {
31            int freq = map.get(key);
32            if (freq > res[0][1]) {
33                res[1] = res[0];
34                res[0] = new int[]{key, freq};
35            } else if (freq > res[1][1]) {
36                res[1] = new int[]{key, freq};
37            }
38        }
39        return res;
40    }
41}
42
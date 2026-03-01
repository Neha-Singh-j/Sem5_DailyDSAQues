// Last updated: 3/1/2026, 10:12:28 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3       int st=0;
4       int end=0;
5       int c=0;
6       int max=Integer.MIN_VALUE;
7       while(end<nums.length){
8        if (nums[end] == 0) {
9                c++;
10            }
11            while (c > k) {
12                if (nums[st] == 0) {
13                    c--;
14                }
15                st++;
16            }
17            max = Math.max(max, end- st+1);
18            end++;
19       }
20        return max;
21       }
22    }
23
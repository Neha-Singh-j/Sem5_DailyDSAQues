// Last updated: 3/18/2026, 11:40:12 AM
1class Solution {
2    public int eraseOverlapIntervals(int[][] intervals) {
3       Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
4         int c=0;
5        int prevEnd=intervals[0][1];
6        for(int i=1;i<intervals.length;i++){
7            if(intervals[i][0]<prevEnd){
8                c++;
9            }else{
10                prevEnd=intervals[i][1];;
11            }
12        }
13        return c;
14    }
15}
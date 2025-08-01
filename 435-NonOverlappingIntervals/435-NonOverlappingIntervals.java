// Last updated: 8/1/2025, 10:37:06 PM
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));
         int c=0;
        int prevEnd=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<prevEnd){
                c++;
            }else{
                prevEnd=intervals[i][1];;
            }
        }
        return c;
    }
}
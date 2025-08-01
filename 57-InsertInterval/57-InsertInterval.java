// Last updated: 8/1/2025, 10:41:18 PM
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int n = intervals.length;
        int i = 0;

        // Step 1: Add intervals that come before newInterval
        while (i < n && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i]);
            i++;
        }

        // Step 2: Merge overlapping intervals with newInterval
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        ans.add(newInterval); // Add merged interval

        // Step 3: Add remaining intervals
        while (i < n) {
            ans.add(intervals[i]);
            i++;
        }

        // Convert list to array
        int[][] res = new int[ans.size()][2];
        for (i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }
}

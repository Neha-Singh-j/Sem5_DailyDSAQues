// Last updated: 8/31/2025, 4:12:41 PM
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            for (int j = 0; j < waterStartTime.length; j++) {
                
                  int wEnd = waterStartTime[j] + waterDuration[j];
                int lBeg = Math.max(wEnd, landStartTime[i]);
                int time1 = lBeg + landDuration[i];
                
                int lEnd = landStartTime[i] + landDuration[i];
                int wBeg = Math.max(lEnd, waterStartTime[j]);
                int time2 = wBeg + waterDuration[j];
                 
                res = Math.min(res, Math.min(time1, time2));
            }
        }

        return res;
    }
}

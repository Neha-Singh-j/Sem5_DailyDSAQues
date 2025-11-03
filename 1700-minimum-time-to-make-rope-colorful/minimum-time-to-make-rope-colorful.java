class Solution {
    public int minCost(String colors, int[] neededTime) {
        int[] t=new int[26];
        int time=0;
        int gpTime=neededTime[0];
        int gpMax=neededTime[0];
        for(int i=1;i<colors.length();i++){
            char ch=colors.charAt(i);
            if(ch==colors.charAt(i-1)){
                gpTime+=neededTime[i];
                gpMax=Math.max(gpMax, neededTime[i]);
            }else{
                time+=gpTime-gpMax;
                gpTime=neededTime[i];
                gpMax=neededTime[i];
            }
        }
        time+=gpTime-gpMax;
        return time;
    }
}
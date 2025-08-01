// Last updated: 8/1/2025, 10:32:32 PM
class Solution {
    public int longestContinuousSubstring(String s) {
        int c=1;
        int curr=1;
        for(int i=1;i<s.length();i++){
            if((s.charAt(i)-'a')-(s.charAt(i-1)-'a')==1){
                curr++;
            }else{
                c=Math.max(curr,c);
                curr=1;
            }
        }
         c=Math.max(curr,c);
        return c;
    }
}
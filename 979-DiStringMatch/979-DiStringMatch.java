// Last updated: 8/1/2025, 10:34:50 PM
class Solution {
    public int[] diStringMatch(String s) {
        int[] ans=new int[s.length()+1];
        int c=0;
        for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='I'){
                ans[i]=c;
                c++;
                }
        }
        ans[s.length()]=c++;
          for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'D') {
                ans[i] = c++;
            }
        }

        return ans;
    }
}
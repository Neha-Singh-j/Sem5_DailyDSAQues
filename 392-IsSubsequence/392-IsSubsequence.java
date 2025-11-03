// Last updated: 11/3/2025, 9:13:00 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int l=0;
        int r=0;
        while(l<s.length() && r<t.length()){
            char ch1=s.charAt(l);
            char ch2=t.charAt(r);
            if(ch1==ch2){
                l++;
            }
            
            r++;
        }
        return s.length()==l;
    }
}
// Last updated: 8/1/2025, 10:37:20 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int l=0;
        int r=0;
        while(l<s.length() && r<t.length()){
            char ch1=s.charAt(l);
            char ch2=t.charAt(r);
            if(ch1!=ch2){
                r++;
            }else{
                l++;
                r++;
            }
            

        }
        return s.length()==l;
    }
}
// Last updated: 8/1/2025, 10:42:10 PM
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.length()<needle.length()) return -1;

        if(needle.length()==0) return 0;

        int p1=0;
        int p2=needle.length()-1;
        while(p2<haystack.length()){
            if(haystack.substring(p1,p2+1).equals(needle)){
                return p1;
            }
            p1++;
            p2++;
         }
         return -1;
    }
}
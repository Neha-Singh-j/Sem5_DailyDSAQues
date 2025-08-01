// Last updated: 8/1/2025, 10:33:08 PM
class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        if(s1.length()!=s2.length()) return false;
        int c=0;
        int[] frq=new int[26];
        int[] frq2=new int[26];
        for(int i=0;i<s1.length();i++){
            frq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<s2.length();i++){
            frq2[s2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(frq[i]!=frq2[i]) return false;
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
            }
        }
        if(c==0||c==2){
            return true;
        }else{
            return false;
        }
    }
}
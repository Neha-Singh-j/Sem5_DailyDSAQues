// Last updated: 9/15/2025, 12:05:56 AM
class Solution {
    public boolean doesAliceWin(String s) {
       int v= countVowel(s);
       if(v==0){
        return false;
       }
       return true;
    }
    public static int countVowel(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                c++;
            }
        }
        return c;
    }
}
// Last updated: 8/1/2025, 10:32:21 PM
class Solution {
    public int appendCharacters(String s, String t) {
        int c=0;
        int st=0;
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            boolean f=false; // char of t string is found or not track
            for(int j=st;j<s.length();j++){
                char curr=s.charAt(j);
                if(ch==curr){
                    c++;
                    st=j+1;
                    f=true;
                    break;
                }
            }
            if(f==false){
                break;
            }
        }
        return t.length()-c;

    }
}
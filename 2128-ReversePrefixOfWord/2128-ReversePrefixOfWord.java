// Last updated: 8/1/2025, 10:33:05 PM
class Solution {
    public String reversePrefix(String word, char ch){
        int rev=0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                rev=i;
                break;
            }
        }
        StringBuilder s=new StringBuilder(word.substring(0,rev+1));
        int l=0;
        int r=s.length()-1;
       while(l<=r){
        char temp=s.charAt(l);
        
        s.setCharAt(l,s.charAt(r));
        s.setCharAt(r,temp);
        l++;
        r--;
       }
       s.append(word.substring(rev+1));
        return s.toString();
    }
}
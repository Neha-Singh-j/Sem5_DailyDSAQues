// Last updated: 8/1/2025, 10:33:41 PM
class Solution {
    public int maxVowels(String s, int k) {
        int i=0;
        int j=0;
        int v=0;
        int c=0;
        while(j<s.length()){
if(isVowel(s.charAt(j))){
c++;
            }
           
            while((j-i+1)>k){
              if(isVowel(s.charAt(i))){
                c--;
              }
                i++;
            }
              v=Math.max(c,v);
              j++;

        }
        return v;
    }
    private boolean isVowel(char ch){
        return ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u';
    }
}
// Last updated: 8/1/2025, 10:36:32 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;
        boolean first=false;
        for(int i=0;i<word.length();i++){
             if(word.charAt(0)>='A' && word.charAt(0)<='Z'){
               first=true;
            }
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                count++;
            }

        }
        if(count==1&& !first){
            return false;
        }
        if(count==word.length()|| count==1|| count ==0){
            return true;
        }
        return false;
    }
}
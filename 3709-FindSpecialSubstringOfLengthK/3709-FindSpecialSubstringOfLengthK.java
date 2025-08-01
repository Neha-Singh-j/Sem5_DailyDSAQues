// Last updated: 8/1/2025, 10:31:21 PM
class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        int len=s.length();
        
        if (k > len) return false;
        
        for(int i=0;i<=len-k;i++){
            char ch=s.charAt(i);
            boolean isSame=true;

            for(int j=i;j<i+k;j++){
                if(s.charAt(j)!=ch){
                    isSame=false;
                    break;
                }
            }
            if(isSame){
               if ((i > 0 && s.charAt(i - 1) == ch) || (i + k < len && s.charAt(i + k) == ch)) {
                    continue; 
                }
                return true;
            }
        }
        return false;
    }
}
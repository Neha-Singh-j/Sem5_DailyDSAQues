// Last updated: 8/1/2025, 10:35:17 PM
class Solution {
    public String decodeAtIndex(String s, int k) {
        long len=0;
        for(char c: s.toCharArray()){
            if(Character.isDigit(c)){
                len*=Character.getNumericValue(c);
            }else{
                len+=1;
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            k%=len;
            if(k==0 && (!Character.isDigit(s.charAt(i)))){
                return String.valueOf(s.charAt(i));
            }
            if(Character.isDigit(s.charAt(i))){
                len/=Character.getNumericValue(s.charAt(i));
            }else{
                len-=1;
            }
        }
        return "";
    }
}
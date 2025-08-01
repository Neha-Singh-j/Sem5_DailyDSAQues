// Last updated: 8/1/2025, 10:32:35 PM
class Solution {
    public int minimumRecolors(String blocks, int k) {
        int res=blocks.length();
        for(int i=0;i<=blocks.length()-k;i++){ 
                String s=blocks.substring(i,i+k);
                res=Math.min(res,count(s)); 
            }
        
        return res;
    }
    public static int count(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='W') c++;
        }
        return c;
    }
}
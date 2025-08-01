// Last updated: 8/1/2025, 10:33:32 PM
class Solution {
    public char findKthBit(int n, int k) {
        String res=rec(n);
        return res.charAt(k-1);
    }
    public static String rec(int n){

        if(n==1){
            return "0";
        }
        String previous = rec(n - 1); 
        return previous + "1" + reverse(invert(previous));
    }
    public static String reverse(String s){
       StringBuilder  s2=new StringBuilder();
       for(int i=s.length()-1;i>=0;i--){
        s2.append(s.charAt(i));
       }
       return s2.toString();
    }
    public static String invert(String s){
         StringBuilder  s2=new StringBuilder();
         for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            s2.append('0');
        }else{
            s2.append('1');
        }
         }
        return s2.toString();
    }
}
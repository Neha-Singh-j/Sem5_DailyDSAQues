// Last updated: 8/1/2025, 10:42:51 PM
class Solution {
    public boolean isMatch(String s, String p) {
        return match(s,p,0,0);
    }
    public  boolean match(String s , String p , int i ,int j ){

        if(p.length()==j) return i==s.length();

        boolean firstMatch= (i<s.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.'));

        if(j+1<p.length() && p.charAt(j+1)=='*'){

            return match(s,p,i,j+2) || (firstMatch && match(s,p,i+1,j));
        }else{

            return firstMatch && match(s,p,i+1,j+1);

        }
    }
}
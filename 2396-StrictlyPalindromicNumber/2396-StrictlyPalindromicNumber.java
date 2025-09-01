// Last updated: 9/1/2025, 11:45:11 PM
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            String s=basestr(n,i);
            if(!isPalindromic(s)){
                return false;
            }
        }
        return true;
    }
    public static String basestr(int n, int b){
        int sum=0,mul=1;
		while(n>0) {
			int rem=n%b;
			sum=sum+rem*mul;
			n=n/b;
			mul=mul*10;
		}
        return String.valueOf(sum);
    }
    public static boolean isPalindromic(String s){
        int a=0;
        int b=s.length()-1;
        while(a<b){
            if(s.charAt(a)!=s.charAt(b)){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }
}
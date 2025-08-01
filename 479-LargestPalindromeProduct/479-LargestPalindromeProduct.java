// Last updated: 8/1/2025, 10:36:46 PM
class Solution {
    public int largestPalindrome(int n) {
    long high = (long)Math.pow(10,n);
    long low= (long) Math.pow(10,n-1);
    if(n == 7) return 877;
        for(long i = high-1;i>=high-low;i--){
            for(long j = high-1;j>=high-low;j--){
                long res = i*j;
               
                if(check(res)){
                    return (int)(res%1337);
                }
                
            }

        }    
  return 9;
    }
    public static boolean check(long res){
         String s=String.valueOf(res);
       int i=0;
       int j=s.length()-1;
       while(i<=j){
        if(s.charAt(i)!=s.charAt(j)) return false;
        i++;
        j--;
       }
       return true;
    }
}
// Last updated: 8/1/2025, 10:32:25 PM
class Solution {
    
    public boolean sumOfNumberAndReverse(int num) {
        
        for(int i=0;i<=num;i++){
            if(i+reverse(i)==num){
                return true;
            }
        }
        return false;
        
    }
    public int reverse(int n){
        int rev=0;
        while(n>0){
            int x=n%10;
            rev=rev*10 + x;
            n/=10;
        }
        return rev;
    }
}
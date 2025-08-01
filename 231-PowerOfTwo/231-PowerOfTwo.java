// Last updated: 8/1/2025, 10:38:25 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }else if(n==1){
            return true;
        }
        while(n>1){
            if(n%2!=0){
            return false;
        }
        n=n/2;
        
    }
    return true;
}
}
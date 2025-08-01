// Last updated: 8/1/2025, 10:31:31 PM
class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int ns=1;
          int num=n;
            while(num>0){
                int rem=num%10;
                num=num/10;
                ns=ns*rem;
                if(ns%t==0){
                    return n;
                }
            }
            n++;
        }
    }
}
// Last updated: 9/2/2025, 11:28:47 PM
class Solution {
    public int addDigits(int num) {
        int n=num;
      while(n>9){
            int sum=0;
            while(num>0){

                int rem=num%10;
                sum+=rem;
                num=num/10;

            }
            n=sum;
            num=sum;
        }
        return n;
    }
}
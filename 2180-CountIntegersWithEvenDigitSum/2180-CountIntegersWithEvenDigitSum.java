// Last updated: 9/2/2025, 11:50:41 PM
class Solution {
    public int countEven(int num) {
        
        int c=0;
        int i=1;

        while(i<=num){
            if(cEven(i)){
                c++;
            }
            i++;
        }
        return c;

    }
    public static boolean cEven(int n){
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum%2==0;
    }
}
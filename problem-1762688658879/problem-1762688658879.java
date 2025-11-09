// Last updated: 11/9/2025, 5:14:18 PM
class Solution {
    public int numberOfSteps(int num) {
        int c=0;
        while(num>0){
            if(num%2==0){
                num=num/2;
            }else{
                num-=1;
            }
            c++;
        }
        return c;
    }
}
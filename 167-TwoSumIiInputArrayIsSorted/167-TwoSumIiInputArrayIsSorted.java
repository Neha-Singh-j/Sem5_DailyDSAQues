// Last updated: 8/1/2025, 10:39:11 PM
class Solution {
    public int[] twoSum(int[] num, int target) {
int[] arr=new int[2];
       int p1=0;
       int p2=num.length-1;
       while(p1<p2){
        int sum=num[p1]+num[p2];
        if(sum==target){
            arr[0]=p1+1;
            arr[1]=p2+1;
            break;
        }else if(sum<target){
            p1++;
        }else{
            p2--;
        }
       }
       return arr;
    }
}
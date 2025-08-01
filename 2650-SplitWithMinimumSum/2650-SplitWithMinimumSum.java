// Last updated: 8/1/2025, 10:32:11 PM
class Solution {
    public int splitNum(int num) {
        int n1=0;
        int n2=0;
        String s=String.valueOf(num);
       char[] arr= s.toCharArray();
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++){
            if(i%2==0){
                n1=n1*10+(arr[i]-'0');
            }else{
                n2=n2*10+(arr[i]-'0');
            }
       }
        return n1+n2;
    }
}
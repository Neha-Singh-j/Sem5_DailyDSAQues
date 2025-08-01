// Last updated: 8/1/2025, 10:32:44 PM
class Solution {
    public boolean digitCount(String num) {
        int[] arr=new int[10];
        for(int i=0;i<num.length();i++){
            arr[num.charAt(i)-'0']++;
        }
        for(int i=0;i<num.length();i++){
            // System.out.print(arr[i]+" ");
             if(arr[i]!=num.charAt(i)-'0') return false;
        }
        return true;
    }
}
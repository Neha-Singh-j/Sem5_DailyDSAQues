// Last updated: 8/1/2025, 10:35:27 PM
class Solution {
    public int longestMountain(int[] arr) {
        int c=0;
        if(arr.length<3){
            return 0;
        }
        for(int i=1;i<arr.length-1;i++){
               if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                int left=i-1;
                int right=i+1;
                while(left>0&&arr[left-1]<arr[left])left--;
                while(right<arr.length-1  && arr[right]>arr[right+1]) right++;
                c=Math.max(c,right-left+1);
               }
        }
        return c;
    }
}
// Last updated: 8/1/2025, 10:34:52 PM
class Solution {
    public boolean validMountainArray(int[] arr) {
        int indx=0;
        int max=Integer.MIN_VALUE;
        if(arr.length<3){
            return false;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                indx=i;
            }
        }
        if(indx==0||indx==arr.length-1){
            return false;
        }
        for(int i=0;i<indx;i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }
        for(int i=indx;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
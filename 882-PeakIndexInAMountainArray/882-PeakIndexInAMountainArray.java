// Last updated: 8/1/2025, 10:35:24 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
      int lo=0;
      int hi=arr.length-1;
while(lo<hi){
    int mid=(lo+hi)/2;
    if(arr[mid]>arr[mid+1]){
        hi=mid;
    }else{
        lo=mid+1;
    }
}
return hi;
    }
}
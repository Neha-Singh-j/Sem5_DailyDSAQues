// Last updated: 8/1/2025, 10:31:19 PM
class Solution {
    public long minCost(int[] arr, int[] brr, long k) {
     
        long pre = 0;
        for (int i = 0; i < arr.length; i++) {
            pre += Math.abs((long) arr[i] - brr[i]);
        }
       
        Arrays.sort(brr);
         Arrays.sort(arr);
        long curr = 0;
        for (int i = 0; i < arr.length; i++) {
            curr += Math.abs((long) arr[i] - brr[i]);
        }
        curr += k; 
        return Math.min(pre, curr);
    }

   
}
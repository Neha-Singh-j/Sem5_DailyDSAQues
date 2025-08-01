// Last updated: 8/1/2025, 10:31:58 PM
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int[] arr=new int[A.length];
        int[] freq=new int[A.length+1];
        int curr=0;
        for(int i=0;i<A.length;i++){
            int v1=++freq[A[i]];
           if(v1==2){
            curr++;
           }
           int v2=++freq[B[i]];
           if(v2==2){
            curr++;
           }
           arr[i]=curr;
        }
        return arr;
    }
}
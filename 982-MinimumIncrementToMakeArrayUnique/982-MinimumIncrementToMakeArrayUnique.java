// Last updated: 8/1/2025, 10:34:48 PM
class Solution {
    public int minIncrementForUnique(int[] arr) {
        Arrays.sort(arr);
        int move=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=arr[i-1]){
                int incre=arr[i-1]+1-arr[i];
                move+=incre;
                arr[i]+=incre;
            }
            
        }
        return move;
    }
}
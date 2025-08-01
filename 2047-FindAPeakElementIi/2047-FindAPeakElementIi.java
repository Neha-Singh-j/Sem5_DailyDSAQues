// Last updated: 8/1/2025, 10:33:06 PM
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        
        int st=0; // start
        int end=mat[0].length-1;
        while(st<=end){
            int mid=st+(end-st)/2; // mid column
            int mrow=0;
            for(int i=0;i<mat.length;i++){
                if(mat[i][mid]>mat[mrow][mid]){
                    mrow=i; // maximum row
                }
            }
              boolean leftIsBig    =   mid-1 >= st  &&  mat[mrow][mid-1] > mat[mrow][mid];
            boolean rightIsBig   =   mid+1 <= end   &&  mat[mrow][mid+1] > mat[mrow][mid];
                if(!leftIsBig && !rightIsBig) {  
                          return new int[]{mrow, mid};
                }
                else if(rightIsBig) { 
                    st = mid+1;
                }else{
                    end=mid-1;
                }
        }
       return new int[]{0,0};
    }
}
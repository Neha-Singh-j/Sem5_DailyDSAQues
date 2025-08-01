// Last updated: 8/1/2025, 10:41:36 PM
class Solution {
    public void rotate(int[][] matrix) {
        int matrixSize=matrix.length;
        for(int i=0;i<matrixSize;i++){
       for(int j=i+1;j<matrixSize;j++){
           int temp=matrix[i][j];
           matrix[i][j]=matrix[j][i];
           matrix[j][i]=temp;
       }
   } 
   for(int i=0;i<matrixSize;i++){
       int left=0;
       int right=matrixSize-1;
       while(left<right)
       {
           int temp=matrix[i][left];
          matrix[i][left]= matrix[i][right];
          matrix[i][right]=temp;
          left++;
          right--;
       }
   }
    }
}


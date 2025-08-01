// Last updated: 8/1/2025, 10:38:10 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int row=0;
      
       int col=matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]>target){
                col--;
            }else{
row++;
            }
        }
        return false;
    }
}
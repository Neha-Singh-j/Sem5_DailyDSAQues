// Last updated: 8/1/2025, 10:41:01 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
       ArrayList<Integer > arr=new ArrayList<Integer>();
       ArrayList<Integer > arr2=new ArrayList<Integer>();
      
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                  
                   arr.add(i);
                   arr2.add(j);
                }
            }
        }
       for(int i=0;i<arr.size();i++){
            for(int j=0;j<n;j++){
              matrix[arr.get(i)][j]=0;
            }
        }
        for(int i=0;i<arr2.size();i++){
            for(int j=0;j<m;j++){
               matrix[j][arr2.get(i)]=0;
            }
        }
    }
}
// Last updated: 8/1/2025, 10:37:30 PM
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int m=matrix[0].length;
        int[] arr=new int[m*n];
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[c]=matrix[i][j];
                c++;
            }
        }
        Arrays.sort(arr);
return arr[k-1];
    }
}
// Last updated: 8/1/2025, 10:32:16 PM
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int n=score.length;
        int m=score[0].length;
        int[] arr=new int[n];
        int[][] sorted=new int[n][m];
        for(int i=0;i<n;i++){
               arr[i] =score[i][k];
        }
        Arrays.sort(arr);
        int x=0;
        for(int j=n-1;j>=0;j--){
        for(int i=0;i<n;i++){
            
                if(score[i][k]==arr[j]){
                   sorted[x]=score[i];
                   x++;
                }
            }

        }
        return sorted;


    }
}
// Last updated: 8/1/2025, 10:31:32 PM
class Solution {
    public int minFlips(int[][] grid) {
        int c=0,r=0;
        for(int i=0;i<grid.length;i++){
            c+=ispalindromic(grid[i]);
        }
         for(int i=0;i<grid[0].length;i++){
            int[] arr=new int[grid.length];
            for(int j=0;j<grid.length;j++){
                arr[j]=grid[j][i];
            }
            r+=ispalindromic(arr);
        }
    return Math.min(r,c);
    }
    public static int ispalindromic(int[] arr){
        int i=0;
        int c=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]!=arr[j]) c++;
            i++;
            j--;
        }
            return c;
    }
}
// Last updated: 8/1/2025, 10:31:22 PM
class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        ArrayList<Integer> arr=new ArrayList<>();
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0;i<n;i++){
           
                if(i%2==0){
                    int j=0;
                  while(j<m){
                     arr.add( grid[i][j]);
                    j+=2;  
                  }  
                }else{
                     int j = (m%2==0)?m-1:m-2;
                    while(j>=0){
                         arr.add( grid[i][j]);
                      j-=2;  
                    }
                }
            
        }
        return arr;
    }
}
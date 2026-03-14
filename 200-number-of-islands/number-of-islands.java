class Solution {
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int c=0;
        boolean[][] visited=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfs(i,j,grid,visited);
                    c++;
                }
            }
        }
       
        return c;
        
    }
    public static void dfs( int i , int j, char[][] grid, boolean[][] visited){
            if(i>=grid.length || j >=grid[0].length || i<0 || j<0 || visited[i][j] || grid[i][j]!='1'){
                return;
            }
            visited[i][j]=true;
            dfs(i+1,j,grid,visited);
            dfs(i-1,j,grid,visited);
            dfs(i,j+1,grid,visited);
            dfs(i,j-1,grid,visited);
    }
}
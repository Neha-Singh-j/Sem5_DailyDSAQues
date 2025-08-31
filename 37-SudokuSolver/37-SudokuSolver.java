// Last updated: 8/31/2025, 3:56:12 PM
class Solution {
    public void solveSudoku(char[][] board) {

        Print(board, 0, 0);
		return;

	}
	
	private static boolean Print(char[][] grid ,int row,int col) {
			if(col==9) {
				row++;
				col=0;
				
			}
			if(row==9) {
				return true;
			}
			if(grid[row][col]!='.') {
				return Print(grid,row,col+1);
			}else {
				for(int val=1;val<=9;val++) {
					if(isitSafe(grid,row,col,val)){
						grid[row][col]=(char) (val + '0');
						boolean ans=Print(grid,row,col+1);
						if(ans) {
						return true;	
						}
						grid[row][col]='.';
						
					}
				}
				
			}
			return false;
			
		}
		private static boolean isitSafe(char[][] grid,int row,int col,int val) {
           char ch= (char) (val + '0');
			// checking in row
			for(int i=0;i<grid.length;i++) {
				if(grid[row][i]==ch){
					return false;
				}
			}
			//checking in 3*3 matrix
			
			for(int i=row-row%3;i<row-row%3+3;i++) {
				
				for(int j=col-col%3;j<col-col%3+3;j++) {
					if(grid[i][j]==ch){
						return false;
					}
				}
			}
			
			//checking in col
			for(int i=0;i<grid.length;i++) {
				
				if(grid[i][col]==ch){
					return false;
				}
			}
			return true;
		}
}

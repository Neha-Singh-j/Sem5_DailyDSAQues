// Last updated: 8/1/2025, 10:41:58 PM
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
        boolean[] checkr= new boolean[9];
        boolean[] checkc= new boolean[9];
        // check in row
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]!='.'){
                    int num=board[i][j]-'1';
                    if(checkr[num]) return false;
                    checkr[num]=true;
                }
              
            }
            //checking col
            for(int j=0;j<board[0].length;j++){
                if(board[j][i]!='.'){
                    int num=board[j][i]-'1';
                    if(checkc[num]) return false;
                    checkc[num]=true;
                }
              
            }

        }
        //check in 3*3 matrix
         for (int box = 0; box < 9; box++) {
            boolean[] matCheck = new boolean[9];
            int r=3*(box/3);
            int c=3*(box%3);
            for(int i=r;i<r+3;i++){
                for(int j=c;j<c+3;j++){
                      if (board[i][j] != '.') {
                    int num=board[i][j]-'1';
                   if(matCheck[num]) return false;
                   matCheck[num]=true;
                      }
                }
            }
         }
         return true;

    }
}
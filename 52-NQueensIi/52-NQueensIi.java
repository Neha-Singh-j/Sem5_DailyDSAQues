// Last updated: 8/1/2025, 10:41:28 PM
class Solution {
    public int totalNQueens(int n) {
   
        List<List<String>> res = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        print(board, res, 0, n);
			int c=0;
				return res.size();
			 }

    private static void print(boolean[][] board, List<List<String>> res, int row, int tq) {
        if (row == board.length) {
            List<String> curr = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < board.length; j++) {
                    if (board[i][j]) {
                        sb.append('Q');
                    } else {
                        sb.append('.');
                    }
                }
                curr.add(sb.toString());
            }
            res.add(curr);
            return;
        }

        for (int col = 0; col < board.length; col++) {
            if (isitsafe(board, row, col, board.length)) {
                board[row][col] = true;
                print(board, res, row + 1, tq - 1);
                board[row][col] = false;
            }
        }
    }

    private static boolean isitsafe(boolean[][] board, int row, int col, int n) {
        int r = row;
        while (r >= 0) {
            if (board[r][col]) {
                return false;
            }
            r--;
        }

        int r1 = row, c = col;
        while (r1 >= 0 && c < board[0].length) {
            if (board[r1][c]) {
                return false;
            }
            r1--;
            c++;
        }

        int r2 = row, c2 = col;
        while (r2 >= 0 && c2 >= 0) {
            if (board[r2][c2]) {
                return false;
            }
            r2--;
            c2--;
        }
        return true;
    }
}

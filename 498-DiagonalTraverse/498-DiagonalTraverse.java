// Last updated: 8/27/2025, 12:24:27 AM
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        if (mat == null || mat.length == 0) return new int[0];

        int m = mat.length, n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0, col = 0, idx = 0;
        boolean up = true; // direction flag

        while (idx < m * n) {
            result[idx++] = mat[row][col];

            if (up) { 
                if (col == n - 1) { 
                    row++;
                    up = false;
                } else if (row == 0) { 
                    col++;
                    up = false;
                } else { 
                    row--;
                    col++;
                }
            } else { 
                if (row == m - 1) { 
                    col++;
                    up = true;
                } else if (col == 0) { 
                    row++;
                    up = true;
                } else { 
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
}

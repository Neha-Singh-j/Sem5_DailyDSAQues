// Last updated: 8/1/2025, 10:30:54 PM
class Solution {
    public int[][] specialGrid(int N) {
        return buildGrid(N,0);
    }
    
        private int[][] buildGrid(int N, int start) {
        int size = (int) Math.pow(2, N);
        int[][] grid = new int[size][size];

        if (N == 0) {
            grid[0][0] = start;
            return grid;
        }

        int blockSize = (int) Math.pow(2, 2 * (N - 1)); // 2^(2(N - 1))

        // Get 4 smaller special grids
        int[][] topRight = buildGrid(N - 1, start);
        int[][] bottomRight = buildGrid(N - 1, start + blockSize);
        int[][] bottomLeft = buildGrid(N - 1, start + 2 * blockSize);
        int[][] topLeft = buildGrid(N - 1, start + 3 * blockSize);

        int half = size / 2;

        for (int i = 0; i < half; i++) {
            for (int j = 0; j < half; j++) {
                grid[i][j + half] = topRight[i][j];      
                grid[i + half][j + half] = bottomRight[i][j]; 
                grid[i + half][j] = bottomLeft[i][j];      
                grid[i][j] = topLeft[i][j];                
            }
        }

        return grid;
    }
}

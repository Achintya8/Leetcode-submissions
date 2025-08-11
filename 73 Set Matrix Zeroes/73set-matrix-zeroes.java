class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;        // rows
        int n = matrix[0].length;     // cols
        int col0 = 1;                 // flag for first column

        // Pass 1: mark the first row/col
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) col0 = 0; // mark if first col should be zero

            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // mark row
                    matrix[0][j] = 0; // mark col
                }
            }
        }

        // Pass 2: update matrix in reverse order
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 1; j--) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if (col0 == 0) {
                matrix[i][0] = 0;
            }
        }
    }
}

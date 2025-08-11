class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int temp=0;    
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
       for (int i = 0; i < n; i++) {                // Loop over each row
       for (int j = 0; j < n / 2; j++) {        // Only swap first half of columns
              temp = matrix[i][j];             // Store left-side element
              matrix[i][j] = matrix[i][n - 1 - j]; // Replace it with matching right-side element
              matrix[i][n - 1 - j] = temp;         // Place stored value into right side
    }
}
        
}
    
}
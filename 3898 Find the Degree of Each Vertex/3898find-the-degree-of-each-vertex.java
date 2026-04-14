class Solution {
    public int[] findDegrees(int[][] matrix) {
        int row= matrix.length;
        int col= matrix[0].length;
        int rowsum=0;
        int[] ans = new int[row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                rowsum += matrix[i][j];
            }
            ans[i]=rowsum;
            rowsum=0;
        }
        return ans;
    }
}
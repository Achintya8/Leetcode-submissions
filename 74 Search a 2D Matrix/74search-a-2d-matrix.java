class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col = matrix[0].length;
        int i=0;
        int j=(col*row)-1;
        while(i<=j){
             int midt = (i+j)/2;
             int r =midt/col;
             int c = midt % col;
             if(matrix[r][c]==target){
                return true;
             }else if(matrix[r][c]<target){
                    i=midt+1;
                }else{
                    j=midt-1;
                }
             } return false;
        }
  
   
}
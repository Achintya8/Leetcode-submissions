class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer>ans= new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0,left=0,right=n-1,down=m-1;
        while(top<=down && left<=right){
        for(int i=left;i<=right;i++){
            ans.add(matrix[top][i]);
            }
            top++;
        for(int i=top;i<=down;i++){
            ans.add(matrix[i][right]);
        }right--;
        if (top <= down) {
                for (int i = right; i >= left; i--)
                    ans.add(matrix[down][i]);

                down--;
            }

            // For moving bottom to top.
            if (left <= right) {
                for (int i = down; i >= top; i--)
                    ans.add(matrix[i][left]);

                left++;
            }}return ans;
    }
}
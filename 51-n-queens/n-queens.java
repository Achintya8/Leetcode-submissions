class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row : board) Arrays.fill(row,'.');
        int[] qrow =new int[n];
        int[] upperdiag =new int[2*n-1];
        int[] lowerdiag =new int[2*n-1];
        solve(0,n,board,qrow,upperdiag,lowerdiag,res);
        return res;
    }
    public void solve(int col,int n,char[][] board, int[] qrow,int[] upperdiag,int[] lowerdiag,List<List<String>> res){
        if(col==n){
            List<String> temp = new ArrayList<>();
            for(int i=0;i<n;i++){
                temp.add(new String(board[i]));
            }
            res.add(temp);
            return;
        }
        for(int row=0;row<n;row++){
            if(qrow[row]==0 && upperdiag[n-1+col-row]==0 && lowerdiag[row+col]==0){

                board[row][col]='Q';
                qrow[row]=1;
                upperdiag[n-1+col-row]=1;
                lowerdiag[row+col]=1;

                solve(col+1,n,board,qrow,upperdiag,lowerdiag,res);

                board[row][col]='.';
                qrow[row]=0;
                upperdiag[n-1+col-row]=0;
                lowerdiag[row+col]=0;


            }
        }
    }
}
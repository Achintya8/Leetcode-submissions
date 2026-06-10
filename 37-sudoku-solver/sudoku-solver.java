class Solution {
    public void solveSudoku(char[][] board) {
        helper(board,0,0);
    }
    public boolean helper(char[][] board, int row,int col){
        if(row==9){
            return true;
        }
        int nxtrow = row,nxtcol = col+1;
        if(nxtcol==9){
            nxtrow=row+1;
            nxtcol = 0;
        }
        if(board[row][col]!='.'){
            return helper(board,nxtrow,nxtcol);
        }
        for(char dig='1';dig<='9';dig++){
            if(isSafe(board,row,col,dig)){
              board[row][col] = dig;
              if(helper(board,nxtrow,nxtcol)){
                return true;
              }
            board[row][col] = '.';
            }
        }
        return false;
    }
    public boolean isSafe(char[][] board,int r,int c,char dig){
        for(int i=0;i<9;i++){
            if(i!=c && board[r][i]==dig){
                return false;
            }
        }
        for(int i=0;i<9;i++){
            if(i!=r && board[i][c]==dig){
                return false;
            }
        }
        int sr = (r/3)*3;
        int sc = (c/3)*3;
        for(int i=sr;i<=sr+2;i++){
            for(int j=sc;j<=sc+2;j++){
                if((i!=r || j!=c) && (board[i][j]==dig)){
                    return false;
                }
            }
        }
        return true;
    }
}
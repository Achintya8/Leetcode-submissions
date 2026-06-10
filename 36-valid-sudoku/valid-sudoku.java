class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(!isSafe(board,i,j,board[i][j])){
                        return false;
                    }
                }
            }
        }
        return true;
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
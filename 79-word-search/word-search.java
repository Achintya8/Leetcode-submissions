class Solution {
    public boolean exist(char[][] board, String word) {
        int r = board.length-1;
        int c = board[0].length-1;
        for(int i=0;i<=r;i++){
            for(int j=0;j<=c;j++){
                if(board[i][j]==word.charAt(0)){
                    if(find(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean find(char[][] board, String word,int r,int c, int i){
        if(i==word.length()){
            return true;
        }
        if (r < 0 || r >= board.length || 
        c < 0 || c >= board[0].length || 
        board[r][c] != word.charAt(i)) {
        return false;
    }
    char tmp = board[r][c];
    board[r][c] = '#';

    boolean found = find(board,word,r+1,c,i+1) ||
                    find(board,word,r-1,c,i+1) ||
                    find(board,word,r,c+1,i+1) ||
                    find(board,word,r,c-1,i+1);

    board[r][c] = tmp;

    return found;

    }
}
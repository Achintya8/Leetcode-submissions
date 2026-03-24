class Solution {
    public int numIslands(char[][] grid) {
        int cnt=0;
        int rows=grid.length;
        int col=grid[0].length;
        for(int i=0;i<rows;i++){
                for(int j=0;j<col;j++){
                    if(grid[i][j]=='1'){
                        cnt++;
                        island(i,j,rows,col,grid);
                    }
                }
        }
        return cnt;
    }

    public void island(int i,int j,int rows,int col,char[][] grid){
        if(i<0 || j<0 || i>=rows || j>= col || grid[i][j]=='0'){
                return;
        }
        grid[i][j]='0';
        island(i+1,j,rows,col,grid);
        island(i-1,j,rows,col,grid);
        island(i,j+1,rows,col,grid);
        island(i,j-1,rows,col,grid);
    }
}
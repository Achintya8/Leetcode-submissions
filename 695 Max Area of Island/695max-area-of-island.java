class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row=grid.length;
        int col =  grid[0].length;
        int maxarea=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                maxarea= Math.max(maxarea,Area(i,j,grid));}
            }
        }
        return maxarea;
    }
    public int Area(int i,int j,int[][] grid){
        
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;

         return 1+ Area(i+1,j,grid)+
         Area(i-1,j,grid)+
         Area(i,j+1,grid)+
         Area(i,j-1,grid) ;
    }

}
class Solution {
    public int minOperations(int[][] grid, int x) {
        int n=grid.length;
        int m=grid[0].length;
        int[] flat = new int[n*m];
        int c =0;
        for(int[] row : grid){
            System.arraycopy(row,0,flat,c,row.length);
            c += row.length;
        }
        Arrays.sort(flat);
        int rem = flat[0]%x;
        for(int i=1;i<flat.length;i++){
            if(flat[i]%x != rem){
                return -1;
            }
        }
        int cnt = 0;
        int mid  = flat.length/2;
        

        for(int j=0;j<flat.length;j++){
            while(flat[j]!=flat[mid]){
                if(flat[j]>flat[mid]){
                    flat[j] -= x;
                    cnt++;
                }else{
                flat[j] += x;
                cnt++;}
            }
        }
        return cnt;
    }
}
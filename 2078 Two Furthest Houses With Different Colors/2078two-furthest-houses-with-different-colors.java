class Solution {
    public int maxDistance(int[] colors) {
        int start = 0;
        int end =  colors.length;
        int j=0;
        int maxl = 0;
        for(start=0;start<end-1;start++){
           for(j=0;j<end;j++){
            if(colors[start]!=colors[j]){
                maxl = Math.max(maxl,Math.abs(j-start));
            }
           }
            

        }
        return maxl;
    }
}
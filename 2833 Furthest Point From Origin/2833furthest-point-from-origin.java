class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n = moves.length();
        int l = moves.length()-moves.replace("L","").length()-moves.replace("_","").length();
        int r = moves.length()-moves.replace("R","").length()-moves.replace("_","").length();
        int ans = 0;
        if(l>=r){
                moves=moves.replace('_','L');
            }else{
                moves=moves.replace('_','R');  
            }

        for(int i=0;i<n;i++){
            if(moves.charAt(i)=='L'){
                ans--;
            }else{
                ans++;
            }
        }
        return Math.abs(ans);
    }
}
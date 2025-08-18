class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> fans = new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            fans.add(rowgen(i));
        }return fans;
    }
    public static List<Integer> rowgen(int numRows){
        List<Integer> ansrow = new ArrayList<>();
        long ans=1;
        ansrow.add(1);
        for(int col=1;col<numRows;col++){
            ans=ans*(numRows-col);
            ans=ans/col;
            ansrow.add((int)ans);

        }return ansrow;
    }

}
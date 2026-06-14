class Solution {
    public boolean checkGoodInteger(int n) {
      int squaresum=0;
      int digitsum = 0;

      while(n>0){
        int digi = n%10;
        squaresum += (digi*digi);
        digitsum += digi;

        n = n/10;
      }  
      return (squaresum-digitsum)>=50;
    }
}
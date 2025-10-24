class Solution {
    public long MOD=1000000007;
    public int countGoodNumbers(long n) {
      
        long evendig=(n+1)/2;
        long odddig=n/2;
        long even=pow(5,evendig);
        long odd=pow(4,odddig);
        return (int)((even*odd)%MOD);
    }
    public long pow(long i,long b){
    
        i %= MOD;
        long res=1;
        if(b==0){
            return 1;
        }
        while(b>0){
            if(b%2==1){
                res = (res*i)%MOD;
                b=b-1;
            }else{
                i=(i*i)%MOD;
                b=b/2;
            }
        }return res;
    }
}
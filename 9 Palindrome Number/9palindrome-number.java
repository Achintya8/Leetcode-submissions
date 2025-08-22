class Solution {
    public boolean isPalindrome(int x) {
        int revnum=0;
        int y=x;
        if(x<0){
            return false;
        }
        while(x!=0){
            int ld=x%10;
            if(revnum>Integer.MAX_VALUE/10||revnum<Integer.MIN_VALUE/10){
                return false;
            }
            revnum=(revnum*10)+ld;
            x=x/10;

        }
        if(revnum==y){
            return true;
        }else return false;
    }
}
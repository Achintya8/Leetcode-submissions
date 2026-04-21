class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);

        int score=0;
        int mscore=0;

        int m = 0;
        int n= tokens.length-1;

        while(m<=n){
            if(tokens[m]<=power){
                power -= tokens[m];
                m++;
                score++;
            }else if(score>0){
                power += tokens[n--];
                
                score -= 1;
            }else{
                break;
            }
            mscore = Math.max(mscore,score);
        }
        return mscore;

    }
}
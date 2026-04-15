class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int mini=Integer.MAX_VALUE;
        int n=nums.length;
        int i=0,j=0;
        boolean foundi=false;
        boolean foundj=false;
        for(i=0;i<n;i++){
            if(nums[i]==1){
                foundi=true;
                for(j=0;j<n;j++){
                    if(nums[j]==2){
                        foundj=true;
                        mini=Math.min(mini,Math.abs(i-j));
                    }
                }
            }
        }if(foundi==false||foundj==false){return -1;}else{
         return mini;   
        }
        
    }
}
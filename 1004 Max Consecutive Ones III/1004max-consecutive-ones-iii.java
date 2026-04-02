class Solution {
    public int longestOnes(int[] nums, int k) {
     int n = nums.length;
     int maxl=0;
     int j=0;
     for(int i=0;i<n;i++){
            if(nums[i]==0){
                k--;
            }

            while(k<0){
                if(nums[j]==0){
                    k++;
                }
                j++;
            }

            maxl=Math.max(maxl,i-j+1);

     }return maxl;
    }
}
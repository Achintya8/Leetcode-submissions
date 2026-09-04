class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        boolean found = false;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(maxi(nums,i)-mini(nums,i)<=k){
                return i;
            }
            
  } return -1;
    } 
    public int maxi(int[] nums,int i){
        int m = nums[0];
        for(int j=1;j<i;j++){
            m = Math.max(m,nums[j]);
        }
        return m;
    }
    public int mini(int[] nums,int i){
        int m = nums[i];
        int n = nums.length;
        for(int j=i+1;j<=n-1;j++){
            m = Math.min(m,nums[j]);
        }
        return m;
    }
}
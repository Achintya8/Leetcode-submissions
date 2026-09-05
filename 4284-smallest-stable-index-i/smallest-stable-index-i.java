class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
       int[] maxi = new int[n];
       int[] mini = new int[n];
       int m = Integer.MAX_VALUE;
       for(int i=n-1;i>=0;i--){
            m = Math.min(m,nums[i]);
            mini[i]=m;
       }
       int n1 = Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
        n1 = Math.max(n1,nums[i]);
        maxi[i]=n1;
       }
       for(int i=0;i<n;i++){
        if(maxi[i]-mini[i]<=k){
            return i;
        }
       }
       return -1;
    }
}
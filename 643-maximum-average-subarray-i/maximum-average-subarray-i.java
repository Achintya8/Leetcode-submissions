class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int ans = 0;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        ans = sum;
        for(int j=k;j<nums.length;j++){
            sum -= nums[j-k];
            sum+=nums[j];
            ans = Math.max(ans,sum);
        }
        return (double)ans/k;
    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0;
        if(nums.length<k){
            return 0;
        }
        double sum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        ans = sum/k;
        int a=0;
        for(int j=k;j<nums.length;j++){
            sum -= nums[a];
            a++;
            sum+=nums[j];
            ans = Math.max(ans,(sum/k));
        }
        return ans;
    }
}
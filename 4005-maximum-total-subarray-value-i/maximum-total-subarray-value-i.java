class Solution {
    public long maxTotalValue(int[] nums, int k) {
        Arrays.sort(nums);
        long ans = 0;
        int maxe = nums[nums.length-1];
        int mine = nums[0];
        
        for(int j=k;j>0;j--){
            ans += maxe - mine;
           
        }
    return ans;
    }
}
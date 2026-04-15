class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int cnt=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==digit){
                cnt++;
            }else{
                while(nums[i]>0){
                        int lastDigit = nums[i] % 10;            
                    if(lastDigit==digit){
                        cnt++;
                    }nums[i] = nums[i] / 10;
                }
            }
        }
        return cnt;
    }
}
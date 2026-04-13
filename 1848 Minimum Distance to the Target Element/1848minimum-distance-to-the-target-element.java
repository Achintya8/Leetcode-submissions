class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int abs=0;
        int mins = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                abs = i - start;
                if(abs<0){
                    abs *= -1;
                }
                mins = Math.min(mins,abs);
            }
            
    
        }
        return mins;
    }


}
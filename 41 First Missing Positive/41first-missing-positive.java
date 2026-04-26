class Solution {

    public void swap(int[] nums,int s, int e){
        int temp = nums[s]; nums[s]=nums[e];nums[e]=temp;

    }
    public int firstMissingPositive(int[] nums) {
      int n = nums.length;
      int i = 0;
      while(i<n){
        if(nums[i]>0 && nums[i]<n && nums[i]!=nums[nums[i]-1]){
            swap(nums,i,nums[i]-1);
        }else{
            i++;
        }
      }
      for(int j=0;j<n;j++){
        if(nums[j]!=j+1){
            return j+1;
        }
      }
      return n+1;
    }
}
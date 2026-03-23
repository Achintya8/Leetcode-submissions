class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int i=0;
        // int cnt=0;
        // Arrays.sort(nums);

        while(i<n){
            if(nums[i]==val){
                // cnt++;
                swap(nums,i,n-1);
                n--;
            }else{
                i++;
            }
        }
        return n;
    }

    public void swap(int[] nums,int a,int b){
        int tmp=nums[a];
        nums[a]=nums[b];
        nums[b]=tmp;

    }
}
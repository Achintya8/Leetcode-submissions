class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(m.containsKey(nums[i])){
                if(Math.abs(m.get(nums[i])-i)<=k){
                    return true;
                }else{m.put(nums[i],i);}
            }else{
                m.put(nums[i],i);
            }
        }
        return false;
    }
}
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        Arrays.sort(nums);

        createSubset(nums,0,res,subset);
        return res;
    }

    private void createSubset(int[] nums,int index,List<List<Integer>> res,List<Integer> subset){
        if(index==nums.length){
            res.add(new ArrayList<>(subset));
            return;
        }
        subset.add(nums[index]);
        createSubset(nums,index+1,res,subset);
        subset.remove(subset.size()-1);
        int i = index + 1;
        while (i < nums.length && nums[i] == nums[index]) {
            i++;
        }
        createSubset(nums, i,res, subset);
    }
}
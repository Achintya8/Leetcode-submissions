class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        findcombi(0,candidates,target,ans,sub);
        return ans;       

    }
    private void findcombi(int index,int[] candidates,int target,List<List<Integer>> ans,List<Integer> sub){
                if(index==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(sub));
                
            }return;}

            if(candidates[index]<=target){
                sub.add(candidates[index]);
                findcombi(index,candidates,target-candidates[index],ans,sub);
                sub.remove(sub.size()-1);
            }
            findcombi(index+1,candidates,target,ans,sub);

    }
}
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        calcombi(0,candidates,target,res,sub);
        return res;
    }
    private void calcombi(int index,int[] candidates,int target,List<List<Integer>> res,List<Integer> sub){
        if(target==0){
            res.add(new ArrayList<>(sub));
            return;
        }
        for(int i=index;i<candidates.length;i++){
            if(i>index && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            sub.add(candidates[i]);
            calcombi(i+1,candidates,target-candidates[i],res,sub);
            sub.remove(sub.size()-1);
        }
    }
}
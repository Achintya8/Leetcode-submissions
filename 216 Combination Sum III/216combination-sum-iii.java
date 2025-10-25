class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        solve(1,k,n,ans,mid);
        return ans;
    }
    public void solve(int first,int k,int n,List<List<Integer>> ans,List<Integer> mid){
        if(mid.size()==k && n==0){
            ans.add(new ArrayList<>(mid));
            return;
        }
        for(int i=first;i<=9;i++){
            if(i<=n){
                mid.add(i);
                solve(i+1,k,n-i,ans,mid);

                mid.remove(mid.size()-1);
            }else{
                break;
            }
        }

    }
}
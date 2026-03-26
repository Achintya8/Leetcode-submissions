class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        helper("",0,0,res,n);
        return res;
    }
    public void helper(String curr,int open,int close,List<String> res,int n){
            if(curr.length()==n*2){
                res.add(curr);
                return;
            }
            if(open<n){  helper(curr+"(",open+1,close,res,n); }
            if(close<open){ helper(curr+")",open,close+1,res,n);}
    }
}
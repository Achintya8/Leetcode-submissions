class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> str=new ArrayList<>();
    // Edge case: Empty input string should yield an empty result list
        if (digits == null || digits.isEmpty()) return str;
    // Array mapping index to keypad letters (indices 0 and 1 are placeholders) u can also use an hashmap
        String[] phone=new String[]{" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuilder sb=new StringBuilder();
        helper(0,digits,phone,str,sb);
        return str;
    }
    public void helper(int index,String digits,String[] phone,List<String> res,StringBuilder curr){
    // Base case: If path length matches digits length, a valid combination is formed   
        if(curr.length()==digits.length()){
            res.add(curr.toString());
            return;
        }
    // Convert current digit character to an integer index
        int val=digits.charAt(index)-'0';
        String letters=phone[val];
    // Iterate through all possible characters for the current digit
        for(int i=0;i<letters.length();i++){
            curr.append(letters.charAt(i));//Choose
            helper(index+1,digits,phone,res,curr);//Explore
            curr.deleteCharAt(curr.length()-1);//Unchoose(Backtrack)
        }
    }
}
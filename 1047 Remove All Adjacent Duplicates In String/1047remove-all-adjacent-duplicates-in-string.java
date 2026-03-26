class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder output = new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
                if(!st.isEmpty() && s.charAt(i)==st.peek()){
                    st.pop();
                    i--;
                    
                }else{
                    st.add(s.charAt(i));
                    i--;
                }
        }
        for(Character c:st){
            output.append(c);
        }
        return output.reverse().toString();
    }
}
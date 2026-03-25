class Solution {
    public boolean isValid(String s) {
        if(s.length()==0 || s.length()==1){
            return false;
        }
        Stack<Character> para = new Stack<>();

        int i=0;
        for (i = 0; i < s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                System.out.println(s.charAt(i));
            para.push(s.charAt(i));
             
            }else{
                if (para.isEmpty()) return false;
                if(s.charAt(i)==')' && para.peek()=='(' ||
                s.charAt(i)==']' && para.peek()=='[' ||
                s.charAt(i)=='}' && para.peek()=='{'){
                    para.pop();
                   
                }else{ return false;}
                    
                }
            }
        
        return para.isEmpty();
    }
}